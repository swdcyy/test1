package com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import ira.e;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import ira.g;
import ira.g$a;
import lnc.u1;
import m56.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import hka.a;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$c;
import java.lang.Runnable;
import ekd.k1;
import m56.d;
import java.lang.System;
import hra.c;
import hra.c$a;
import m56.e;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$onInterceptBackPressEvent$1;
import android.content.IntentFilter;
import qrd.l1;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class GrowthWidgetOneKeyAddListener	// class@0015ea
{
    public boolean a;
    public boolean b;
    public GrowthWidgetManager c;
    public e d;
    public boolean e;
    public int f;
    public long g;
    public final GrowthWidgetOneKeyAddListener$b h;
    public static final GrowthWidgetOneKeyAddListener$a i;

    static {
       GrowthWidgetOneKeyAddListener.i = new GrowthWidgetOneKeyAddListener$a(null);
    }
    public void GrowthWidgetOneKeyAddListener(){
       super();
       this.h = new GrowthWidgetOneKeyAddListener$b(this);
    }
    public static final GrowthWidgetManager a(GrowthWidgetOneKeyAddListener p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("mGrowthWidgetManager");
       }
       return p0;
    }
    public static final e b(GrowthWidgetOneKeyAddListener p0){
       p0 = p0.d;
       if (p0 == null) {
          a.S("mOneKeyAddPolicy");
       }
       return p0;
    }
    public final WidgetType c(){
       GrowthWidgetOneKeyAddListener obj = PatchProxy.apply(null, this, GrowthWidgetOneKeyAddListener.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mOneKeyAddPolicy");
       }
       return obj.b();
    }
    public final boolean d(){
       GrowthWidgetOneKeyAddListener obj = PatchProxy.apply(null, this, GrowthWidgetOneKeyAddListener.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       int i1 = this.e ^ i;
       GrowthWidgetOneKeyAddListener td = this.d;
       if (td == null) {
          a.S("mOneKeyAddPolicy");
       }
       if (!td.e()) {
          if (i1) {
             obj = this.d;
             if (obj == null) {
                a.S("mOneKeyAddPolicy");
             }
             if (obj.a()) {
             label_0038 :
                i1 = i;
             }
          }
          i = 0;
          goto label_0038 ;
       }
       return i1;
    }
    public final void e(GrowthWidgetManager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthWidgetOneKeyAddListener.class, "1")) {
          return;
       }
       a.p(p0, "manager");
       if (this.a != null) {
          return;
       }
       this.a = true;
       if (Build$VERSION.SDK_INT < 26) {
          return;
       }
       e uoe = g.a.a();
       this.d = uoe;
       if (uoe == null) {
          a.S("mOneKeyAddPolicy");
       }
       if (!uoe.c()) {
          return;
       }else if(!this.d()){
          return;
       }else {
          u1.a(this);
          this.c = p0;
          return;
       }
    }
    public final void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthWidgetOneKeyAddListener.class, "3")) {
          return;
       }
       String str = null;
       c a = (p0 != null)? p0.a: str;
       a = (a instanceof GifshowActivity && a.g(p0.a.getClass().getSimpleName(), "SearchActivity"))? 1: 0;
       if (!a) {
          String str1 = str;
       }
       if (p0 != null) {
          p0 = p0.a;
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          p0.l3(this.h);
          this.f = 0;
          if (this.b != null) {
             k1.r(new GrowthWidgetOneKeyAddListener$c(this), 0);
          }
       }
       return;
    }
    public final void onEventMainThread(d p0){
       d a;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthWidgetOneKeyAddListener.class, "4")) {
          return;
       }
       a.p(p0, "event");
       a = p0.a;
       String str = 1;
       String str1 = (a != null && a.g(a.getClass().getSimpleName(), "SearchActivity"))? 1: null;
       Object[] objArray = null;
       if (!str1) {
          Object[] objArray1 = objArray;
       }
       if (p0 != null) {
          GrowthWidgetOneKeyAddListener tc = this.c;
          if (tc == null) {
             a.S("mGrowthWidgetManager");
          }
          Objects.requireNonNull(tc);
          GrowthWidgetOneKeyAddListener obj = PatchProxy.apply(objArray, tc, GrowthWidgetManager.class, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(tc.d != null && (System.currentTimeMillis() - tc.e) - 3000 < 0){
             str = null;
          }
          b = str;
          if (b != null) {
             c$a a1 = c.a;
             obj = this.d;
             str = "mOneKeyAddPolicy";
             if (obj == null) {
                a.S(str);
             }
             boolean b1 = obj.d();
             GrowthWidgetOneKeyAddListener td = this.d;
             if (td == null) {
                a.S(str);
             }
             a1.c(b1, "", td.b());
          }
       }
       return;
    }
    public final void onEventMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthWidgetOneKeyAddListener.class, "2")) {
          return;
       }
       if (p0 != null) {
          e a = p0.a;
          if (a != null) {
             e uoe = (a instanceof GifshowActivity)? a: null;
             if (uoe != null) {
                String simpleName = a.getClass().getSimpleName();
                if (simpleName.hashCode() == -501522185 && simpleName.equals("SearchActivity")) {
                   p0 = p0.a;
                   Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                   p0.F2(this.h);
                }
             }
          }
       }
    label_0042 :
       return;
    }
    public final void onInterceptBackPressEvent(){
       GrowthWidgetOneKeyAddListener growthWidget = GrowthWidgetOneKeyAddListener.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, growthWidget, "7")) {
          return;
       }
       this.b = true;
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("ACTION_GROWTH_WIDGET_ONE_KEY_ADD");
       UniversalReceiver.e(a.b(), new GrowthWidgetOneKeyAddListener$onInterceptBackPressEvent$1(this), intentFilter);
       if (!PatchProxy.applyVoid(objArray, this, growthWidget, "9")) {
          this.e = true;
          growthWidget = this.d;
          if (growthWidget == null) {
             a.S("mOneKeyAddPolicy");
          }
          growthWidget.f();
       }
       growthWidget = this.c;
       if (growthWidget == null) {
          a.S("mGrowthWidgetManager");
       }
       growthWidget.b(this.c(), "ACTION_GROWTH_WIDGET_ONE_KEY_ADD");
       return;
    }
}
