package com.yxcorp.gifshow.music.data.MusicHistoryRecord;
import java.io.Serializable;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class MusicHistoryRecord implements Serializable, Comparable	// class@002054
{
    public String mMusicId;
    public int mMusicType;
    public long mUseTime;
    public static final long serialVersionUID = 0x18a9392062837389;

    public void MusicHistoryRecord(){
       super();
    }
    public int compareTo(MusicHistoryRecord p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicHistoryRecord.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Long.compare(p0.mUseTime, this.mUseTime);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
}
