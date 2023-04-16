package com.yxcorp.gifshow.upload.e0$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.e0;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e0$b implements Runnable	// class@001e6c
{
    public final LocalMusicUploadInfo b;
    public final e0 c;

    public void e0$b(e0 p0,LocalMusicUploadInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e0$b.class, "1")) {
          return;
       }
       this.c.b(this.b);
       return;
    }
}
