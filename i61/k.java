package i61.k;
import k61.f;
import i61.j;
import java.lang.Object;
import z61.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import z61.l;
import a71.a;
import a71.c;
import w61.c;
import w61.a;
import java.lang.Integer;

public class k implements f	// class@002842
{
    public final int a;
    public final boolean b;
    public final j c;

    public void k(j p0,int p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(b p0,boolean p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ok, "3")) {
          return;
       }
       b mClickCallba = p0.mClickCallback;
       if (mClickCallba != null && p0 instanceof l) {
          p0.mIsSelected = p1;
          mClickCallba.a(p0.mFeatureId);
       }
       this.e(p0, this.a);
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       b mShowCallbac = p0.mShowCallback;
       if (mShowCallbac != null) {
          mShowCallbac.onShow();
       }
       if (p0.mShouldReportLogWithBottomBar != null) {
          a.c(this.a, this.c.o, false, Boolean.valueOf(this.b), p0, this.c.c);
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       b mClickCallba = p0.mClickCallback;
       if (mClickCallba != null && mClickCallba.a(p0.mFeatureId)) {
          this.c.d(p0.mFeatureId);
       }
       this.e(p0, this.a);
       this.c.a();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.c.a();
       return;
    }
    public final void e(b p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ok, "5")) {
          return;
       }
       if (p0.mShouldReportLogWithBottomBar == null) {
          return;
       }
       a.c(p1, this.c.o, true, Boolean.valueOf(this.b), p0, this.c.c);
       return;
    }
}
