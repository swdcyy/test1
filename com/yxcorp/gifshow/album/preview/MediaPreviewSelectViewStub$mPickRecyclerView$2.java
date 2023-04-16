package com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$mPickRecyclerView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewSelectViewBinder;
import kotlin.jvm.internal.a;

public final class MediaPreviewSelectViewStub$mPickRecyclerView$2 extends Lambda implements a	// class@001a3d
{
    public final MediaPreviewSelectViewStub this$0;

    public void MediaPreviewSelectViewStub$mPickRecyclerView$2(MediaPreviewSelectViewStub p0){
       this.this$0 = p0;
       super(0);
    }
    public final AlbumSelectRecyclerView invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MediaPreviewSelectViewStub obj = PatchProxy.apply(objArray, this, MediaPreviewSelectViewStub$mPickRecyclerView$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.z;
       Objects.requireNonNull(obj);
       AbsPreviewSelectViewBinder uAbsPreviewS = PatchProxy.apply(objArray, obj, AbsPreviewSelectViewBinder.class, "1");
       if (uAbsPreviewS != patchProxyRe) {
       }else {
          uAbsPreviewS = obj.e;
          if (uAbsPreviewS == null) {
             a.S("pickRecyclerView");
          }
       }
       return uAbsPreviewS;
    }
    public Object invoke(){
       return this.invoke();
    }
}
