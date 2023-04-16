package com.kuaishou.protobuf.photo.funnel.PublishStat$b;
import pr4.p;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PublishStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PublishStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.protobuf.ByteString;

public final class PublishStat$b extends GeneratedMessageLite$Builder implements p	// class@000e49
{

    public void PublishStat$b(){
       super(PublishStat.DEFAULT_INSTANCE);
    }
    public void PublishStat$b(PublishStat$a p0){
       super(PublishStat.DEFAULT_INSTANCE);
    }
    public boolean getHasPublished(){
       Object obj = PatchProxy.apply(null, this, PublishStat$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getHasPublished();
    }
    public String getHashTags(){
       Object obj = PatchProxy.apply(null, this, PublishStat$b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getHashTags();
    }
    public ByteString getHashTagsBytes(){
       Object obj = PatchProxy.apply(null, this, PublishStat$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getHashTagsBytes();
    }
    public boolean getIsEnter(){
       Object obj = PatchProxy.apply(null, this, PublishStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsEnter();
    }
    public String getPrivacy(){
       Object obj = PatchProxy.apply(null, this, PublishStat$b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPrivacy();
    }
    public ByteString getPrivacyBytes(){
       Object obj = PatchProxy.apply(null, this, PublishStat$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPrivacyBytes();
    }
    public boolean getSaveToDraft(){
       Object obj = PatchProxy.apply(null, this, PublishStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getSaveToDraft();
    }
}
