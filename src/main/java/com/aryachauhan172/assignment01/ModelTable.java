package com.aryachauhan172.assignment01;

public class ModelTable {
    String name	,damage,	weight,	gold, type;

    public ModelTable(String name, String damage, String weight, String gold, String type) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.gold = gold;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
