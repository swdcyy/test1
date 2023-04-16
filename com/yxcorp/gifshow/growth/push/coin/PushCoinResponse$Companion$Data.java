package com.yxcorp.gifshow.growth.push.coin.PushCoinResponse$Companion$Data;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.push.coin.PushCoinResponse$Companion$Data$a;
import nsd.u;
import java.lang.Object;

public final class PushCoinResponse$Companion$Data implements Serializable	// class@001494
{
    public boolean showIcon;
    public String toast;
    public static final PushCoinResponse$Companion$Data$a Companion;
    public static final long serialVersionUID;

    static {
       PushCoinResponse$Companion$Data.Companion = new PushCoinResponse$Companion$Data$a(null);
       PushCoinResponse$Companion$Data.serialVersionUID = 42;
    }
    public void PushCoinResponse$Companion$Data(){
       super();
       this.toast = "";
    }
    public static final long getSerialVersionUID(){
       return PushCoinResponse$Companion$Data.serialVersionUID;
    }
}
