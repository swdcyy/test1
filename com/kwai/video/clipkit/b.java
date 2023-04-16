package com.kwai.video.clipkit.b;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Double;
import com.kwai.video.clipkit.ClipMVImportHandler;

public final class b implements Comparator	// class@001a55
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return ClipMVImportHandler.lambda$packetVideoInfos$0(p0, p1);
    }
}
