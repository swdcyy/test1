package ny0.c;
import k51.c;
import ny0.a;
import ny0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gw1.a;
import gq5.c;
import gq5.f;
import oq5.c;
import jv1.b;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewStub;
import com.kuaishou.live.gzone.widget.LiveGzoneLandscapeGradientMaskView;
import t02.a0;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;

public class c extends c	// class@00341f
{
    public View p;
    public LiveGzoneLandscapeGradientMaskView q;
    public LiveGzoneLandscapeGradientMaskView r;
    public f s;
    public a0 t;
    public b u;
    public c v;
    public c w;
    public static float[] A;
    public static String sLivePresenterClassName;
    public static int[] x;
    public static float[] y;
    public static int[] z;

    public void c(){
       super();
       this.v = new a(this);
       this.w = new b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (!a.c()) {
          this.P8();
       }
       this.s.k(this.v);
       this.u.W0(this.w, true);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.s.l(this.v);
       this.u.Q0(this.w);
       return;
    }
    public final void P8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (this.p != null) {
          return;
       }
       ViewStub viewStub = this.m8().findViewById(R.id.live_fullscreen_float_element_background_viewstub);
       if (viewStub == null) {
          return;
       }
       View view = viewStub.inflate();
       this.p = view;
       this.q = view.findViewById(0x7f0a1958);
       this.r = this.p.findViewById(0x7f0a1957);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          if (this.t.l()) {
             if (this.q != null) {
                if (!PatchProxy.applyVoid(objArray, this, uoc, "4") && c.x == null) {
                   int[] ointArray = new int[]{a1.a(0x7f061434),a1.a(0x7f061435),a1.a(0x7f061436),a1.a(0x7f061437)};
                   c.x = ointArray;
                   c.y = new float[4]{0,0x3ea8f5c3,0x3f28f5c3,0x3f800000};
                   int[] ointArray1 = new int[]{a1.a(0x7f06142a),a1.a(0x7f06142b),a1.a(0x7f06142c)};
                   c.z = ointArray1;
                   c.A = new float[3]{0,0x3f000000,0x3f800000};
                }
                this.q.setBackground(objArray);
                this.q.a(c.x, c.y);
                this.q.getLayoutParams().height = a1.e(100.00f);
             }
             uoc = this.r;
             if (uoc != null) {
                uoc.setBackground(objArray);
                this.r.a(c.z, c.A);
                this.r.getLayoutParams().height = a1.e(100.00f);
             }
          }else {
             uoc = this.q;
             float f = 80.00f;
             if (uoc != null) {
                uoc.setBackgroundResource(R.drawable.arg_RES_7f081258);
                this.q.getLayoutParams().height = a1.e(f);
             }
             uoc = this.r;
             if (uoc != null) {
                uoc.setBackgroundResource(R.drawable.arg_RES_7f081257);
                this.r.getLayoutParams().height = a1.e(f);
             }
          }
       }
       return;
    }
    public final void R8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "7")) {
          return;
       }
       uoc = this.p;
       if (uoc != null) {
          int i = (p0)? 0: 8;
          uoc.setVisibility(i);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.s = this.q8(f.class);
       this.t = this.q8(a0.class);
       this.u = this.q8(b.class);
       return;
    }
}
