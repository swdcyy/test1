package com.kuaishou.protobuf.photo.funnel.RecordStat$b;
import pr4.q;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.RecordStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.protobuf.photo.funnel.MagicFaceStat;
import com.kuaishou.protobuf.photo.funnel.MusicStat;
import com.kuaishou.protobuf.photo.funnel.PrettifyStat;

public final class RecordStat$b extends GeneratedMessageLite$Builder implements q	// class@000e5e
{

    public void RecordStat$b(){
       super(RecordStat.DEFAULT_INSTANCE);
    }
    public void RecordStat$b(RecordStat$a p0){
       super(RecordStat.DEFAULT_INSTANCE);
    }
    public RecordStat$b a(RecordBaseStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecordStat$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setPageBase(p0);
       return this;
    }
    public boolean getHasRecord(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getHasRecord();
    }
    public boolean getIsEnter(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsEnter();
    }
    public MagicFaceStat getMagicFace(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getMagicFace();
    }
    public MusicStat getMusic(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getMusic();
    }
    public RecordBaseStat getPageBase(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPageBase();
    }
    public PrettifyStat getPrettify(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPrettify();
    }
    public boolean hasMagicFace(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasMagicFace();
    }
    public boolean hasMusic(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasMusic();
    }
    public boolean hasPageBase(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasPageBase();
    }
    public boolean hasPrettify(){
       Object obj = PatchProxy.apply(null, this, RecordStat$b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasPrettify();
    }
}
