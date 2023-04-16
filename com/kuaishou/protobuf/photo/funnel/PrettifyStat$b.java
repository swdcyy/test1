package com.kuaishou.protobuf.photo.funnel.PrettifyStat$b;
import pr4.o;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PrettifyStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PrettifyStat$a;
import com.kuaishou.protobuf.photo.funnel.BeautyStat;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat;
import java.lang.Integer;
import java.lang.Number;
import java.util.List;
import java.util.Collections;
import com.kuaishou.protobuf.photo.funnel.BodyStat;
import com.kuaishou.protobuf.photo.funnel.FilterStat;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat;
import java.lang.Boolean;

public final class PrettifyStat$b extends GeneratedMessageLite$Builder implements o	// class@000e46
{

    public void PrettifyStat$b(){
       super(PrettifyStat.DEFAULT_INSTANCE);
    }
    public void PrettifyStat$b(PrettifyStat$a p0){
       super(PrettifyStat.DEFAULT_INSTANCE);
    }
    public BeautyStat getBeauty(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getBeauty();
    }
    public PrettifyBlockStat getBlockStat(int p0){
       if (PatchProxy.isSupport(PrettifyStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PrettifyStat$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getBlockStat(p0);
    }
    public int getBlockStatCount(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getBlockStatCount();
    }
    public List getBlockStatList(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getBlockStatList());
    }
    public BodyStat getBody(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getBody();
    }
    public FilterStat getFilter(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFilter();
    }
    public MakeUpStat getMakeup(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getMakeup();
    }
    public boolean hasBeauty(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasBeauty();
    }
    public boolean hasBody(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasBody();
    }
    public boolean hasFilter(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasFilter();
    }
    public boolean hasMakeup(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat$b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasMakeup();
    }
}
