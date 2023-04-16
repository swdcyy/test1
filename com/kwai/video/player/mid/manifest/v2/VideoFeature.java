package com.kwai.video.player.mid.manifest.v2.VideoFeature;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class VideoFeature implements Serializable, Cloneable	// class@000b71
{
    public float mAvgEntropy;
    public float mBlockyProbability;
    public float mBlurProbability;
    public float mMosScore;

    public void VideoFeature(){
       super();
    }
    public VideoFeature clone(){
       Object obj = PatchProxy.apply(null, this, VideoFeature.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public float getAvgEntropy(){
       return this.mAvgEntropy;
    }
    public float getBlockyProbability(){
       return this.mBlockyProbability;
    }
    public float getBlurProbability(){
       return this.mBlurProbability;
    }
    public float getMosScore(){
       return this.mMosScore;
    }
}
