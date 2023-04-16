package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$l0;
import t36.f$a;
import java.lang.String;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;

public final class KSDataManager$l0 implements f$a	// class@001a26
{
    public final String a;
    public final KSTemplateFeedListResponse b;
    public final Ref$ObjectRef c;
    public final boolean d;
    public final boolean e;

    public void KSDataManager$l0(String p0,KSTemplateFeedListResponse p1,Ref$ObjectRef p2,boolean p3,boolean p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$l0.class, "1")) {
       }else if(p0 != null){
          KSDataManager$l0 ta = this.a;
          List items = this.b.getItems();
          a.o(items, "feedResponse.items");
          ArrayList uArrayList = new ArrayList(u.Y(items, 10));
          Iterator iterator = items.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().updateGroupName(this.c.element.e()));
          }
          p0.a3(ta, uArrayList, this.d, this.e);
       }
       return;
    }
}
