package m71.a$a;
import java.lang.String;
import com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkStartPkInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@003130
{
    public final String bizExtraInfo;
    public final LiveMultiPkStartPkInfo multiPKInfo;

    public final String a(){
       return this.bizExtraInfo;
    }
    public final LiveMultiPkStartPkInfo b(){
       return this.multiPKInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.multiPKInfo, p0.multiPKInfo) && a.g(this.bizExtraInfo, p0.bizExtraInfo)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.multiPKInfo;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$a tbizExtraInf = this.bizExtraInfo;
       if (tbizExtraInf != null) {
          i = tbizExtraInf.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(multiPKInfo="+this.multiPKInfo+", bizExtraInfo="+this.bizExtraInfo+"\)";
    }
}
