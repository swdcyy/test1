package com.kuaishou.gifshow.kuaishan.logic.z;
import erd.o;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.i0$b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.QMedia;
import kotlin.Pair;
import lnc.g7;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public final class z implements o	// class@001a7f
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final Object apply(Object p0){
       Objects.requireNonNull(p0);
       String str = PatchProxy.apply(null, p0, i0$b.class, "10");
       if (str != PatchProxyResult.class) {
       }else {
          Pair pair = g7.e(p0.b.mClipDuration);
          str = (pair == null)? p0.b.path+System.currentTimeMillis(): p0.b.path+p0.b.mClipStart+pair.getSecond().intValue();
       }
       return str;
    }
}
