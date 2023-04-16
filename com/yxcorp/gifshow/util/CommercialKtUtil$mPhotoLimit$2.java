package com.yxcorp.gifshow.util.CommercialKtUtil$mPhotoLimit$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.experiment.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class CommercialKtUtil$mPhotoLimit$2 extends Lambda implements a	// class@001edd
{
    public static final CommercialKtUtil$mPhotoLimit$2 INSTANCE;

    static {
       CommercialKtUtil$mPhotoLimit$2.INSTANCE = new CommercialKtUtil$mPhotoLimit$2();
    }
    public void CommercialKtUtil$mPhotoLimit$2(){
       super(0);
    }
    public final int invoke(){
       c uoc = c.h();
       a.o(uoc, "ABManager.getInstance\(\)");
       int i = (uoc.k())? f.e("photoIdUploadCount"): 0;
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
