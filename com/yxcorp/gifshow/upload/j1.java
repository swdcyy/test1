package com.yxcorp.gifshow.upload.j1;
import erd.g;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import ekd.p0;
import java.util.Objects;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Long;
import java.lang.Throwable;

public class j1 implements g	// class@001e86
{
    public final long b;
    public final UploadInfo c;
    public final long d;
    public final SegmentUploader e;

    public void j1(SegmentUploader p0,long p1,UploadInfo p2,long p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j1.class, "1")) {
       }else {
          String str = p0.n().request().url().host();
          String str1 = p0.o(p0.n().request().url().url().toString());
          SegmentUploader e = this.e.e;
          long l = p0.n().sentRequestAtMillis();
          j1 tb = this.b;
          j1 tc = this.c;
          j1 td = this.d;
          Objects.requireNonNull(e);
          p0 = o1.class;
          if (PatchProxy.isSupport(p0)) {
             Object[] objArray = new Object[]{Long.valueOf(l),Long.valueOf(tb),str1,str,tc,Long.valueOf(td)};
             if (!PatchProxy.applyVoid(objArray, e, p0, "1")) {
             }
          }else {
          }
       }
       return;
    }
}
