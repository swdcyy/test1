package com.kuaishou.gifshow.kuaishan.logic.x;
import erd.o;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.i0$b;
import com.yxcorp.gifshow.models.QMedia;
import java.util.List;
import java.lang.Iterable;
import brd.t;
import com.kuaishou.gifshow.kuaishan.logic.y;
import u80.e;
import java.lang.String;
import q87.c;
import java.lang.Boolean;

public final class x implements o	// class@001a7b
{
    public static final x b;

    static {
       x.b = new x();
    }
    public void x(){
       super();
    }
    public final Object apply(Object p0){
       p0 = p0.b.mVideoFrameList;
       if (p0 == null || p0.isEmpty()) {
          Object[] objArray = new Object[0];
          e.D().A("KSPrepareMediaAPI", "frameList is empty, return false", objArray);
          p0 = t.just(Boolean.FALSE);
       }else {
          p0 = t.fromIterable(p0).flatMap(y.b);
       }
       return p0;
    }
}
