package com.yxcorp.gifshow.growth.invitecode.InviteSwitchUtil$isNewFissionApiEnable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class InviteSwitchUtil$isNewFissionApiEnable$2 extends Lambda implements a	// class@0013cd
{
    public static final InviteSwitchUtil$isNewFissionApiEnable$2 INSTANCE;

    static {
       InviteSwitchUtil$isNewFissionApiEnable$2.INSTANCE = new InviteSwitchUtil$isNewFissionApiEnable$2();
    }
    public void InviteSwitchUtil$isNewFissionApiEnable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, InviteSwitchUtil$isNewFissionApiEnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("newFissionPopupsApi", false);
    }
}