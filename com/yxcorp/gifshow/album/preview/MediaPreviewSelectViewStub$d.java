package com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MediaPreviewSelectViewStub$d implements Observer	// class@001a38
{
    public final MediaPreviewSelectViewStub b;

    public void MediaPreviewSelectViewStub$d(MediaPreviewSelectViewStub p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewSelectViewStub$d.class, "1")) {
       }else {
          a.h(p0, "position");
          this.b.i(p0.intValue());
       }
       return;
    }
}
