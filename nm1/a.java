package nm1.a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceId;
import java.lang.String;
import java.lang.Short;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@00336f
{
    public short a;
    public long b;
    public int c;
    public long d;
    public int e;
    public boolean f;
    public String g;

    public void a(int p0,long p1,int p2){
       super();
       this.a = 1;
       this.b = 1000;
       this.b = 0;
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = true;
    }
    public void a(LiveKtraceProto$AppKTraceId p0){
       super();
       this.a = 1;
       this.b = 1000;
       this.a = (short)p0.version;
       this.b = p0.serviceInstanceId;
       this.c = p0.threadId;
       this.d = p0.timestamp;
       this.e = p0.counter;
       this.f = true;
    }
    public void a(String p0){
       int i;
       super();
       this.a = 1;
       this.b = 1000;
       String[] stringArray = p0.split("\\.");
       try{
          i = 0;
          this.a = Short.parseShort(stringArray[i]);
          this.b = Long.parseLong(stringArray[1]);
          this.c = Integer.parseInt(stringArray[2]);
          this.d = Long.parseLong(stringArray[3]);
          this.e = Integer.parseInt(stringArray[4]);
          this.f = true;
       }catch(java.lang.NumberFormatException e0){
          this.f = i;
       }
       return;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0 instanceof a) {
          return b;
       }
       if (this.a == p0.a && (!this.b - p0.b && (this.c == p0.c && (!this.d - p0.d && this.e == p0.e)))) {
          b = true;
       }
    label_002e :
       return b;
    }
    public int hashCode(){
       a ta = this.a;
       a tb = this.b;
       tb = this.c;
       tb = this.d;
       tb = this.e;
       return (((((((((ta ^ (ta >> 32)) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (tb ^ (tb >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a+"."+this.b+"."+this.c+"."+this.d+"."+this.e;
    }
}
