package com.kuaishou.protobuf.photo.funnel.MakeUpStat$b;
import pr4.g;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat$a;
import com.kuaishou.protobuf.photo.funnel.PrettifyItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;
import java.lang.Boolean;

public final class MakeUpStat$b extends GeneratedMessageLite$Builder implements g	// class@000e23
{

    public void MakeUpStat$b(){
       super(MakeUpStat.DEFAULT_INSTANCE);
    }
    public void MakeUpStat$b(MakeUpStat$a p0){
       super(MakeUpStat.DEFAULT_INSTANCE);
    }
    public PrettifyItem getItem(int p0){
       if (PatchProxy.isSupport(MakeUpStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MakeUpStat$b.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getItem(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, MakeUpStat$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getItemCount();
    }
    public List getItemList(){
       Object obj = PatchProxy.apply(null, this, MakeUpStat$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getItemList());
    }
    public String getRenderTime(){
       Object obj = PatchProxy.apply(null, this, MakeUpStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRenderTime();
    }
    public ByteString getRenderTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MakeUpStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRenderTimeBytes();
    }
    public PrettifyRestore getRestore(){
       Object obj = PatchProxy.apply(null, this, MakeUpStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRestore();
    }
    public boolean hasRestore(){
       Object obj = PatchProxy.apply(null, this, MakeUpStat$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasRestore();
    }
}
