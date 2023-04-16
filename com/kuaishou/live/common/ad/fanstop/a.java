package com.kuaishou.live.common.ad.fanstop.a;
import x81.c;
import com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener$FansTopStatus;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import h91.a;
import y81.c;
import y81.b;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.live.common.ad.fanstop.a$a;
import com.kuaishou.live.common.ad.fanstop.a$b;
import erd.g;
import crd.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import android.net.Uri;
import android.net.Uri$Builder;
import java.lang.Number;
import android.content.Context;
import lnc.a1;
import com.yxcorp.utility.n;
import android.app.Application;
import o56.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nl9.a0;
import com.kuaishou.live.common.ad.fanstop.a$c;
import com.kuaishou.live.common.ad.fanstop.a$d;

public class a extends c	// class@000e67
{
    public UpdateFansTopStatusListener$FansTopStatus a;
    public PublishSubject b;
    public static boolean c = true;

    public void a(){
       super();
       this.a = UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_UNSELECTED;
       this.b = PublishSubject.g();
    }
    public static a g(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1765983867);
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       b.b().a().map(new e()).observeOn(d.a).subscribe(new a$a(this, p0), new a$b(this, p0));
       return;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c("ENTRANCE_LIVE");
    }
    public String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Uri.parse(WebEntryUrls.g0+p0).buildUpon().toString();
    }
    public UpdateFansTopStatusListener$FansTopStatus d(){
       return this.a;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = n.w(a1.c());
       if (i >= (n.z(a.b()) * 2)) {
          return (int)((float)i * 0x3f333333);
       }
       return (int)((float)i * 0x3f400000);
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "3";
       String str1 = "layoutType";
       if (a.t().d("enableUseFansTopNewUrl", false)) {
          return Uri.parse(WebEntryUrls.f0).buildUpon().appendQueryParameter(str1, str).appendQueryParameter("hyId", "live_index_fanstop").toString();
       }
       return Uri.parse(WebEntryUrls.e0).buildUpon().appendQueryParameter(str1, str).toString();
    }
    public String h(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return this.b();
       }else if(p1 && d.a(-61392074).g50()){
          return this.b();
       }else {
          return this.f();
       }
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.j(p0, false);
       return;
    }
    public void j(a p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "9")) {
          return;
       }
       b.b().b().map(new e()).observeOn(d.a).subscribe(new a$c(this, p0, p1), new a$d(this, p0, p1));
       return;
    }
    public void k(UpdateFansTopStatusListener$FansTopStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       this.b.onNext(p0);
       return;
    }
}
