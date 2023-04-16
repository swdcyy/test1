package l69.c;
import erd.o;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import i79.e;
import elb.s0;
import com.yxcorp.gifshow.model.YcnnScenesObject;
import qrd.l1;
import fg6.a;
import com.google.gson.Gson;
import h69.g;
import q87.c;
import brd.t;
import o56.a;
import java.lang.CharSequence;
import e17.i;
import ooc.d;
import lnc.l8;

public final class c implements o	// class@002c95
{
    public final int b;
    public final String c;
    public final EditorSdk2V2$VideoEditorProject d;
    public final List e;

    public void c(int p0,String p1,EditorSdk2V2$VideoEditorProject p2,List p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       e a;
       String str;
       Object[] objArray1;
       t ot = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "albumSceneResultMap");
          p0 = p0.values();
          a.o(p0, "albumSceneResultMap.values");
          ArrayList uArrayList = new ArrayList();
          p0 = p0.iterator();
          s0 os0 = 1;
          YcnnScenesObject ycnnScenesOb = null;
          while (p0.hasNext()) {
             e uoe = p0.next();
             a = uoe.a;
             if (a != null && !a.isEmpty()) {
                os0 = null;
             }
             if (os0) {
                str = null;
             }else {
                os0 = new s0();
                ycnnScenesOb = new YcnnScenesObject();
                ycnnScenesOb.b(uoe.a);
                os0.b(ycnnScenesOb);
                str = a.a.q(os0);
             }
             if (str != null) {
                uArrayList.add(str);
             }
          }
          if (uArrayList.isEmpty() ^ os0) {
             Object[] objArray = new Object[ycnnScenesOb];
             g.D().w("AICutInternalPluginImpl", "album scene result is not empty", objArray);
             p0 = t.just(a.a.q(uArrayList));
          }else if(this.b == os0){
             objArray1 = new Object[ycnnScenesOb];
             g.D().w("AICutInternalPluginImpl", "album scene result is empty", objArray1);
             p0 = t.just(this.c);
          }else if(a.d()){
             i.d(R.style.arg_RES_7f11066a, "正在进行素材分析...");
          }
          objArray1 = new Object[ycnnScenesOb];
          g.D().w("AICutInternalPluginImpl", "prepare frame analyze", objArray1);
          p0 = d.b(d.a, this.d, this.e, l8.f.a(), 0, 8, null);
          ot = p0;
       }
       return ot;
    }
}
