package d.a;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import android.content.Context;
import java.lang.String;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.base.KSTEContext$Mode;
import a.a.a.a.b.e.c;
import com.kuaishou.security.kste.logic.base.SecKSTEDidProxy;
import d.a$a;
import java.lang.Object;
import java.lang.Enum;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams$Builder;
import d.a$b;
import java.lang.StringBuilder;

public final class a extends InitCommonKSTEParams	// class@001de3
{
    public final Context a;
    public final String b;
    public final IKSTECallback c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final KSTEContext$Mode h;
    public final c i;
    public final SecKSTEDidProxy j;

    public void a(Context p0,String p1,IKSTECallback p2,String p3,String p4,String p5,String p6,KSTEContext$Mode p7,c p8,SecKSTEDidProxy p9,a$a p10){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
    }
    public String appKPN(){
       return this.g;
    }
    public String appVer(){
       return this.f;
    }
    public String appkey(){
       return this.b;
    }
    public Context context(){
       return this.a;
    }
    public String did(){
       return this.d;
    }
    public SecKSTEDidProxy didProxy(){
       return this.j;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof InitCommonKSTEParams) {
          return false;
       }
       if (!this.a.equals(p0.context()) || (!(this.b).equals(p0.appkey()) || (!this.c.equals(p0.initCallback()) || (!(this.d).equals(p0.did()) || (!(this.e).equals(p0.userId()) || (!(this.f).equals(p0.appVer()) || (!(this.g).equals(p0.appKPN()) || (!this.h.equals(p0.initMode()) || (!this.i.equals(p0.recorder()) || !this.j.equals(p0.didProxy())))))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (((((((((((((((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ (this.b).hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ (this.d).hashCode()) * 0xf4243) ^ (this.e).hashCode()) * 0xf4243) ^ (this.f).hashCode()) * 0xf4243) ^ (this.g).hashCode()) * 0xf4243) ^ this.h.hashCode()) * 0xf4243) ^ this.i.hashCode()) * 0xf4243) ^ this.j.hashCode());
    }
    public IKSTECallback initCallback(){
       return this.c;
    }
    public KSTEContext$Mode initMode(){
       return this.h;
    }
    public c recorder(){
       return this.i;
    }
    public InitCommonKSTEParams$Builder toBuilder(){
       return new a$b(this);
    }
    public String toString(){
       return "InitCommonKSTEParams{context="+this.a+", appkey="+this.b+", initCallback="+this.c+", did="+this.d+", userId="+this.e+", appVer="+this.f+", appKPN="+this.g+", initMode="+this.h+", recorder="+this.i+", didProxy="+this.j+"}";
    }
    public String userId(){
       return this.e;
    }
}
