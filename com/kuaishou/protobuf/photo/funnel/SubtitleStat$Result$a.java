package com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result$a;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$e;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo;
import java.lang.Integer;
import java.lang.Number;
import java.util.List;
import java.util.Collections;

public final class SubtitleStat$Result$a extends GeneratedMessageLite$Builder implements SubtitleStat$e	// class@000e6d
{

    public void SubtitleStat$Result$a(){
       super(SubtitleStat$Result.DEFAULT_INSTANCE);
    }
    public void SubtitleStat$Result$a(SubtitleStat$a p0){
       super(SubtitleStat$Result.DEFAULT_INSTANCE);
    }
    public String getFileKey(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$Result$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFileKey();
    }
    public ByteString getFileKeyBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$Result$a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFileKeyBytes();
    }
    public SubtitleStat$RecInfo getInfo(int p0){
       if (PatchProxy.isSupport(SubtitleStat$Result$a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SubtitleStat$Result$a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getInfo(p0);
    }
    public int getInfoCount(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$Result$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getInfoCount();
    }
    public List getInfoList(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$Result$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getInfoList());
    }
    public int getStatus(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$Result$a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getStatus();
    }
}
