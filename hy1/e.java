package hy1.e;
import java.lang.Object;
import hy1.d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class e	// class@0027c0
{
    public final int a;
    public long b;
    public long c;
    public final Object d;
    public d e;

    public void e(int p0,long p1,Object p2){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
    }
    public d a(){
       return this.e;
    }
    public long b(){
       return (this.b + this.c);
    }
    public void c(d p0){
       this.e = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TopTemporaryMessage{mMessageType="+this.a+", mShowDurationMs="+this.b+", mDismissAnimationMs="+this.c+", mExtraInfo="+this.d+", mHandler="+this.e+'}';
    }
}
