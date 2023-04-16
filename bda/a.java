package bda.a;
import java.lang.String;
import java.util.Map;
import bda.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@000396
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final Map g;

    public void a(String p0,String p1,String p2,String p3,boolean p4,boolean p5,Map p6,a$a p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public String a(){
       return this.d;
    }
    public String b(){
       return this.c;
    }
    public Map c(){
       return this.g;
    }
    public String d(){
       return this.b;
    }
    public String e(){
       return this.a;
    }
    public boolean f(){
       return this.f;
    }
    public boolean g(){
       return this.e;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NoticeButtonEvent{mUrl=\'"+this.a+'''+", mText=\'"+this.b+'''+", mBizType=\'"+this.c+'''+", mBizDataId=\'"+this.d+'''+", mSelected="+this.e+", mDisabled="+this.f+", mLogInfo="+this.g+'}';
    }
}
