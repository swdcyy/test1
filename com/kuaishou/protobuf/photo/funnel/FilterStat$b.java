package com.kuaishou.protobuf.photo.funnel.FilterStat$b;
import pr4.e;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.FilterStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.FilterStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;
import java.lang.Boolean;

public final class FilterStat$b extends GeneratedMessageLite$Builder implements e	// class@000e1d
{

    public void FilterStat$b(){
       super(FilterStat.DEFAULT_INSTANCE);
    }
    public void FilterStat$b(FilterStat$a p0){
       super(FilterStat.DEFAULT_INSTANCE);
    }
    public String getRenderTime(){
       Object obj = PatchProxy.apply(null, this, FilterStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRenderTime();
    }
    public ByteString getRenderTimeBytes(){
       Object obj = PatchProxy.apply(null, this, FilterStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRenderTimeBytes();
    }
    public PrettifyRestore getRestore(){
       Object obj = PatchProxy.apply(null, this, FilterStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRestore();
    }
    public boolean hasRestore(){
       Object obj = PatchProxy.apply(null, this, FilterStat$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasRestore();
    }
}
