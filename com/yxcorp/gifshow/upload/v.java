package com.yxcorp.gifshow.upload.v;
import f36.b;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Object;
import wkd.b;
import gnc.b;
import ojd.f;
import brd.t;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.postwork.e;
import okhttp3.MultipartBody$Part;
import ojd.e;
import t45.d;
import brd.z;
import dnc.m;
import erd.o;
import brd.w;
import dnc.j;
import erd.g;
import cjd.a;
import dnc.k;
import dnc.l;
import com.yxcorp.gifshow.upload.t;
import com.yxcorp.gifshow.upload.u;
import com.yxcorp.gifshow.upload.s;

public class v implements b	// class@001eb3
{
    public b a;
    public o1 b;
    public final b c;

    public void v(b p0,o1 p1){
       super();
       this.c = b.a(-1142264700);
       this.a = p0;
       this.b = p1;
    }
    public t a(Object p0,f p1){
       v ov = v.class;
       File obj = PatchProxy.applyTwoRefs(p0, p1, this, ov, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = null;
          if (p0.getOriginCoverFile() != null) {
             obj = new File(p0.getOriginCoverFile().getAbsolutePath());
          }
          if (obj != null && PostExperimentUtils.c0()) {
             t ot = PatchProxy.applyTwoRefs(p0, obj, this, ov, "3");
             if (ot != PatchProxyResult.class) {
             }else {
                e.a().d(e.c(p0), "start_upload_cover");
                ot = this.c.k(e.d("cover", obj)).observeOn(d.c).map(new m(p0));
             }
             Object obj1 = ot;
             t ot1 = this.b(p0);
             Object obj2 = PatchProxy.applyFourRefs(obj1, ot1, p0, p1, this, v.class, "4");
             if (obj2 != PatchProxyResult.class) {
                obj = obj2;
             }else {
                obj = t.concat(obj1, ot1).doOnNext(a.a(new j(this, p0))).doOnError(a.a(new k(this, p0))).takeLast(1).flatMap(new l(this, p0, p1));
             }
          }else {
             obj = this.b(p0).doOnNext(a.a(new t(this, p0))).doOnError(a.a(new u(this, p0))).flatMap(new s(this, p0, p1));
          }
       }
       return obj;
    }
    public final t b(UploadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e.a().d(e.c(p0), "start_upload_cover");
       return this.c.k(e.d("cover", new File(p0.getCoverFile().getAbsolutePath()))).observeOn(d.c);
    }
    public void cancel(){
    }
}
