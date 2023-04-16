package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$y;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import trd.u;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;

public final class KSDataManager$y implements o	// class@001a3c
{
    public static final KSDataManager$y b;

    static {
       KSDataManager$y.b = new KSDataManager$y();
    }
    public void KSDataManager$y(){
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, KSDataManager$y.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "feedList");
          uArrayList = new ArrayList();
          p0 = p0.iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             Object obj1 = (obj.mUnSupportReason == null)? 1: null;
             if (obj1) {
                uArrayList.add(obj);
             }
          }
          p0 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             p0.add(iterator.next().toKSTemplateDetailInfo());
          }
          uArrayList = p0;
       }
       return uArrayList;
    }
}
