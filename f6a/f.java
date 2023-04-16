package f6a.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f6a.f$a;
import android.view.GestureDetector;
import android.content.Context;
import f6a.f$b;
import android.view.GestureDetector$OnGestureListener;
import f6a.f$d;
import ekd.y0;
import f6a.f$e;
import java.lang.Runnable;
import f6a.f$c;
import android.widget.SeekBar;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.NullPointerException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import b8a.h;
import b8a.g1;
import android.graphics.Bitmap;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment;
import com.kwai.robust.PatchProxyResult;
import b8a.w;
import androidx.lifecycle.MutableLiveData;
import nsd.r0;
import java.lang.Integer;
import java.util.Arrays;
import android.widget.ImageView;
import android.view.MotionEvent;
import ekd.m1;
import android.widget.TextView;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.p1;
import qrd.l1;
import f6a.d;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import android.graphics.Typeface;
import ekd.d0;
import lnc.a1;
import android.widget.SeekBar$OnSeekBarChangeListener;
import f6a.e;

public abstract class f extends PresenterV2	// class@0022d0
{
    public long A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final a F;
    public final GestureDetector G;
    public final View$OnTouchListener H;
    public final y0 I;
    public final f$c J;
    public QPhoto p;
    public NasaPanoramaDetailFragment q;
    public View r;
    public ImageView s;
    public View t;
    public View u;
    public TextView v;
    public TextView w;
    public SeekBar x;
    public ImageView y;
    public long z;

