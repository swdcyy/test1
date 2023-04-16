package com.kwai.performance.fluency.page.monitor.PageMonitorConfig$Builder;
import yf7.f$a;
import java.lang.Object;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig$Builder$build$1;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig$Builder$build$2;
import msd.a;
import msd.l;
import yf7.f;

public final class PageMonitorConfig$Builder implements f$a	// class@001096
{
    public l a;
    public a b;
    public l c;
    public l d;
    public boolean e;
    public boolean f;
    public boolean g;
    public a h;
    public l i;
    public l j;
    public a k;
    public a l;

    public void PageMonitorConfig$Builder(){
       super();
    }
    public PageMonitorConfig a(){
       PageMonitorConfig$Builder tl = this.l;
       PageMonitorConfig$Builder tk = this.k;
       PageMonitorConfig$Builder tb = this.b;
       PageMonitorConfig$Builder tc = this.c;
       PageMonitorConfig$Builder ta = this.a;
       PageMonitorConfig$Builder ti = this.i;
       PageMonitorConfig$Builder td = this.d;
       if (td != null) {
       }else {
          td = PageMonitorConfig$Builder$build$1.INSTANCE;
       }
       PageMonitorConfig$Builder uBuilder = td;
       PageMonitorConfig$Builder te = this.e;
       PageMonitorConfig$Builder tf = this.f;
       PageMonitorConfig$Builder th = this.h;
       PageMonitorConfig$Builder tg = this.g;
       td = this.j;
       if (td == null) {
          PageMonitorConfig$Builder$build$2 iNSTANCE = PageMonitorConfig$Builder$build$2.INSTANCE;
       }
       PageMonitorConfig pageMonitorC = new PageMonitorConfig(tl, tk, tb, tc, ta, uBuilder, ti, td, tg, th, te, tf);
       return v13;
    }
    public f build(){
       return this.a();
    }
}
