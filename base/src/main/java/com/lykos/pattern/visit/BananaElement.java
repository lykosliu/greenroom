package com.lykos.pattern.visit;

/**
 * Created by Lykos on 16/3/7.
 */
public class BananaElement implements IElement {
    private String mes;
    public BananaElement(String mes){
        this.mes = mes;
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitBanana(this);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
