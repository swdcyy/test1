package com.kuaishou.live.lite.comment.view.ItemViewControllerFactory;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$Companion;
import nsd.u;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Map;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.Pair;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import ba3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.q;
import java.lang.RuntimeException;

public final class ItemViewControllerFactory	// class@000819
{
    public final Map a;
    public final Map b;
    public final ItemViewControllerFactory$a c;
    public static final String d;
    public static Map e;
    public static Map f;
    public static final ItemViewControllerFactory$Companion g;

    static {
       ItemViewControllerFactory.g = new ItemViewControllerFactory$Companion(null);
       ItemViewControllerFactory.d = "ItemViewControllerFactory";
    }
    public void ItemViewControllerFactory(ItemViewControllerFactory$a p0){
       a.p(p0, "itemViewControllerDependence");
       super();
       this.c = p0;
       Map e = ItemViewControllerFactory.e;
       if (e != null) {
       }else {
          e = new LinkedHashMap();
       }
       this.a = e;
       Map f = ItemViewControllerFactory.f;
       if (f == null) {
          f = new LinkedHashMap();
       }
       this.b = f;
       if (e.isEmpty() || f.isEmpty()) {
          b.Z(LiveLogTag.LIVE_LITE_COMMENT, ItemViewControllerFactory.d+" init mapping");
          int i = 0;
          Iterator iterator = ItemViewControllerFactory.g.a().iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             this.a.put(obj.getFirst(), Integer.valueOf(i));
             this.b.put(Integer.valueOf(i), obj.getSecond());
             i = i1;
          }
       }
       return;
    }
    public final a a(LiveData p0,int p1,LiveData p2){
       if (PatchProxy.isSupport(ItemViewControllerFactory.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ItemViewControllerFactory.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "position");
       a.p(p2, "dataProvider");
       q oq = this.b.get(Integer.valueOf(p1));
       if (oq != null) {
          return oq.invoke(p0, p2, this.c);
       }else {
          throw new RuntimeException(ItemViewControllerFactory.d+" getItemViewController comment message can not be recognized");
       }
    }
}
