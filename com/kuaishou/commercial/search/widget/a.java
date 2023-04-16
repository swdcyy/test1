package com.kuaishou.commercial.search.widget.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.search.widget.a$a;
import nsd.u;
import lnc.a1;
import ux.b;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Constructor;
import java.lang.String;
import kotlin.jvm.internal.a;
import sx.d;
import ux.a;
import wkd.b;
import xy.c;
import com.kuaishou.commercial.search.widget.a$b;
import com.kuaishou.commercial.search.widget.a$c;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.view.Window;
import android.app.Activity;
import o07.d$a;
import o07.d;
import java.util.Objects;
import java.util.ArrayList;
import yx.j0;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import rx.b;
import rx.d;
import xy.d;
import u49.c;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import tkd.b;
import tkd.d;
import nl9.u;
import brd.t;
import cjd.e;
import erd.o;
import xy.b;
import xy.a;
import erd.g;
import crd.b;
import android.animation.AnimatorListenerAdapter;
import java.lang.Float;
import android.util.Property;
import android.animation.ObjectAnimator;
import gr.e;
import android.animation.TimeInterpolator;
import android.animation.Animator$AnimatorListener;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.d;
import java.util.Iterator;
import java.util.List;
import nl9.h;
import java.lang.Integer;
import com.kuaishou.commercial.search.widget.a$d;
import kotlin.Pair;
import rx.d$b;
import java.lang.Boolean;
import com.kuaishou.commercial.search.widget.a$f;
import android.widget.ImageView;
import com.kuaishou.commercial.search.widget.a$e;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@00157c
{
    public KwaiImageView A;
    public KwaiImageView B;
    public BaseFragment C;
    public List D;
    public boolean E;
    public final d$a F;
    public final d G;
    public final float p;
    public final float q;
    public final float r;
    public int s;
    public final d t;
    public final a u;
    public final c v;
    public ViewGroup w;
    public View x;
    public View y;
    public View z;
    public static final a$a H;

    static {
       a.H = new a$a(null);
    }
    public void a(){
       super();
       this.p = (float)a1.e(72.00f);
       this.q = (float)a1.e(104.00f);
       this.r = (float)a1.e(58.00f);
       Class[] uClassArray = new Class[]{"Hornbill_Search_Suspended_Ball".getClass()};
       Object[] objArray = new Object[]{"Hornbill_Search_Suspended_Ball"};
       Object obj = b.class.getDeclaredConstructor(uClassArray).newInstance(objArray);
       a.o(obj, "T::class.java.getDeclare¡­ava\).newInstance\(session\)");
       this.t = obj;
       this.u = new a("Hornbill_Search_Suspended_Ball");
       this.v = b.a(0x7df40eea);
       this.F = new a$b(this);
       this.G = new a$c(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       a tC = this.C;
       if (tC != null) {
          FragmentActivity activity = tC.getActivity();
          if (activity != null) {
             Window window = activity.getWindow();
             if (window != null) {
                d.b(window, this.F);
             }
          }
       }
       tC = this.v;
       a tG = this.G;
       a tt = this.t;
       Objects.requireNonNull(tC);
       c uoc = c.class;
       if (!PatchProxy.applyVoidTwoRefs(tG, tt, tC, uoc, "1")) {
          if (tC.d == null) {
             tC.d = new ArrayList();
          }
          tC.d.add(tG);
          if (tC.c != null) {
             Object[] objArray1 = new Object[0];
             j0.f("AdSuspendedBallManager", "feed is usable", objArray1);
             tt.T0(tC.c, "", objArray, true);
             tG.a();
          }else if(tC.a == null){
             Object[] objArray2 = new Object[0];
             j0.f("AdSuspendedBallManager", "start request", objArray2);
             if (!PatchProxy.applyVoidOneRefs(tt, tC, uoc, "6")) {
                tC.a = true;
                c uoc1 = b.a(0x3a268c29);
                String str = PatchProxy.apply(objArray, tC, uoc, "5");
                if (str != PatchProxyResult.class) {
                }else {
                   JSONObject jSONObject = new JSONObject();
                   d.a(-1694791652).jM(jSONObject);
                   str = jSONObject.toString();
                }
                uoc1.F(str).map(new e()).subscribe(new b(tC, tt), new a(tC));
             }
          }else {
             Object[] objArray3 = new Object[0];
             j0.f("AdSuspendedBallManager", "initFeed feed is null and isRequesting", objArray3);
          }
       }
       return;
    }
    public void J8(){
       c d;
       String str = "3";
       if (PatchProxy.applyVoid(null, this, a.class, str)) {
          return;
       }
       a tv = this.v;
       a tG = this.G;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoidOneRefs(tG, tv, c.class, str)) {
          d = tv.d;
          if (d != null) {
             d.remove(tG);
          }
          tv.c();
       }
       tv = this.C;
       if (tv != null) {
          FragmentActivity activity = tv.getActivity();
          if (activity != null) {
             Window window = activity.getWindow();
             if (window != null) {
                d.c(window, this.F);
             }
          }
       }
       return;
    }
    public final void P8(View p0,float p1,float p2,AnimatorListenerAdapter p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), p3, this, a.class, "15")) {
          return;
       }
       p0.clearAnimation();
       float[] uofloatArray = new float[]{p1,p2};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_X, uofloatArray);
       objectAnimat.setDuration(300);
       objectAnimat.setInterpolator(e.a());
       if (p3 != null) {
          objectAnimat.addListener(p3);
       }
       objectAnimat.start();
       return;
    }
    public final void R8(float p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoa, "16")) {
          return;
       }
       uoa = this.z;
       if (uoa != null) {
          uoa.clearAnimation();
          float[] uofloatArray = new float[]{p0,p1};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uoa, View.TRANSLATION_Y, uofloatArray);
          objectAnimat.setDuration(300);
          objectAnimat.setInterpolator(e.a());
          objectAnimat.start();
       }
       return;
    }
    public final JsonObject S8(){
       JsonObject obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       a tv = this.v;
       a.o(tv, "mAdSuspendedBallManager");
       String str = (1 == tv.b())? "0": "1";
       obj.c0("show_type", str);
       return obj;
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       a tu = this.u;
       a tv = this.v;
       a.o(tv, "mAdSuspendedBallManager");
       QPhoto qPhoto = new QPhoto(tv.a());
       tv = this.C;
       if (tv != null) {
          objArray = tv.getActivity();
       }
       d uod = new d();
       uod.e(false);
       a.o(uod, "ClickParams\(\).setNeedReport\(false\)");
       tu.c(qPhoto, objArray, uod);
       this.W8(2);
       tu = this.D;
       if (tu != null) {
          Iterator iterator = tu.iterator();
          while (iterator.hasNext()) {
             iterator.next().e(this.S8());
          }
       }
       return;
    }
    public final void W8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "9")) {
          return;
       }
       uoa = this.v;
       a.o(uoa, "mAdSuspendedBallManager");
       BaseFeed uBaseFeed = uoa.a();
       if (uBaseFeed != null) {
          a.o(uBaseFeed, "it");
          d$b.d(this.t, p0, uBaseFeed, null, null, new a$d(this, p0), 12, null);
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.W8(3);
       a tD = this.D;
       if (tD != null) {
          Iterator iterator = tD.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(this.S8());
          }
       }
       return;
    }
    public final void Y8(boolean p0){
       a tv;
       int i1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       int i = 2;
       a$f uof = 1;
       String str = "mAdSuspendedBallManager";
       if (p0) {
          tv = this.v;
          a.o(tv, str);
          i1 = tv.b();
          if (i1) {
             if (i1 != uof) {
                if (i1 == i) {
                   tv = this.x;
                   if (tv != null) {
                      this.P8(tv, 0, (float)tv.getWidth(), new a$f(tv));
                   }
                }
             }else {
                tv = this.A;
                if (tv != null) {
                   this.P8(tv, 0, (float)tv.getWidth(), new a$e(tv));
                }
                tv = this.B;
                if (tv != null) {
                   tv.setVisibility(0);
                }
                tv = this.B;
                if (tv != null) {
                   this.P8(tv, (float)tv.getWidth(), 0, null);
                }
                tv = this.y;
                if (tv != null) {
                   this.P8(tv, 0, this.r, null);
                }
             }
          }else {
             tv = this.A;
             if (tv != null) {
                tv.setVisibility(0);
             }
             tv = this.B;
             if (tv != null) {
                tv.setVisibility(4);
             }
          }
       }else {
          tv = this.v;
          a.o(tv, str);
          i1 = tv.b();
          if (i1) {
             if (i1 != uof) {
                if (i1 == i) {
                   tv = this.x;
                   if (tv != null) {
                      tv.setVisibility(8);
                   }
                }
             }else {
                tv = this.A;
                if (tv != null) {
                   tv.setVisibility(4);
                }
                tv = this.B;
                if (tv != null) {
                   tv.setVisibility(0);
                }
                tv = this.y;
                if (tv != null) {
                   tv.setTranslationX(this.r);
                }
             }
          }else {
             tv = this.A;
             if (tv != null) {
                tv.setVisibility(0);
             }
             tv = this.B;
             if (tv != null) {
                tv.setVisibility(4);
             }
          }
       }
    label_00c0 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.w = this.t8("SEARCH_HOME_WIDGET_CONTAINER");
       this.C = this.t8("SEARCH_HOME_FRAGMENT");
       this.D = this.t8("SEARCH_HOME_WIDGET_LISTENER");
       return;
    }
}
