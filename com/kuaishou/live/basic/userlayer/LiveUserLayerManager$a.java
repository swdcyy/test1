package com.kuaishou.live.basic.userlayer.LiveUserLayerManager$a;
import erd.o;
import java.lang.Object;
import njd.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer;
import kotlin.jvm.internal.a;
import c61.c;
import c61.a;
import java.util.Objects;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer$a;
import java.lang.Integer;
import java.util.NoSuchElementException;

public final class LiveUserLayerManager$a implements o	// class@000d24
{
    public static final LiveUserLayerManager$a b;

    static {
       LiveUserLayerManager$a.b = new LiveUserLayerManager$a();
    }
    public void LiveUserLayerManager$a(){
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       LiveUserLayerManager$UserLayer$a obj = PatchProxy.applyOneRefs(p0, this, LiveUserLayerManager$a.class, str);
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "resp");
          obj = LiveUserLayerManager$UserLayer.Companion;
          p0 = p0.a().a.a;
          Objects.requireNonNull(obj);
          LiveUserLayerManager$UserLayer$a userLayer$a = LiveUserLayerManager$UserLayer$a.class;
          if (PatchProxy.isSupport(userLayer$a)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, userLayer$a, str);
             if (obj != patchProxyRe) {
             }
          }
          LiveUserLayerManager$UserLayer[] userLayerArr = LiveUserLayerManager$UserLayer.values();
          int len = userLayerArr.length;
          int i = 0;
          while (true) {
             if (i >= len) {
                throw new NoSuchElementException("Array contains no element matching the predicate.");
             }
             object oobject = userLayerArr[i];
             int i1 = (oobject.getValue() == p0)? 1: 0;
             if (i1) {
                obj = oobject;
                break ;
             }else {
                i = i + 1;
             }
          }
       }
       return obj;
    }
}
