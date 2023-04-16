package com.kwai.emotionsdk.bean.EmotionRealTimeUpdateConfig;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import nsd.u;

public final class EmotionRealTimeUpdateConfig implements Serializable	// class@000d7f
{
    public final String emotionPackageId;
    public final int emotionPackageType;
    public int emotionPackageVersion;

    public void EmotionRealTimeUpdateConfig(int p0,String p1){
       super();
       this.emotionPackageType = p0;
       this.emotionPackageId = p1;
    }
    public void EmotionRealTimeUpdateConfig(int p0,String p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = "";
       }
       super(p0, p1);
       return;
    }
    public final String getEmotionPackageId(){
       return this.emotionPackageId;
    }
    public final int getEmotionPackageType(){
       return this.emotionPackageType;
    }
    public final int getEmotionPackageVersion(){
       return this.emotionPackageVersion;
    }
    public final void setEmotionPackageVersion(int p0){
       this.emotionPackageVersion = p0;
    }
}
