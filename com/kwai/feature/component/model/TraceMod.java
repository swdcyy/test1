package com.kwai.feature.component.model.TraceMod;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;

public class TraceMod implements Serializable	// class@00121f
{
    public String actId;
    public String authorId;
    public String category;
    public String commentId;
    public String createPage2;
    public int createPageDepth;
    public long createTimestamp;
    public String generateFrom;
    public String headLiveId;
    public String lifeCycle;
    public String liveId;
    public String photoId;
    public String plcGoodsId;
    public String plcName;
    public String plcPoiId;
    public String queryId;
    public String queryListId;
    public String stgRecallSource;
    public String traceType;
    public static final long serialVersionUID = 0x1e7f3b658e51e394;

    public void TraceMod(){
       super();
       this.createPageDepth = -1;
       this.createTimestamp = 0;
       this.category = "";
       this.lifeCycle = "";
    }
    public void getCategory(int p0){
       if (p0) {
          this.category = (p0 != 1)? "": "KS_TRACE_CATEGORY_COMMAND";
       }else {
          this.category = "KS_TRACE_CATEGORY_DATA";
       }
       return;
    }
    public void getGenerateFrom(int p0){
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                this.generateFrom = (p0 != 3)? "": "KS_TRACE_GENERATE_FROM_KWAILINK";
             }else {
                this.generateFrom = "KS_TRACE_GENERATE_FROM_API";
             }
          }else {
             this.generateFrom = "KS_TRACE_GENERATE_FROM_CLIENT";
          }
       }else {
          this.generateFrom = "KS_TRACE_GENERATE_FROM_UNKNOWN";
       }
       return;
    }
    public void getLifeCycle(int p0){
       if (p0) {
          if (p0 != 1) {
             this.lifeCycle = (p0 != 2)? "": "KS_TRACE_LIFE_CYCLE_ONE_STEP";
          }else {
             this.lifeCycle = "KS_TRACE_LIFE_CYCLE_SINGLE_PAGE";
          }
       }else {
          this.lifeCycle = "KS_TRACE_LIFE_CYCLE_INFINITE";
       }
       return;
    }
    public void getTraceType(int p0){
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                this.traceType = (p0 != 3)? "": "KS_TRACE_TYPE_ENTRY_ID_INFO";
             }else {
                this.traceType = "KS_TRACE_TYPE_RECALL";
             }
          }else {
             this.traceType = "KS_TRACE_TYPE_ACTIVITY";
          }
       }else {
          this.traceType = "KS_TRACE_TYPE_UNKNOWN";
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TraceMod.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GsonUtil.toJson(this);
    }
}
