package hba.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Text;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.StickerResult;
import java.lang.System;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$CompTextInfoModel;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextResource;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$CompTextLayerInfoModel;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$AnimationInfoModel;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$VideoEffectModel;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$VideoAssetModel;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel;

public class b extends e	// class@0025fa
{

    public void b(File p0,Text p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       Text text = PatchProxy.apply(null, this, b.class, "1");
       if (text != PatchProxyResult.class) {
       }else {
          Text$b uob = Text.newBuilder();
          uob.b(DraftUtils.i());
          StickerResult$b uob1 = StickerResult.newBuilder();
          uob1.w((int)(System.currentTimeMillis() / 1000));
          uob.k(uob1.build());
          text = uob.build();
       }
       return text;
    }
    public List j(GeneratedMessageLite p0){
       List list;
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          int i = 0;
          if (p0.hasResult()) {
             String[] stringArray = new String[]{p0.getResult().getPreviewImageFile(),p0.getResult().getOutputImageFile()};
             list = Arrays.asList(stringArray);
          }else {
             list = Collections.emptyList();
          }
          ArrayList uArrayList1 = new ArrayList(list);
          if (p0.hasCompTextIndoModel()) {
             CommonDraftTextAssetModel$CompTextInfoModel compTextIndo = p0.getCompTextIndoModel();
             uArrayList1.add(p0.getCompTextIndoModel().getResource().getResPath());
             while (i < compTextIndo.getLayerInfosCount()) {
                CommonDraftTextAssetModel$CompTextLayerInfoModel layerInfos = compTextIndo.getLayerInfos(i);
                if (layerInfos.hasAnimationInfo()) {
                   if (layerInfos.getAnimationInfo().hasSubInEffect() && layerInfos.getAnimationInfo().getSubInEffect().hasBase()) {
                      uArrayList1.add(layerInfos.getAnimationInfo().getSubInEffect().getBase().getPath());
                   }
                   if (layerInfos.getAnimationInfo().hasSubOutEffect() && layerInfos.getAnimationInfo().getSubOutEffect().hasBase()) {
                      uArrayList1.add(layerInfos.getAnimationInfo().getSubOutEffect().getBase().getPath());
                   }
                   if (layerInfos.getAnimationInfo().hasSubRepeatEffect() && layerInfos.getAnimationInfo().getSubRepeatEffect().hasBase()) {
                      uArrayList1.add(layerInfos.getAnimationInfo().getSubRepeatEffect().getBase().getPath());
                   }
                }
             label_00e9 :
                if (layerInfos.hasTextInfo()) {
                   uArrayList1.add(layerInfos.getTextInfo().getFontId());
                }
                i = i + 1;
             }
          }
          uArrayList = uArrayList1;
       }
       return uArrayList;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.f().b(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
}
