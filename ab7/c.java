package ab7.c;
import erd.o;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.adt.UnionResponse;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import com.yxcorp.utility.Log;
import com.kwai.middleware.resourcemanager.cache.adt.DetailResponse;
import brd.t;
import java.lang.IllegalStateException;
import java.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import cb7.b;
import com.kwai.middleware.resourcemanager.cache.adt.SimpleInfo;
import cb7.a;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Map;
import trd.t0;
import db7.b;
import t45.d;
import brd.z;
import ab7.b;

public final class c implements o	// class@000092
{
    public final BaseResourceCacheRepo b;

    public void c(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "response");
       List groupList = p0.getGroupList();
       int i = 1;
       boolean b = false;
       c uoc = (groupList == null || groupList.isEmpty())? 1: null;
       if (uoc) {
          uoc = this.b;
          uoc.b = b;
          Log.d(uoc.f(), "wrong union response, empty template list");
          if (this.b.c().isEmpty() ^ i) {
             p0 = t.just(this.b.g(p0, null));
          }else {
             throw new IllegalStateException("wrong union response, empty template list".toString());
          }
       }else {
          uoc = this.b;
          Objects.requireNonNull(uoc);
          String str = "[RMResource] Helper";
          Log.g(str, "getTemplateIdsFromResponse fromDetail=false");
          HashMap hashMap = new HashMap();
          List groupList1 = p0.getGroupList();
          if (groupList1 != null) {
             Iterator iterator = groupList1.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                if (uob != null) {
                   List simpleInfoLi = uob.getSimpleInfoList();
                   simpleInfoLi = (simpleInfoLi == null || simpleInfoLi.isEmpty())? 1: null;
                   if (simpleInfoLi) {
                      continue ;
                   }else {
                      List simpleInfoLi1 = uob.getSimpleInfoList();
                      if (simpleInfoLi1 != null) {
                         Iterator iterator1 = simpleInfoLi1.iterator();
                         while (iterator1.hasNext()) {
                            SimpleInfo simpleInfo = iterator1.next();
                            if (simpleInfo != null) {
                               hashMap.put(simpleInfo.getUniqueIdentifier(), simpleInfo.getId());
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }
             }
          }
          Log.g(str, "mapSize="+hashMap.size());
          Collection uCollection = t0.Z(hashMap, uoc.f.keySet()).values();
          Log.g(this.b.f(), "new id list size = "+uCollection.size());
          if (uCollection.isEmpty()) {
             Log.g(this.b.f(), "no need to requestMultiApi");
             p0 = t.just(this.b.g(p0, null));
          }else {
             Log.g(this.b.f(), "requestMultiApi");
             p0 = this.b.k.a(uCollection).observeOn(d.c).map(new b(this, p0));
          }
       }
       return p0;
    }
}
