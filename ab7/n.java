package ab7.n;
import erd.o;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.adt.UnionResponse;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import cb7.b;
import com.kwai.middleware.resourcemanager.cache.adt.DetailInfo;
import java.lang.String;
import cb7.a;

public final class n implements o	// class@00009d
{
    public final BaseResourceCacheRepo b;

    public void n(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (p0 != null) {
          List groupList = p0.getGroupList();
          n on = (groupList != null && (groupList.isEmpty() ^ 1) == 1)? 1: null;
          if (!on) {
             p0 = null;
          }
          if (p0 != null) {
             on = this.b;
             HashMap hashMap = new HashMap();
             List groupList1 = p0.getGroupList();
             groupList1 = (groupList1 == null || groupList1.isEmpty())? 1: null;
             if (!groupList1) {
                groupList1 = p0.getGroupList();
                if (groupList1 != null) {
                   Iterator iterator = groupList1.iterator();
                   while (iterator.hasNext()) {
                      b uob = iterator.next();
                      if (uob != null) {
                         List detailInfoLi = uob.getDetailInfoList();
                         detailInfoLi = (detailInfoLi == null || detailInfoLi.isEmpty())? 1: null;
                         if (detailInfoLi) {
                            continue ;
                         }else {
                            List detailInfoLi1 = uob.getDetailInfoList();
                            if (detailInfoLi1 != null) {
                               Iterator iterator1 = detailInfoLi1.iterator();
                               while (iterator1.hasNext()) {
                                  DetailInfo uDetailInfo = iterator1.next();
                                  hashMap.put(uDetailInfo.getUniqueIdentifier(), uDetailInfo);
                               }
                            }
                         }
                      }
                   }
                }
             }
             on.f = hashMap;
             on = this.b;
             on.h(on.b(p0.getGroupList()));
          }
       }
       return this.b.c();
    }
}
