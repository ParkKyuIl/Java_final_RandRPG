import java.util.HashMap; 


class Character {
	public int HP,MP,EXP,Level,OP,DP,Money;//ü�� ������ ����ġ ���� ���ݷ� ���� ��
	int MaxHP,MaxMP,MaxEXP;//�ִ�ü��,�ִ븶����,�������Ǳ� ���� �ʿ��� ����ġ��
	HashMap<String,Integer> item= new HashMap<String,Integer>();//�������̸��� ����
	Character(){//�ʱ� ĳ���� ������
		MaxHP=50;
		MaxMP=50;
		HP=MaxHP;
		MP=MaxMP;
		EXP=0;
		Level=1;
		OP=4;
		DP=4;
		MaxEXP=100;
		Money=0;
	}
	public void PlusHp(int n) {
		HP+=n;
		if(HP>MaxHP)
			HP=MaxHP;
	}
	public void PlusMp(int n) {
		MP+=n;
		if(MP>MaxMP)
			MP=MaxMP;
	}
	public void PlusExp(int n) {
		EXP+=n;
		if(EXP>=MaxEXP) {//�������Ҷ����� �����͵�
			EXP=EXP%MaxEXP;
			Level++;
			MaxEXP+=50;
			MaxHP+=10;
			MaxMP+=10;
			HP=MaxHP;
			MP=MaxMP;
			OP+=2;
			DP+=2;
			System.out.println("�����մϴ�!! Lv."+Level+"�� �Ǽ̽��ϴ�.");
			this.ShowMyStatus();
		}
	}
	public void ShowMyStatus() {
		System.out.println("==========================�ɸ��� ���� ==========================");
        System.out.println("����: " + Level);
        System.out.println("hp: " + HP+ "/" + MaxHP);
        System.out.println("mp: " + MP + "/" + MaxMP);
        System.out.println("���ݷ�: " + OP);
        System.out.println("����: " + DP);
        System.out.println("��: " + Money + "��");
        System.out.println("����ġ: " + EXP+ "/" + MaxEXP);
        System.out.println("===========================================================");
	}
	public void GetItem(String name,int n) {
		item.put(name,n);
	}
	public void ShowInventory() {
		System.out.println("==========================�κ��丮===========================");
		for (String keyItemName : item.keySet()){ 
		System.out.println(keyItemName + "\t" + item.get(keyItemName) + "��"); 
		} 
		System.out.println("===========================================================");
	}	
}
