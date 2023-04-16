package d.a$b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams$Builder;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import android.content.Context;
import java.lang.String;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.base.KSTEContext$Mode;
import a.a.a.a.b.e.c;
import com.kuaishou.security.kste.logic.base.SecKSTEDidProxy;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import d.a;
import d.a$a;
import java.lang.IllegalStateException;

public final class a$b extends InitCommonKSTEParams$Builder	// class@001de2
{
    public Context a;
    public String b;
    public IKSTECallback c;
    public String d;
    public String e;
    public String f;
    public String g;
    public KSTEContext$Mode h;
    public c i;
    public SecKSTEDidProxy j;

    public void a$b(){
       super();
    }
    public void a$b(InitCommonKSTEParams p0){
       super();
       this.a = p0.context();
       this.b = p0.appkey();
       this.c = p0.initCallback();
       this.d = p0.did();
       this.e = p0.userId();
       this.f = p0.appVer();
       this.g = p0.appKPN();
       this.h = p0.initMode();
       this.i = p0.recorder();
       this.j = p0.didProxy();
    }
    public InitCommonKSTEParams$Builder appKPN(String p0){
       Objects.requireNonNull(p0, "Null appKPN");
       this.g = p0;
       return this;
    }
    public InitCommonKSTEParams$Builder appVer(String p0){
       Objects.requireNonNull(p0, "Null appVer");
       this.f = p0;
       return this;
    }
    public InitCommonKSTEParams$Builder appkey(String p0){
       Objects.requireNonNull(p0, "Null appkey");
       this.b = p0;
       return this;
    }
    public InitCommonKSTEParams autoBuild(){
       String str = (this.a == null)? " context": "";
       if (this.b == null) {
          str = str+" appkey";
       }
       if (this.c == null) {
          str = str+" initCallback";
       }
       if (this.d == null) {
          str = str+" did";
       }
       if (this.e == null) {
          str = str+" userId";
       }
       if (this.f == null) {
          str = str+" appVer";
       }
       if (this.g == null) {
          str = str+" appKPN";
       }
       if (this.h == null) {
          str = str+" initMode";
       }
       if (this.i == null) {
          str = str+" recorder";
       }
       if (this.j == null) {
          str = str+" didProxy";
       }
       if (str.isEmpty()) {
          a uoa = new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
    public InitCommonKSTEParams$Builder context(Context p0){
       Objects.requireNonNull(p0, "Null context");
       this.a = p0;
       return this;
    }
    public InitCommonKSTEParams$Builder did(String p0){
       Objects.requireNonNull(p0, "Null did");
       this.d = p0;
       return this;
    }
    public InitCommonKSTEParams$Builder didProxy(SecKSTEDidProxy p0){
       Objects.requireNonNull(p0, "Null didProxy");
       this.j = p0;
       return this;
    }
    public InitCommonKSTEParams$Builder initCallback(IKSTECallback p0){
       Objects.requireNonNull(p0, "Null initCallback");
       this.c = p0;
       return this;
    }
    public InitCommonKSTEParams$Builder initMode(KSTEContext$Mode p0){
       Objects.requireNonNull(p0, "Null initMode");
       this.h = p0;
       return this;
    }
    public InitCommonKSTEParams$Builder recorder(c p0){
       Objects.requireNonNull(p0, "Null recorder");
       this.i = p0;
       return this;
    }
    public InitCommonKSTEParams$Builder userId(String p0){
       Objects.requireNonNull(p0, "Null userId");
       this.e = p0;
       return this;
    }
}
