package com.yxcorp.gifshow.profile.krn.c;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.StringBuilder;
import java.lang.String;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class c implements o	// class@00136e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       return "data:image/jpg;base64,"+BitmapUtil.d(BitmapUtil.n(p0.getPath(), 1, (p0.getClipStart() * 1000)));
    }
}
