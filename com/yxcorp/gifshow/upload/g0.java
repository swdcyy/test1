package com.yxcorp.gifshow.upload.g0;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.upload.e0;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.util.Map;

public class g0 implements Runnable	// class@001e7b
{
    public final e0$c b;

    public void g0(e0$c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, g0.class, "1")) {
          return;
       }
       g0 tb = this.b;
       tb.o.e.remove(tb.b.getFileId());
       return;
    }
}
