package com.yxcorp.gifshow.upload.v1;
import erd.a;
import com.yxcorp.gifshow.upload.r1$b$b;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.upload.r1$b;
import qq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import lnc.j8;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import dnc.p2;
import com.yxcorp.gifshow.upload.u0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.upload.r0;
import erd.o;
import dnc.p1;
import java.lang.Runnable;
import dnc.o1;
import erd.g;
import crd.b;

public final class v1 implements a	// class@001eb2
{
    public final r1$b$b b;

    public void v1(r1$b$b p0){
       this.b = p0;
    }
    public final void run(){
       v1 tb = this.b;
       File uFile = tb.b.a();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("UploadManager", "Upload complete. Clean editing workspace "+uFile, objArray);
       boolean b = j8.c();
       UploadResult mPhotoId = (tb.b.b.mUploadResult != null)? tb.b.b.mUploadResult.mPhotoId: null;
       p2 op2 = new p2(tb);
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0)) {
          Object[] objArray1 = new Object[]{uFile,Boolean.valueOf(b),Boolean.TRUE,mPhotoId,op2};
          if (!PatchProxy.applyVoid(objArray1, null, ou0, "2")) {
          label_0069 :
             if (uFile == null || !uFile.exists()) {
                op2.run();
             }else {
                DraftFileManager.E().X(uFile).observeOn(d.c).flatMap(r0.b).observeOn(d.a).subscribe(new p1(1, mPhotoId, b, op2), new o1(op2, uFile));
             }
          }
       }else {
          goto label_0069 ;
       }
       return;
    }
}
