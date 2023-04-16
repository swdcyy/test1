package hh9.b;
import erd.o;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagRepo;
import java.util.Objects;
import java.util.Collection;
import j8c.a;
import q87.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagConfig;
import java.lang.Integer;
import java.lang.Number;

public final class b implements o	// class@002688
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uArrayList = new ArrayList();
          CameraTabTagRepo c = CameraTabTagRepo.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidTwoRefs(p0, uArrayList, c, CameraTabTagRepo.class, "3")) {
             p0 = p0.a();
             int i = 0;
             String str = (p0 == null || p0.isEmpty())? 1: null;
             if (str) {
                Object[] objArray = new Object[i];
                a.D().s("CameraTabTagRepo", "groupData data is empty", objArray);
             }else {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   MaterialGroupInfo materialGrou = p0.next();
                   List detailInfoLi = materialGrou.getDetailInfoList();
                   if (detailInfoLi == null || detailInfoLi.isEmpty()) {
                   }else {
                      Iterator iterator = detailInfoLi.iterator();
                      while (iterator.hasNext()) {
                         MaterialDetailInfo materialDeta = iterator.next();
                         CameraTabTagConfig extObject = materialDeta.getExtObject();
                         if (extObject != null) {
                            extObject.setIdentifier(materialDeta.getMaterialId(), materialDeta.getChecksum());
                            if (extObject.isBirthdayType()) {
                               extObject.updateConfigTimeStamp();
                            }
                            Integer groupType = materialGrou.getGroupType();
                            if (groupType != null) {
                               extObject.setCameraTab(groupType.intValue());
                            }
                            uArrayList.add(extObject);
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       return uArrayList;
    }
}
