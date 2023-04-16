package com.kuaishou.protobuf.photo.funnel.CoverStat$b;
import pr4.d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.CoverStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.CoverStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.google.protobuf.ByteString;

public final class CoverStat$b extends GeneratedMessageLite$Builder implements d	// class@000e14
{

    public void CoverStat$b(){
       super(CoverStat.DEFAULT_INSTANCE);
    }
    public void CoverStat$b(CoverStat$a p0){
       super(CoverStat.DEFAULT_INSTANCE);
    }
    public float getCustomTimestamp(){
       Object obj = PatchProxy.apply(null, this, CoverStat$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getCustomTimestamp();
    }
    public boolean getIsChange(){
       Object obj = PatchProxy.apply(null, this, CoverStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsChange();
    }
    public String getStickerName(){
       Object obj = PatchProxy.apply(null, this, CoverStat$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getStickerName();
    }
    public ByteString getStickerNameBytes(){
       Object obj = PatchProxy.apply(null, this, CoverStat$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getStickerNameBytes();
    }
}
