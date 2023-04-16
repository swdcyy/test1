package com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow$a;
import erd.c;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import fe3.c$b;
import android.graphics.Bitmap;
import ie3.f0;
import re3.a;
import fe3.g;
import re3.b;
import java.lang.Iterable;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class ImageRenderDataFlow$a implements c	// class@000c04
{
    public static final ImageRenderDataFlow$a a;

    static {
       ImageRenderDataFlow$a.a = new ImageRenderDataFlow$a();
    }
    public void ImageRenderDataFlow$a(){
       super();
    }
    public Object a(Object p0,Object p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, ImageRenderDataFlow$a.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "map");
          a.p(p1, "cache");
          ArrayList uArrayList = new ArrayList();
          p1 = p1.entrySet().iterator();
          while (p1.hasNext()) {
             Map$Entry uEntry = p1.next();
             c$b key = uEntry.getKey();
             Bitmap value = uEntry.getValue();
             f0 uof0 = p0.get(key);
             if (uof0 != null) {
                uArrayList.add(new a(key, value, uof0.b()));
             }
          }
          list = CollectionsKt___CollectionsKt.f5(uArrayList, new b());
       }
       return list;
    }
}
