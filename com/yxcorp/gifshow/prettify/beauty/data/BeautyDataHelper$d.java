package com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper$d;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import q87.c;
import java.lang.System;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper$PreloadState;
import java.lang.StringBuilder;

public final class BeautyDataHelper$d implements Runnable	// class@001104
{
    public static final BeautyDataHelper$d b;

    static {
       BeautyDataHelper$d.b = new BeautyDataHelper$d();
    }
    public void BeautyDataHelper$d(){
       super();
    }
    public final void run(){
       BeautyDataHelper$PreloadState lOCAL_SUCCES;
       if (PatchProxy.applyVoid(null, this, BeautyDataHelper$d.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("BeautyDataHelper", "pre load start", objArray);
       long l = System.currentTimeMillis();
       BeautyDataHelper d = BeautyDataHelper.d;
       if (BeautyDataHelper.a(d) == null) {
          d.h();
          lOCAL_SUCCES = BeautyDataHelper$PreloadState.LOCAL_SUCCESS;
       }else {
          lOCAL_SUCCES = BeautyDataHelper$PreloadState.LOCAL_FAILED;
       }
       BeautyDataHelper.b(d, lOCAL_SUCCES);
       Object[] objArray1 = new Object[i];
       p3.D().w("BeautyDataHelper", "pre load finish cost "+(System.currentTimeMillis() - l), objArray1);
       return;
    }
}
