package kb.h$b$a;
import kb.e;
import kb.h$b;
import java.lang.Object;
import kb.c;
import java.util.Objects;
import java.util.Map;
import com.facebook.datasource.AbstractDataSource;

public class h$b$a implements e	// class@0024a2
{
    public final h$b a;

    public void h$b$a(h$b p0){
       this.a = p0;
       super();
    }
    public void onCancellation(c p0){
    }
    public void onFailure(c p0){
       Objects.requireNonNull(this.a);
    }
    public void onNewResult(c p0){
       if (p0.hasResult()) {
          h$b$a ta = this.a;
          if (p0 == ta.i) {
             ta.n(null, false, p0.getExtras());
          }
       }else if(p0.a()){
          Objects.requireNonNull(this.a);
       }
       return;
    }
    public void onProgressUpdate(c p0){
       h$b$a ta = this.a;
       if (p0 == ta.i) {
          ta.m(p0.getProgress());
       }
       return;
    }
}
