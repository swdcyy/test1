package com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo$a;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$RecInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.protobuf.ByteString;

public final class SubtitleStat$RecInfo$a extends GeneratedMessageLite$Builder implements SubtitleStat$d	// class@000e6b
{

    public void SubtitleStat$RecInfo$a(){
       super(SubtitleStat$RecInfo.DEFAULT_INSTANCE);
    }
    public void SubtitleStat$RecInfo$a(SubtitleStat$a p0){
       super(SubtitleStat$RecInfo.DEFAULT_INSTANCE);
    }
    public float getEnd(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$RecInfo$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getEnd();
    }
    public float getStart(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$RecInfo$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getStart();
    }
    public String getText(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$RecInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getText();
    }
    public ByteString getTextBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$RecInfo$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTextBytes();
    }
}
