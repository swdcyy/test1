package my1.e;
import iy1.l;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.common.base.Optional;
import v91.n;
import my1.d;
import ok.h;
import java.lang.Long;
import my1.c;
import java.lang.StringBuilder;

public class e	// class@003251
{
    public final l a;
    public final MutableLiveData b;
    public String c;

    public void e(l p0){
       super();
       this.b = new MutableLiveData("");
       this.a = p0;
    }
    public long a(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return n.d(this.a.b()).transform(d.b).or(Long.valueOf(7000)).longValue();
    }
    public boolean b(){
       return this instanceof c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveTempEnhanceMessageInfo{mMessageType="+this.a+", mShowingContentLiveData="+this.b+'}';
    }
}
