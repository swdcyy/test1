package com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$b;
import erd.g;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$a;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import java.util.List;
import java.lang.Integer;
import q87.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import java.util.Collection;
import ekd.q;
import w46.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import trd.u;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerExtParams;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;

public final class EditStickerRepo$b implements g	// class@001287
{
    public final Map[] b;
    public final EditStickerRepo$a c;

    public void EditStickerRepo$b(Map[] p0,EditStickerRepo$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditStickerRepo$b.class, "1")) {
       }else {
          a uoa = a.D();
          StringBuilder str = "fetchStickerInfo, source = "+p0.b()+", group count = ";
          List list = p0.a();
          Integer integer = (list != null)? Integer.valueOf(list.size()): null;
          int i = 0;
          Object[] objArray = new Object[i];
          uoa.w("EditStickerRepo", str+integer, objArray);
          ArrayList uArrayList = Lists.b();
          a.o(uArrayList, "Lists.newArrayList\(\)");
          object oobject = this.b[i];
          if (oobject != null) {
             StickerRanker.i.j(oobject);
          }
          p0 = p0.a();
          if (q.f(p0)) {
             Object[] objArray1 = new Object[i];
             a.D().t("EditStickerRepo", "sticker response empty", objArray1);
             this.c.a(3, new ArrayList(), oobject);
          }else if(p0 != null){
             p0 = p0.iterator();
             while (p0.hasNext()) {
                MaterialGroupInfo materialGrou = p0.next();
                StickerGroupInfo stickerGroup = new StickerGroupInfo(materialGrou);
                a uoa1 = a.D();
                StringBuilder str1 = "fetchStickerInfo, group name = "+materialGrou.getGroupName()+", sticker count = ";
                List detailInfoLi = materialGrou.getDetailInfoList();
                Integer integer1 = (detailInfoLi != null)? Integer.valueOf(detailInfoLi.size()): null;
                Object[] objArray2 = new Object[i];
                uoa1.w("EditStickerRepo", str1+integer1, objArray2);
                List detailInfoLi1 = materialGrou.getDetailInfoList();
                if (detailInfoLi1 != null) {
                   ArrayList uArrayList1 = new ArrayList(u.Y(detailInfoLi1, 10));
                   Iterator iterator = detailInfoLi1.iterator();
                   while (iterator.hasNext()) {
                      MaterialDetailInfo materialDeta = iterator.next();
                      uArrayList1.add(StickerDetailInfo.parseFromMaterialDetailInfo(materialDeta, materialDeta.getExtObject(), materialGrou.getGroupId()));
                   }
                   stickerGroup.updateStickerDetailInfoListAll(uArrayList1);
                }
                uArrayList.add(stickerGroup);
             }
          }
          this.c.a(2, uArrayList, oobject);
       }
       return;
    }
}
