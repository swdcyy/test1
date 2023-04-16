package com.yxcorp.gifshow.share.screenshot.d0;
import erd.o;
import java.lang.Object;
import com.kwai.sharelib.model.QrCodeResponse;
import java.lang.String;
import android.graphics.Bitmap;
import uic.g0;

public final class d0 implements o	// class@001c54
{
    public static final d0 b;

    static {
       d0.b = new d0();
    }
    public void d0(){
       super();
    }
    public final Object apply(Object p0){
       return g0.b(p0.mQrBytes, p0.mQrUrls);
    }
}
