package com.yxcorp.gifshow.media.util.e;
import erd.o;
import com.yxcorp.gifshow.media.util.g;
import java.lang.String;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import android.content.Context;
import java.lang.Object;
import com.yxcorp.gifshow.media.util.g$b;
import java.util.Objects;
import com.yxcorp.gifshow.media.model.WatermarkEncodeConfig;
import ykd.a;
import java.lang.StringBuilder;
import q87.c;
import hxc.a;
import com.yxcorp.gifshow.media.util.d;
import io.reactivex.g;
import brd.t;
import android.util.Pair;
import java.io.File;
import java.lang.Float;

public final class e implements o	// class@001d22
{
    public final g b;
    public final String c;
    public final EncodeConfig d;
    public final Context e;
    public final String f;

    public void e(g p0,String p1,EncodeConfig p2,Context p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object apply(Object p0){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       e te = this.e;
       e tf = this.f;
       g$b uob = p0;
       Objects.requireNonNull(tb);
       p0 = uob.c;
       int i = 0;
       boolean b = (0 - p0 < 0 && (p0 - g.d().n() < 0 && (uob.a > null && uob.b > null)))? true: false;
       Object[] objArray = new Object[i];
       a.C().w(g.b, "adjustFrameRate FrameRatePromote,check inputFile FrameRate. needAdjustFrameRate:"+b+",videoSimpleParam:"+uob+",getForceTranscodeIfFpsLessThan:"+g.d().n()+",getForceTranscodeTargetFps:"+g.d().o(), objArray);
       if (b) {
          tb.a = new a();
          d uod = new d(tb, tc, uob, td, te, tf);
          b = t.create(new a());
       }else {
          b = t.just(new Pair(new File(tc), Float.valueOf(0x3f800000)));
       }
       return b;
    }
}
