package com.kuaishou.gifshow.kuaishan.logic.y;
import erd.o;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceDetectOut;
import com.kuaishou.gifshow.kuaishan.utils.e;
import brd.t;
import lnc.g7;
import com.kuaishou.gifshow.kuaishan.logic.v;

public final class y implements o	// class@001a7d
{
    public static final y b;

    static {
       y.b = new y();
    }
    public void y(){
       super();
    }
    public final Object apply(Object p0){
       p0 = BitmapUtil.r(new File(p0), 320, 320, false);
       return g7.l(e.f(p0), p0, false, true).flatMap(v.b);
    }
}
