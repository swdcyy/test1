package cca.a;
import tvc.e;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a extends e	// class@00059d
{
    public final boolean a;
    public final boolean b;
    public final int c;
    public final Bitmap d;
    public final boolean e;
    public final VideoTemplate f;
    public final boolean g;
    public AICutErrorCode h;

    public void a(){
       super(false, false, 0, null, false, null, false, null, 255, null);
    }
    public void a(boolean p0,boolean p1,int p2,Bitmap p3,boolean p4,VideoTemplate p5,boolean p6,AICutErrorCode p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public void a(boolean p0,boolean p1,int p2,Bitmap p3,boolean p4,VideoTemplate p5,boolean p6,AICutErrorCode p7,int p8,u p9){
       int i = 0;
       int i1 = (p8 & 0x01)? 0: p0;
       int i2 = (p8 & 0x02)? 0: p1;
       int i3 = (p8 & 0x04)? 0: p2;
       if (!(p8 & 0x10)) {
          i = p4;
       }
       int i4 = (p8 & 0x40)? 1: p6;
       super(i1, i2, i3, 0, i, 0, i4, 0);
       return;
    }
    public static a a(a p0,boolean p1,boolean p2,int p3,Bitmap p4,boolean p5,VideoTemplate p6,boolean p7,AICutErrorCode p8,int p9,Object p10){
       a uoa = p0;
       int i = p9;
       a a = (i & 0x01)? uoa.a: p1;
       a b = (i & 0x02)? uoa.b: p2;
       a c = (i & 0x04)? uoa.c: p3;
       a d = (i & 0x08)? uoa.d: p4;
       a e = (i & 0x10)? uoa.e: p5;
       a f = (i & 0x20)? uoa.f: p6;
       a g = (i & 0x40)? uoa.g: p7;
       a h = (i & 0x0080)? uoa.h: p8;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{Boolean.valueOf(a),Boolean.valueOf(b),Integer.valueOf(c),d,Boolean.valueOf(e),f,Boolean.valueOf(g),h};
          uoa = PatchProxy.apply(objArray, p0, uoa1, "1");
          if (uoa != PatchProxyResult.class) {
          label_00a2 :
             return uoa;
          }
       }
       p0 = new a(a, b, c, d, e, f, g, h);
       goto label_00a2 ;
    }
    public final Bitmap b(){
       return this.d;
    }
    public final AICutErrorCode c(){
       return this.h;
    }
    public final boolean d(){
       return this.b;
    }
    public final boolean e(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && (a.g(this.d, p0.d) && (this.e == p0.e && (a.g(this.f, p0.f) && (this.g == p0.g && a.g(this.h, p0.h)))))))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       return this.e;
    }
    public int hashCode(){
       int i1;
       a th;
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       a tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       i1 = (((i1 + tb) * 31) + this.c) * 31;
       tb = this.d;
       int i2 = 0;
       int i3 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tb = this.e;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tb = this.f;
       i3 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tb = this.g;
       if (tb == null) {
          th = tb;
       }
       i1 = (i1 + i) * 31;
       th = this.h;
       if (th != null) {
          i2 = th.hashCode();
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LoadingPageState\(isPageShowing="+this.a+", isEditButtonShowing="+this.b+", loadingProgress="+this.c+", currentBitmap="+this.d+", isPlayerReleased="+this.e+", curTemplate="+this.f+", applyStyle="+this.g+", errorCode="+this.h+"\)";
    }
}
