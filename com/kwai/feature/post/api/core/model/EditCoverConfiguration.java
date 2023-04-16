package com.kwai.feature.post.api.core.model.EditCoverConfiguration;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class EditCoverConfiguration implements Serializable	// class@001304
{
    public double mAbsTimePoint;
    public double mPosition;
    public final boolean mSaveToFinalCover;
    public int mTrackIndex;
    public static final long serialVersionUID = 0x11739e8bd0d98aed;

    public void EditCoverConfiguration(double p0,boolean p1){
       super();
       this.mTrackIndex = 0;
       this.mPosition = 0;
       this.mAbsTimePoint = 0;
       this.mSaveToFinalCover = p1;
       this.mAbsTimePoint = p0;
    }
    public void EditCoverConfiguration(int p0,double p1,boolean p2){
       super();
       this.mTrackIndex = 0;
       this.mPosition = 0;
       this.mAbsTimePoint = 0;
       this.mTrackIndex = p0;
       this.mPosition = p1;
       this.mSaveToFinalCover = p2;
    }
    public double getAbsTimePoint(){
       return this.mAbsTimePoint;
    }
    public double getPosition(){
       return this.mPosition;
    }
    public int getTrackIndex(){
       return this.mTrackIndex;
    }
    public boolean isSaveToFinalCover(){
       return this.mSaveToFinalCover;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditCoverConfiguration.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EditCoverConfiguration{mTrackIndex="+this.mTrackIndex+", mPosition="+this.mPosition+", mSaveToFinalCover="+this.mSaveToFinalCover+'}';
    }
}
