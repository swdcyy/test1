package com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel$mReorderDataList$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import java.lang.Object;
import zsc.a;
import zsc.b;
import atc.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.AssetSegment;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import haa.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Asset;
import wba.z;
import com.kuaishou.edit.draft.FineTuningParam;
import com.kwai.video.minecraft.model.nano.Minecraft$BasicAdjustParam;
import wba.p;
import java.lang.Integer;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import java.util.ArrayList;
import com.kuaishou.edit.draft.Workspace$Type;
import haa.f;
import java.lang.StringBuilder;
import w46.b;
import faa.a;
import com.kwai.video.minecraft.model.nano.Minecraft$DefinitionParam;
import vba.g;

public final class ReorderViewModel$mReorderDataList$1 extends Lambda implements p	// class@0011bc
{
    public final ReorderViewModel this$0;

    public void ReorderViewModel$mReorderDataList$1(ReorderViewModel p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final b invoke(a p0,b p1){
       List list;
       Object[] objArray;
       String str2;
       Iterator iterator1;
       int i5;
       String albumId;
       Size obj = this;
       Object obj1 = p0;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj2 = PatchProxy.applyTwoRefs(obj1, p1, obj, ReorderViewModel$mReorderDataList$1.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj1, "draftData");
       String identifier = p0.a().getIdentifier();
       a.o(identifier, "draftData.assetSegment.identifier");
       ReorderViewModel m = obj.this$0.m;
       String identifier1 = p0.a().getIdentifier();
       Objects.requireNonNull(m);
       String obj3 = PatchProxy.applyOneRefs(identifier1, m, uoa, "9");
       String str = "it";
       String str1 = "DraftGetUtils.getAssetDr¡­\(workspaceDraft\).messages";
       if (obj3 != patchProxyRe) {
          identifier1 = obj3;
       }else {
          list = a.c(m.c).z();
          a.o(list, str1);
          Iterator iterator2 = list.iterator();
          while (true) {
             if (iterator2.hasNext()) {
                Asset uAsset1 = iterator2.next();
                a.o(uAsset1, str);
                if (a.g(uAsset1.getIdentifier(), identifier1)) {
                   albumId = uAsset1.getAlbumId();
                   a.o(albumId, "it.albumId");
                }
             }else {
                albumId = "";
             }
             identifier1 = albumId;
          }
       }
       obj3 = z.f(p0.a());
       a b = obj1.b;
       Minecraft$BasicAdjustParam uBasicAdjust = p.d(p0.b());
       ReorderViewModel$mReorderDataList$1 this$0 = obj.this$0;
       a d = obj1.d;
       Objects.requireNonNull(this$0);
       ReorderViewModel reorderViewM = ReorderViewModel.class;
       if (PatchProxy.isSupport(reorderViewM)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(d), this$0, reorderViewM, "18");
          if (obj != patchProxyRe) {
          }else {
          label_00b2 :
             ReorderViewModel m1 = this$0.m;
             list = this$0.i.w0();
             Objects.requireNonNull(m1);
             ArrayList uArrayList = PatchProxy.applyOneRefs(list, m1, uoa, "15");
             if (uArrayList != patchProxyRe) {
             }else {
                a.p(list, "assetSegmentSizeList");
                uArrayList = new ArrayList();
                int i = -1;
                List list1 = a.c(m1.c).z();
                a.o(list1, str1);
                Iterator iterator = list1.iterator();
                while (iterator.hasNext()) {
                   Asset uAsset = iterator.next();
                   a.o(uAsset, str);
                   a c = m1.c;
                   ReorderViewModel reorderViewM1 = m1;
                   Workspace$Type type = c.a1();
                   a.o(type, "workspaceDraft\n          .type");
                   int i1 = z.w(uAsset, c, type).size();
                   int i2 = 0;
                   Size size = null;
                   int i3 = 0;
                   while (i2 < i1) {
                      i = i + 1;
                      int i4 = i1;
                      if (i < 0 || i >= list.size()) {
                         str2 = str;
                         iterator1 = iterator;
                         i5 = i;
                         objArray = new Object[0];
                         f.D().t("ReorderAssetRepo", "getOriginPictureSizeList index out of bounds : index ="+i+", assetSegmentSizeList.size = "+list.size(), objArray);
                      }else {
                         size = list.get(i).b;
                         i3 = i3 + list.get(i).c;
                         i5 = i;
                         str2 = str;
                         iterator1 = iterator;
                      }
                      i2 = i2 + 1;
                      i1 = i4;
                      str = str2;
                      iterator = iterator1;
                      i = i5;
                   }
                   uArrayList.add(new Size(size, i3));
                   m1 = reorderViewM1;
                }
             }
             if (d < null || d >= uArrayList.size()) {
                objArray = new Object[0];
                a.D().t("ReorderViewModel", "draftData index out of bounds :index = "+d+", "+"originPictureListSize = "+uArrayList.size(), objArray);
                obj = new Size(0, 0);
             }else {
                obj = uArrayList.get(d);
             }
          }
       }else {
          goto label_00b2 ;
       }
       b uob = new b(identifier, identifier1, obj3, b, uBasicAdjust, obj, p.c(p0.b()));
       return obj2;
    }
}
