package mm1.i;
import java.lang.Cloneable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import nm1.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import nm1.a;
import java.lang.ThreadLocal;
import nm1.e$a;
import java.lang.Thread;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceId;

public abstract class i implements Cloneable	// class@0031c9
{
    public LiveKtraceProto$AppKTraceContextCarrier b;
    public final LiveKtraceProto$AppKTraceId c;
    public final long d;

    public void i(long p0){
       a uoa;
       super();
       this.d = p0;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          uoa = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uoe, "1");
          if (uoa != PatchProxyResult.class) {
          label_0049 :
             Objects.requireNonNull(uoa);
             LiveKtraceProto$AppKTraceId uAppKTraceId = PatchProxy.apply(null, uoa, a.class, "2");
             if (uAppKTraceId != PatchProxyResult.class) {
             }else {
                uAppKTraceId = new LiveKtraceProto$AppKTraceId();
                uAppKTraceId.version = uoa.a;
                uAppKTraceId.serviceInstanceId = uoa.b;
                uAppKTraceId.threadId = uoa.c;
                uAppKTraceId.timestamp = uoa.d;
                uAppKTraceId.counter = uoa.e;
             }
             this.c = uAppKTraceId;
             return;
          }
       }
       e$a uoa1 = e.a.get();
       short s = 0;
       if (uoa1 != null) {
          if (uoa1.a == 0x2710) {
             uoa1.a = s;
          }
          s = uoa1.a;
          uoa1.a = (short)(s + 1);
       }
       uoa = new a((int)Thread.currentThread().getId(), p0, s);
       goto label_0049 ;
    }
    public abstract String a();
    public long b(){
       return this.d;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
}
