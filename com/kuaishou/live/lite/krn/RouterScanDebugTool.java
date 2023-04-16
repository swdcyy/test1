package com.kuaishou.live.lite.krn.RouterScanDebugTool;
import com.kuaishou.live.lite.krn.RouterScanDebugTool$Companion;
import nsd.u;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import vq5.d;
import xp5.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.UUID;
import com.kuaishou.live.lite.krn.RouterScanDebugTool$Companion$LaunchRouterBroadcastReceiver;
import android.content.Context;
import q2.a;
import android.content.IntentFilter;
import qrd.l1;
import android.content.BroadcastReceiver;
import com.kuaishou.live.lite.krn.RouterScanDebugTool$2;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.view.View;
import android.view.ViewParent;
import java.util.Objects;
import java.lang.Integer;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.Color;
import com.yxcorp.utility.n;
import ub3.c;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class RouterScanDebugTool	// class@0009e3
{
    public float a;
    public float b;
    public String c;
    public RouterScanDebugTool$Companion$LaunchRouterBroadcastReceiver d;
    public final Activity e;
    public static final RouterScanDebugTool$Companion f;

    static {
       RouterScanDebugTool.f = new RouterScanDebugTool$Companion(null);
    }
    public void RouterScanDebugTool(Activity p0,Lifecycle p1,d p2,g p3){
       TextView textView;
       View decorView;
       a.p(p0, "activity");
       a.p(p1, "lifecycle");
       a.p(p2, "routerManager");
       a.p(p3, "liveInfoManager");
       super();
       this.e = p0;
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.c = str;
       this.d = new RouterScanDebugTool$Companion$LaunchRouterBroadcastReceiver(this.c, p2, p3);
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("com.live.router.scheme");
       a.b(p0).c(this.d, intentFilter);
       p1.addObserver(new RouterScanDebugTool$2(this));
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RouterScanDebugTool routerScanDe = RouterScanDebugTool.class;
       if (PatchProxy.applyVoid(null, this, routerScanDe, "1")) {
       }else {
          Window window = p0.getWindow();
          a.o(window, "activity.window");
          View view = PatchProxy.applyOneRefs(window, this, routerScanDe, "3");
          if (view != patchProxyRe) {
          }else {
             try{
                decorView = window.getDecorView();
             }catch(java.lang.Exception e0){
             }
             if (decorView != null) {
                view = decorView;
             }else {
                view = window.findViewById(0x7f0a0945);
                while (view != null && view.getParent() instanceof View) {
                   ViewParent parent = view.getParent();
                   Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                   view = parent;
                }
             }
          }
          if (view != null) {
             int i = 0x7f0a2531;
             if (view.findViewById(i) == null) {
                RouterScanDebugTool te = this.e;
                if (PatchProxy.isSupport(routerScanDe)) {
                   textView = PatchProxy.applyTwoRefs(te, Integer.valueOf(i), this, routerScanDe, "2");
                   if (textView != patchProxyRe) {
                   label_0108 :
                      view.addView(textView, new FrameLayout$LayoutParams(200, 100));
                   }
                }
                textView = new TextView(te);
                textView.setId(i);
                textView.setText("点击扫路由二维码");
                textView.setBackgroundColor(Color.parseColor("#B5B5B6"));
                textView.setTextSize(10.00f);
                textView.setWidth(200);
                textView.setHeight(100);
                textView.setX(((float)n.k(this.e) - (float)200));
                textView.setY(((float)n.j(this.e) / (float)2));
                textView.setGravity(17);
                textView.setOnTouchListener(new c(textView, this, i));
                goto label_0108 ;
             }
          }
       }
       return;
    }
}
