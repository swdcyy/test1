package com.kuaishou.growth.pendant.model.RewardPopupV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.RewardPopupV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class RewardPopupV2 implements Serializable	// class@000686
{
    public String mAmount;
    public String mAmountText;
    public String mButtonText;
    public String mDesc;
    public static final RewardPopupV2$a Companion;
    public static final long serialVersionUID;

    static {
       RewardPopupV2.Companion = new RewardPopupV2$a(null);
    }
    public void RewardPopupV2(){
       super();
    }
    public final String getMAmount(){
       return this.mAmount;
    }
    public final String getMAmountText(){
       return this.mAmountText;
    }
    public final String getMButtonText(){
       return this.mButtonText;
    }
    public final String getMDesc(){
       return this.mDesc;
    }
    public final void setMAmount(String p0){
       this.mAmount = p0;
    }
    public final void setMAmountText(String p0){
       this.mAmountText = p0;
    }
    public final void setMButtonText(String p0){
       this.mButtonText = p0;
    }
    public final void setMDesc(String p0){
       this.mDesc = p0;
    }
}
