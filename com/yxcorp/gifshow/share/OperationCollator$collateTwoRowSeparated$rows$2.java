package com.yxcorp.gifshow.share.OperationCollator$collateTwoRowSeparated$rows$2;
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

public final class OperationCollator$collateTwoRowSeparated$rows$2 extends Lambda implements l	// class@001b52
{
    public static final OperationCollator$collateTwoRowSeparated$rows$2 INSTANCE;

    static {
       OperationCollator$collateTwoRowSeparated$rows$2.INSTANCE = new OperationCollator$collateTwoRowSeparated$rows$2();
    }
    public void OperationCollator$collateTwoRowSeparated$rows$2(){
       super(1);
    }
    public final int invoke(p1 p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationCollator$collateTwoRowSeparated$rows$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "op");
       Point point = q1.c.g().get(p0.M());
       point = (point != null)? point.y: Integer.MAX_VALUE;
       return point;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
