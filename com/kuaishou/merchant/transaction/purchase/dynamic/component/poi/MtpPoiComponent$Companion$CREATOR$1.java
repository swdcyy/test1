package com.kuaishou.merchant.transaction.purchase.dynamic.component.poi.MtpPoiComponent$Companion$CREATOR$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.poi.MtpPoiComponent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MtpPoiComponent$Companion$CREATOR$1 extends Lambda implements a	// class@000902
{
    public static final MtpPoiComponent$Companion$CREATOR$1 INSTANCE;

    static {
       MtpPoiComponent$Companion$CREATOR$1.INSTANCE = new MtpPoiComponent$Companion$CREATOR$1();
    }
    public void MtpPoiComponent$Companion$CREATOR$1(){
       super(0);
    }
    public final MtpPoiComponent invoke(){
       Object obj = PatchProxy.apply(null, this, MtpPoiComponent$Companion$CREATOR$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MtpPoiComponent();
    }
    public Object invoke(){
       return this.invoke();
    }
}
