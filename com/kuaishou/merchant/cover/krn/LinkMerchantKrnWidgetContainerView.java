package com.kuaishou.merchant.cover.krn.LinkMerchantKrnWidgetContainerView;
import b30.c;
import com.kuaishou.merchant.bowl.krn.MerchantKrnWidgetContainerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d30.c;
import js6.a;
import android.view.View;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import com.kwai.framework.activitycontext.ActivityContext;
import com.kuaishou.merchant.bowl.krn.MerchantSpbKrnContainerView;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import com.kuaishou.cover.Link;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.ViewGroup;
import android.view.MotionEvent;

public class LinkMerchantKrnWidgetContainerView extends MerchantKrnWidgetContainerView implements c	// class@00165a
{

    public void LinkMerchantKrnWidgetContainerView(Context p0){
       super(p0);
    }
    public void LinkMerchantKrnWidgetContainerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LinkMerchantKrnWidgetContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LinkMerchantKrnWidgetContainerView.class, "8")) {
          return;
       }
       c.d("LinkMerchantKrnWidgetContainerViewnotifyResume");
       a.b.mN(this, "merchant_show", "");
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LinkMerchantKrnWidgetContainerView.class, "10")) {
          return;
       }
       c.d("LinkMerchantKrnWidgetContainerViewnotifyDestroy");
       a.b.mN(this, "merchant_cover_destroy", "");
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LinkMerchantKrnWidgetContainerView.class, "9")) {
          return;
       }
       c.d("LinkMerchantKrnWidgetContainerViewnotifyPause");
       a.b.mN(this, "merchant_hide", "");
       return;
    }
    public Activity getActivity(){
       Activity obj = PatchProxy.apply(null, this, LinkMerchantKrnWidgetContainerView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getActivity();
       if (obj == null) {
          obj = ActivityContext.g().e();
       }
       return obj;
    }
    public void l(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LinkMerchantKrnWidgetContainerView.class, "4")) {
          return;
       }
       MerchantSpbKrnContainerView tu = this.u;
       if (tu != null) {
          try{
             String str = "isPassThroughClose";
             if (!tu.containsKey(str) || (this.u.containsKey("materialId") && ("1").equals(this.u.get(str)))) {
                String str1 = this.u.get("materialId");
                if (TextUtils.isEmpty(str1)) {
                   return;
                }else {
                   long l = -11;
                   if ((String.valueOf(l)).equals(str1)) {
                      Object obj = PatchProxy.apply(objArray, this, LinkMerchantKrnWidgetContainerView.class, "2");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         tu = this.u;
                         if (tu != null) {
                            String str2 = "handleClose";
                            if (tu.containsKey(str2)) {
                               b = ("true").equals(this.u.get(str2));
                            }
                         }
                         b = false;
                      }
                      if (b) {
                         a.b.mN(this, "MerchantCloseCover", "close");
                      }else {
                         Link.h().g(l);
                      }
                   }
                }
             }
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public final boolean m(){
       MerchantSpbKrnContainerView obj = PatchProxy.apply(null, this, LinkMerchantKrnWidgetContainerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj != null) {
          String str = "forbidSwipe";
          if (obj.containsKey(str)) {
             return ("true").equals(this.u.get(str));
          }
       }
       return false;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LinkMerchantKrnWidgetContainerView.class, "6")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.m()) {
          SwipeLayout swipeLayout = w9.c(this.getActivity());
          if (swipeLayout != null) {
             swipeLayout.a(this);
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LinkMerchantKrnWidgetContainerView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.m()) {
          SwipeLayout swipeLayout = w9.c(this.getActivity());
          if (swipeLayout != null) {
             swipeLayout.l(this);
          }
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, LinkMerchantKrnWidgetContainerView.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, LinkMerchantKrnWidgetContainerView.class, "3");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          MerchantSpbKrnContainerView tu = this.u;
          if (tu != null) {
             obj = "widgetPenetrate";
             if (tu.containsKey(obj)) {
                b = ("true").equals(this.u.get(obj));
             }
          }
          b = false;
       }
       if (b) {
          return true;
       }else {
          return super.onInterceptTouchEvent(p0);
       }
    }
}
