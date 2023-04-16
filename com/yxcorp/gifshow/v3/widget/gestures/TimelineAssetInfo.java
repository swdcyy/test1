package com.yxcorp.gifshow.v3.widget.gestures.TimelineAssetInfo;
import com.yxcorp.gifshow.v3.widget.gestures.TimelineAssetInfo$TimelineAssetType;
import java.lang.Object;
import faa.a;
import java.lang.StringBuilder;
import java.lang.String;
import w46.b;

public class TimelineAssetInfo	// class@001671
{
    public double a;
    public double b;
    public int c;
    public int d;
    public TimelineAssetInfo$TimelineAssetType e;

    public void TimelineAssetInfo(double p0,double p1,int p2,int p3,TimelineAssetInfo$TimelineAssetType p4){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = 0;
       if (p0 - p1 > 0 || p2 > p3) {
          Object[] objArray = new Object[0];
          a.D().t("TimelineAssetInfo", "AssetInfo: startTimeLinePx: "+p2+" has to be ahead of endTimeLinePx: "+p3, objArray);
       }else {
          this.a = p0;
          this.b = p1;
          this.c = p2;
          this.d = p3;
       }
       this.e = p4;
       return;
    }
    public int a(){
       return this.d;
    }
    public int b(){
       return this.c;
    }
}
