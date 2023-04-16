package com.yxcorp.gifshow.activity.web.OperateWebViewFragment$a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.view.View;
import android.view.ViewParent;

public class OperateWebViewFragment$a implements KwaiYodaWebView$b	// class@0014b5
{
    public final OperateWebViewFragment a;

    public void OperateWebViewFragment$a(OperateWebViewFragment p0){
       this.a = p0;
       super();
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (p2) {
          p0.E = true;
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       OperateWebViewFragment$a obj = PatchProxy.applyOneRefs(p0, this, OperateWebViewFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       obj = this.a;
       if (obj.F == null) {
          obj.F = obj.Oh(obj.Ch());
       }
       obj = this.a;
       OperateWebViewFragment f = obj.F;
       if (f == null) {
          return false;
       }else if(actionMasked){
          if (actionMasked != 2) {
             f.requestDisallowInterceptTouchEvent(false);
          }else {
             f.requestDisallowInterceptTouchEvent((obj.E ^ 1));
          }
       }else {
          obj.E = false;
          f.requestDisallowInterceptTouchEvent(1);
       }
       return false;
    }
}
