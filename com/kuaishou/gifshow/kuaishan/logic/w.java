package com.kuaishou.gifshow.kuaishan.logic.w;
import erd.o;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.i0$b;
import h90.e;
import com.yxcorp.gifshow.models.QMedia;
import java.io.File;
import java.lang.String;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceDetectOut;
import brd.t;
import lnc.g7;
import x80.c0;

public final class w implements o	// class@001a79
{
    public static final w b;

    static {
       w.b = new w();
    }
    public void w(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0.c.J != null)? g7.l(p0.c.J, BitmapUtil.r(new File(p0.b.path), 1280, 1280, false), true, true).flatMap(new c0(p0)): t.just(p0);
       return p0;
    }
}
