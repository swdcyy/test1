package bb6.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class e	// class@0002d3
{
    public List hostList;
    public String id;
    public String typeName;
    public String version;

    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CdnHostGroup\(typeName=\'"+this.typeName+"\', id=\'"+this.id+"\', "+"version=\'"+this.version+"\', hostList="+this.hostList+')';
    }
}
