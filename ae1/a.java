package ae1.a;
import java.lang.Comparable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public class a implements Comparable	// class@000065
{
    public final int b;
    public String c;
    public int d;
    public UserInfo e;
    public int f;
    public static final AtomicInteger g;

    static {
       a.g = new AtomicInteger();
    }
    public void a(String p0,UserInfo p1,int p2){
       super();
       this.f = 0;
       this.c = p0;
       this.e = p1;
       this.d = p2;
       this.b = a.g.getAndIncrement();
    }
    public final int a(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (this.b())? 0: 0x3fffffff;
       return (obj + i);
    }
    public boolean b(){
       boolean b = (this.f == 2)? true: false;
       return b;
    }
    public int compareTo(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): this.a() - p0.a();
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChatUserInfo{mOrder="+this.b+", mGuestId=\'"+this.c+", mState="+this.d+", mUserInfo="+this.e+", mMediaType="+this.f+'}';
    }
}
