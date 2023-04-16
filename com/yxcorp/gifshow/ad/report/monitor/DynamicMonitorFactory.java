package com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory;
import cm9.b;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import msd.l;
import cm9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import p49.h;
import jd6.g;
import ul9.a;
import p49.b;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import nl9.e;
import android.view.View;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory$createUiMonitor$1;

public final class DynamicMonitorFactory implements b	// class@0017b8
{
    public static final DynamicMonitorFactory$a b;
    public static final DynamicMonitorFactory c;

    static {
       DynamicMonitorFactory.c = new DynamicMonitorFactory();
       DynamicMonitorFactory.b = new DynamicMonitorFactory$a();
    }
    public void DynamicMonitorFactory(){
       super();
    }
    public static final DynamicMonitorFactory$a a(DynamicMonitorFactory p0){
       return DynamicMonitorFactory.b;
    }
    public a F(String p0,String p1,BaseFeed p2,t p3,l p4){
       DynamicMonitorFactory$a uoa;
       DynamicMonitorFactory uDynamicMoni = DynamicMonitorFactory.class;
       if (PatchProxy.isSupport(uDynamicMoni)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uDynamicMoni, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "pageKey");
       a.p(p1, "eventId");
       a.p(p2, "feed");
       if (!h.a.a()) {
          uoa = DynamicMonitorFactory.a(this);
       }else if(g.e("commercial_ad_monitor") || a.a.g("commercial_ad_monitor")){
          uoa = d.a(0x7c2201b0).F(p0, p1, p2, p3, p4);
       }else {
          a.d("commercial_ad_monitor", 0, 0, 0, 14, null).onTerminateDetach().subscribe(new b("commercial_ad_monitor"));
          uoa = DynamicMonitorFactory.a(this);
       }
       return uoa;
    }
    public a S(Object p0,String p1,View p2,l p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, DynamicMonitorFactory.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "pageKey");
       a.p(p2, "rootView");
       if (!h.a.a()) {
          p0 = DynamicMonitorFactory.a(this);
       }else if(g.e("commercial_ad_monitor") || a.a.g("commercial_ad_monitor")){
          p0 = d.a(0x7c2201b0).S(p0, p1, p2, p3);
       }else {
          a.d("commercial_ad_monitor", 0, 0, 0, 14, null).onTerminateDetach().subscribe(new b("commercial_ad_monitor"));
          p0 = DynamicMonitorFactory.a(this);
       }
       return p0;
    }
    public final a b(BaseFeed p0,String p1,View p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DynamicMonitorFactory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feed");
       a.p(p1, "pageKey");
       a.p(p2, "rootView");
       return this.S(p0, p1, p2, new DynamicMonitorFactory$createUiMonitor$1(p0));
    }
    public a n(Object p0,String p1,l p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DynamicMonitorFactory.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "originData");
       a.p(p1, "dataTypeKey");
       if (!h.a.a()) {
          p0 = DynamicMonitorFactory.a(this);
       }else if(g.e("commercial_ad_monitor") || a.a.g("commercial_ad_monitor")){
          p0 = d.a(0x7c2201b0).n(p0, p1, p2);
       }else {
          a.d("commercial_ad_monitor", 0, 0, 0, 14, null).onTerminateDetach().subscribe(new b("commercial_ad_monitor"));
          p0 = DynamicMonitorFactory.a(this);
       }
       return p0;
    }
}