    public void f(){
       super();
       this.B = "BACK";
       this.C = "AREA_BLANK";
       this.D = "AREA_X";
       this.E = "TRIAL_FINISH";
       this.F = new f$a(this);
       this.G = new GestureDetector(this.getContext(), new f$b(this));
       this.H = new f$d(this);
       this.I = new y0(200, new f$e(this));
       this.J = new f$c(this);
    }
    public static final SeekBar P8(f p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mSeekBar");
       }
       return p0;
    }
    public void E8(){
       f tp1;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, f.class, "9")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity.F2(this.F);
          this.j9(2);
          f tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          String str = "mProgressContainer";
          if (r1.w5(tp.mEntity)) {
             tp = this.u;
             if (tp == null) {
                a.S(str);
             }
             tp.setVisibility(0);
             if (!PatchProxy.applyVoidWithListener(objArray, this, f.class, "15")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PROGRESS_BUTTON";
                i3 oi3 = i3.f();
                oi3.d("progress_type", "VERTICAL_FULL_SCREE");
                oi3.c("time_start", Long.valueOf(this.V8()));
                uElementPack.params = oi3.toString();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                tp1 = this.p;
                if (tp1 == null) {
                   a.S("mPhoto");
                }
                uContentPack.photoPackage = w1.f(tp1.mEntity);
                f tq = this.q;
                if (tq == null) {
                   a.S("mPanoramaDetailFragment");
                }
                u1.D0("", tq, 0, uElementPack, uContentPack, null);
                PatchProxy.onMethodExit(f.class, "15");
             }
          }else {
             tp1 = this.u;
             if (tp1 == null) {
                a.S(str);
             }
             tp1.setVisibility(8);
          }
          this.I.d();
          PatchProxy.onMethodExit(f.class, "9");
          return;
       }else {
          PatchProxy.onMethodExit(f.class, "9");
          throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       }
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "10")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity.l3(this.F);
          this.I.e();
          PatchProxy.onMethodExit(f.class, "10");
          return;
       }else {
          PatchProxy.onMethodExit(f.class, "10");
          throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       }
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "13")) {
          return;
       }
       h oh = (TextUtils.n(p0, this.E))? new h(new g1(this.W8(), Boolean.TRUE)): new h(new g1(this.W8(), Boolean.FALSE));
       f tq = this.q;
       if (tq == null) {
          a.S("mPanoramaDetailFragment");
       }
       Objects.requireNonNull(tq);
       String str = "1";
       NasaPanoramaDetailFragment nasaPanorama = PatchProxy.applyWithListener(null, tq, NasaPanoramaDetailFragment.class, str);
       if (nasaPanorama != PatchProxyResult.class) {
       }else {
          nasaPanorama = tq.l;
          if (nasaPanorama == null) {
             a.S("mPanoramaViewModel");
          }
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, str);
       }
       nasaPanorama.q0().setValue(oh);
       if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "14")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("close_type", p0);
          uElementPack.params = oi3.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          f tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(tp.mEntity);
          f tq1 = this.q;
          if (tq1 == null) {
             a.S("mPanoramaDetailFragment");
          }
          u1.M("", tq1, 1, uElementPack, uContentPack, null);
          PatchProxy.onMethodExit(f.class, "14");
       }
       PatchProxy.onMethodExit(f.class, "13");
       return;
    }
    public final String S8(long p0){
       Object[] obj;
       if (PatchProxy.isSupport2(f.class, "12")) {
          obj = PatchProxy.applyOneRefsWithListener(Long.valueOf(p0), this, f.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0 / (long)1000;
       long l = (long)60;
       obj = new Object[]{Integer.valueOf((int)(p0 / l)),Integer.valueOf((int)(p0 % l))};
       String str = String.format("%2d:%02d", Arrays.copyOf(obj, 2));
       a.o(str, "java.lang.String.format\(format, *args\)");
       PatchProxy.onMethodExit(f.class, "12");
       return str;
    }
    public abstract long V8();
    public abstract Bitmap W8();
    public final NasaPanoramaDetailFragment X8(){
       f obj = PatchProxy.applyWithListener(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mPanoramaDetailFragment");
       }
       PatchProxy.onMethodExit(f.class, "4");
       return obj;
    }
    public final QPhoto Y8(){
       f obj = PatchProxy.applyWithListener(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPhoto");
       }
       PatchProxy.onMethodExit(f.class, "2");
       return obj;
    }
    public abstract float Z8();
    public abstract long a9();
    public final void b9(boolean p0){
       if (PatchProxy.isSupport2(f.class, "8") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, f.class, "8")) {
          return;
       }
       f ty = this.y;
       if (ty == null) {
          a.S("mPauseView");
       }
       ty.setSelected((p0 ^ 0x01));
       PatchProxy.onMethodExit(f.class, "8");
       return;
    }
    public abstract void c9();
    public abstract boolean d9(MotionEvent p0);
    public void doBindView(View p0){
       f tt;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "7")) {
          return;
       }
       View view = m1.f(p0, R.id.panorama_detail_interceptor_view);
       a.o(view, "bindWidget\(rootView, R.i¡­_detail_interceptor_view\)");
       this.r = view;
       view = m1.f(p0, R.id.panorama_detail_close_view);
       a.o(view, "bindWidget\(rootView, R.i¡­norama_detail_close_view\)");
       this.t = view;
       view = m1.f(p0, R.id.panorama_detail_progress_container);
       a.o(view, "bindWidget\(rootView, R.i¡­etail_progress_container\)");
       this.u = view;
       view = m1.f(p0, R.id.xf_panorama_direction_foreground);
       a.o(view, "bindWidget\(rootView, R.i¡­ama_direction_foreground\)");
       this.s = view;
       view = m1.f(p0, R.id.total_duration);
       a.o(view, "bindWidget\(rootView, R.id.total_duration\)");
       this.v = view;
       view = m1.f(p0, R.id.current_duration);
       a.o(view, "bindWidget\(rootView, R.id.current_duration\)");
       this.w = view;
       view = m1.f(p0, R.id.player_seekbar);
       a.o(view, "bindWidget\(rootView, R.id.player_seekbar\)");
       this.x = view;
       p0 = m1.f(p0, R.id.player_pause);
       a.o(p0, "bindWidget\(rootView, R.id.player_pause\)");
       this.y = p0;
       if (!PatchProxy.applyVoidWithListener(null, this, f.class, "11")) {
          Activity activity = this.getActivity();
          a.m(activity);
          String str = "mCloseView";
          if (i.e(activity)) {
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             ViewGroup$LayoutParams layoutParams = tt.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                f tt1 = this.t;
                if (tt1 == null) {
                   a.S(str);
                }
                ViewGroup$LayoutParams layoutParams1 = layoutParams;
                layoutParams1.topMargin = layoutParams1.topMargin + p1.f(this.getContext());
                tt1.setLayoutParams(layoutParams);
             }
          }
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tt.setOnClickListener(new d(this));
          tt = this.r;
          if (tt == null) {
             a.S("mInterceptorView");
          }
          tt.setOnTouchListener(this.H);
          Typeface typeface = d0.a("alte-din.ttf", this.getContext());
          f tv = this.v;
          if (tv == null) {
             a.S("mTotalDurationView");
          }
          tv.setTypeface(typeface);
          tv = this.w;
          if (tv == null) {
             a.S("mCurrentDurationView");
          }
          tv.setTypeface(typeface);
          tt = this.x;
          str = "mSeekBar";
          if (tt == null) {
             a.S(str);
          }
          tt.setPadding(a1.d(R.dimen.arg_RES_7f070271), 0, a1.d(R.dimen.arg_RES_7f070271), 0);
          tt = this.x;
          if (tt == null) {
             a.S(str);
          }
          tt.setOnSeekBarChangeListener(this.J);
          tt = this.y;
          if (tt == null) {
             a.S("mPauseView");
          }
          tt.setOnClickListener(new e(this));
          PatchProxy.onMethodExit(f.class, "11");
       }
       PatchProxy.onMethodExit(f.class, "7");
       return;
    }
    public abstract boolean e9();
    public abstract void h9(long p0);
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(NasaPanoramaDetailFragment.class);
       a.o(obj, "inject\(NasaPanoramaDetailFragment::class.java\)");
       this.q = obj;
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
    public abstract void j9(int p0);
}
