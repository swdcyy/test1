package com.yxcorp.gifshow.edit.previewer.utils.AssetExt$getFirstSegmentIdentifyByAssetIdentify$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.edit.draft.Asset;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AssetExt$getFirstSegmentIdentifyByAssetIdentify$1 extends Lambda implements l	// class@001b60
{
    public final String $segmentIdentify;

    public void AssetExt$getFirstSegmentIdentifyByAssetIdentify$1(String p0){
       this.$segmentIdentify = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Asset p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AssetExt$getFirstSegmentIdentifyByAssetIdentify$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.o(p0, "it");
       return (p0.getIdentifier()).equals(this.$segmentIdentify);
    }
}
