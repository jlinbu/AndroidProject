package com.insufficientlight.androidproject;

public class Terrain
{
    //The name of the terrain
    String terrainType;
    //What Modifier does the terrain have on the number of troops field-able
    int frontLineCount;
    //The Bonus to retreat
    int retreatBonus;
    //The Bonus to Defenders
    int defenderBonus;
    //The Bonus to Attackers
    int attackerBonus;
    //Are cavalry favored?
    boolean cavFavored;
    //Are infantry favored?
    boolean infantryFavored;
    //Are Siege Weapons Favored?
    boolean seigeWeaponFavored;

    public String getTerrainType()
    {
        return terrainType;
    }

    public int getFrontLineCount()
    {
        return frontLineCount;
    }

    public int getRetreatBonus() {
        return retreatBonus;
    }

    public int getDefenderBonus() {
        return defenderBonus;
    }

    public int getAttackerBonus() {
        return attackerBonus;
    }

    public boolean isCavFavored()
    {
        return cavFavored;
    }

    public boolean isInfantryFavored()
    {
        return infantryFavored;
    }

    public boolean isSeigeWeaponFavored()
    {
        return seigeWeaponFavored;
    }

    public Terrain(String terrainType, int frontLineCount, int retreatBonus, int attackerBonus, int defenderBonus
                    , boolean cavFavored, boolean infantryFavored, boolean seigeWeaponFavored)
    {
        this.seigeWeaponFavored = seigeWeaponFavored;
        this.terrainType = terrainType;
        this.frontLineCount = frontLineCount;
        this.retreatBonus = retreatBonus;
        this.attackerBonus = attackerBonus;
        this.cavFavored = cavFavored;
        this.infantryFavored = infantryFavored;
        this.defenderBonus = defenderBonus;
    }

}
