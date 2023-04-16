package com.kuaishou.gifshow.kuaishan.logic.feed.e;
import t36.f$a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$b;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import u80.e;
import java.lang.StringBuilder;
import java.util.List;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.HashMap;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;

public final class e implements f$a	// class@001a43
{
    public final KSDataManager$d0 a;
    public final KSDataManager$b b;

    public void e(KSDataManager$d0 p0,KSDataManager$b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void apply(Object p0){
       String str;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, e.class, "1")) {
       }else {
          p0 = this.b.a();
          boolean b = true;
          if (p0 == null) {
             p0 = this.a;
             p0.b.T(p0.c.element, new IllegalArgumentException("template feed response is empty"), b);
          }else {
             Object[] objArray = new Object[0];
             e.D().w("KSDataManager", "fetchTemplatesForDeepLink: template feed response fetched with group: "+this.a.c.element+", size: "+p0.mTemplateList.size(), objArray);
             if (obj != null) {
                Ref$ObjectRef element = this.a.c.element;
                List items = p0.getItems();
                a.o(items, "response.items");
                ArrayList uArrayList = new ArrayList(u.Y(items, 10));
                Iterator iterator = items.iterator();
                while (iterator.hasNext()) {
                   KSTemplateDetailInfo kSTemplateDe = iterator.next();
                   e ta = this.a;
                   KSDataManager$d uod = ta.b.h.get(ta.c.element);
                   if (uod != null) {
                      str = uod.e();
                      if (str != null) {
                      label_00ac :
                         uArrayList.add(kSTemplateDe.updateGroupName(str));
                      }
                   }
                   str = "";
                   goto label_00ac ;
                }
                obj.N3(element, uArrayList, this.b.a, (p0.hasMore() ^ b), (this.b.b ^ b));
             }
          }
       }
       return;
    }
}
