package okhttp3.ResponseBody$BomAwareReader;
import java.io.Reader;
import okio.d;
import java.nio.charset.Charset;
import okio.n;
import okhttp3.internal.Util;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.lang.String;

public final class ResponseBody$BomAwareReader extends Reader	// class@001f63
{
    public final Charset charset;
    public boolean closed;
    public Reader delegate;
    public final d source;

    public void ResponseBody$BomAwareReader(d p0,Charset p1){
       super();
       this.source = p0;
       this.charset = p1;
    }
    public void close(){
       this.closed = true;
       ResponseBody$BomAwareReader tdelegate = this.delegate;
       if (tdelegate != null) {
          tdelegate.close();
       }else {
          this.source.close();
       }
       return;
    }
    public int read(char[] p0,int p1,int p2){
       if (this.closed != null) {
          throw new IOException("Stream closed");
       }
       ResponseBody$BomAwareReader tdelegate = this.delegate;
       if (tdelegate == null) {
          InputStreamReader inputStreamR = new InputStreamReader(this.source.inputStream(), Util.bomAwareCharset(this.source, this.charset));
          this.delegate = inputStreamR;
          tdelegate = inputStreamR;
       }
       return tdelegate.read(p0, p1, p2);
    }
}
