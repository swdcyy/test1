package h71.a0;
import com.kuaishou.live.bridge.commands.CommonParams;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.live.bridge.commands.CustomEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.bridge.commands.TaskEventParams;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a0	// class@00262a
{
    public final CommonParams commonParams;
    public final ClientContent$ContentPackage contentPackage;
    public ClientContentWrapper$ContentWrapper contentWrapper;
    public final CustomEvent customEvent;
    public final ClientEvent$ElementPackage elementPackage;
    public final String eventId;
    public final ClientEvent$ResultPackage resultPackage;
    public final TaskEventParams taskEventParams;
    public final String type;

    public final CommonParams a(){
       return this.commonParams;
    }
    public final ClientContent$ContentPackage b(){
       return this.contentPackage;
    }
    public final ClientContentWrapper$ContentWrapper c(){
       return this.contentWrapper;
    }
    public final CustomEvent d(){
       return this.customEvent;
    }
    public final ClientEvent$ElementPackage e(){
       return this.elementPackage;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a0 && (a.g(this.eventId, p0.eventId) && (a.g(this.type, p0.type) && (a.g(this.contentPackage, p0.contentPackage) && (a.g(this.elementPackage, p0.elementPackage) && (a.g(this.contentWrapper, p0.contentWrapper) && (a.g(this.resultPackage, p0.resultPackage) && (a.g(this.commonParams, p0.commonParams) && (a.g(this.taskEventParams, p0.taskEventParams) && a.g(this.customEvent, p0.customEvent))))))))))) {
          return true;
       }
       return false;
    }
    public final String f(){
       return this.eventId;
    }
    public final TaskEventParams g(){
       return this.taskEventParams;
    }
    public final String h(){
       return this.type;
    }
    public int hashCode(){
       a0 obj = PatchProxy.apply(null, this, a0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.eventId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a0 ttype = this.type;
       int i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.contentPackage;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.elementPackage;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.contentWrapper;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.resultPackage;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.commonParams;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.taskEventParams;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.customEvent;
       if (ttype != null) {
          i = ttype.hashCode();
       }
       return (i1 + i);
    }
    public final void i(ClientContentWrapper$ContentWrapper p0){
       this.contentWrapper = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveJsLoggerData\(eventId="+this.eventId+", type="+this.type+", contentPackage="+this.contentPackage+", elementPackage="+this.elementPackage+", contentWrapper="+this.contentWrapper+", resultPackage="+this.resultPackage+", commonParams="+this.commonParams+", taskEventParams="+this.taskEventParams+", customEvent="+this.customEvent+"\)";
    }
}
