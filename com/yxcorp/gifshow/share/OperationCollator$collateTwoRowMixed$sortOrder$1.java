package com.yxcorp.gifshow.share.OperationCollator$collateTwoRowMixed$sortOrder$1;
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

public final class OperationCollator$collateTwoRowMixed$sortOrder$1 extends Lambda implements l	// class@001b50
{
    public static final OperationCollator$collateTwoRowMixed$sortOrder$1 INSTANCE;

    static {
       OperationCollator$collateTwoRowMixed$sortOrder$1.INSTANCE = new OperationCollator$collateTwoRowMixed$sortOrder$1();
    }
    public void OperationCollator$collateTwoRowMixed$sortOrder$1(){
       super(1);
    }
    public final int invoke(p1 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationCollator$collateTwoRowMixed$sortOrder$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "op");
       Point point = q1.c.g().get(p0.M());
       int i = (point == null)? Integer.MAX_VALUE: point.y + (point.x * 20);
       return i;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
