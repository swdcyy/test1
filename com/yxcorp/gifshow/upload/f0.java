package com.yxcorp.gifshow.upload.f0;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.e0$c$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.upload.e0$c;
import com.yxcorp.gifshow.upload.e0;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.util.Map;

public class f0 implements Runnable	// class@001e78
{
    public final e0$c$c b;

    public void f0(e0$c$c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       e0$c$c b = this.b.b;
       b.o.e.remove(b.b.getFileId());
       return;
    }
}
