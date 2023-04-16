package cj1.b;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import cj1.c;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@0004cd
{
    public final String a;
    public final List b;
    public final String c;
    public final Gift d;
    public LiveCommonEffectInfo e;
    public final c f;
    public String g;
    public int h;
    public boolean i;

    public void b(String p0,List p1,String p2,Gift p3,LiveCommonEffectInfo p4,c p5,String p6,int p7,boolean p8,int p9,u p10){
       p6 = (p9 & 0x40)? "": null;
       if (p9 & 0x0080) {
          p7 = 7;
       }
       if (p9 & 0x0100) {
          p8 = false;
       }
       a.p(p0, "defaultPreviewText");
       a.p(p1, "recoTextInBanner");
       a.p(p3, "gift");
       a.p(p4, "commonEffectInfo");
       a.p(p5, "sendGiftInfo");
       a.p(p6, "previewText");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       return;
    }
    public final LiveCommonEffectInfo a(){
       return this.e;
    }
    public final String b(){
       return this.a;
    }
    public final Gift c(){
       return this.d;
    }
    public final int d(){
       return this.h;
    }
    public final String e(){
       return this.g;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (this.h == p0.h && this.i == p0.i)))))))))) {
          return true;
       }
       return false;
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (((i1 + i) * 31) + this.h) * 31;
       b ti = this.i;
       if (ti != null) {
          ti = 1;
       }
       return (i1 + ti);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveDiyInputInfo\(defaultPreviewText="+this.a+", recoTextInBanner="+this.b+", regexRuleWhenInput="+this.c+", gift="+this.d+", commonEffectInfo="+this.e+", sendGiftInfo="+this.f+", previewText="+this.g+", maxInputNumber="+this.h+", diyContentIsInput="+this.i+"\)";
    }
}
