package com.kuaishou.live.longconnection.exception.LiveLongConnectionServerException;
import com.yxcorp.gifshow.exception.ServerException;
import java.lang.String;

public class LiveLongConnectionServerException extends ServerException	// class@000c7e
{
    public final long mMaxDelayMs;
    public final long mMinDelayMs;

    public void LiveLongConnectionServerException(int p0,int p1,String p2,long p3,long p4){
       super(p0, p1, p2);
       this.mMinDelayMs = p3;
       this.mMaxDelayMs = p4;
    }
}
