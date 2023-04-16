package okhttp3.internal.cache.FaultHidingSink;
import okio.f;
import okio.m;
import java.io.IOException;
import okio.b;

public class FaultHidingSink extends f	// class@001f7f
{
    public boolean hasErrors;

    public void FaultHidingSink(m p0){
       super(p0);
    }
    public void close(){
       if (this.hasErrors != null) {
          return;
       }
       try{
          super.close();
       }catch(java.io.IOException e0){
          this.hasErrors = true;
          this.onException(e0);
       }
       return;
    }
    public void flush(){
       if (this.hasErrors != null) {
          return;
       }
       try{
          super.flush();
       }catch(java.io.IOException e0){
          this.hasErrors = true;
          this.onException(e0);
       }
       return;
    }
    public void onException(IOException p0){
    }
    public void write(b p0,long p1){
       if (this.hasErrors != null) {
          p0.skip(p1);
          return;
       }else {
          try{
             super.write(p0, p1);
          }catch(java.io.IOException e2){
             this.hasErrors = true;
             this.onException(e2);
          }
          return;
       }
    }
}
