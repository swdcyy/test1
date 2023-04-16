package com.yxcorp.gifshow.aicut.api.MusicAnalysisResult;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.api.MusicBeats;

public final class MusicAnalysisResult implements Serializable	// class@00194c
{
    public MusicBeats[] beats;

    public void MusicAnalysisResult(){
       super();
    }
    public final MusicBeats[] getBeats(){
       return this.beats;
    }
    public final void setBeats(MusicBeats[] p0){
       this.beats = p0;
    }
}
