package com.yxcorp.gifshow.upload.r1$b$a;
import com.kwai.feature.post.api.feature.upload.interfaces.a;
import com.yxcorp.gifshow.upload.r1$b;
import java.lang.Object;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.upload.r1;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;

public class r1$b$a implements a	// class@001e9f
{
    public final r1$b a;

    public void r1$b$a(r1$b p0){
       this.a = p0;
       super();
    }
    public void a(float p0,IUploadInfo p1){
       if (PatchProxy.isSupport(r1$b$a.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, r1$b$a.class, "2")) {
          return;
       }
       this.a.o.l(p1);
       return;
    }
    public void b(IUploadInfo$Status p0,IUploadInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r1$b$a.class, "1")) {
          return;
       }
       this.a.o.m(p1);
       return;
    }
}
