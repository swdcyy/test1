package i0a.y;
import bf5.d;
import android.content.Context;
import android.view.View;
import i0a.y$a;
import i0a.y$b;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.LinearGradient;
import ekd.r;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar$b;
import android.view.View$OnTouchListener;
import com.kwai.robust.PatchProxyResult;
import hn5.n;
import hn5.m;
import tkd.b;
import tkd.d;
import gp5.c;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import wkd.b;
import com.yxcorp.gifshow.w;
import uv8.e1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.utility.n;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import java.lang.RuntimeException;
import wh5.c;
import e0a.j;
import java.lang.Runnable;
import ekd.k1;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Float;

public class y extends d	// class@002760
{
    public NasaFeaturedSeekBar f;
    public TextView g;
    public TextView h;
    public View i;
    public boolean j;
    public boolean k;
    public final View$OnTouchListener l;
    public final NasaFeaturedSeekBar$b m;
    public static final boolean n;

    public void y(Context p0){
       super(p0, y.A(p0));
       this.j = false;
       this.k = false;
       y$a uoa = new y$a(this);
       this.l = uoa;
       y$b uob = new y$b(this);
       this.m = uob;
       NasaFeaturedSeekBar nasaFeatured = this.e().findViewById(R.id.milano_player_seekbar);
       this.f = nasaFeatured;
       Objects.requireNonNull(nasaFeatured);
       if (!PatchProxy.isSupport(NasaFeaturedSeekBar.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, nasaFeatured, NasaFeaturedSeekBar.class, "6")) {
          nasaFeatured.Z0 = true;
          nasaFeatured.N = nasaFeatured.O;
          Paint paint = new Paint(5);
          nasaFeatured.c1 = paint;
          paint.setStyle(Paint$Style.FILL);
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, (float)nasaFeatured.k, r.b(nasaFeatured.getContext(), 0x7f06203d), r.b(nasaFeatured.getContext(), 0x7f06202f), Shader$TileMode.CLAMP);
          nasaFeatured.c1.setShader(paint);
       }
       this.g = this.e().findViewById(0x7f0a2b71);
       this.h = this.e().findViewById(0x7f0a2b6d);
       this.i = this.e().findViewById(0x7f0a2b70);
       this.f.setOnProgressChangeListener(uob);
       this.f.setOnTouchListener(uoa);
       return;
    }
    public static View A(Context p0){
       View obj = PatchProxy.applyOneRefs(p0, null, y.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (m.a().U3(p0)) {
          obj = d.a(-87665878).ag(R.layout.arg_RES_7f0d1056);
          StringBuilder str = "use async inflated view: ";
          boolean b = (obj != null)? true: false;
          Log.g("NasaMilanoProgress", str+b);
          if (obj != null) {
             b.a(-1343064608).z().s();
          }
       }else {
          obj = null;
       }
       if (obj == null) {
          obj = a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d1056, null, false);
       }
       return obj;
    }
    public static y x(ViewGroup p0){
       RelativeLayout$LayoutParams layoutParams;
       View obj = PatchProxy.applyOneRefs(p0, null, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.findViewById(R.id.nasa_milano_progress_container);
       if (obj == null) {
          y oy = new y(p0.getContext());
          View view = oy.e();
          view.setTag(R.id.milano_progress_layout_tag_id, oy);
          int i = 0x7f0a0475;
          int i1 = -2;
          if (p0 instanceof RelativeLayout) {
             layoutParams = new RelativeLayout$LayoutParams(-1, i1);
             layoutParams.addRule(2, i);
          }else {
             layoutParams = new ConstraintLayout$LayoutParams(-1, i1);
             layoutParams.j = i;
          }
          layoutParams.bottomMargin = n.c(p0.getContext(), -49.00f);
          oy.f();
          p0.addView(view, layoutParams);
          obj = view;
       }
       return obj.getTag(0x7f0a2b6f);
    }
    public static y y(FrameLayout p0){
       View obj = PatchProxy.applyOneRefs(p0, null, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new RuntimeException("parentView == null");
       }
       obj = p0.findViewById(R.id.nasa_milano_progress_container);
       if (obj == null) {
          y oy = new y(p0.getContext());
          View view = oy.e();
          view.setTag(R.id.milano_progress_layout_tag_id, oy);
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
          layoutParams.gravity = 80;
          layoutParams.bottomMargin = 0;
          oy.f();
          p0.addView(view, layoutParams);
          obj = view;
       }
       return obj.getTag(0x7f0a2b6f);
    }
    public static y z(ViewGroup p0){
       RelativeLayout$LayoutParams layoutParams;
       View obj = PatchProxy.applyOneRefs(p0, null, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.findViewById(R.id.nasa_milano_progress_container);
       if (obj == null) {
          y oy = new y(p0.getContext());
          View view = oy.e();
          view.setTag(R.id.milano_progress_layout_tag_id, oy);
          Context uContext = null;
          int i = -2;
          if (p0 instanceof RelativeLayout) {
             layoutParams = new RelativeLayout$LayoutParams(-1, i);
             layoutParams.addRule(12);
             layoutParams.bottomMargin = (c.b())? n.c(p0.getContext(), -14.00f): n.c(p0.getContext(), uContext);
          }else {
             layoutParams = new ConstraintLayout$LayoutParams(-1, i);
             layoutParams.k = 0;
             if (c.b()) {
                view.setTranslationY((float)n.c(p0.getContext(), 14.00f));
             }else {
                layoutParams.bottomMargin = n.c(p0.getContext(), uContext);
             }
          }
          oy.f();
          p0.addView(view, layoutParams);
          obj = view;
       }
       return obj.getTag(0x7f0a2b6f);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "14")) {
          return;
       }
       int i = 1;
       this.k = j.d() ^ i;
       y tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, NasaFeaturedSeekBar.class, "13")) {
          tf.G = 0;
          tf.K = false;
          tf.e1 = false;
          tf.setProgressState(i);
          tf.Q = false;
          tf.d1 = false;
          tf.R = false;
          tf.k1 = false;
          tf.J = 0x3f800000;
          tf.l1 = false;
          tf.m1 = false;
          tf.invalidate();
          k1.m(tf.n1);
       }
       tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, NasaFeaturedSeekBar.class, "3")) {
          if (tf.g1 == null) {
             tf.g1 = w9.c(a.a(tf));
          }
          if (tf.g1 != null) {
             NasaFeaturedSeekBar o1 = tf.o1;
             if (o1 != null) {
                o1.i(0);
                tf.g1.b(0, tf.o1);
             }
          }
       }
    label_0076 :
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "15")) {
          return;
       }
       y tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, NasaFeaturedSeekBar.class, "14") && tf.j1 != null) {
          tf.b();
       }
       this.f.h();
       tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, NasaFeaturedSeekBar.class, "4")) {
          NasaFeaturedSeekBar g1 = tf.g1;
          if (g1 != null) {
             g1.m(tf.o1);
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, y.class, "16")) {
          return;
       }
       this.f.b();
       return;
    }
    public void d(boolean p0,long p1,int p2){
       if (PatchProxy.isSupport(y.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, y.class, "11")) {
          return;
       }
       if (p0) {
          y tf = this.f;
          tf.W = true;
          tf.setProgressAnimatorUpdateInterval(p1);
          this.f.setProgressAnimatorUpdateThreshold(p2);
          this.f.h();
       }
       return;
    }
    public void h(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "12")) {
          return;
       }
       this.f.setEnableSeek(p0);
       return;
    }
    public void i(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "13")) {
          return;
       }
       this.f.setKeepEnhanceStyle(p0);
       return;
    }
    public void j(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "21")) {
          return;
       }
       this.f.setDisableDrawNormal(p0);
       return;
    }
    public void l(float p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oy, "8")) {
          return;
       }
       this.f.setHighLightPos(p0);
       return;
    }
    public void m(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "22")) {
          return;
       }
       this.f.setIsLagStateBanInterceptMove(p0);
       return;
    }
    public void n(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "23")) {
          return;
       }
       this.f.setSeekTouchEventStarted(p0);
       return;
    }
    public void o(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "6")) {
          return;
       }
       this.f.setMaxProgress(p0);
       return;
    }
    public void p(float p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oy, "7")) {
          return;
       }
       this.f.setMentionSummaryPos(p0);
       return;
    }
    public void t(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "17")) {
          return;
       }
       y tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, NasaFeaturedSeekBar.class, "35") && tf.Q != null) {
          k1.m(tf.n1);
          k1.o(tf.n1);
       }
       return;
    }
    public void u(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "9")) {
          return;
       }
       if (this.f.g()) {
          this.f.setSmoothProgress(p0);
       }else {
          this.f.setProgress(p0);
       }
       return;
    }
    public void v(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "10")) {
          return;
       }
       this.f.setProgress(p0);
       return;
    }
    public String w(long p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, oy, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0 / 1000;
       Object[] objArray = new Object[]{Integer.valueOf((int)(p0 / 60)),Integer.valueOf((int)(p0 % 60))};
       return String.format("%02d:%02d", objArray);
    }
}
