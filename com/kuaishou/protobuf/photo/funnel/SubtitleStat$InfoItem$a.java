package com.kuaishou.protobuf.photo.funnel.SubtitleStat$InfoItem$a;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$InfoItem;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.protobuf.ByteString;

public final class SubtitleStat$InfoItem$a extends GeneratedMessageLite$Builder implements SubtitleStat$c	// class@000e69
{

    public void SubtitleStat$InfoItem$a(){
       super(SubtitleStat$InfoItem.DEFAULT_INSTANCE);
    }
    public void SubtitleStat$InfoItem$a(SubtitleStat$a p0){
       super(SubtitleStat$InfoItem.DEFAULT_INSTANCE);
    }
    public float getEnd(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getEnd();
    }
    public String getFileKey(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFileKey();
    }
    public ByteString getFileKeyBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFileKeyBytes();
    }
    public String getPath(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPath();
    }
    public ByteString getPathBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPathBytes();
    }
    public String getRemuxPath(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRemuxPath();
    }
    public ByteString getRemuxPathBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRemuxPathBytes();
    }
    public float getStart(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getStart();
    }
    public String getToken(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getToken();
    }
    public ByteString getTokenBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTokenBytes();
    }
    public float getVolume(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem$a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getVolume();
    }
}
