package com.yxcorp.gifshow.share.OperationCollator$collateTwoRowSeparated$rows$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.Pair;
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
import java.util.List;
import java.lang.Integer;

public final class OperationCollator$collateTwoRowSeparated$rows$1 extends Lambda implements l	// class@001b51
{
    public final Pair $ops;

    public void OperationCollator$collateTwoRowSeparated$rows$1(Pair p0){
       this.$ops = p0;
       super(1);
    }
    public final int invoke(p1 p0){
       Point x;
       Point obj = PatchProxy.applyOneRefs(p0, this, OperationCollator$collateTwoRowSeparated$rows$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "op");
       obj = q1.c.g().get(p0.M());
       if (obj != null) {
          x = obj.x;
       }else if(this.$ops.getFirst().contains(p0)){
          x = 0;
       }else {
          x = 1;
       }
       return x;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
