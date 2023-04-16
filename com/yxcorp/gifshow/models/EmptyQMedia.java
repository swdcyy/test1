package com.yxcorp.gifshow.models.EmptyQMedia;
import com.yxcorp.gifshow.models.QMedia;
import nsd.u;
import java.lang.String;

public final class EmptyQMedia extends QMedia	// class@001fb8
{

    public void EmptyQMedia(){
       super(0, 1, null);
    }
    public void EmptyQMedia(long p0){
       super(0, "", p0, 0, -1);
       this.setClipDuration(p0);
    }
    public void EmptyQMedia(long p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = 0;
       }
       super(p0);
       return;
    }
}
