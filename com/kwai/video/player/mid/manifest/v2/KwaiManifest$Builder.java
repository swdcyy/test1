package com.kwai.video.player.mid.manifest.v2.KwaiManifest$Builder;
import java.lang.Object;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest$1;
import java.util.List;
import java.util.Iterator;
import com.kwai.video.player.mid.manifest.v2.Representation;

public class KwaiManifest$Builder	// class@000b67
{
    public int mMediaType;
    public List mRepresentation;

    public void KwaiManifest$Builder(){
       super();
    }
    public KwaiManifest build(){
       Object obj = PatchProxy.apply(null, this, KwaiManifest$Builder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiManifest(this, null);
    }
    public KwaiManifest$Builder setMediaType(int p0){
       this.mMediaType = p0;
       return this;
    }
    public KwaiManifest$Builder setRepresentations(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiManifest$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mRepresentation = p0;
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          iterator.next().mId = i;
          i = i1;
       }
       return this;
    }
}
