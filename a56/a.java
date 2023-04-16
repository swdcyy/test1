package a56.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@000027
{
    public final int a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public void a(int p0,String p1,String p2,String p3,String p4,String p5,String p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ManifestQualityUiModel{mId="+this.a+", mQualityShowText=\'"+this.b+'''+'}';
    }
}
