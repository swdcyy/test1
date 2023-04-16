package com.kwai.video.clipkit.MVAudioParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;

public class MVAudioParams	// class@001a45
{
    public String audioPath;
    public int detechType;
    public double longBeatMargin;
    public float maxAudioDuration;
    public float miniInterval;
    public float miniThreashold;
    public boolean needUpdateBeats;
    public double shortBeatMargin;

    public void MVAudioParams(String p0,boolean p1){
       super();
       this.miniInterval = 0.10f;
       this.audioPath = p0;
       this.needUpdateBeats = p1;
    }
    public static MVAudioParams createMarginAudioParam(String p0,boolean p1,double p2,double p3,float p4){
       MVAudioParams mVAudioParam = MVAudioParams.class;
       if (PatchProxy.isSupport(mVAudioParam)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Double.valueOf(p2),Double.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, mVAudioParam, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       mVAudioParam = new MVAudioParams(p0, p1);
       mVAudioParam.shortBeatMargin = p2;
       mVAudioParam.longBeatMargin = p3;
       mVAudioParam.miniInterval = p4;
       mVAudioParam.detechType = 1;
       return mVAudioParam;
    }
    public static MVAudioParams createThreasholdAudioParam(String p0,boolean p1,float p2,float p3,float p4){
       MVAudioParams mVAudioParam = MVAudioParams.class;
       if (PatchProxy.isSupport(mVAudioParam)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, mVAudioParam, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       mVAudioParam = new MVAudioParams(p0, p1);
       mVAudioParam.miniInterval = p2;
       mVAudioParam.miniThreashold = p3;
       mVAudioParam.maxAudioDuration = p4;
       mVAudioParam.detechType = 2;
       return mVAudioParam;
    }
}
