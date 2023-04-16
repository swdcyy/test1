package g69.f;
import com.yxcorp.gifshow.pymk.f;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.k2;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.n0;
import b69.f;
import java.util.Objects;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import wkd.b;
import z59.a;
import cjd.e;
import erd.o;
import h0c.c;
import b69.d;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.List;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import la6.b;
import java.lang.Number;

public class f extends f	// class@002425
{
    public int E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public boolean L;

    public void f(){
       super(0);
    }
    public t I1(){
       f f;
       t ot;
       Object obj1;
       f f1;
       String str1;
       String str = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k2 obj = PatchProxy.apply(objArray, str, f.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = u1.n();
       if (obj != null) {
          str.y = obj.d;
       }
       int i = 0x53352bb2;
       if (TextUtils.x(str.I)) {
          if (this.K() && str.L == null) {
             f a = f.a;
             f = str.F;
             f e = str.E;
             f y = str.y;
             Objects.requireNonNull(a);
             if (PatchProxy.isSupport(f.class)) {
                ot = PatchProxy.applyThreeRefs(f, Integer.valueOf(e), y, a, f.class, "2");
                if (ot != patchProxyRe) {
                }else {
                label_0057 :
                   a.p(f, "pageType");
                   if (a.g(f, "profile") && e == 22) {
                      t ot1 = b.a(i).d(f, e, "", null, null, y, "").map(new e());
                      a.o(ot1, "Singleton.get\(AggregateA¡­\).map\(ResponseFunction\(\)\)");
                      ot1 = c.b("ExploreFriendPreLoader", ot1, false);
                      if (ot1 != null) {
                         ot = ot1.map(d.b);
                      }
                   }
                   ot = objArray;
                }
             }else {
                goto label_0057 ;
             }
             str.L = true;
          }else {
             ot = objArray;
          }
          if (ot == null) {
             obj1 = b.a(i);
             f1 = str.F;
             f e1 = str.E;
             str1 = TextUtils.k(str.G);
             String str2 = this.t2();
             if (this.L0() == null || !this.g()) {
                objArray = str.J;
             }
             ot = obj1.d(f1, e1, str1, str2, objArray, str.y, TextUtils.k(str.H)).map(new e());
          }
          return ot;
       }else {
          obj1 = b.a(i);
          f1 = str.I;
          str1 = this.t2();
          if (this.L0() == null || !this.g()) {
             objArray = str.J;
          }
          return obj1.a(f1, 34, str1, objArray, str.y, RequestTiming.DEFAULT).map(new e());
       }
    }
    public void M1(Object p0,List p1){
       this.o2(p0, p1);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       boolean b = (this.L0() != null)? true: false;
       this.K = b;
       super.a();
       return;
    }
    public void d2(b p0,List p1){
       this.o2(p0, p1);
    }
    public boolean i(){
       return false;
    }
    public int l2(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.i2() == null)? 0: this.i2().mPortal;
       return i;
    }
    public String m2(){
       return this.J;
    }
    public void o2(RecommendUserResponseV2 p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "3")) {
          return;
       }
       super.o2(p0, p1);
       this.J = TextUtils.k(p0.mPrsid);
       return;
    }
    public final String t2(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return objArray;
    }
}
