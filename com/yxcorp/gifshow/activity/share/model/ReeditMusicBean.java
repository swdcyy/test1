package com.yxcorp.gifshow.activity.share.model.ReeditMusicBean;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ReeditMusicBean implements Serializable	// class@001394
{
    public final int endSec;
    public final String musicId;
    public final int musicType;
    public final int startSec;

    public void ReeditMusicBean(String p0,int p1,int p2,int p3){
       a.p(p0, "musicId");
       super();
       this.musicId = p0;
       this.musicType = p1;
       this.startSec = p2;
       this.endSec = p3;
    }
    public static ReeditMusicBean copy$default(ReeditMusicBean p0,String p1,int p2,int p3,int p4,int p5,Object p6){
       ReeditMusicBean musicId;
       ReeditMusicBean musicType;
       ReeditMusicBean startSec;
       ReeditMusicBean endSec;
       if (p5 & 0x01) {
          musicId = p0.musicId;
       }
       if (p5 & 0x02) {
          musicType = p0.musicType;
       }
       if (p5 & 0x04) {
          startSec = p0.startSec;
       }
       if (p5 & 0x08) {
          endSec = p0.endSec;
       }
       return p0.copy(musicId, musicType, startSec, endSec);
    }
    public final String component1(){
       return this.musicId;
    }
    public final int component2(){
       return this.musicType;
    }
    public final int component3(){
       return this.startSec;
    }
    public final int component4(){
       return this.endSec;
    }
    public final ReeditMusicBean copy(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReeditMusicBean.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReeditMusicBean.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "musicId");
       return new ReeditMusicBean(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReeditMusicBean.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ReeditMusicBean && (a.g(this.musicId, p0.musicId) && (this.musicType == p0.musicType && (this.startSec == p0.startSec && this.endSec == p0.endSec))))) {
          return true;
       }
       return false;
    }
    public final int getEndSec(){
       return this.endSec;
    }
    public final String getMusicId(){
       return this.musicId;
    }
    public final int getMusicType(){
       return this.musicType;
    }
    public final int getStartSec(){
       return this.startSec;
    }
    public int hashCode(){
       ReeditMusicBean obj = PatchProxy.apply(null, this, ReeditMusicBean.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.musicId;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((((i * 31) + this.musicType) * 31) + this.startSec) * 31) + this.endSec);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReeditMusicBean.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReeditMusicBean\(musicId="+this.musicId+", musicType="+this.musicType+", startSec="+this.startSec+", endSec="+this.endSec+"\)";
    }
}
