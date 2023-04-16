package d92.q;
import android.view.View$OnTouchListener;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import o56.c;
import o56.a;
import android.app.Application;
import java.util.Objects;
import android.media.AudioManager;
import android.view.GestureDetector;
import d92.q$a;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.view.ViewStub;
import java.lang.ref.WeakReference;
import android.app.Activity;
import e3a.a;
import android.view.Window;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import com.kwai.library.widget.progressbar.StepProgressBar;
import ekd.k1;
import d92.q$b;
import java.lang.Runnable;

public class q implements View$OnTouchListener	// class@0024bb
{
    public ViewStub b;
    public View c;
    public ImageView d;
    public StepProgressBar e;
    public Window f;
    public AudioManager g;
    public WeakReference h;
    public GestureDetector i;

    public void q(View p0){
       a.p(p0, "viewRoot");
       super();
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       WeakReference systemServic = uoc.a().getSystemService("audio");
       Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.media.AudioManager");
       this.g = systemServic;
       c uoc1 = a.a();
       a.o(uoc1, "AppEnv.get\(\)");
       c uoc2 = a.a();
       a.o(uoc2, "AppEnv.get\(\)");
       this.i = new GestureDetector(uoc1.a(), new q$a(this, uoc2.a()));
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "8")) {
       }else {
          View view = m1.f(p0, R.id.live_landscape_elements_view_stub);
          a.o(view, "ViewBindUtils.bindWidget¡­scape_elements_view_stub\)");
          this.b = view;
       }
       systemServic = new WeakReference(a.b(p0.getContext()));
       this.h = systemServic;
       Activity uActivity = systemServic.get();
       Window window = (uActivity != null)? uActivity.getWindow(): null;
       this.f = window;
       return;
    }
    public static final ViewStub a(q p0){
       p0 = p0.b;
       if (p0 == null) {
          a.S("mLandscapeElementViewStub");
       }
       return p0;
    }
    public void b(){
    }
    public boolean c(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       return false;
    }
    public boolean d(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       return false;
    }
    public void e(MotionEvent p0,MotionEvent p1,float p2,float p3,float p4,float p5){
       if (PatchProxy.isSupport(q.class)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, q.class, "6")) {
             return;
          }
       }
       a.p(p0, "e1");
       a.p(p1, "e2");
       return;
    }
    public void f(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "7")) {
          return;
       }
       a.p(p0, "e");
       return;
    }
    public boolean g(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return false;
    }
    public boolean h(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       return false;
    }
    public boolean i(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       return false;
    }
    public final void j(int p0,int p1){
       if (PatchProxy.isSupport(q.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, q.class, "10")) {
          return;
       }
       n.Y(this.c, 0, 0);
       q td = this.d;
       if (td != null) {
          td.setImageResource(p0);
       }
       q te = this.e;
       if (te != null) {
          te.setProgressStep(p1);
       }
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "14");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       k1.n(this);
       if (p1 != null && p1.getAction() == 1) {
          this.b();
          k1.s(new q$b(this), this, 1000);
       }
       this.i.onTouchEvent(p1);
       return true;
    }
}
