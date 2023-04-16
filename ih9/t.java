package ih9.t;
import erd.o;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfigRepo;
import java.util.Objects;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import java.lang.Integer;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import hb0.a;
import java.lang.StringBuilder;
import lnc.a1;
import q87.c;

public final class t implements o	// class@00282c
{
    public final long b;

    public void t(long p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       ToolBoxHeaderConfig toolBoxHeade = PatchProxy.applyOneRefs(p0, this, t.class, "1");
       if (toolBoxHeade != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ArrayList uArrayList = new ArrayList();
          ToolBoxHeaderConfigRepo b = ToolBoxHeaderConfigRepo.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidTwoRefs(p0, uArrayList, b, ToolBoxHeaderConfigRepo.class, "3")) {
             p0 = p0.a();
             StringBuilder str = (p0 == null || p0.isEmpty())? 1: null;
             if (!str) {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   MaterialGroupInfo materialGrou = p0.next();
                   Integer groupType = materialGrou.getGroupType();
                   if (groupType == null || groupType.intValue()) {
                      continue ;
                   }else {
                      List detailInfoLi = materialGrou.getDetailInfoList();
                      if (detailInfoLi == null || detailInfoLi.isEmpty()) {
                         continue ;
                      }else {
                         MaterialDetailInfo materialDeta = detailInfoLi.get(0);
                         String extParams = materialDeta.getExtParams();
                         ToolBoxHeaderConfig toolBoxHeade1 = (extParams == null || !extParams.length())? 1: null;
                         if (!toolBoxHeade1) {
                            uArrayList.add(new ToolBoxHeaderConfig(materialDeta.getExtParams()));
                         }
                      }
                   }
                }
             }
          }
          Object[] objArray = new Object[0];
          a.D().s("ToolBoxHeaderConfigRepo", "ed"+a1.o(this.b), objArray);
          p0 = (uArrayList.isEmpty() ^ 1)? new ToolBoxHeaderConfig(uArrayList.get(0).b()): new ToolBoxHeaderConfig("");
          toolBoxHeade = p0;
       }
       return toolBoxHeade;
    }
}
