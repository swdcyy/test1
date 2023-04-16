package com.kuaishou.webkit.extension.media.KsMediaPlayerFactory$CreateParams;
import android.os.Bundle;
import java.lang.Object;
import java.lang.String;

public class KsMediaPlayerFactory$CreateParams	// class@00130b
{
    public final boolean mAccurateSeek;
    public final int mEndTime;
    public final Bundle mExtra;
    public final int mLoopCount;
    public final int mStartTime;
    public final boolean mTransparent;

    public void KsMediaPlayerFactory$CreateParams(boolean p0,boolean p1,int p2,int p3,int p4,Bundle p5){
       super();
       this.mTransparent = p0;
       this.mAccurateSeek = p1;
       this.mStartTime = p2;
       this.mEndTime = p3;
       this.mLoopCount = p4;
       this.mExtra = p5;
    }
    public boolean accurateSeek(){
       return this.mAccurateSeek;
    }
    public int endTime(){
       return this.mEndTime;
    }
    public String extras(){
       KsMediaPlayerFactory$CreateParams tmExtra = this.mExtra;
       if (tmExtra != null) {
          return tmExtra.getString("extras", "");
       }
       return "";
    }
    public int loopCount(){
       return this.mLoopCount;
    }
    public int startTime(){
       return this.mStartTime;
    }
    public boolean transparent(){
       return this.mTransparent;
    }
    public String type(){
       KsMediaPlayerFactory$CreateParams tmExtra = this.mExtra;
       if (tmExtra != null) {
          return tmExtra.getString("type", "");
       }
       return "";
    }
}
