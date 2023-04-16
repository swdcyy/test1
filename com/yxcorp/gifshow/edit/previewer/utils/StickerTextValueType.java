package com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import java.lang.Enum;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType$Draft;
import java.lang.String;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType$EditElement;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType$AnimatedSubAsset;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wba.h0;

public abstract class StickerTextValueType extends Enum	// class@001b6c
{
    public static final StickerTextValueType[] $VALUES;
    public static final StickerTextValueType AnimatedSubAsset;
    public static final StickerTextValueType Draft;
    public static final StickerTextValueType EditElement;

    static {
       StickerTextValueType$Draft uDraft;
       StickerTextValueType$EditElement uEditElement;
       StickerTextValueType$AnimatedSubAsset uAnimatedSub;
       StickerTextValueType[] stickerTextV = new StickerTextValueType[]{uDraft,uEditElement,uAnimatedSub};
       uDraft = new StickerTextValueType$Draft("Draft", 0);
       StickerTextValueType.Draft = uDraft;
       uEditElement = new StickerTextValueType$EditElement("EditElement", 1);
       StickerTextValueType.EditElement = uEditElement;
       uAnimatedSub = new StickerTextValueType$AnimatedSubAsset("AnimatedSubAsset", 2);
       StickerTextValueType.AnimatedSubAsset = uAnimatedSub;
       StickerTextValueType.$VALUES = stickerTextV;
    }
    public void StickerTextValueType(String p0,int p1){
       super(p0, p1);
    }
    public void StickerTextValueType(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static StickerTextValueType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StickerTextValueType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(StickerTextValueType.class, p0);
    }
    public static StickerTextValueType[] values(){
       Object obj = PatchProxy.apply(null, null, StickerTextValueType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StickerTextValueType.$VALUES.clone();
    }
    public abstract h0 convertToCommonData(h0 p0,StickerTextValueType p1);
}
