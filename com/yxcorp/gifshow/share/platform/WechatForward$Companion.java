package com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion$a;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion$c;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion$b;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion$wxApi$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import mhc.x;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;
import mhc.y;
import mhc.f2;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import java.lang.Integer;
import java.lang.Boolean;

public final class WechatForward$Companion	// class@001c18
{
    public static Boolean a;
    public static Integer b;
    public static final x c;
    public static final x d;
    public static final x e;
    public static final p f;
    public static final WechatForward$Companion g;

    static {
       WechatForward$Companion uCompanion = new WechatForward$Companion();
       WechatForward$Companion.g = uCompanion;
       WechatForward$Companion.c = new WechatForward$Companion$a(uCompanion);
       WechatForward$Companion.d = new WechatForward$Companion$c(uCompanion);
       WechatForward$Companion.e = new WechatForward$Companion$b(uCompanion);
       WechatForward$Companion.f = s.c(new WechatForward$Companion$wxApi$2(uCompanion));
    }
    public void WechatForward$Companion(){
       super();
    }
    public final x a(boolean p0){
       x c = (p0)? WechatForward$Companion.c: WechatForward$Companion.d;
       return c;
    }
    public final String b(){
       f2 obj = PatchProxy.apply(null, this, WechatForward$Companion.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x91df3e4);
       a.o(obj, "Singleton.get\(ForwardService::class.java\)");
       obj = obj.a();
       a.o(obj, "Singleton.get\(ForwardSer¡­::class.java\).shareConfig");
       String str = obj.a();
       a.o(str, "Singleton.get\(ForwardSer¡­echatAppIdFromSecuritySDK");
       return str;
    }
    public final x c(){
       return WechatForward$Companion.c;
    }
    public final x d(){
       return WechatForward$Companion.e;
    }
    public final x e(){
       return WechatForward$Companion.d;
    }
    public final IWXAPI f(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WechatForward$Companion.f.getValue();
    }
    public final Integer g(){
       Integer obj = PatchProxy.apply(null, this, WechatForward$Companion.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = WechatForward$Companion.b;
       int i = (obj != null)? obj.intValue(): this.f().getWXAppSupportAPI();
       return Integer.valueOf(i);
    }
    public final Boolean h(){
       Boolean obj = PatchProxy.apply(null, this, WechatForward$Companion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = WechatForward$Companion.a;
       boolean b = (obj != null)? obj.booleanValue(): this.f().isWXAppInstalled();
       return Boolean.valueOf(b);
    }
}
