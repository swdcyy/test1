package c9c.b;
import qvb.q;
import y8c.q;
import io.reactivex.subjects.PublishSubject;
import lkd.b;
import java.lang.Object;
import s2b.d;
import androidx.fragment.app.Fragment;
import y8c.a;
import androidx.fragment.app.FragmentActivity;
import k2b.j0;
import d9c.b;
import b9c.d;
import qvb.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.j;
import java.lang.Throwable;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import y8c.c;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import qvb.p;

public final class b implements q	// class@000561
{
    public j0 b;
    public final Activity c;
    public i d;
    public d e;
    public final q f;
    public final PublishSubject g;
    public final b h;

    public void b(q p0,PublishSubject p1,b p2){
       super();
       this.e = new d();
       this.c = p0.g0().getActivity();
       this.g = p1;
       this.f = p0;
       this.b = p0;
       this.h = p0;
       i oi = p2.get();
       if (PatchProxy.applyVoidOneRefs(oi, this, b.class, "10")) {
       }else if(this.d != null){
          this.c();
       }
       this.d = oi;
       oi.h(this);
       this.d.h(p0);
       return;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, b.class, "6")) {
          return;
       }
       if (p0 && (this.d() && this.c instanceof GifshowActivity)) {
          this.b(2);
       }
    label_0027 :
       return;
    }
    public void Z1(boolean p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       b tc = this.c;
       if (tc != null && !tc.isFinishing()) {
          this.g.onNext(new c(6, this.f, p0));
       }
       return;
    }
    public final void b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.b;
       if (uob != null) {
          uob.b2(p0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.d.f(this);
       this.d.f(this.f);
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.N5();
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, b.class, "2")) {
          return;
       }
       b tc = this.c;
       if (tc != null && !tc.isFinishing()) {
          this.e.c(p0);
          if (p0 && this.d()) {
             Object obj = PatchProxy.apply(null, this, b.class, "5");
             obj = (obj != PatchProxyResult.class)? obj.booleanValue(): this.h.b6();
             if (obj && this.c instanceof GifshowActivity) {
                this.b(1);
             }
          }
       label_0055 :
          this.e.b();
       }
       return;
    }
}
