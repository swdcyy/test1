package f71.b;
import f71.b$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.bridge.LiveKrnUserInfoExtra;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class b	// class@0022c8
{
    public final LiveKrnUserInfoExtra extra;
    public final CDNUrl[] headUrls;
    public final long userId;
    public final String userName;
    public final String userSex;
    public static final b$a a;

    static {
       b.a = new b$a(null);
    }
    public void b(long p0,String p1,String p2,CDNUrl[] p3,LiveKrnUserInfoExtra p4){
       a.p(p1, "userName");
       a.p(p4, "extra");
       super();
       this.userId = p0;
       this.userName = p1;
       this.userSex = p2;
       this.headUrls = p3;
       this.extra = p4;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (!this.userId - p0.userId && (a.g(this.userName, p0.userName) && (a.g(this.userSex, p0.userSex) && (a.g(this.headUrls, p0.headUrls) && a.g(this.extra, p0.extra))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.userName;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.userSex;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.headUrls;
       i2 = (obj != null)? Arrays.hashCode(obj): 0;
       i = (i + i2) * 31;
       obj = this.extra;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveKrnUserInfo\(userId="+this.userId+", userName="+this.userName+", userSex="+this.userSex+", headUrls="+Arrays.toString(this.headUrls)+", extra="+this.extra+"\)";
    }
}
