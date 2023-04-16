package com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$needRankStickerGroupIds$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$needRankStickerGroupIds$2$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import kotlin.collections.CollectionsKt__CollectionsKt;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class StickerRanker$needRankStickerGroupIds$2 extends Lambda implements a	// class@001211
{
    public static final StickerRanker$needRankStickerGroupIds$2 INSTANCE;

    static {
       StickerRanker$needRankStickerGroupIds$2.INSTANCE = new StickerRanker$needRankStickerGroupIds$2();
    }
    public void StickerRanker$needRankStickerGroupIds$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List obj = PatchProxy.apply(null, this, StickerRanker$needRankStickerGroupIds$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (StickerRanker.i.h().a()) {
          obj = a.t().getValue("sortStickerGroupIds", new StickerRanker$needRankStickerGroupIds$2$1().getType(), CollectionsKt__CollectionsKt.E());
          Object[] objArray = new Object[0];
          a.D().w("StickerRanker", "fetch from KSwitch needRankStickerGroupIdList="+obj, objArray);
       }else {
          obj = CollectionsKt__CollectionsKt.E();
       }
       return obj;
    }
}
