package b90.d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ei0.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b90.e;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.System;
import androidx.lifecycle.MutableLiveData;
import b90.d$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import b90.d$b;
import b90.d$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.graphics.Typeface;
import ekd.d0;
import z80.c;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import lnc.a1;
import android.graphics.Bitmap;
import android.text.TextPaint;
import b90.d$d;
import android.view.View$OnClickListener;
import b90.d$e;
import z80.a;
import q87.c;
import android.view.ViewTreeObserver;
import java.util.Objects;
import b90.e$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.logic.c;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import z80.b;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import java.lang.Throwable;
import w46.b;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import z80.s;
import brd.t;
import b90.f;
import erd.g;
import t45.d;
import brd.z;
import b90.g;
import b90.h;
import erd.a;
import b90.i;
import b90.j;
import b90.k;
import crd.b;
import com.kwai.feature.post.api.util.g;

public final class d extends a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000af5
{
    public final View c;
    public final TextView d;
    public final ProgressBar e;
    public final View f;
    public final ImageView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final ImageView k;
    public final KwaiActionBar l;
    public final TextView m;
    public final KwaiImageView n;
    public long o;
    public final BaseFragment p;
    public final e q;

    public void d(BaseFragment p0,e p1,View p2){
       View view;
       a.p(p0, "mFragment");
       a.p(p1, "mViewModel");
       a.p(p2, "rootView");
       super(p2);
       this.p = p0;
       this.q = p1;
       if (p1.t0()) {
          view = p2.findViewById(R.id.loading_progress_view);
          a.o(view, "rootView.findViewById\(R.id.loading_progress_view\)");
          view.getTitleView().setTextColor(-1);
          view.getTitleView().setTextSize(2, 15.00f);
       }else {
          view = p2.findViewById(R.id.loading_progress_panel);
          a.o(view, "rootView.findViewById\(R.id.loading_progress_panel\)");
       }
       this.c = view;
       view = p2.findViewById(R.id.loading_sub_title);
       a.o(view, "rootView.findViewById\(R.id.loading_sub_title\)");
       this.d = view;
       view = p2.findViewById(R.id.loading_progress);
       a.o(view, "rootView.findViewById\(R.id.loading_progress\)");
       this.e = view;
       view = p2.findViewById(R.id.loading_error_panel);
       a.o(view, "rootView.findViewById\(R.id.loading_error_panel\)");
       this.f = view;
       view = p2.findViewById(R.id.loading_error_icon);
       a.o(view, "rootView.findViewById\(R.id.loading_error_icon\)");
       this.g = view;
       view = p2.findViewById(R.id.error_text);
       a.o(view, "rootView.findViewById\(R.id.error_text\)");
       this.h = view;
       view = p2.findViewById(R.id.progress_text);
       a.o(view, "rootView.findViewById\(R.id.progress_text\)");
       this.i = view;
       View view1 = p2.findViewById(R.id.progress_hint);
       a.o(view1, "rootView.findViewById\(R.id.progress_hint\)");
       this.j = view1;
       View view2 = p2.findViewById(R.id.icon_percentage);
       a.o(view2, "rootView.findViewById\(R.id.icon_percentage\)");
       this.k = view2;
       View view3 = p2.findViewById(R.id.title_root);
       a.o(view3, "rootView.findViewById\(R.id.title_root\)");
       this.l = view3;
       View view4 = p2.findViewById(R.id.error_retry);
       a.o(view4, "rootView.findViewById\(R.id.error_retry\)");
       this.m = view4;
       p2 = p2.findViewById(R.id.loading_background);
       a.o(p2, "rootView.findViewById\(R.id.loading_background\)");
       this.n = p2;
       this.o = System.currentTimeMillis();
       p1.r0().observe(p0, new d$a(this));
       p1.q0().observe(p0, new d$b(this));
       p1.s0().observe(p0, new d$c(this));
       if (!PatchProxy.applyVoid(null, this, d.class, "11")) {
          view.setTypeface(d0.a("alte-din.ttf", p0.getContext()));
          MediaSceneConfig mediaSceneCo = c.j.r();
          if (mediaSceneCo != null && mediaSceneCo.getSceneType() == 5) {
             view.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
             view1.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
             view2.setImageResource(R.drawable.arg_RES_7f0816ef);
          }
       }
       p2.setImageBitmap(p1.p0());
       TextPaint paint = view4.getPaint();
       a.o(paint, "mRetryButton.paint");
       paint.setFakeBoldText(true);
       view4.setOnClickListener(new d$d(this));
       view3.h(new d$e(this));
       return;
    }
    public void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("MediaSceneLoadingViewBinder", "onAttach\(\)", objArray1);
       this.o = System.currentTimeMillis();
       this.c.getViewTreeObserver().addOnGlobalLayoutListener(this);
       d tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, e.class, "6")) {
          objArray = new Object[i];
          a.D().w("MediaSceneLoadingViewModel", "onBind\(\)", objArray);
       }
       return;
    }
    public void C(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, d.class, str)) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("MediaSceneLoadingViewBinder", "onDetach\(\)", objArray1);
       ViewTreeObserver viewTreeObse = this.c.getViewTreeObserver();
       a.o(viewTreeObse, "mProgressPanel.viewTreeObserver");
       if (viewTreeObse.isAlive()) {
          this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       }
       d tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, e.class, "7")) {
          Object[] objArray2 = new Object[0];
          a.D().w("MediaSceneLoadingViewModel", "onUnbind\(\)", objArray2);
          tq.o0();
          e f = tq.f;
          if (f != null && !PatchProxy.applyVoid(objArray, f, e$a.class, str)) {
             f.b = false;
             k1.m(f);
          }
          tq.f = objArray;
          tq.i.b();
          tq.a.removeObservers(tq.j);
          tq.b.removeObservers(tq.j);
          tq.c.removeObservers(tq.j);
       }
       return;
    }
    public final void D(boolean p0){
       ClientEvent$ElementPackage uElementPack;
       JSONObject jSONObject;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, d.class, "7")) {
          return;
       }
       FragmentActivity activity = this.p.getActivity();
       if (activity != null) {
          activity.finish();
       }
       long l = System.currentTimeMillis() - this.o;
       b a = b.a;
       d tp = this.p;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(tp, Boolean.valueOf(p0), Long.valueOf(l), a, b.class, "4")) {
          try{
             a.p(tp, "logPage");
             Object[] objArray = new Object[0];
             a.D().s("MediaSceneLogger", "logLoadingPageExit\(\) called with: logPage = ["+tp+"],"+" exitByUser = ["+p0+"], exposureTime = ["+l, objArray);
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LOAD_UPOR_RESOURCE_POPUP";
             jSONObject = new JSONObject();
             String str = (p0)? "click": "finish";
             jSONObject.put("close_type", str);
             jSONObject.put("time_cost", l);
          }catch(org.json.JSONException e13){
             a.D().e("MediaSceneLogger", "logLoadingPageShow: ", e13);
          }
          uElementPack.params = jSONObject.toString();
          u1.D0(null, tp, 1, uElementPack, null, null);
       }
       return;
    }
    public final void E(){
       View view;
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       String str = "mRootView.findViewById<V¡­mmon_scene_loading_panel\)";
       if (!this.q.t0()) {
          view = this.A().findViewById(R.id.common_scene_loading_panel);
          a.o(view, str);
          view.setVisibility(8);
          return;
       }else {
          view = this.A().findViewById(R.id.common_scene_loading_panel);
          a.o(view, str);
          view.setVisibility(0);
          this.c.setVisibility(0);
          return;
       }
    }
    public final void F(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "5")) {
          return;
       }
       this.E();
       this.f.setVisibility(8);
       d tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, e.class, "1")) {
          Object[] objArray1 = new Object[0];
          a.D().w("MediaSceneLoadingViewModel", "loadMediaSceneData invoked", objArray1);
          tq.o0();
          tq.g = s.d.g().doOnNext(new f(tq)).observeOn(d.a).doOnSubscribe(new g(tq)).doOnComplete(h.b).doFinally(new i(tq)).subscribe(new j(tq), new k(tq));
       }
       return;
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.F();
       FragmentActivity activity = this.p.getActivity();
       if (activity != null) {
          g.x(this.l, g.g(activity), -1, false);
          this.E();
          ViewTreeObserver viewTreeObse = this.c.getViewTreeObserver();
          a.o(viewTreeObse, "mProgressPanel.viewTreeObserver");
          if (viewTreeObse.isAlive()) {
             this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          }
       }
       return;
    }
}
