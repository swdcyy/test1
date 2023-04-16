package com.kwai.feature.post.api.feature.memory.MemoryJsonData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MemoryJsonData implements Serializable	// class@0013b0
{
    public String mCoverPath;
    public String mMusicId;
    public double mMusicStartTime;
    public String mMusicType;
    public int mProjectOutputHeight;
    public int mProjectOutputWidth;
    public List mTrackAsset;

    public void MemoryJsonData(){
       super();
    }
    public String getCoverPath(){
       return this.mCoverPath;
    }
    public String getMusicId(){
       return this.mMusicId;
    }
    public double getMusicStartTime(){
       return this.mMusicStartTime;
    }
    public String getMusicType(){
       return this.mMusicType;
    }
    public int getProjectOutputHeight(){
       return this.mProjectOutputHeight;
    }
    public int getProjectOutputWidth(){
       return this.mProjectOutputWidth;
    }
    public List getTrackAsset(){
       return this.mTrackAsset;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MemoryJsonData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MemoryJsonData{mMusicId=\'"+this.mMusicId+'''+", mProjectOutputWidth="+this.mProjectOutputWidth+", mProjectOutputHeight="+this.mProjectOutputHeight+'}';
    }
}
