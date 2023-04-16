package com.kuaishou.live.core.show.coverandbackground.cover.b;
import java.lang.Object;
import io.reactivex.subjects.ReplaySubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import pm8.a;
import com.kuaishou.live.core.show.coverandbackground.cover.LiveLastAuditedCoverResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.reflect.Type;
import brd.t;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.live.core.show.coverandbackground.cover.b$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import d61.z;
import o02.f;
import o02.e;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.coverandbackground.cover.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class b	// class@000ae2
{
    public LiveLastAuditedCoverResponse a;
    public String b;
    public List c;
    public int d;
    public File e;
    public ReplaySubject f;
    public ReplaySubject g;

    public void b(){
       super();
       this.f = ReplaySubject.i(1);
       this.g = ReplaySubject.i(1);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b te = this.e;
       if (te != null && te.exists()) {
          this.e.delete();
       }
       this.e = null;
       File uFile = new File(a.x0());
       if (uFile.exists()) {
          uFile.delete();
          a.S1("");
       }
       a.T1("");
       a.U1(null);
       a.b2(false);
       return;
    }
    public File b(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.x0();
       if (!TextUtils.x(obj)) {
          objArray = new File(obj);
       }
       return objArray;
    }
    public String c(){
       LiveLastAuditedCoverResponse obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.y0(LiveLastAuditedCoverResponse.class);
       String str = (obj == null)? "": TextUtils.k(obj.mCaption);
       return str;
    }
    public t d(){
       return this.f;
    }
    public boolean e(){
       boolean b;
       File obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b();
       b = (obj != null && obj.exists())? true: false;
       return b;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       LiveLastAuditedCoverResponse liveLastAudi = a.y0(LiveLastAuditedCoverResponse.class);
       if (liveLastAudi == null) {
          return;
       }
       a.T1(liveLastAudi.mAuditedCoverId);
       return;
    }
    public void g(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "9")) {
          return;
       }
       uob = this.c;
       if (uob != null && (uob.isEmpty() || (p0 >= 0 && p0 < this.c.size()))) {
          String url = this.c.get(p0).getUrl();
          if (!TextUtils.x(url)) {
             File uFile = new File(b.a(-1504323719).o(), "audited_cover_"+url.hashCode());
             if (!uFile.exists()) {
                a.d(ImageRequestBuilder.k(w0.f(url)).a(), new b$a(this, uFile, new File(a.x0())));
             }else {
                this.e = uFile;
                this.f.onNext(uFile);
                this.f();
                a.b2(true);
             }
          }
       }
       return;
    }
    public void h(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (QCurrentUser.me().isLogined() && (LiveStreamStatus.AVAILABLE == z.a() || LiveStreamStatus.VOICEPARTY == z.a())) {
          e.a().c0(p0).map(new e()).subscribe(new a(this), Functions.d());
       }
       return;
    }
}
