package ar3.d;
import erd.o;
import br3.a;
import java.lang.Object;
import br3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import ar3.b;
import java.util.Objects;
import ar3.b$a;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupInfo;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefInfoItem;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailInfoItem;
import java.util.ArrayList;

public final class d implements o	// class@0002b4
{
    public final a b;

    public void d(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       b$a a;
       MaterialBriefGroupInfo materialBrie;
       List simpleInfoLi;
       List list = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "detailInfo");
          a = b.a;
          List list1 = this.b.a();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(p0, list1, a, b$a.class, "3")) {
             HashMap hashMap = new HashMap();
             Iterator iterator = list1.iterator();
             while (iterator.hasNext()) {
                materialBrie = iterator.next();
                if (materialBrie != null) {
                   simpleInfoLi = materialBrie.getSimpleInfoList();
                   if (simpleInfoLi != null) {
                      Iterator iterator1 = simpleInfoLi.iterator();
                      while (iterator1.hasNext()) {
                         hashMap.put(iterator1.next().getId(), materialBrie);
                      }
                   }
                }
             }
             p0 = p0.materialDetailInfoList;
             if (p0 != null) {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   MaterialDetailInfoItem materialDeta = p0.next();
                   if (materialDeta != null) {
                      materialBrie = hashMap.get(materialDeta.getMaterialId());
                      simpleInfoLi = null;
                      String groupName = (materialBrie != null)? materialBrie.getGroupName(): simpleInfoLi;
                      materialDeta.setGroupName(groupName);
                      materialBrie = hashMap.get(materialDeta.getMaterialId());
                      if (materialBrie != null) {
                         simpleInfoLi = materialBrie.getBriefInfoList();
                      }
                      if (simpleInfoLi == null && materialBrie != null) {
                         materialBrie.setBriefInfoList(new ArrayList());
                      }
                      if (materialBrie != null) {
                         List briefInfoLis = materialBrie.getBriefInfoList();
                         if (briefInfoLis != null) {
                            briefInfoLis.add(materialDeta);
                         }
                      }
                   }
                }
             }
          }
          list = this.b.a();
       }
       return list;
    }
}
