package com.kuaishou.protobuf.photo.funnel.MagicFaceStat$b;
import pr4.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.MagicFaceStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.MagicFaceStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;
import java.lang.Boolean;

public final class MagicFaceStat$b extends GeneratedMessageLite$Builder implements f	// class@000e20
{

    public void MagicFaceStat$b(){
       super(MagicFaceStat.DEFAULT_INSTANCE);
    }
    public void MagicFaceStat$b(MagicFaceStat$a p0){
       super(MagicFaceStat.DEFAULT_INSTANCE);
    }
    public String getApplyFailReason(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getApplyFailReason();
    }
    public ByteString getApplyFailReasonBytes(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getApplyFailReasonBytes();
    }
    public boolean getApplySuccess(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getApplySuccess();
    }
    public String getApplyTimeCost(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getApplyTimeCost();
    }
    public ByteString getApplyTimeCostBytes(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getApplyTimeCostBytes();
    }
    public String getDataFailReason(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDataFailReason();
    }
    public ByteString getDataFailReasonBytes(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDataFailReasonBytes();
    }
    public boolean getDataSuccess(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getDataSuccess();
    }
    public String getDataTimeCost(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDataTimeCost();
    }
    public ByteString getDataTimeCostBytes(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDataTimeCostBytes();
    }
    public boolean getResouceDownload(){
       Object obj = PatchProxy.apply(null, this, MagicFaceStat$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getResouceDownload();
    }
}
