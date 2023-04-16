package l71.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e$a	// class@002e94
{
    public final String extraInfo;
    public final Integer subChatMode;
    public final String subChatModeId;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e$a && (a.g(this.subChatMode, p0.subChatMode) && (a.g(this.subChatModeId, p0.subChatModeId) && a.g(this.extraInfo, p0.extraInfo))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e$a obj = PatchProxy.apply(null, this, e$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subChatMode;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       e$a tsubChatMode = this.subChatModeId;
       int i2 = (tsubChatMode != null)? tsubChatMode.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubChatMode = this.extraInfo;
       if (tsubChatMode != null) {
          i = tsubChatMode.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(subChatMode="+this.subChatMode+", subChatModeId="+this.subChatModeId+", extraInfo="+this.extraInfo+"\)";
    }
}
