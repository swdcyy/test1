package com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider$leaveTime$2;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Number;

public final class PhotoDetailLoggerFieldProvider$leaveTime$2 extends Lambda implements q	// class@000a29
{
    public static final PhotoDetailLoggerFieldProvider$leaveTime$2 INSTANCE;

    static {
       PhotoDetailLoggerFieldProvider$leaveTime$2.INSTANCE = new PhotoDetailLoggerFieldProvider$leaveTime$2();
    }
    public void PhotoDetailLoggerFieldProvider$leaveTime$2(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Boolean.valueOf(this.invoke(p0.booleanValue(), p1.longValue(), p2.longValue()));
    }
    public final boolean invoke(boolean p0,long p1,long p2){
       p0 = (p0 || p2 - p1 > 0)? true: false;
       return p0;
    }
}
