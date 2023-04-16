package com.kwai.video.krtc.Arya$VideoLayout;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class Arya$VideoLayout	// class@000693
{
    public boolean isMuted;
    public boolean isScreenSharing;
    public int layoutH;
    public int layoutW;
    public int layoutX;
    public int layoutY;
    public long userId;

    public void Arya$VideoLayout(){
       super();
       this.userId = 0;
       this.isScreenSharing = false;
       this.isMuted = false;
       this.layoutX = 0;
       this.layoutY = 0;
       this.layoutW = 0;
       this.layoutH = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Arya$VideoLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoLayout{userId="+this.userId+", isScreenSharing="+this.isScreenSharing+", isMuted="+this.isMuted+", layoutX="+this.layoutX+", layoutY="+this.layoutY+", layoutW="+this.layoutW+", layoutH="+this.layoutH+'}';
    }
}
