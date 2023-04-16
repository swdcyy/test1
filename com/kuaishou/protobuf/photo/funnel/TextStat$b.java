package com.kuaishou.protobuf.photo.funnel.TextStat$b;
import com.kuaishou.protobuf.photo.funnel.h;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.TextStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.TextStat$a;
import com.kuaishou.protobuf.photo.funnel.TextStat$TextItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.Collections;

public final class TextStat$b extends GeneratedMessageLite$Builder implements h	// class@000e7e
{

    public void TextStat$b(){
       super(TextStat.DEFAULT_INSTANCE);
    }
    public void TextStat$b(TextStat$a p0){
       super(TextStat.DEFAULT_INSTANCE);
    }
    public TextStat$TextItem getItem(int p0){
       if (PatchProxy.isSupport(TextStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TextStat$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getItem(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, TextStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getItemCount();
    }
    public List getItemList(){
       Object obj = PatchProxy.apply(null, this, TextStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getItemList());
    }
}
