package com.kuaishou.protobuf.photo.funnel.BodyStat$c;
import com.kuaishou.protobuf.photo.funnel.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.BodyStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.BodyStat$a;
import com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.Collections;

public final class BodyStat$c extends GeneratedMessageLite$Builder implements b	// class@000e11
{

    public void BodyStat$c(){
       super(BodyStat.DEFAULT_INSTANCE);
    }
    public void BodyStat$c(BodyStat$a p0){
       super(BodyStat.DEFAULT_INSTANCE);
    }
    public BodyStat$BodyItem getItem(int p0){
       if (PatchProxy.isSupport(BodyStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, BodyStat$c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getItem(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, BodyStat$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getItemCount();
    }
    public List getItemList(){
       Object obj = PatchProxy.apply(null, this, BodyStat$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getItemList());
    }
}
