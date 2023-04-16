package com.yxcorp.gifshow.upload.k0;
import erd.o;
import com.yxcorp.gifshow.upload.o0;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import android.util.Pair;
import com.yxcorp.gifshow.postwork.a;
import java.lang.String;
import r26.a;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import qq.a;
import w46.b;
import java.lang.Exception;
import java.lang.Throwable;
import brd.t;
import q87.c;
import njd.a;
import dnc.i1;

public final class k0 implements o	// class@001e88
{
    public final o0 b;
    public final UploadInfo c;

    public void k0(o0 p0,UploadInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       Object[] objArray;
       k0 tb = this.b;
       k0 tc = this.c;
       PostWorkInfo postWorkInfo = tb.b().c4(tc.getId());
       int i = 0;
       if (postWorkInfo == null) {
          objArray = new Object[i];
          a.D().t("PipelineUploader", "postWorkInfo is null, please check", objArray);
          p0 = t.error(new Exception("PostWorkInfo is null, please check"));
       }else if(!postWorkInfo.isPublished()){
          objArray = new Object[i];
          a.D().w("PipelineUploader", "postWorkInfo is not published, don\'t call publish", objArray);
          a uoa = new a(null, 0, null, null, 0, 0);
          p0 = t.just(a.D());
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("PipelineUploader", "upload\(\) flatmap", objArray1);
          if (tc.mEditCoverUploadedSubject != null) {
             Object[] objArray2 = new Object[i];
             a.D().w("PipelineUploader", "upload\(\) waiting share page update cover key", objArray2);
             p0 = tc.mEditCoverUploadedSubject.flatMap(new i1(tb, p0));
          }else {
             p0 = tb.c(p0.first);
          }
       }
       return p0;
    }
}
