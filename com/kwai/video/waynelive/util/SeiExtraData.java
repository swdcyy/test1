package com.kwai.video.waynelive.util.SeiExtraData;
import java.lang.Object;
import android.os.SystemClock;

public class SeiExtraData	// class@000e1a
{
    public final byte[] mData;
    public final int mPayloadType;
    public final long mTimestamp;

    public void SeiExtraData(byte[] p0,int p1){
       super();
       this.mData = p0;
       this.mTimestamp = SystemClock.elapsedRealtime();
       this.mPayloadType = p1;
    }
}
