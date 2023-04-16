package com.kuaishou.protobuf.photo.funnel.TextStat$TextItem$a;
import com.kuaishou.protobuf.photo.funnel.TextStat$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.TextStat$TextItem;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.TextStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.protobuf.ByteString;

public final class TextStat$TextItem$a extends GeneratedMessageLite$Builder implements TextStat$c	// class@000e7b
{

    public void TextStat$TextItem$a(){
       super(TextStat$TextItem.DEFAULT_INSTANCE);
    }
    public void TextStat$TextItem$a(TextStat$a p0){
       super(TextStat$TextItem.DEFAULT_INSTANCE);
    }
    public float getDuration(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getDuration();
    }
    public String getFont(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFont();
    }
    public ByteString getFontBytes(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFontBytes();
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getIdBytes();
    }
    public int getLayer(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getLayer();
    }
    public float getStartTime(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getStartTime();
    }
    public String getText(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getText();
    }
    public ByteString getTextBytes(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTextBytes();
    }
}
