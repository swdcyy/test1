package dc2.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public class a	// class@0024d7
{
    public String a;
    public String b;

    public void a(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       uoa = this.a;
       if (uoa != null) {
          if (!uoa.equals(p0.a)) {
          label_0034 :
             return false;
          }
       }else if(p0.a != null){
          goto label_0034 ;
       }
       uoa = this.b;
       if (uoa != null) {
          b = uoa.equals(p0.b);
       }else if(p0.b == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLuckyStarCommonRequest{mLiveStreamId=\'"+this.a+'''+", mLuckyStarId=\'"+this.b+'''+'}';
    }
}
