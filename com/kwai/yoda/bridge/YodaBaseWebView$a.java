package com.kwai.yoda.bridge.YodaBaseWebView$a;
import com.kuaishou.webkit.extension.KsWebPaintEventListener;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import yz7.r;
import nz7.e;
import com.kwai.yoda.bridge.g;
import sz7.l;
import java.lang.Boolean;
import com.kwai.yoda.session.logger.webviewload.LCPDetail;
import java.lang.Double;
import com.kwai.yoda.session.logger.webviewload.CLSDetail;

public class YodaBaseWebView$a extends KsWebPaintEventListener	// class@00117f
{
    public final YodaBaseWebView a;

    public void YodaBaseWebView$a(YodaBaseWebView p0){
       this.a = p0;
       super();
    }
    public void OnTimeToInteractive(long p0){
       YodaBaseWebView$a uoa = YodaBaseWebView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "7")) {
          return;
       }
       super.OnTimeToInteractive(p0);
       r.h("YodaBaseWebView", "--- OnTimeToInteractive, timeInMillis:"+p0);
       this.a.getSessionLogger().w("interactive");
       return;
    }
    public void onFirstContentfulPaint(long p0){
       YodaBaseWebView$a uoa = YodaBaseWebView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "4")) {
          return;
       }
       super.onFirstContentfulPaint(p0);
       this.a.getSessionLogger().w("first_content_paint");
       r.b("YodaBaseWebView", "--- onFirstContentfulPaint, timeMills:"+p0);
       g yodaWebViewC = this.a.getYodaWebViewClient();
       if (yodaWebViewC != null) {
          yodaWebViewC.k(p0);
       }
       return;
    }
    public void onFirstInputDelay(long p0){
       YodaBaseWebView$a uoa = YodaBaseWebView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "6")) {
          return;
       }
       super.onFirstInputDelay(p0);
       r.h("YodaBaseWebView", "--- onFirstInputDelay, timeDelayInMillis:"+p0);
       this.a.getSessionPageInfoModule().fid = Long.valueOf(p0);
       return;
    }
    public void onFirstMeaningfulPaint(long p0){
       YodaBaseWebView$a uoa = YodaBaseWebView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "3")) {
          return;
       }
       super.onFirstMeaningfulPaint(p0);
       this.a.getSessionLogger().w("first_meaningful_paint");
       r.h("YodaBaseWebView", "--- onFirstMeaningfulPaint, timeMills:"+p0);
       return;
    }
    public void onFirstPaint(long p0){
       YodaBaseWebView$a uoa = YodaBaseWebView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "2")) {
          return;
       }
       super.onFirstPaint(p0);
       this.a.disposeBlankCheck();
       this.a.getSessionLogger().w("first_paint");
       r.b("YodaBaseWebView", "--- onFirstPaint, timeMills:"+p0);
       this.a.getYodaWebViewClient();
       return;
    }
    public void onFirstVisuallyNonEmptyPaint(long p0){
       YodaBaseWebView$a uoa = YodaBaseWebView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "1")) {
          return;
       }
       super.onFirstVisuallyNonEmptyPaint(p0);
       this.a.getSessionLogger().w("first_non_empty_paint");
       r.b("YodaBaseWebView", "--- onFirstVisuallyNonEmptyPaint, timeMills:"+p0);
       this.a.getYodaWebViewClient();
       return;
    }
    public void onLargestContentfulPaint(boolean p0,long p1,long p2){
       if (PatchProxy.isSupport(YodaBaseWebView$a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, YodaBaseWebView$a.class, "5")) {
          return;
       }
       super.onLargestContentfulPaint(p0, p1, p2);
       this.a.getSessionPageInfoModule().firstLcp = (this.a.getSessionPageInfoModule().firstLcp == null)? new LCPDetail(Boolean.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2)): new LCPDetail(Boolean.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2));
       r.h("YodaBaseWebView", "--- onLargestContentfulPaint, isText:"+p0+", size:"+p1+", timeInMillis:"+p2);
       return;
    }
    public void onLayoutShift(double p0,boolean p1,long p2){
       if (PatchProxy.isSupport(YodaBaseWebView$a.class) && PatchProxy.applyVoidThreeRefs(Double.valueOf(p0), Boolean.valueOf(p1), Long.valueOf(p2), this, YodaBaseWebView$a.class, "8")) {
          return;
       }
       super.onLayoutShift(p0, p1, p2);
       if (!p1) {
          this.a.getSessionPageInfoModule().lastCls = new CLSDetail(Double.valueOf(p0), Boolean.valueOf(p1), Long.valueOf(p2));
       }
       r.h("YodaBaseWebView", "--- onLayoutShift, score:"+p0+", afterInputOrScroll:"+p1+", timeInMillis:"+p2);
       return;
    }
}
