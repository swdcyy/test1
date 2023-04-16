package com.yxcorp.gifshow.album.preview.MediaPreviewFragment$a;
import android.os.Handler;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class MediaPreviewFragment$a extends Handler	// class@001a28
{
    public final MediaPreviewFragment a;

    public void MediaPreviewFragment$a(MediaPreviewFragment p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewFragment$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       this.a.fh();
       return;
    }
}
