package com.kwai.video.player.mid.manifest.v2.Representation$Builder;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.video.player.mid.manifest.v2.Representation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.mid.manifest.v2.Representation$1;
import java.util.List;
import java.util.Collection;

public class Representation$Builder	// class@000b6e
{
    public int mAvgBitrate;
    public List mBackupUrls;
    public int mHeight;
    public String mMailUrl;
    public int mMaxBitrate;
    public int mWidth;

    public void Representation$Builder(){
       super();
       this.mBackupUrls = new ArrayList();
    }
    public Representation build(){
       Object obj = PatchProxy.apply(null, this, Representation$Builder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Representation(this, null);
    }
    public Representation$Builder setAvgBitrate(int p0){
       this.mAvgBitrate = p0;
       return this;
    }
    public Representation$Builder setBackupUrls(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Representation$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.mBackupUrls.addAll(p0);
       }
       return this;
    }
    public Representation$Builder setHeight(int p0){
       this.mHeight = p0;
       return this;
    }
    public Representation$Builder setMainUrl(String p0){
       this.mMailUrl = p0;
       return this;
    }
    public Representation$Builder setMaxBitrate(int p0){
       this.mMaxBitrate = p0;
       return this;
    }
    public Representation$Builder setWidth(int p0){
       this.mWidth = p0;
       return this;
    }
}
