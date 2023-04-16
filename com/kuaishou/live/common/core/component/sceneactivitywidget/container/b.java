package com.kuaishou.live.common.core.component.sceneactivitywidget.container.b;
import lx1.b;
import android.view.View;
import lp3.e;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.b$a;
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
import java.util.Collection;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView;
import android.widget.ImageView;
import android.content.Context;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView$b;

public class b implements b	// class@00176f
{
    public final View a;
    public View b;
    public SceneActivityWidgetBannerView c;
    public LinearLayout d;
    public final e e;
    public final List f;
    public final SceneActivityWidgetBannerView$b g;

    public void b(View p0,e p1){
       super();
       this.f = new ArrayList();
       this.g = new b$a(this);
       this.a = p0;
       this.e = p1;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070947);
    }
    public void b(List p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "loopWidgetShowList", "showList", p0);
       Object[] objArray = null;
       if (this.b == null) {
          b uob1 = PatchProxy.apply(objArray, this, uob, "3");
          if (uob1 != PatchProxyResult.class) {
          }else {
             View view = a.i(this.a, R.layout.arg_RES_7f0d0dbd);
             this.b = view;
             this.d = view.findViewById(0x7f0a2532);
             uob1 = this.b;
          }
          this.b = uob1;
       }
       this.f.clear();
       this.f.addAll(p0);
       b = true;
       if (!PatchProxy.applyVoid(objArray, this, uob, "2") && this.c == null) {
          SceneActivityWidgetBannerView sceneActivit = this.b.findViewById(R.id.live_scene_activity_loop_widget_item_container);
          this.c = sceneActivit;
          sceneActivit.setIsLoopWidget(b);
          this.c.setILiveServiceManager(this.e);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          this.d.removeAllViews();
          boolean b1 = false;
          if (this.f.size() <= b) {
             this.d(b1);
          }else {
             this.d(b);
             for (int i = 0; i < this.f.size(); i++) {
                ImageView imageView = new ImageView(this.a.getContext());
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a1.d(0x7f07094b), a1.d(0x7f07094b));
                layoutParams.setMargins(b1, a1.d(R.dimen.arg_RES_7f07094a), b1, b1);
                imageView.setLayoutParams(layoutParams);
                this.d.addView(imageView);
             }
          }
       }
       this.c.setActivityWidgetBannerList(this.f);
       return;
    }
    public View c(){
       return this.b;
    }
    public final void d(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "7")) {
          return;
       }
       if (p0) {
          this.c.setPageChangeCallback(this.g);
          this.d.setVisibility(0);
       }else {
          this.c.setPageChangeCallback(null);
          this.d.setVisibility(8);
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b tc = this.c;
       if (tc != null) {
          tc.setPageChangeCallback(null);
          this.c.a();
       }
       return;
    }
}
