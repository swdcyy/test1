package com.yxcorp.gifshow.upload.e0$c$a;
import com.yxcorp.gifshow.upload.d0$a;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Object;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.upload.e0;
import java.lang.Float;

public class e0$c$a implements d0$a	// class@001e6d
{
    public final e0$c a;

    public void e0$c$a(e0$c p0){
       this.a = p0;
       super();
    }
    public void a(IUploadInfo$Status p0,LocalMusicUploadInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e0$c$a.class, "1")) {
          return;
       }
       this.a.o.c(p1);
       return;
    }
    public void b(float p0,LocalMusicUploadInfo p1){
       if (PatchProxy.isSupport(e0$c$a.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, e0$c$a.class, "2")) {
          return;
       }
       this.a.o.b(p1);
       return;
    }
}
