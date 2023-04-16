package com.kuaishou.protobuf.photo.funnel.PageInfo$b;
import pr4.h;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PageInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PageInfo$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class PageInfo$b extends GeneratedMessageLite$Builder implements h	// class@000e2f
{

    public void PageInfo$b(){
       super(PageInfo.DEFAULT_INSTANCE);
    }
    public void PageInfo$b(PageInfo$a p0){
       super(PageInfo.DEFAULT_INSTANCE);
    }
    public PageInfo$b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PageInfo$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setStage(p0);
       return this;
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, PageInfo$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, PageInfo$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getNameBytes();
    }
    public String getStage(){
       Object obj = PatchProxy.apply(null, this, PageInfo$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getStage();
    }
    public ByteString getStageBytes(){
       Object obj = PatchProxy.apply(null, this, PageInfo$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getStageBytes();
    }
    public String getTime(){
       Object obj = PatchProxy.apply(null, this, PageInfo$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTime();
    }
    public ByteString getTimeBytes(){
       Object obj = PatchProxy.apply(null, this, PageInfo$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTimeBytes();
    }
}
