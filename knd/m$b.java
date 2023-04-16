package knd.m$b;
import erd.g;
import knd.m;
import msd.l;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcrop.gifshow.v3.editor.text_v2.model.TTSVoiceModelV2;
import jod.e;
import java.util.Collection;
import ekd.q;

public final class m$b implements g	// class@0017f1
{
    public final m b;
    public final l c;

    public void m$b(m p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b.class, "1")) {
       }else {
          a.p(p0, "materialGroupInfoResult");
          m$b tb = this.b;
          Objects.requireNonNull(tb);
          ArrayList uArrayList = PatchProxy.applyOneRefs(p0, tb, m.class, "12");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             p0 = p0.a();
             if (p0 != null) {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   List detailInfoLi = p0.next().getDetailInfoList();
                   if (detailInfoLi != null) {
                      Iterator iterator = detailInfoLi.iterator();
                      while (iterator.hasNext()) {
                         MaterialDetailInfo materialDeta = iterator.next();
                         String materialName = materialDeta.getMaterialName();
                         if (materialName == null) {
                            materialName = "";
                         }
                         ArrayList uArrayList1 = new ArrayList();
                         List iconUrls = materialDeta.getIconUrls();
                         if (iconUrls != null) {
                            Iterator iterator1 = iconUrls.iterator();
                            while (iterator1.hasNext()) {
                               String url = iterator1.next().getUrl();
                               a.o(url, "cdnUrl.url");
                               uArrayList1.add(url);
                            }
                         }
                         TTSVoiceModelV2 extObject = materialDeta.getExtObject();
                         int i = -1;
                         int speakerId = (extObject != null)? extObject.getSpeakerId(): -1;
                         if (extObject != null) {
                            i = extObject.getLangType();
                         }
                         uArrayList.add(new e(materialName, uArrayList1, speakerId, i));
                      }
                   }
                }
             }
          }
          if (!q.f(uArrayList)) {
             uArrayList.add(0, this.b.c);
             this.c.invoke(uArrayList);
          }else {
             this.c.invoke(new ArrayList());
          }
       }
       return;
    }
}
