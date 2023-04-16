package com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment$a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment;
import java.lang.Object;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.view.ViewParent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public class HotChannelWebContainerFragment$a implements KwaiYodaWebView$b	// class@00105b
{
    public boolean a;
    public ViewParent b;
    public final HotChannelWebContainerFragment c;

    public void HotChannelWebContainerFragment$a(HotChannelWebContainerFragment p0){
       this.c = p0;
       super();
       this.a = false;
       this.b = null;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (p2) {
          this.a = true;
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HotChannelWebContainerFragment$a uoa = HotChannelWebContainerFragment$a.class;
       YodaBaseWebView obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       if (this.b == null) {
          obj = this.c.s.Ch();
          ViewParent viewParent = PatchProxy.applyOneRefs(obj, this, uoa, "2");
          if (viewParent != patchProxyRe) {
          }else {
             viewParent = null;
             if (obj != null) {
                for (ViewParent parent = obj.getParent(); parent != null; parent = parent.getParent()) {
                   if (parent instanceof ViewPager) {
                      viewParent = parent;
                      break ;
                   }
                }
             }
          }
          this.b = viewParent;
       }
       HotChannelWebContainerFragment$a tb = this.b;
       if (tb == null) {
          return false;
       }else if(actionMasked){
          if (actionMasked != 2) {
             tb.requestDisallowInterceptTouchEvent(false);
          }else {
             tb.requestDisallowInterceptTouchEvent((this.a ^ 1));
          }
       }else {
          this.a = false;
          tb.requestDisallowInterceptTouchEvent(1);
       }
       return false;
    }
}
