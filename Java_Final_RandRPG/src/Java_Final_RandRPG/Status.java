package Java_Final_RandRPG;

public class Status {
	public int maxHp, hp, maxMp, mp, level, exp, maxExp, ad, dp, pad, pdp, pmaxHp, pmaxMp;
	public Status(int _hp, int _mp, int _level, int _exp, int _ad, int _dp){
		maxHp = _hp;
		hp = maxHp;
		maxMp = _mp;
		mp = maxMp;
		level = _level;
		maxExp = _exp;
		exp = 0;
		ad = _ad;
		dp = _dp;
		pad = 0;
		pdp = 0;
		pmaxHp = 0;
		pmaxMp = 0;
	}
	
	public Status(int _pmaxHp, int _pmaxMp, int _pad, int _pdp) {
		maxHp = 0;
		hp = 0;
		maxMp = 0;
		mp = 0;
		level = 0;
		maxExp = 0;
		exp = 0;
		ad = 0;
		dp = 0;
		pad = _pad;
		pdp = _pdp;
		pmaxHp = _pmaxHp;
		pmaxMp = _pmaxMp;
	}
	
	public Status(Status s) {
		maxHp = s.maxHp;
		hp = maxHp;
		maxMp = s.maxMp;
		mp = maxMp;
		level = s.level;
		maxExp = s.exp;
		exp = 0;
		ad = s.ad;
		dp = s.dp;
		pad = s.pad;
		pdp = s.pdp;
		pmaxHp = s.pmaxHp;
		pmaxMp = s.pmaxMp;
	}
	
	public void Show() {
		System.out.println(" ---------------------------");
		System.out.println("|\t\t\t    |");
		System.out.printf("|      LEVEL : %3d", level);
		System.out.println("\t    |");
		System.out.printf("|      EXP : %3d / %3d", exp, maxExp);
		System.out.println("\t    |");
		System.out.printf("|      HP : %3d / %3d(+ %2d)", hp, maxHp, pmaxHp);
		System.out.println(" |");
		System.out.printf("|      MP : %3d / %3d(+ %2d)", mp, maxMp, pmaxMp);
		System.out.println(" |");
		System.out.printf("|      AD : %3d(+ %3d)", ad, pad);
		System.out.println("\t    |");
		System.out.printf("|      DP : %3d(+ %3d)", dp, pdp);
		System.out.println("\t    |");
		System.out.println("|\t\t\t    |");
		System.out.println(" ---------------------------");
	}

}
