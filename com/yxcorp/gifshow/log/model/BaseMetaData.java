package com.yxcorp.gifshow.log.model.BaseMetaData;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import java.lang.String;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f3b.u;

public abstract class BaseMetaData implements Serializable	// class@001b0f
{
    public FeedLogCtx feedLogCtx;
    public StidContainerProto$StidContainer interStidContainer;
    public boolean isRealTime;
    public e0 logPage;
    public static final long serialVersionUID = 0xeea3a35184582019;

    public void BaseMetaData(){
       super();
       this.isRealTime = false;
    }
    public FeedLogCtx getFeedLogCtx(){
       return this.feedLogCtx;
    }
    public e0 getLogPage(){
       return this.logPage;
    }
    public String getStExParams(){
       BaseMetaData tuBaseMetaDa = this.feedLogCtx;
       if (tuBaseMetaDa != null) {
          FeedLogCtx stExParams = tuBaseMetaDa.stExParams;
          if (stExParams != null) {
             return stExParams;
          }
       }
       return "";
    }
    public StidContainerProto$StidContainer getStidContainer(){
       StidContainerProto$StidContainer stidContaine1;
       BaseMetaData obj = PatchProxy.apply(null, this, BaseMetaData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.interStidContainer;
       BaseMetaData tuBaseMetaDa = this.feedLogCtx;
       if (tuBaseMetaDa != null) {
          StidContainerProto$StidContainer stidContaine = u.c(tuBaseMetaDa.stidContainer);
          if (stidContaine != null) {
             stidContaine1 = stidContaine;
          }
       }
       return stidContaine1;
    }
    public boolean isRealTime(){
       return this.isRealTime;
    }
}
