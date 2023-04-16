package okhttp3.internal.http.CallServerInterceptor$CountingSink;
import okio.f;
import okio.m;
import okio.b;

public final class CallServerInterceptor$CountingSink extends f	// class@0020b3
{
    public long successfulCount;

    public void CallServerInterceptor$CountingSink(m p0){
       super(p0);
    }
    public void write(b p0,long p1){
       super.write(p0, p1);
       this.successfulCount = this.successfulCount + p1;
    }
}
