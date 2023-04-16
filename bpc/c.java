package bpc.c;
import uvc.c;
import bpc.c$a;
import nsd.u;
import bpc.a;
import bpc.e;
import uvc.a;
import bpc.b;
import bpc.d;
import bpc.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c extends c	// class@00045d
{
    public final boolean a;
    public final boolean b;
    public final a c;
    public final e d;
    public final a e;
    public final b f;
    public final d g;
    public final f h;
    public int i;
    public static final c$a j;

    static {
       c.j = new c$a(null);
    }
    public void c(boolean p0,boolean p1,a p2,e p3,a p4,b p5,d p6,f p7,int p8){
       a.p(p2, "panelState");
       a.p(p3, "transitionState");
       a.p(p4, "playerState");
       a.p(p5, "previewState");
       a.p(p6, "tipsState");
       a.p(p7, "timelineState");
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
    }
    public static c b(c p0,boolean p1,boolean p2,a p3,e p4,a p5,b p6,d p7,f p8,int p9,int p10,Object p11){
       c uoc = p0;
       int i = p10;
       c a = (i & 0x01)? uoc.a: p1;
       c b = (i & 0x02)? uoc.b: p2;
       c c = (i & 0x04)? uoc.c: p3;
       c d = (i & 0x08)? uoc.d: p4;
       a uoa = (i & 0x10)? p0.a(): p5;
       c f = (i & 0x20)? uoc.f: p6;
       c g = (i & 0x40)? uoc.g: p7;
       c h = (i & 0x0080)? uoc.h: p8;
       c i1 = (i & 0x0100)? uoc.i: p9;
       c uoc1 = c.class;
       if (PatchProxy.isSupport(uoc1)) {
          Object[] objArray = new Object[9];
          objArray[0] = Boolean.valueOf(a);
          objArray[1] = Boolean.valueOf(b);
          objArray[2] = c;
          objArray[3] = d;
          objArray[4] = uoa;
          objArray[5] = f;
          objArray[6] = g;
          objArray[7] = h;
          objArray[8] = Integer.valueOf(i1);
          uoc = PatchProxy.apply(objArray, p0, uoc1, "2");
          if (uoc != PatchProxyResult.class) {
          label_00cb :
             return uoc;
          }
       }
       a.p(c, "panelState");
       a.p(d, "transitionState");
       a.p(uoa, "playerState");
       a.p(f, "previewState");
       a.p(g, "tipsState");
       a.p(h, "timelineState");
       p0 = new c(a, b, c, d, uoa, f, g, h, i1);
       goto label_00cb ;
    }
    public a a(){
       return this.e;
    }
    public final a c(){
       return this.c;
    }
    public final b d(){
       return this.f;
    }
    public final f e(){
       return this.h;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (this.a == p0.a && (this.b == p0.b && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.a(), p0.a()) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && this.i == p0.i)))))))))) {
          return true;
       }
       return false;
    }
    public final d f(){
       return this.g;
    }
    public final e g(){
       return this.d;
    }
    public final boolean h(){
       return this.a;
    }
    public int hashCode(){
       int i1;
       c tc;
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       c tb = this.b;
       if (tb == null) {
          tc = tb;
       }
       i1 = (i1 + i) * 31;
       tc = this.c;
       int i2 = 0;
       i = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i) * 31;
       tc = this.d;
       i = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i) * 31;
       a uoa = this.a();
       i = (uoa != null)? uoa.hashCode(): 0;
       i1 = (i1 + i) * 31;
       tc = this.f;
       i = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i) * 31;
       tc = this.g;
       i = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i) * 31;
       tc = this.h;
       if (tc != null) {
          i2 = tc.hashCode();
       }
       return (((i1 + i2) * 31) + this.i);
    }
    public final boolean i(){
       return this.b;
    }
    public final void j(int p0){
       this.i = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClipRootState\(isClipShowing="+this.a+", isClipTotalOpened="+this.b+", panelState="+this.c+", transitionState="+this.d+", playerState="+this.a()+", previewState="+this.f+", tipsState="+this.g+", timelineState="+this.h+", actionCode="+this.i+"\)";
    }
}
