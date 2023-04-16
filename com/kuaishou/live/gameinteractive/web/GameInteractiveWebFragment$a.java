package com.kuaishou.live.gameinteractive.web.GameInteractiveWebFragment$a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import com.kuaishou.live.gameinteractive.web.GameInteractiveWebFragment;
import java.lang.Object;
import android.view.View;
import android.view.ViewParent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import java.lang.Integer;
import java.lang.Boolean;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.MotionEvent;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;

public class GameInteractiveWebFragment$a implements KwaiYodaWebView$b	// class@001bf7
{
    public boolean a;
    public ViewParent b;
    public final GameInteractiveWebFragment c;

    public void GameInteractiveWebFragment$a(GameInteractiveWebFragment p0){
       this.c = p0;
       super();
       this.a = false;
       this.b = null;
    }
    public final ViewParent a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GameInteractiveWebFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewParent parent = p0.getParent();
       if (parent == null) {
          return parent;
       }
       if (parent instanceof VerticalViewPager) {
          return parent;
       }
       if (parent instanceof View) {
          parent = this.a(parent);
       }
       return parent;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(GameInteractiveWebFragment$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, GameInteractiveWebFragment$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().t("GameInteractiveWebFragment", "onOverScrolled--clampedX:"+p2+"  clampedY:"+p3, objArray);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       GameInteractiveWebFragment$a obj = PatchProxy.applyOneRefs(p0, this, GameInteractiveWebFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       if (this.b == null) {
          this.b = this.a(this.c.Ch());
       }
       obj = this.b;
       if (obj == null) {
          return false;
       }else if(actionMasked){
          if (actionMasked != 2) {
             obj.requestDisallowInterceptTouchEvent(false);
          }else {
             obj.requestDisallowInterceptTouchEvent((this.a ^ 1));
          }
       }else {
          this.a = false;
          obj.requestDisallowInterceptTouchEvent(1);
       }
       return false;
    }
}
