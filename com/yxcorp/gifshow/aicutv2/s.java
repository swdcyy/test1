package com.yxcorp.gifshow.aicutv2.s;
import erd.o;
import o69.g1;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.video.ksmemorykit.EditorSmartClipResult;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import i79.e;
import elb.s0;
import com.yxcorp.gifshow.model.YcnnScenesObject;
import java.util.List;
import qrd.l1;
import fg6.a;
import com.google.gson.Gson;
import java.util.Objects;

public final class s implements o	// class@0019b8
{
    public final g1 b;

    public void s(g1 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       s os = PatchProxy.applyOneRefs(p0, this, s.class, "1");
       if (os != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          EditorSmartClipResult uEditorSmart = this.b.d();
          if (uEditorSmart != null) {
             p0 = p0.values();
             a.o(p0, "it.values");
             ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
             p0 = p0.iterator();
             while (p0.hasNext()) {
                s0 os0 = new s0();
                YcnnScenesObject ycnnScenesOb = new YcnnScenesObject();
                ycnnScenesOb.b(p0.next().a);
                os0.b(ycnnScenesOb);
                uArrayList.add(a.a.q(os0));
             }
             p0 = new String[0];
             p0 = uArrayList.toArray(p0);
             Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Array<T>");
             uEditorSmart.setSceneDetectionJsonResults(p0);
          }
          os = this.b;
       }
       return os;
    }
}
