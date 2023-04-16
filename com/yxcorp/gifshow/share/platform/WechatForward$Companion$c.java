package com.yxcorp.gifshow.share.platform.WechatForward$Companion$c;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import java.lang.Object;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class WechatForward$Companion$c implements x	// class@001c16
{
    public final KwaiOp b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final WechatForward$Companion n;

    public void WechatForward$Companion$c(WechatForward$Companion p0){
       this.n = p0;
       super();
       this.b = KwaiOp.FORWARD_WECHAT_MOMENT;
       this.e = 3;
       this.f = 2;
       this.g = "timeline";
       this.h = "wechat_moments";
       this.i = "share_wxtl";
       this.j = "timeline";
       this.k = 0x7f10518f;
       this.l = 0x7f081fcc;
       this.m = 2;
    }
    public int C0(){
       return this.e;
    }
    public String E0(){
       return this.g;
    }
    public KwaiOp H0(){
       return this.b;
    }
    public boolean K(){
       boolean b;
       Boolean obj = PatchProxy.apply(null, this, WechatForward$Companion$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n.h();
       a.m(obj);
       if (obj.booleanValue()) {
          Integer integer = this.n.g();
          a.m(integer);
          if (integer.intValue() >= 0x21020001) {
             b = true;
          label_0038 :
             return b;
          }
       }
       b = false;
       goto label_0038 ;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public int e(){
       return this.k;
    }
    public String f0(){
       return this.j;
    }
    public int g(){
       return this.m;
    }
    public boolean getAddWatermark(){
       return this.d;
    }
    public String getPackageName(){
       return "com.tencent.mm";
    }
    public String getText(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public int k(){
       return this.l;
    }
    public int l0(){
       return this.f;
    }
    public boolean m0(){
       return this.c;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public String v(){
       return this.h;
    }
    public boolean v0(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public String y0(){
       return this.i;
    }
}
