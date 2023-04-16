package com.yxcorp.gifshow.album.preview.h;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;

public final class h implements Comparator	// class@001a53
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getSelectIndex() - p1.getSelectIndex());
    }
}
