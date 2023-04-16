package com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$container$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewSelectViewBinder;

public final class MediaPreviewSelectViewStub$container$2 extends Lambda implements a	// class@001a37
{
    public final MediaPreviewSelectViewStub this$0;

    public void MediaPreviewSelectViewStub$container$2(MediaPreviewSelectViewStub p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewGroup invoke(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewSelectViewStub$container$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.z.a;
    }
    public Object invoke(){
       return this.invoke();
    }
}
