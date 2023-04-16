package n90.g$g;
import erd.o;
import n90.g;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.Object;
import java.lang.Number;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import brd.w;
import java.util.Objects;
import brd.t;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.KSSource;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kuaishou.gifshow.kuaishan.utils.e;
import kotlin.jvm.internal.a;
import lq.i;
import tkd.b;
import tkd.d;
import hb0.b;
import java.util.Map;
import u80.b;
import v90.d;
import n90.i;
import erd.g;
import n90.h;

public final class g$g implements o	// class@0026da
{
    public final g b;
    public final boolean c;
    public final o1 d;

    public void g$g(g p0,boolean p1,o1 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot;
       g g;
       String str2;
       String str3;
       String str4;
       int i = p0.intValue();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g$g og = g$g.class;
       if (PatchProxy.isSupport(og)) {
          ot = PatchProxy.applyOneRefs(Integer.valueOf(i), this, og, "1");
          if (ot != patchProxyRe) {
          label_00fb :
             return ot;
          }
       }
       if (i == 100 && this.c == null) {
          i = this.b;
          og = this.d;
          Objects.requireNonNull(i);
          t ot1 = PatchProxy.applyOneRefs(og, i, g.class, "11");
          if (ot1 != patchProxyRe) {
          }else {
             int i1 = 0;
             Object[] objArray = new Object[i1];
             e.D().w("KuaiShanAlbumDataHelper", "doSaveDraft invoked", objArray);
             g = i.g;
             KSSource tOOLBOX = (g == null)? KSSource.TOOLBOX: KSSource.EXTERNAL;
             if (g == null) {
                i = e.c(og);
                a.o(i, "KSUtil.createVideoContext\(ksProject\)");
             }else {
                VideoContext videoContext = new VideoContext();
                videoContext.k0(i.g);
                e.G(videoContext, og, tOOLBOX);
                i = videoContext;
             }
             if (!PatchProxy.applyVoidOneRefs(i, null, e.class, "23")) {
                String str = "";
                if (i.h()) {
                   Map obj = i.m().z("toolbox_template_params");
                   if (obj instanceof String) {
                      obj = d.a(0x338f144a).KV(obj);
                      str = obj.get("photo_id");
                      String str1 = obj.get("tab_id");
                      str2 = obj.get("template_name");
                      str3 = obj.get("template_type");
                      str4 = str1;
                      i1 = 1;
                   label_00ca :
                      if (i1) {
                         VideoContext.e2(i, str, str4, str2, str3);
                      }
                   }
                }
                str4 = str;
                str2 = str4;
                str3 = str2;
                goto label_00ca ;
             }
             ot1 = d.a(0x5c806526).Nr(i, og, null, tOOLBOX).doOnNext(new i(og));
             a.o(ot1, "PluginManager.get\(IKuaiS¡­tepInfoBuilder\)\n        }");
          }
          i = ot1.map(h.b);
       }else {
          i = t.just(Integer.valueOf(i));
       }
       ot = i;
       goto label_00fb ;
    }
}
