package com.yxcorp.gifshow.upload.e0$c$g;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.upload.e0;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.util.Map;

public class e0$c$g implements Runnable	// class@001e73
{
    public final e0$c b;

    public void e0$c$g(e0$c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e0$c$g.class, "1")) {
          return;
       }
       e0$c$g tb = this.b;
       tb.o.e.remove(tb.b.getFileId());
       return;
    }
}
