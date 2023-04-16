package com.kwai.component.tti.monitor.TTIFrame;
import java.io.Serializable;
import java.lang.Object;
import ph5.i;
import java.lang.String;
import android.content.SharedPreferences;

public class TTIFrame implements Serializable	// class@000bcb
{
    public int fps;
    public int index;
    public float rate;
    public long time;
    public static int b = 255;

    public void TTIFrame(int p0,long p1,int p2,float p3){
       super();
       this.index = p0;
       this.time = p1;
       this.fps = p2;
       this.rate = p3;
       if (TTIFrame.b < 0) {
          TTIFrame.b = i.a.getInt("TTIMonitorFpsThresholdValue", 50);
       }
       return;
    }
    public boolean isJank(){
       boolean b = (this.fps <= TTIFrame.b)? true: false;
       return b;
    }
}
