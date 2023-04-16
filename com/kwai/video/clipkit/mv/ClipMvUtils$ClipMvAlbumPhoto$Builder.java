package com.kwai.video.clipkit.mv.ClipMvUtils$ClipMvAlbumPhoto$Builder;
import java.lang.Object;
import com.kwai.video.clipkit.mv.ClipMvUtils$ClipMvAlbumPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.mv.ClipMvUtils$1;
import java.util.ArrayList;

public class ClipMvUtils$ClipMvAlbumPhoto$Builder	// class@001aa3
{
    public String assetTag;
    public String customImagePath;
    public double duration;
    public int groupId;
    public ArrayList paths;
    public String textMarker;

    public void ClipMvUtils$ClipMvAlbumPhoto$Builder(){
       super();
    }
    public ClipMvUtils$ClipMvAlbumPhoto build(){
       Object obj = PatchProxy.apply(null, this, ClipMvUtils$ClipMvAlbumPhoto$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ClipMvUtils$ClipMvAlbumPhoto(this, null);
    }
    public void setAssetTag(String p0){
       this.assetTag = p0;
    }
    public void setCustomImagePath(String p0){
       this.customImagePath = p0;
    }
    public void setDuration(double p0){
       this.duration = p0;
    }
    public void setGroupId(int p0){
       this.groupId = p0;
    }
    public void setPaths(ArrayList p0){
       this.paths = p0;
    }
    public void setTextMarker(String p0){
       this.textMarker = p0;
    }
}
