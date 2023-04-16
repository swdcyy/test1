package b58.m;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class m	// class@000307
{
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public void m(String p0,String p1,String p2,String p3,boolean p4){
       super();
       this.d = p3;
       this.a = p0;
       this.b = p4;
       this.c = p1;
       this.e = p2;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BackupSoInfo{soName=\'"+this.a+'''+", isArm64="+this.b+", downloadUrl=\'"+this.c+'''+", libGroup=\'"+this.d+'''+", md5=\'"+this.e+'''+'}';
    }
}
