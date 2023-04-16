package mm1.c;
import mm1.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.nano.MessageNano;
import nm1.f;
import java.util.concurrent.LinkedBlockingDeque;
import java.lang.Boolean;
import java.util.Objects;
import nm1.c;
import com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceContextCarrier;
import o56.a;
import java.lang.RuntimeException;
import java.lang.Number;
import java.lang.StringBuilder;

public abstract class c extends i	// class@0031c3
{
    public String action;
    public String authorId;
    public int code;
    public long curActionTimeCostMs;
    public final boolean e;
    public String f;
    public Boolean friend;
    public final Deque g;
    public String ktvId;
    public long liveBizStatus;
    public long liveOperationType;
    public String liveSessionId;
    public String liveStreamId;
    public int liveStreamPatternType;
    public int mLiveModel;
    public String message;
    public Boolean myFollow;
    public int pageType;
    public String pkId;
    public long reportTimestampMs;
    public String serverExpTag;
    public long showIndexPlusOne;
    public int sourceTypeNew;
    public String sourceUrl;
    public String stage;
    public String teamPkRoomId;
    public String theaterId;
    public long totalTimeCostMs;
    public final String traceId;
    public String voicePartyId;
    public String voicePartyPkId;

    public void c(long p0){
       super(p0);
       String str = PatchProxy.apply(null, this, i.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = f.a(this.c);
       }
       this.traceId = str;
       this.e = true;
       this.g = new LinkedBlockingDeque();
       return;
    }
    public void c(String p0,long p1){
       super(p1);
       this.traceId = p0;
       this.e = false;
       this.g = new LinkedBlockingDeque();
    }
    public int c(){
       return this.code;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public abstract String d();
    public String e(){
       return this.stage;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof c) {
          return false;
       }
       return Objects.equals(this.traceId, p0.traceId);
    }
    public String f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.e == null) {
          throw new RuntimeException("自定义traceId，暂不支持traceContext");
       }
       if (this.f == null) {
          obj = PatchProxy.apply(objArray, this, i.class, "2");
          if (obj != patchProxyRe) {
          }else if(this.b == null){
             i tc = this.c;
             String str = this.a();
             LiveKtraceProto$AppKTraceContextCarrier uAppKTraceCo = PatchProxy.applyTwoRefs(tc, str, objArray, c.class, "1");
             if (uAppKTraceCo != patchProxyRe) {
             }else {
                uAppKTraceCo = new LiveKtraceProto$AppKTraceContextCarrier();
                uAppKTraceCo.version = 1;
                uAppKTraceCo.primaryTraceId = tc;
                uAppKTraceCo.serviceName = a.x;
                uAppKTraceCo.bizName = str;
             }
             this.b = uAppKTraceCo;
          }
          obj = f.a(this.b);
          this.f = obj;
       }
       return this.f;
    }
    public String g(){
       return this.traceId;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.traceId};
       return Objects.hash(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TraceInfo{traceId=\'"+this.traceId+'''+", traceContext=\'"+this.f+'''+", stage=\'"+this.stage+'''+", action=\'"+this.action+'''+", message=\'"+this.message+'''+", code="+this.code+'''+", curActionTimeCostMs="+this.curActionTimeCostMs+'}';
    }
}
