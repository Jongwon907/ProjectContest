package com.example.projectcontest.classFile;

public class Stats {
    private int AttackStats;
    private int IntelligenceStats;
    private int Stamina;

    public Stats(){
        AttackStats = 0;
        IntelligenceStats = 0;
        Stamina = 0;
    }

    public void setAttackStats(int AttackStats){this.AttackStats = AttackStats;}
    public void setIntelligenceStats(int IntelligenceStats){this.IntelligenceStats = IntelligenceStats;}
    public void setStamina(int Stamina){this.Stamina = Stamina;}
}
