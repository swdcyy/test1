package com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher$b;
import java.util.Comparator;
import com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher;
import java.lang.Object;
import ba9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Float;

public final class AutoPlayScrollDispatcher$b implements Comparator	// class@001be2
{
    public final AutoPlayScrollDispatcher b;

    public void AutoPlayScrollDispatcher$b(AutoPlayScrollDispatcher p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AutoPlayScrollDispatcher$b.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(p0, "range1");
          a.p(p1, "range2");
          i = Float.compare(this.b.d(p1), this.b.d(p0));
       }
       return i;
    }
}
