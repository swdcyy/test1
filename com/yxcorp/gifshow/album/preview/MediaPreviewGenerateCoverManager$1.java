package com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$1;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MediaPreviewGenerateCoverManager$1 extends LinkedHashMap	// class@001a2e
{
    public final MediaPreviewGenerateCoverManager this$0;

    public void MediaPreviewGenerateCoverManager$1(MediaPreviewGenerateCoverManager p0,int p1,float p2,boolean p3){
       this.this$0 = p0;
       super(p1, p2, p3);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MediaPreviewGenerateCoverManager$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > 4)? true: false;
       return b;
    }
}
