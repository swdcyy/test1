package okhttp3.internal.huc.StreamedRequestBody;
import okhttp3.internal.http.UnrepeatableRequestBody;
import okhttp3.internal.huc.OutputStreamRequestBody;
import cud.i;
import okio.m;
import okio.c;
import okio.l;
import okio.b;
import okio.n;

public final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody	// class@001fc7
{
    public final i pipe;

    public void StreamedRequestBody(long p0){
       super();
       i oi = new i(8192);
       this.pipe = oi;
       this.initOutputStream(l.c(oi.e()), p0);
    }
    public void writeTo(c p0){
       b uob = new b();
       while (this.pipe.f.read(uob, 8192) - -1) {
          p0.write(uob, uob.p());
       }
       return;
    }
}
