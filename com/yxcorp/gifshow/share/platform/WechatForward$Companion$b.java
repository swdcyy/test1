package com.yxcorp.gifshow.share.platform.WechatForward$Companion$b;
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

public final class WechatForward$Companion$b implements x	// class@001c15
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

    public void WechatForward$Companion$b(WechatForward$Companion p0){
       this.n = p0;
       super();
       this.b = KwaiOp.FORWARD_WECHAT_WOW;
       this.d = true;
       this.e = 5;
       this.f = 25;
       this.g = "weixin_wow";
       this.h = "wechat_wow";
       this.i = "";
       this.j = "";
       this.k = 0x7f105193;
       this.l = 0x7f081fe0;
       this.m = 3;
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
       Boolean obj = PatchProxy.apply(null, this, WechatForward$Companion$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n.h();
       a.m(obj);
       if (obj.booleanValue()) {
          Integer integer = this.n.g();
          a.m(integer);
          if (integer.intValue() >= 0x25030200) {
             b = true;
          label_0038 :
             return b;
          }
       }
       b = false;
       goto label_0038 ;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$b.class, "3");
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
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public String getText(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$b.class, "6");
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
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public String v(){
       return this.h;
    }
    public boolean v0(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public String y0(){
       return this.i;
    }
}
