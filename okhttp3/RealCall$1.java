package okhttp3.RealCall$1;
import okio.a;
import okhttp3.RealCall;

public class RealCall$1 extends a	// class@002089
{
    public final RealCall this$0;

    public void RealCall$1(RealCall p0){
       this.this$0 = p0;
       super();
    }
    public void timedOut(){
       this.this$0.cancel();
    }
}
