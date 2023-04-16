package com.yxcorp.gifshow.camera.record.l;
import erd.o;
import qb9.z;
import android.os.Bundle;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.camera.record.SchemePairedPhotoVideoHelper;
import brd.t;
import qb9.f0;
import com.yxcorp.gifshow.camera.record.SchemePairedPhotoVideoHelper$PairNotSupportException;
import qb9.m0;

public final class l implements o	// class@001d54
{
    public final z b;
    public final Bundle c;

    public void l(z p0,Bundle p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       l tb = this.b;
       l tc = this.c;
       if (SchemePairedPhotoVideoHelper.c(tb, p0)) {
          return SchemePairedPhotoVideoHelper.e(tb, true).map(new f0(p0, tc));
       }
       throw new SchemePairedPhotoVideoHelper$PairNotSupportException(false, null);
    }
}
