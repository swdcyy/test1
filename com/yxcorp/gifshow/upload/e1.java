package com.yxcorp.gifshow.upload.e1;
import erd.o;
import com.yxcorp.gifshow.upload.g1;
import com.yxcorp.gifshow.upload.SegmentResponse;
import java.lang.Object;
import java.lang.Integer;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import com.yxcorp.retrofit.model.ActionResponse;
import brd.t;
import java.lang.Math;
import java.util.Objects;
import java.lang.Long;
import ojd.f;
import dnc.z1;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.System;
import java.util.HashMap;
import java.io.File;
import ojd.e;
import okhttp3.MediaType;
import okhttp3.MultipartBody$Part;
import java.util.Map;
import com.yxcorp.gifshow.retrofit.service.KwaiSegmentUploadService;
import com.yxcorp.gifshow.upload.m1;
import erd.r;
import com.yxcorp.gifshow.upload.n1;
import erd.g;
import cjd.a;
import dnc.w1;
import com.yxcorp.gifshow.upload.v0;
import cjd.e;

public class e1 implements o	// class@001e76
{
    public final SegmentResponse b;
    public final g1 c;

    public void e1(g1 p0,SegmentResponse p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       z1 oz1;
       t ot1;
       a uoa;
       Object obj = this;
       Object[] obj1 = p0;
       SegmentUploader segmentUploa = SegmentUploader.class;
       t ot = PatchProxy.applyOneRefs(obj1, obj, e1.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(obj.c.d.l[obj1.intValue()]){
          ot = t.just(new ActionResponse());
       }else {
          int i = obj.b.mPartSize * obj1.intValue();
          long l = (long)obj.b.mPartSize;
          int i1 = 1;
          if (obj1.intValue() == (obj.c.d.g - i1)) {
             l = (long)Math.min((obj.c.b - i), obj.b.mPartSize);
          }
          long l1 = l;
          e1 c = obj.c;
          g1 d = c.d;
          g1 c1 = c.c;
          int i2 = obj1.intValue();
          SegmentResponse mFileKey = obj.b.mFileKey;
          g1 d1 = obj.c.d;
          int i3 = obj1.intValue();
          g1 c2 = obj.c.c;
          Objects.requireNonNull(d1);
          if (PatchProxy.isSupport(segmentUploa)) {
             oz1 = PatchProxy.applyThreeRefs(Integer.valueOf(i3), Long.valueOf(l1), c2, d1, SegmentUploader.class, "6");
             if (oz1 != PatchProxyResult.class) {
             label_009e :
                Objects.requireNonNull(d);
                if (PatchProxy.isSupport(segmentUploa)) {
                   obj1 = new Object[]{c1,Integer.valueOf(i2),mFileKey,Integer.valueOf(i),Long.valueOf(l1),oz1};
                   ot1 = PatchProxy.apply(obj1, d, segmentUploa, "4");
                   if (ot1 != PatchProxyResult.class) {
                   label_016d :
                      ot = ot1.map(new e());
                   }
                }
                long l2 = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("fileKey", mFileKey);
                hashMap.put("partIndex", String.valueOf(i2));
                File uFile = new File(c1.getFilePath());
                long l3 = uFile.length();
                MultipartBody$Part part = e.e("partFile", uFile, i, l1, oz1, e.b);
                ot1 = d.a.segmentUploadFile(e.a(hashMap), part);
                n1 on1 = new n1(d, l3, l2, c1, i2);
                ot1 = ot1.retry(3, new m1(d)).doOnNext(a.a(part)).doOnError(new w1(d));
                if (PatchProxy.isSupport(segmentUploa)) {
                   uoa = PatchProxy.applyFourRefs(Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(l1), c1, d, SegmentUploader.class, "5");
                   if (uoa != PatchProxyResult.class) {
                   label_0169 :
                      ot1 = ot1.doOnError(uoa);
                      goto label_016d ;
                   }
                }
                v0 ov0 = new v0(d, l3, l1, l2, c1);
                uoa = a.a(uoa);
                goto label_0169 ;
             }
          }
          oz1 = new z1(d1, i3, c2);
          goto label_009e ;
       }
       return ot;
    }
}
