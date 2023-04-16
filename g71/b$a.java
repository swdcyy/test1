package g71.b$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b$a	// class@00242f
{
    public final int chatType;
    public final String extraInfo;

    public void b$a(int p0,String p1){
       super();
       this.chatType = p0;
       this.extraInfo = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b$a && (this.chatType == p0.chatType && a.g(this.extraInfo, p0.extraInfo)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.chatType * 31;
       b$a textraInfo = this.extraInfo;
       int i1 = (textraInfo != null)? textraInfo.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(chatType="+this.chatType+", extraInfo="+this.extraInfo+"\)";
    }
}
