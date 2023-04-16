package com.kuaishou.live.core.show.test.debug.LiveMockRouterPresenter$b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.test.debug.LiveMockRouterPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.view.Window;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import android.content.Context;
import java.lang.CharSequence;
import android.graphics.Color;
import java.lang.Number;
import com.yxcorp.utility.n;
import jl2.c;
import android.view.View$OnClickListener;
import jl2.d;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class LiveMockRouterPresenter$b implements Runnable	// class@00119c
{
    public final LiveMockRouterPresenter b;

    public void LiveMockRouterPresenter$b(LiveMockRouterPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       View decorView;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMockRouterPresenter$b.class, "1")) {
          return;
       }
       LiveMockRouterPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMockRouterPresenter liveMockRout = LiveMockRouterPresenter.class;
       if (!PatchProxy.applyVoid(objArray, tb, liveMockRout, "5")) {
          Activity activity = tb.getActivity();
          if (activity != null) {
             a.o(activity, "it");
             Window window = activity.getWindow();
             a.o(window, "it.window");
             View view = PatchProxy.applyOneRefs(window, tb, liveMockRout, "6");
             if (view != patchProxyRe) {
             }else {
                try{
                   decorView = window.getDecorView();
                }catch(java.lang.Exception e0){
                }
                if (decorView != null) {
                   view = decorView;
                }else {
                   view = window.findViewById(0x1020002);
                   while (view != null && view.getParent() instanceof View) {
                      ViewParent parent = view.getParent();
                      Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                      view = parent;
                   }
                }
             }
             if (view != null) {
                int i = 0x7f0a218e;
                if (view.findViewById(i) == null) {
                   TextView textView = new TextView(activity);
                   textView.setId(i);
                   textView.setText("点击扫直播路由二维码");
                   textView.setBackgroundColor(Color.parseColor("#B5B5B6"));
                   textView.setTextSize(10.00f);
                   textView.setWidth(200);
                   textView.setHeight(100);
                   Object obj = PatchProxy.applyOneRefs(activity, tb, liveMockRout, "8");
                   int i1 = (obj != patchProxyRe)? obj.intValue(): n.k(activity);
                   textView.setX(((float)i1 - (float)200));
                   Object obj1 = PatchProxy.applyOneRefs(activity, tb, liveMockRout, "7");
                   int i2 = (obj1 != patchProxyRe)? obj1.intValue(): n.j(activity);
                   textView.setY(((float)i2 / (float)2));
                   textView.setGravity(17);
                   textView.setOnClickListener(new c(activity, tb));
                   textView.setOnTouchListener(new d(textView, activity, tb));
                   view.addView(textView, new FrameLayout$LayoutParams(200, 100));
                }
             }
          }
       }
       return;
    }
}
