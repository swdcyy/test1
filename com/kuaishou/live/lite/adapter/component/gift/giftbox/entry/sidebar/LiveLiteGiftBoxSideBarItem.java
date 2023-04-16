package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem;
import com.kuaishou.live.lite.sidebar.e$a;
import android.view.View$OnClickListener;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fd3.l;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ug1.v0;
import java.util.Map;
import ug1.v0$a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder;
import kb.c;
import android.view.View;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.lite.sidebar.e$b;
import fd3.m;
import android.content.Context;
import java.lang.Boolean;
import ha1.b;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import fg6.a;
import q73.b;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import w51.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$a;
import com.airbnb.lottie.LottieAnimationView;

public final class LiveLiteGiftBoxSideBarItem implements e$a	// class@001dce
{
    public View a;
    public LiveLiteGiftBoxSideBarItem$ViewHolder b;
    public boolean c;
    public boolean d;
    public LiveLiteGiftBoxSideBarItem$a e;
    public final View$OnClickListener f;
    public final k g;

    public void LiveLiteGiftBoxSideBarItem(View$OnClickListener p0,k p1){
       a.p(p0, "listener");
       a.p(p1, "bizLogParams");
       super();
       this.f = p0;
       this.g = p1;
       this.d = true;
    }
    public void a(){
       l.c(this);
    }
    public JsonObject b(){
       JsonObject obj = PatchProxy.apply(null, this, LiveLiteGiftBoxSideBarItem.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       Object obj1 = this.g.get();
       a.o(obj1, "bizLogParams.get\(\)");
       obj.a.a(obj, obj1);
       String str = (this.d != null)? "FALSE": "TRUE";
       obj.c0("if_effect", str);
       return obj;
    }
    public boolean c(){
       return l.e(this);
    }
    public JsonObject d(){
       return l.b(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarItem.class, "2")) {
          return;
       }
       l.d(this);
       LiveLiteGiftBoxSideBarItem tb = this.b;
       if (tb != null && !PatchProxy.applyVoid(null, tb, LiveLiteGiftBoxSideBarItem$ViewHolder.class, "10")) {
          if (tb.g != null) {
             tb.g = null;
          }
          LiveLiteGiftBoxSideBarItem$ViewHolder h = tb.h;
          if (h != null) {
             h.close();
          }
          tb.h = null;
       }
       return;
    }
    public View f(){
       Object[] objArray = null;
       LiveLiteGiftBoxSideBarItem obj = PatchProxy.apply(objArray, this, LiveLiteGiftBoxSideBarItem.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.f;
       }
       return objArray;
    }
    public List g(){
       Object[] objArray = null;
       View[] obj = PatchProxy.apply(objArray, this, LiveLiteGiftBoxSideBarItem.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new View[4];
       int i = 0;
       LiveLiteGiftBoxSideBarItem tb = this.b;
       KwaiImageView kwaiImageVie = (tb != null)? tb.d(): objArray;
       obj[i] = kwaiImageVie;
       i = 1;
       tb = this.b;
       LiveLiteGiftBoxSideBarItem$ViewHolder e = (tb != null)? tb.e: objArray;
       obj[i] = e;
       i = 2;
       SelectShapeView selectShapeV = (tb != null)? tb.c(): objArray;
       obj[i] = selectShapeV;
       tb = this.b;
       if (tb != null) {
          objArray = tb.b();
       }
       obj[3] = objArray;
       return CollectionsKt__CollectionsKt.N(obj);
    }
    public String getLogName(){
       return "GIFT";
    }
    public void h(){
       m.c(this);
    }
    public void i(){
       m.d(this);
    }
    public int j(){
       return 3;
    }
    public View k(Context p0,JsonObject p1,boolean p2){
       LiveLiteGiftBoxSideBarItem obj;
       ViewGroup$MarginLayoutParams marginLayout;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveLiteGiftBoxSideBarItem.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, LiveLiteGiftBoxSideBarItem.class, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "context");
       obj = this.a;
       if (obj == null) {
          int i = (p2)? 0x7f0d0b40: 0x7f0d0b41;
          View view = b.b(p0, i);
          a.o(view, "view");
          if (PatchProxy.isSupport(LiveLiteGiftBoxSideBarItem.class)) {
             marginLayout = PatchProxy.applyOneRefs(Boolean.valueOf(p2), this, LiveLiteGiftBoxSideBarItem.class, "1");
             if (marginLayout != patchProxyRe) {
             label_0077 :
                view.setLayoutParams(marginLayout);
                if (!PatchProxy.isSupport(LiveLiteGiftBoxSideBarItem.class) || !PatchProxy.applyVoidThreeRefs(view, p1, Boolean.valueOf(p2), this, LiveLiteGiftBoxSideBarItem.class, "4")) {
                   b uob = (p1 != null)? a.a.c(p1, b.class): null;
                   this.b = new LiveLiteGiftBoxSideBarItem$ViewHolder(view, this.f, uob, p2);
                   if (this.c == null || (this.d != null || a.C())) {
                      this.p();
                   }
                   LiveLiteGiftBoxSideBarItem te = this.e;
                   if (te != null) {
                      te.a(view, p2);
                   }
                }
                this.a = view;
             }
          }
          int i1 = 0x7f07032a;
          ViewGroup$MarginLayoutParams marginLayout1 = (p2)? new ViewGroup$MarginLayoutParams(a1.d(i1), a1.d(0x7f070319)): new ViewGroup$MarginLayoutParams(a1.d(i1), a1.d(0x7f070335));
          marginLayout = marginLayout1;
          goto label_0077 ;
       }
       return obj;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarItem.class, "6")) {
          return;
       }
       this.c = false;
       LiveLiteGiftBoxSideBarItem tb = this.b;
       if (tb != null) {
          tb.a();
       }
       return;
    }
    public final View m(){
       LiveLiteGiftBoxSideBarItem obj = PatchProxy.apply(null, this, LiveLiteGiftBoxSideBarItem.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       a.m(obj);
       return obj.a;
    }
    public final void n(boolean p0){
       this.d = p0;
    }
    public final void o(LiveLiteGiftBoxSideBarItem$a p0){
       this.e = p0;
    }
    public final void p(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGiftBoxSideBarItem.class, "5")) {
          return;
       }
       this.c = true;
       if (this.d != null) {
          LiveLiteGiftBoxSideBarItem tb = this.b;
          if (tb != null && !PatchProxy.applyVoid(objArray, tb, LiveLiteGiftBoxSideBarItem$ViewHolder.class, "6")) {
             tb.a();
             tb.b.s();
          }
       }
       return;
    }
}
