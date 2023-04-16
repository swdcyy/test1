package b66.n;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang;
import l06.b;
import q87.c;
import o56.a;
import o06.a;
import z1.k;
import uf6.n;
import uf6.m;
import pt7.f;
import pt7.b;
import uv8.p1;
import com.yxcorp.gifshow.x;
import uv8.g2;
import com.yxcorp.gifshow.g0;
import com.yxcorp.gifshow.f0;
import flb.a;
import flb.b;
import java.util.Map;

public class n	// class@000429
{
    public static final Map a;

    static {
       n.a = new HashMap();
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, objArray, n.class, str)) {
       }else if(PatchProxy.applyVoid(objArray, objArray, DynamicMultiLang.class, str)){
          Object[] objArray1 = new Object[0];
          b.C().t("DynamicMultiLang", "register StartUpServiceExt", objArray1);
          if (a.q == 0x1869f) {
             n.a("multiLangsCommitId", a.b);
          }
       }
       if (!PatchProxy.applyVoid(objArray, objArray, n.class, str)) {
          n.a("__NSSwitchesEtag", new m());
       }
       if (!PatchProxy.applyVoid(objArray, objArray, f.class, str)) {
          n.a("imVersion", b.b);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, p1.class, str)) {
          n.a("launchMode", x.b);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, g2.class, str)) {
          n.a("bottomSelectionType", g0.b);
          n.a("bottomPageType", f0.b);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "2")) {
          n.a("activityInfoListVersion", b.b);
       }
    }
    public void n(){
       super();
    }
    public static void a(String p0,k p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, n.class, "2")) {
          return;
       }
       n.a.put(p0, p1);
       return;
    }
}
