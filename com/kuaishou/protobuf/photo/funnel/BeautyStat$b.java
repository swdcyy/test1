package com.kuaishou.protobuf.photo.funnel.BeautyStat$b;
import pr4.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.BeautyStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.BeautyStat$a;
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

public final class BeautyStat$b extends GeneratedMessageLite$Builder implements c	// class@000e0b
{

    public void BeautyStat$b(){
       super(BeautyStat.DEFAULT_INSTANCE);
    }
    public void BeautyStat$b(BeautyStat$a p0){
       super(BeautyStat.DEFAULT_INSTANCE);
    }
    public PrettifyItem getItem(int p0){
       if (PatchProxy.isSupport(BeautyStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, BeautyStat$b.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getItem(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, BeautyStat$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getItemCount();
    }
    public List getItemList(){
       Object obj = PatchProxy.apply(null, this, BeautyStat$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getItemList());
    }
    public String getRenderTime(){
       Object obj = PatchProxy.apply(null, this, BeautyStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRenderTime();
    }
    public ByteString getRenderTimeBytes(){
       Object obj = PatchProxy.apply(null, this, BeautyStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRenderTimeBytes();
    }
    public PrettifyRestore getRestore(){
       Object obj = PatchProxy.apply(null, this, BeautyStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRestore();
    }
    public boolean hasRestore(){
       Object obj = PatchProxy.apply(null, this, BeautyStat$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasRestore();
    }
}
