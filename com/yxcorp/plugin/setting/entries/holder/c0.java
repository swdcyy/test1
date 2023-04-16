package com.yxcorp.plugin.setting.entries.holder.c0;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.PhotoAdDownloadCenterItemModel;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.google.common.primitives.Longs;

public final class c0 implements Comparator	// class@000848
{
    public static final c0 b;

    static {
       c0.b = new c0();
    }
    public void c0(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Longs.a(p1.b.mDownloadedTime, p0.b.mDownloadedTime);
    }
}
