package aea.a;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import wq6.k;
import as6.a;
import wq6.d;
import tkd.b;
import tkd.d;
import mv5.b;
import android.view.View;
import aoc.a;
import aoc.b;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import hv5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zq6.r;
import bo5.a;
import java.lang.Float;
import zq6.p;
import zn5.b;
import java.lang.Boolean;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import android.content.Context;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;

public class a implements NasaShootRefreshView$b	// class@000078
{
    public final d a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final View f;
    public final View g;
    public View h;
    public final boolean i;
    public final View j;
    public final View k;
    public final View l;
    public boolean m;

    public void a(BaseFragment p0){
       super();
       this.a = a.g(p0).s8();
       View[] viewArray = d.a(0x3ee97dc2).N3(p0);
       int i = 0;
       object oobject = null;
       object oobject1 = (viewArray != null)? viewArray[i]: oobject;
       this.f = oobject1;
       if (viewArray != null) {
          oobject = viewArray[1];
       }
       this.g = oobject;
       this.k = p0.requireView().findViewById(0x7f0a4492);
       this.l = p0.requireView().findViewById(0x7f0a4493);
       this.b = b.a(p0.requireView(), 0x7f0a0e03);
       this.c = b.a(p0.requireView(), 0x7f0a2d43);
       this.d = b.a(p0.requireView(), 0x7f0a0df9);
       this.e = b.a(p0.requireView(), 0x7f0a0dfa);
       this.j = p0.requireView();
       if (FollowConfigUtil.i() && d.a(0x4999d7cf).pW(p0)) {
          i = true;
       }
       this.i = i;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.m = true;
       this.a.e0().a(a.j, Float.valueOf(0));
       this.a.e0().a(b.e, Float.valueOf(0));
       a tg = this.g;
       if (tg != null) {
          tg.setAlpha(0);
       }
       tg = this.b;
       String str = "NasaShootRefreshView";
       if (tg != null) {
          tg.f(str);
          tg.c(0);
          tg.a(str);
       }
       tg = this.c;
       if (tg != null) {
          tg.f(str);
          tg.c(0);
          tg.a(str);
       }
       tg = this.d;
       if (tg != null) {
          tg.f(str);
          tg.c(0);
          tg.a(str);
       }
       tg = this.e;
       if (tg != null) {
          tg.f(str);
          tg.c(0);
          tg.a(str);
       }
       if (this.h == null && this.i != null) {
          this.h = this.j.findViewById(0x7f0a3360);
       }
       tg = this.l;
       if (tg != null) {
          tg.setAlpha(0);
       }
       return;
    }
    public void b(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("KCubeRefreshStateListener", "onLoadingViewVisible "+p0, objArray);
       this.a.e0().a(a.k, Boolean.valueOf((p0 ^ 0x01)));
       this.a.e0().a(b.f, Boolean.valueOf((p0 ^ 0x01)));
       uoa = this.b;
       if (uoa != null) {
          uoa.d((p0 ^ 0x01));
       }
       uoa = this.c;
       if (uoa != null) {
          uoa.d((p0 ^ 0x01));
       }
       uoa = this.d;
       if (uoa != null) {
          uoa.d((p0 ^ 0x01));
       }
       uoa = this.e;
       if (uoa != null) {
          uoa.d((p0 ^ 0x01));
       }
       uoa = this.l;
       if (uoa != null) {
          uoa.setClickable((p0 ^ 0x01));
       }
       return;
    }
    public void c(float p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.e0().a(a.l, Float.valueOf(p0));
       this.a.e0().a(a.m, Float.valueOf(p1));
       this.a.e0().a(b.b, Float.valueOf(p0));
       this.a.e0().a(b.c, Float.valueOf(p1));
       uoa = this.f;
       if (uoa != null) {
          uoa.setAlpha(p0);
          this.f.setTranslationY(p1);
       }
       uoa = this.g;
       if (uoa != null && this.m == null) {
          uoa.setAlpha(p0);
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.c(p0);
       }
       uoa = this.c;
       if (uoa != null) {
          uoa.c(p0);
       }
       uoa = this.d;
       if (uoa != null) {
          uoa.c(p0);
       }
       uoa = this.e;
       if (uoa != null) {
          uoa.c(p0);
       }
       uoa = this.h;
       if (uoa != null && !uoa.getVisibility()) {
          this.h.setAlpha(p0);
       }
       uoa = this.k;
       if (uoa != null && this.m == null) {
          uoa.setAlpha(p0);
          this.k.setTranslationY(p1);
       }
       uoa = this.l;
       if (uoa != null && this.m == null) {
          uoa.setAlpha(p0);
          this.l.setTranslationY(p1);
       }
       InvalidGestureChecker.a(this.j.getContext(), AnswerType.SLIDE_REFRESH);
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.m = false;
       this.a.e0().a(a.l, Float.valueOf(0x3f800000));
       this.a.e0().a(a.q, Float.valueOf(0x3f800000));
       this.a.e0().a(a.m, Float.valueOf(0));
       this.a.e0().a(b.b, Float.valueOf(0x3f800000));
       this.a.e0().a(b.c, Float.valueOf(0));
       this.a.e0().a(a.j, Float.valueOf(0x3f800000));
       this.a.e0().a(b.e, Float.valueOf(0x3f800000));
       a tf = this.f;
       if (tf != null) {
          tf.setAlpha(0x3f800000);
          this.f.setTranslationY(0);
       }
       tf = this.g;
       if (tf != null) {
          tf.setAlpha(0x3f800000);
       }
       tf = this.b;
       if (tf != null) {
          tf.f("NasaShootRefreshView");
          tf.c(0x3f800000);
       }
       tf = this.c;
       if (tf != null) {
          tf.f("NasaShootRefreshView");
          tf.c(0x3f800000);
       }
       tf = this.d;
       if (tf != null) {
          tf.f("NasaShootRefreshView");
          tf.c(0x3f800000);
       }
       tf = this.e;
       if (tf != null) {
          tf.f("NasaShootRefreshView");
          tf.c(0x3f800000);
       }
       tf = this.h;
       if (tf != null && !tf.getVisibility()) {
          this.h.setAlpha(0x3f800000);
       }
       tf = this.k;
       if (tf != null) {
          tf.setAlpha(0x3f800000);
          this.k.setTranslationY(0);
       }
       tf = this.l;
       if (tf != null) {
          tf.setAlpha(0x3f800000);
          this.l.setTranslationY(0);
       }
       return;
    }
}
