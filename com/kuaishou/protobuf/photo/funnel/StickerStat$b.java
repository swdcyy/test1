package com.kuaishou.protobuf.photo.funnel.StickerStat$b;
import com.kuaishou.protobuf.photo.funnel.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.StickerStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.StickerStat$a;
import com.kuaishou.protobuf.photo.funnel.StickerStat$StickerItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.Collections;

public final class StickerStat$b extends GeneratedMessageLite$Builder implements f	// class@000e66
{

    public void StickerStat$b(){
       super(StickerStat.DEFAULT_INSTANCE);
    }
    public void StickerStat$b(StickerStat$a p0){
       super(StickerStat.DEFAULT_INSTANCE);
    }
    public StickerStat$StickerItem getItem(int p0){
       if (PatchProxy.isSupport(StickerStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StickerStat$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getItem(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, StickerStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getItemCount();
    }
    public List getItemList(){
       Object obj = PatchProxy.apply(null, this, StickerStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getItemList());
    }
}
