package com.kuaishou.protobuf.photo.funnel.StickerStat$StickerItem$a;
import com.kuaishou.protobuf.photo.funnel.StickerStat$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.StickerStat$StickerItem;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.StickerStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.Position;
import java.lang.Number;
import java.lang.Boolean;

public final class StickerStat$StickerItem$a extends GeneratedMessageLite$Builder implements StickerStat$c	// class@000e63
{

    public void StickerStat$StickerItem$a(){
       super(StickerStat$StickerItem.DEFAULT_INSTANCE);
    }
    public void StickerStat$StickerItem$a(StickerStat$a p0){
       super(StickerStat$StickerItem.DEFAULT_INSTANCE);
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getIdBytes();
    }
    public Position getPosition(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem$a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPosition();
    }
    public float getScale(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getScale();
    }
    public String getType(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getType();
    }
    public ByteString getTypeBytes(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTypeBytes();
    }
    public boolean hasPosition(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem$a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasPosition();
    }
}
