package com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PlayEvent	// class@001502
{
    public final QPhoto a;
    public final PlayEvent$Status b;
    public final int c;
    public final String d;
    public final int e;

    public void PlayEvent(QPhoto p0,PlayEvent$Status p1){
       super(p0, p1, 2);
    }
    public void PlayEvent(QPhoto p0,PlayEvent$Status p1,int p2){
       super(p0, p1, p2, "");
    }
    public void PlayEvent(QPhoto p0,PlayEvent$Status p1,int p2,int p3){
       super(p0, p1, p2, "", p3);
    }
    public void PlayEvent(QPhoto p0,PlayEvent$Status p1,int p2,String p3){
       super(p0, p1, p2, p3, 0);
    }
    public void PlayEvent(QPhoto p0,PlayEvent$Status p1,int p2,String p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p4;
       this.d = p3;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PlayEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PlayEvent{mPhoto="+this.a+", mStatus="+this.b+", mPlayControlSource="+this.c+", mActivityHashcode="+this.e+'}';
    }
}
