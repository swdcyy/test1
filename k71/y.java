package k71.y;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.live.bridge.commands.migrated.TaskEventParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.live.bridge.commands.migrated.CommonParams;
import java.lang.StringBuilder;

public final class y	// class@002cd0
{
    public final CommonParams commonParams;
    public final ClientContent$ContentPackage contentPackage;
    public ClientContentWrapper$ContentWrapper contentWrapper;
    public final ClientEvent$ElementPackage elementPackage;
    public final ClientEvent$ResultPackage resultPackage;
    public final TaskEventParams taskEventParams;
    public final String type;

    public final ClientContent$ContentPackage a(){
       return this.contentPackage;
    }
    public final ClientContentWrapper$ContentWrapper b(){
       return this.contentWrapper;
    }
    public final ClientEvent$ElementPackage c(){
       return this.elementPackage;
    }
    public final TaskEventParams d(){
       return this.taskEventParams;
    }
    public final String e(){
       return this.type;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof y && (a.g(this.type, p0.type) && (a.g(this.contentPackage, p0.contentPackage) && (a.g(this.elementPackage, p0.elementPackage) && (a.g(this.contentWrapper, p0.contentWrapper) && (a.g(this.resultPackage, p0.resultPackage) && (a.g(this.commonParams, p0.commonParams) && a.g(this.taskEventParams, p0.taskEventParams))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       y obj = PatchProxy.apply(null, this, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       y tcontentPack = this.contentPackage;
       int i2 = (tcontentPack != null)? tcontentPack.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentPack = this.elementPackage;
       i2 = (tcontentPack != null)? tcontentPack.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentPack = this.contentWrapper;
       i2 = (tcontentPack != null)? tcontentPack.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentPack = this.resultPackage;
       i2 = (tcontentPack != null)? tcontentPack.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentPack = this.commonParams;
       i2 = (tcontentPack != null)? tcontentPack.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentPack = this.taskEventParams;
       if (tcontentPack != null) {
          i = tcontentPack.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveJsLoggerData\(type="+this.type+", contentPackage="+this.contentPackage+", elementPackage="+this.elementPackage+", contentWrapper="+this.contentWrapper+", resultPackage="+this.resultPackage+", commonParams="+this.commonParams+", taskEventParams="+this.taskEventParams+"\)";
    }
}
