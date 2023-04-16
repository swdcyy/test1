package com.yxcorp.gifshow.share.OperationCollator$collateOneRow$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import mhc.p1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import mhc.q1;
import java.util.Map;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import android.graphics.Point;
import java.lang.Integer;

public final class OperationCollator$collateOneRow$2 extends Lambda implements l	// class@001b4e
{
    public static final OperationCollator$collateOneRow$2 INSTANCE;

    static {
       OperationCollator$collateOneRow$2.INSTANCE = new OperationCollator$collateOneRow$2();
    }
    public void OperationCollator$collateOneRow$2(){
       super(1);
    }
    public final int invoke(p1 p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationCollator$collateOneRow$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "op");
       Point point = q1.c.c().get(p0.M());
       point = (point != null)? point.x: 0;
       return point;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
