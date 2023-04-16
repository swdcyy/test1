package com.yxcorp.gifshow.upload.e0$c$c;
import erd.g;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Object;
import com.yxcorp.gifshow.music.upload.UploadLocalMusicResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ojd.f;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.upload.e0;
import com.yxcorp.gifshow.upload.f0;
import java.lang.Runnable;
import android.os.Handler;

public class e0$c$c implements g	// class@001e6f
{
    public final e0$c b;

    public void e0$c$c(e0$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$c$c.class, "1")) {
       }else {
          e0$c d = this.b.d;
          if (d != null) {
             d.a(100, 100, this);
          }
          this.b.b.mStatus = IUploadInfo$Status.COMPLETE;
          p0.setOriginResponse(a.a.q(p0));
          this.b.b.mUploadResult = p0;
          p0.mPath = this.b.b.getFilePath();
          p0.mFileId = this.b.b.getFileId();
          p0.mCoverPath = this.b.b.getCoverPath();
          p0 = this.b;
          p0.o.c(p0.b);
          this.b.o.b.post(new f0(this));
       }
       return;
    }
}
