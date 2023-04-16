package h62.c;
import h62.c$a;
import nsd.u;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.String;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.SourceType;
import java.lang.Throwable;
import h62.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.yxcorp.retrofit.model.KwaiException;
import android.util.Log;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Map;
import kotlin.Pair;
import qrd.r0;
import java.lang.Enum;
import java.lang.Long;
import trd.t0;
import java.lang.StringBuilder;

public final class c	// class@002c6a
{
    public Integer a;
    public String b;
    public String c;
    public String d;
    public Integer e;
    public SourceType f;
    public final long g;
    public final LiveRedPacketStage h;
    public final LiveRedPacketAction i;
    public final String j;
    public final RedPacketType k;
    public final long l;
    public final long m;
    public final FirstReportType n;
    public final ActionType o;
    public final ActionStatus p;
    public final String q;
    public static final c$a r;

    static {
       c.r = new c$a(null);
    }
    public void c(long p0,LiveRedPacketStage p1,LiveRedPacketAction p2,String p3,RedPacketType p4,long p5,long p6,FirstReportType p7,ActionType p8,ActionStatus p9,String p10){
       a.p(p1, "stage");
       a.p(p2, "action");
       a.p(p4, "redPacketType");
       a.p(p7, "firstReportType");
       a.p(p8, "actionType");
       a.p(p9, "actionStatus");
       a.p(p10, "sdkVersion");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.m = p6;
       this.n = p7;
       this.o = p8;
       this.p = p9;
       this.q = p10;
       this.f = SourceType.DEFAULT;
    }
    public final c a(Throwable p0){
       int i;
       b uob = b.class;
       String str = "1";
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          Object obj1 = PatchProxy.applyOneRefs(p0, null, uob, str);
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          }else if(!p0 instanceof KwaiException){
             i = -7656;
          }else {
             i = p0.getErrorCode();
          }
          this.b(i);
          str = PatchProxy.applyOneRefs(p0, null, uob, "2");
          if (str != PatchProxyResult.class) {
          }else if(!p0 instanceof KwaiException){
             str = Log.getStackTraceString(p0);
          }else {
             str = p0.getMessage();
             if (str == null) {
                str = "";
             }
          }
          this.c(str);
          String str1 = PatchProxy.applyOneRefs(p0, null, uob, "3");
          if (str1 != PatchProxyResult.class) {
          }else {
             str1 = TextUtils.k(p0.getMessage());
          }
          this.c = str1;
       }
       return this;
    }
    public final c b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a = Integer.valueOf(p0);
       return this;
    }
    public final c c(String p0){
       this.b = p0;
       return this;
    }
    public final c d(String p0){
       this.d = p0;
       return this;
    }
    public final c e(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e = Integer.valueOf(p0);
       return this;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (!this.g - p0.g && (a.g(this.h, p0.h) && (a.g(this.i, p0.i) && (a.g(this.j, p0.j) && (a.g(this.k, p0.k) && (!this.l - p0.l && (!this.m - p0.m && (a.g(this.n, p0.n) && (a.g(this.o, p0.o) && (a.g(this.p, p0.p) && a.g(this.q, p0.q))))))))))))) {
          return true;
       }
       return false;
    }
    public final Map f(){
       c obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          String str = "";
       }
       c te = this.e;
       int i = 0;
       int i1 = (te != null)? te.intValue(): 0;
       c tf = this.f;
       if (tf == null) {
          tf = SourceType.DEFAULT;
       }
       Pair[] pairArray = new Pair[13];
       pairArray[i] = r0.a("sender_id", String.valueOf(this.g));
       pairArray[1] = r0.a("stage", Integer.valueOf(this.h.ordinal()));
       pairArray[2] = r0.a("action", this.i.name());
       pairArray[3] = r0.a("red_packet_id", obj);
       pairArray[4] = r0.a("red_packet_type", Integer.valueOf(this.k.getRedPacketType()));
       pairArray[5] = r0.a("current_action_time", Long.valueOf(this.l));
       pairArray[6] = r0.a("current_action_total_time", Long.valueOf(this.m));
       pairArray[7] = r0.a("sdk_version", this.q);
       pairArray[8] = r0.a("first_report", Integer.valueOf(this.n.getType()));
       pairArray[9] = r0.a("action_type", Integer.valueOf(this.o.getType()));
       pairArray[10] = r0.a("action_status", this.p.getStatus());
       pairArray[11] = r0.a("sub_red_packet_type", Integer.valueOf(i1));
       pairArray[12] = r0.a("source_type", Integer.valueOf(tf.getSourceType()));
       Map map = t0.j0(pairArray);
       te = this.a;
       if (te != null) {
          map.put("error_code", Integer.valueOf(te.intValue()));
       }
       te = this.b;
       if (te != null) {
          map.put("error_msg", te);
       }
       te = this.c;
       if (te != null) {
          map.put("error_desc", te);
       }
       te = this.d;
       if (te != null) {
          map.put("extra_info", te);
       }
       return map;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.g;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.h;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.i;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.j;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.k;
       i2 = (obj != null)? obj.hashCode(): 0;
       c tl = this.l;
       tl = this.m;
       i = (((((i + i2) * 31) + (int)(tl ^ (tl >> 32))) * 31) + (int)(tl ^ (tl >> 32))) * 31;
       obj = this.n;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.o;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.p;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.q;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRedPacketTraceData\(senderId="+this.g+", stage="+this.h+", action="+this.i+", redPacketId="+this.j+", redPacketType="+this.k+", currentActionTime="+this.l+", currentActionTotalTime="+this.m+", firstReportType="+this.n+", actionType="+this.o+", actionStatus="+this.p+", sdkVersion="+this.q+"\)";
    }
}
