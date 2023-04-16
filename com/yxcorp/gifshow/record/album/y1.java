package com.yxcorp.gifshow.record.album.y1;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.String;
import com.yxcorp.gifshow.record.album.p1;
import java.io.FileFilter;
import java.lang.Integer;

public final class y1 implements Callable	// class@001788
{
    public static final y1 b;

    static {
       y1.b = new y1();
    }
    public void y1(){
       super();
    }
    public final Object call(){
       File[] uFileArray = new File(LocalAlbumUtils.l(), ".long_video").listFiles(p1.b);
       int i = (uFileArray == null)? 0: uFileArray.length;
       return Integer.valueOf(i);
    }
}
