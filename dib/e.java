package dib.e;
import cj9.a;
import android.content.Context;
import com.kwai.camerasdk.Daenerys;
import java.lang.Object;
import dib.b;
import dib.c;
import com.kwai.video.westeros.Westeros;
import bib.b;
import com.kwai.camerasdk.models.Business;
import java.lang.String;
import qi9.d;
import qi9.i1;
import com.kwai.camerasdk.face.FaceDetectorContext;
import com.kwai.camerasdk.models.FaceDetectType;
import ui9.k$a;
import q0c.y1;
import l0c.c;
import ui9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dc5.c;
import com.kwai.video.westeros.v2.faceless.FacelessPlugin;
import lnc.s6;
import com.kwai.video.westeros.v2.faceless.FaceMagicController;
import com.kwai.video.westeros.WesterosPlugin;
import zi9.f;
import com.kwai.video.westeros.v2.yar.YarPlugin;
import zi9.f$a;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin;
import com.kwai.video.westeros.mmuplugin.MmuPlugin;
import com.kwai.video.westeros.veplugin.VEPlugin;
import com.kwai.video.westeros.aiedit.AIEditPlugin;
import com.kwai.video.westeros.audioplugin.AudioPlugin;
import com.kwai.video.westeros.stentorplugin.StentorPlugin;
import com.yxcorp.gifshow.camerasdk.magicface.b;
import dib.e$a;
import java.util.Objects;
import qi9.i0;
import ui9.h;
import qi9.p1;
import xi9.b;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import java.util.HashMap;
import xi9.n;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class e	// class@0024b5
{
    public final Westeros a;
    public final i1 b;
    public final j c;
    public FacelessPlugin d;
    public f e;
    public f f;
    public f g;
    public f h;
    public f i;
    public f j;
    public f k;
    public f l;
    public DevicePersonaConfig m;
    public String n;
    public final f$a o;
    public final n$c p;
    public boolean q;

    static {
       a.a();
    }
    public void e(Context p0,Daenerys p1){
       super();
       b uob = new b(this);
       this.o = uob;
       c uoc = new c(this);
       this.p = uoc;
       this.q = false;
       Westeros westeros = new Westeros(p0, p1);
       this.a = westeros;
       Business a = b.a;
       westeros.setBusiness(a);
       westeros.updateABTestKeyValuesJson(d.a());
       i1 oi1 = new i1(p0);
       this.b = oi1;
       oi1.a(a, new FaceDetectorContext(p0, FaceDetectType.kYcnnFaceDetect));
       westeros.setFaceDetectorContext(oi1.d());
       k$a uoa = new k$a().b(y1.h().f().b());
       uoa.c(true);
       uoa.d(true);
       k ok = uoa.a();
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
       }else {
          c.g("IMMagicSDK", "initPlugins");
          FacelessPlugin.init(p0);
          if (!s6.f()) {
             str = "0";
          }
          FaceMagicController.setRunningKeyandValue("enableBeautityPredownlaod1104", str);
          FacelessPlugin uFacelessPlu = new FacelessPlugin(p0);
          this.d = uFacelessPlu;
          westeros.applyPlugin(uFacelessPlu);
          String[] stringArray = new String[]{"ar"};
          f uof = new f(uob, YarPlugin.class, stringArray);
          this.e = uof;
          uof.c();
          String str1 = "ykit_module";
          String[] stringArray1 = new String[]{"ycnn_pre",str1};
          uof = new f(uob, YcnnPlugin.class, stringArray1);
          this.f = uof;
          uof.c();
          stringArray = new String[]{"ycnn_pre",str1};
          uof = new f(uob, YKitPlugin.class, stringArray);
          this.g = uof;
          uof.c();
          stringArray = new String[]{"mmu"};
          uof = new f(uob, MmuPlugin.class, stringArray);
          this.j = uof;
          uof.c();
          stringArray = new String[]{"visionengine"};
          uof = new f(uob, VEPlugin.class, stringArray);
          this.h = uof;
          uof.c();
          stringArray = new String[]{"ai_edit"};
          uof = new f(uob, AIEditPlugin.class, stringArray);
          this.i = uof;
          uof.c();
          stringArray = new String[]{"audio_recognition"};
          uof = new f(uob, AudioPlugin.class, stringArray);
          this.k = uof;
          uof.c();
          stringArray = new String[]{"stentorplugin"};
          uof = new f(uob, StentorPlugin.class, stringArray);
          this.l = uof;
          uof.c();
       }
       Objects.requireNonNull(oi1);
       b uob1 = new b(p0, this.d, this.j, new e$a(this), ok, new i0(oi1));
       this.c = uob;
       uob.c1(a);
       this.a();
       n.a(uoc);
       return;
    }
    public final void a(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          return;
       }
       String str = "IMMagicSDK";
       c.g(str, "initResource");
       if (this.q == null) {
          e tc = this.c;
          if (tc != null) {
             Map map = PatchProxy.apply(objArray, objArray, uoe, "5");
             if (map != PatchProxyResult.class) {
             }else {
                map = MagicEmojiResourceHelper.m();
                Category mAGIC_YCNN_S = Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2;
                if (mAGIC_YCNN_S.f()) {
                   c.g(str, "MAGIC_YCNN_SKIN_COLOR_DETECTION_V2 exist");
                   map.put(mAGIC_YCNN_S.getResourceName(), mAGIC_YCNN_S.getResourceDir());
                }else {
                   c.c(str, "MAGIC_YCNN_SKIN_COLOR_DETECTION_V2 not exist");
                }
             }
             tc.P(map);
             this.c.b0(MagicEmojiResourceHelper.d());
             this.c.S(MagicEmojiResourceHelper.e());
             this.b.g();
             return;
          }
       }
       c.c(str, "initResource, has released or mImageHelper is null, return");
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "10")) {
          return;
       }
       e td = this.d;
       if (td != null && (td.getFaceMagicController() != null && !TextUtils.x(p0))) {
          td.getFaceMagicController();
          FaceMagicController.setRunningKeyandValue(p0, p1);
       }
    label_0021 :
       return;
    }
}
