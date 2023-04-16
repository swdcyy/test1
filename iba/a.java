package iba.a;
import im8.g;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import java.util.List;
import yaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import laa.e;
import iba.f;
import iba.e;
import java.util.Map;
import java.util.HashMap;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Theme;

public class a extends c implements g	// class@0027d6
{

    public void a(File p0,List p1,c p2){
       super(p0, p1, p2);
    }
    public boolean B(){
       return true;
    }
    public c f0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().g;
       }
       return objArray;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new e());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public e i(GeneratedMessageLite p0){
       f uof = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(this.q(), p0, this.c);
       }
       return uof;
    }
    public String r(){
       return "theme";
    }
}
