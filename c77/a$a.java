package c77.a$a;
import java.lang.String;
import java.lang.Object;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public abstract class a$a	// class@0004f2
{
    public String a;

    public void a$a(String p0){
       super();
       this.a = p0;
    }
    public abstract void a(LiveGzoneTabSource p0);
    public void b(){
    }
    public boolean equals(Object p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       p0 = (p0 instanceof a$a)? p0.a: null;
       return TextUtils.equals(obj, p0);
    }
}
