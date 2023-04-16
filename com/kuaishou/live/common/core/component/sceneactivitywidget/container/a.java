package com.kuaishou.live.common.core.component.sceneactivitywidget.container.a;
import lx1.b;
import android.view.View;
import lp3.e;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.util.List;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewGroup;
import i2b.a;
import android.widget.LinearLayout;
import android.widget.ImageView;
import lx1.e;
import android.view.View$OnClickListener;
import px1.a;
import java.util.Collection;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import lp3.c;
import ekd.k1;
import java.lang.Integer;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.a$a;
import android.animation.Animator$AnimatorListener;
import lx1.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import sx4.e;
import android.widget.FrameLayout;
import android.view.ViewParent;
import nx1.c;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import sx4.e$a;
import android.widget.LinearLayout$LayoutParams;
import ox1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class a implements b	// class@00176d
{
    public final View a;
    public View b;
    public SceneActivityWidgetBannerView c;
    public LinearLayout d;
    public ImageView e;
    public ValueAnimator f;
    public final e g;
    public boolean h;
    public final List i;

    public void a(View p0,e p1){
       super();
       this.h = true;
       this.i = new ArrayList();
       this.a = p0;
       this.g = p1;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f07032a);
    }
    public void b(List p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "openWidgetShowList", "showList", p0);
       if (this.b == null) {
          a uoa1 = PatchProxy.apply(null, this, uoa, "5");
          if (uoa1 != PatchProxyResult.class) {
          }else {
             View view = a.i(this.a, R.layout.arg_RES_7f0d0dbc);
             this.b = view;
             this.d = view.findViewById(0x7f0a2534);
             ImageView imageView = this.b.findViewById(R.id.live_scene_activity_widget_button);
             this.e = imageView;
             imageView.setOnClickListener(new e(this));
             uoa1 = this.b;
          }
          this.b = uoa1;
       }
       if (this.h == null) {
          for (int i = 0; i < this.i.size(); i = i + 1) {
             this.i.get(i).d();
          }
       }
       this.i.clear();
       this.i.addAll(p0);
       if (!PatchProxy.applyVoid(null, this, uoa, "2") && this.c == null) {
          SceneActivityWidgetBannerView sceneActivit = this.b.findViewById(R.id.live_scene_activity_widget_item_container);
          this.c = sceneActivit;
          sceneActivit.setIsLoopWidget(false);
          this.c.setILiveServiceManager(this.g);
       }
       this.g();
       if (this.h == null) {
          this.f(n.P(this.a.getContext(), (float)this.d.getLayoutParams().height), (this.i.size() * 50));
       }
       return;
    }
    public View c(){
       return this.b;
    }
    public final ClientContent$LiveStreamPackage d(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.a(i.class).a();
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       if (this.h == null) {
          boolean b = true;
          this.h = b;
          k1.n(this);
          this.f((this.i.size() * 50), 50);
          for (; b < this.i.size(); b = b + 1) {
             this.i.get(b).d();
          }
       }
       return;
    }
    public final void f(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "12")) {
          return;
       }
       uoa = this.f;
       if (uoa != null) {
          uoa.cancel();
       }
       ViewGroup$LayoutParams layoutParams = this.d.getLayoutParams();
       layoutParams.width = a1.d(0x7f070948);
       int[] ointArray = new int[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       this.f = valueAnimato;
       valueAnimato.setDuration(300);
       this.f.setInterpolator(new AccelerateDecelerateInterpolator());
       this.f.addListener(new a$a(this));
       this.f.addUpdateListener(new d(this, layoutParams));
       this.f.start();
       return;
    }
    public final void g(){
       int i1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          i1 = 0;
          while (i1 < this.i.size()) {
             e uoe1 = this.i.get(i1).h();
             ViewParent parent = uoe1.getView().getParent();
             if (parent != null) {
                parent.removeView(uoe1.getView());
             }
             i1 = i1 + 1;
          }
       }
       if (this.h != null) {
          this.c.setActivityWidgetBannerList(this.i);
       }else {
          this.d.removeAllViews();
          i1 = 0;
          while (i1 < this.i.size()) {
             a uoa1 = this.i.get(i1);
             e uoe = uoa1.h();
             c uoc = uoa1.i();
             i1 = i1 + 1;
             uoc.d(i1, uoa1.j().widgetId, 2, this.d());
             uoe.setIJS2NativeInvoker(uoc);
             uoa1.b();
             uoe.getView().setLayoutParams(new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f070948), a1.d(R.dimen.arg_RES_7f070948)));
             this.d.addView(uoe.getView());
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "13")) {
          if (this.i.size() > 1) {
             this.e.setVisibility(i);
             String str = (this.h != null)? "FOLD": "OPEN";
             ClientContent$LiveStreamPackage liveStreamPa = this.d();
             if (!PatchProxy.applyVoidTwoRefs(str, liveStreamPa, objArray, a.class, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LIVE_INTERACT_PENDANT_FOLD_BUTTON";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("btn_type", str);
                uElementPack.params = jsonObject.toString();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.u0(6, uElementPack, uContentPack);
             }
          }else {
             this.e.setVisibility(8);
          }
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       a tf = this.f;
       if (tf != null) {
          tf.cancel();
       }
       tf = this.c;
       if (tf != null) {
          tf.a();
       }
       k1.n(this);
       return;
    }
}
