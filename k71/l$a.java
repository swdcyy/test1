package k71.l$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class l$a	// class@002cbb
{
    public final boolean needShowConfirmDialog;
    public final boolean needShowFansGroupDialog;
    public final String source;

    public void l$a(){
       a.p("", "source");
       super();
       this.source = "";
       this.needShowConfirmDialog = false;
       this.needShowFansGroupDialog = false;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof l$a && (a.g(this.source, p0.source) && (this.needShowConfirmDialog == p0.needShowConfirmDialog && this.needShowFansGroupDialog == p0.needShowFansGroupDialog)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       l$a obj = PatchProxy.apply(null, this, l$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.source;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       l$a tneedShowCon = this.needShowConfirmDialog;
       int i1 = 1;
       if (tneedShowCon != null) {
          tneedShowCon = 1;
       }
       i = (i + tneedShowCon) * 31;
       tneedShowCon = this.needShowFansGroupDialog;
       if (tneedShowCon == null) {
          i1 = tneedShowCon;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(source="+this.source+", needShowConfirmDialog="+this.needShowConfirmDialog+", needShowFansGroupDialog="+this.needShowFansGroupDialog+"\)";
    }
}
