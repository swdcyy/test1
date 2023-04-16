package com.kwai.video.player.misc.AndroidMediaFormat;
import com.kwai.video.player.misc.IMediaFormat;
import android.media.MediaFormat;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public class AndroidMediaFormat implements IMediaFormat	// class@000b84
{
    public final MediaFormat mMediaFormat;

    public void AndroidMediaFormat(MediaFormat p0){
       super();
       this.mMediaFormat = p0;
    }
    public int getInteger(String p0){
       AndroidMediaFormat obj = PatchProxy.applyOneRefs(p0, this, AndroidMediaFormat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMediaFormat;
       if (obj == null) {
          return 0;
       }
       return obj.getInteger(p0);
    }
    public String getString(String p0){
       AndroidMediaFormat obj = PatchProxy.applyOneRefs(p0, this, AndroidMediaFormat.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMediaFormat;
       if (obj == null) {
          return null;
       }
       return obj.getString(p0);
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, AndroidMediaFormat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StringBuilder(128)+this.getClass().getName()+'{';
       AndroidMediaFormat tmMediaForma = this.mMediaFormat;
       obj = (tmMediaForma != null)? obj+tmMediaForma.toString(): obj+"null";
       return obj+'}';
    }
}
