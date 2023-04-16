package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$q;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import java.util.Map;
import com.kuaishou.gifshow.kuaishan.logic.feed.a;
import t36.f$a;
import t36.f;

public final class KSDataManager$q implements g	// class@001a31
{
    public final KSDataManager b;

    public void KSDataManager$q(KSDataManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$q.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          e.D().w("KSDataManager", "group list fetched, size="+p0.size(), objArray);
          this.b.x0(p0);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             KSFeedGroupInfo kSFeedGroupI = iterator.next();
             if (this.b.h.containsKey(kSFeedGroupI.mId)) {
                Object[] objArray1 = new Object[0];
                e.D().w("KSDataManager", "group list fetched, group cache for groupId="+kSFeedGroupI.mId+" exists", objArray1);
             }else {
                Object[] objArray2 = new Object[0];
                e.D().w("KSDataManager", "group list fetched, create new group cache for groupId="+kSFeedGroupI.mId, objArray2);
                KSFeedGroupInfo mId = kSFeedGroupI.mId;
                a.o(mId, "groupInfo.mId");
                this.b.h.put(mId, new KSDataManager$d(this.b, kSFeedGroupI));
             }
          }
          this.b.s0(new a(p0));
       }
       return;
    }
}
