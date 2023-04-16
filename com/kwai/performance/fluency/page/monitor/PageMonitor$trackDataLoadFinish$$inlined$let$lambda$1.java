package com.kwai.performance.fluency.page.monitor.PageMonitor$trackDataLoadFinish$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import java.lang.String;
import java.lang.Object;
import gf7.a;
import qrd.l1;
import kotlin.jvm.internal.a;
import ef7.b;
import java.util.Map;
import java.util.LinkedList;
import gf7.h;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import java.lang.Long;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import java.text.SimpleDateFormat;
import java.util.Locale;
import gf7.g;
import hf7.c;
import java.io.File;
import com.kwai.performance.fluency.page.monitor.PageMonitorFileManager;
import java.lang.StringBuilder;
import java.util.Objects;
import com.kwai.performance.fluency.page.monitor.utils.ScreenshotUtil$captureScreenshot$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import java.lang.Exception;
import yf7.h;

public final class PageMonitor$trackDataLoadFinish$$inlined$let$lambda$1 extends Lambda implements l	// class@001092
{
    public final PageStageEvent $it$inlined;
    public final long $onRequestEndTs$inlined;
    public final String $pageKey$inlined;
    public final String $pageName$inlined;
    public final Object $pageObj$inlined;
    public final View $rootView$inlined;

    public void PageMonitor$trackDataLoadFinish$$inlined$let$lambda$1(View p0,long p1,PageStageEvent p2,String p3,Object p4,String p5){
       this.$rootView$inlined = p0;
       this.$onRequestEndTs$inlined = p1;
       this.$it$inlined = p2;
       this.$pageKey$inlined = p3;
       this.$pageObj$inlined = p4;
       this.$pageName$inlined = p5;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       h oh1;
       String str;
       a.p(p0, "calculateEvent");
       b n = b.n;
       if (!n.e().containsKey(this.$pageKey$inlined)) {
          n.e().put(this.$pageKey$inlined, new LinkedList());
       }
       if ((p0.e() - this.$onRequestEndTs$inlined) - (long)2000 > 0) {
          LinkedList linkedList = n.e().get(this.$pageKey$inlined);
          if (linkedList != null) {
             a.p(p0, "$this$clone");
             a uoa = new a();
             uoa.a = p0.g();
             uoa.k(p0.d());
             uoa.l(p0.e());
             uoa.f = p0.f;
             uoa.g = p0.g;
             h oh = p0.f();
             a.p(oh, "$this$clone");
             oh1 = new h(oh.e(), oh.g(), oh.f(), oh.h(), oh.b(), oh.c(), oh.d(), oh.a());
             uoa.m(v1);
             linkedList.add(uoa);
          }
       }
       if (p0.g()) {
          PageMonitor iNSTANCE = PageMonitor.INSTANCE;
          iNSTANCE.trackFinishDraw(this.$pageObj$inlined, Long.valueOf(p0.e()));
          char c = '_';
          if (iNSTANCE.getMonitorConfig().k != null) {
             File uFile = new File(PageMonitorFileManager.c.a(), this.$it$inlined.pageCode+c+new SimpleDateFormat("HH_mm_ss_SSS", Locale.getDefault()).format(Long.valueOf(g.b(this.$it$inlined, "OnFinishDraw")))+c+this.$it$inlined.uuid+c+p0.d()+".dat");
             Objects.requireNonNull(c.b);
             try{
                oh1 = 0;
                Monitor_ThreadKt.b(oh1, new ScreenshotUtil$captureScreenshot$1(uFile), 1, null);
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
                h.b("ScreenshotUtil", "take screenshot to bitmap of activity , Error: "+e0);
             }
          }
       }
    label_0182 :
       return;
    }
}
