package hn9.a;
import sx4.e$a;
import android.app.Activity;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tx4.h;
import gn9.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ia5.e;
import java.lang.StringBuilder;
import q87.c;
import in9.d;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import u07.t$a;
import u07.b;
import lnc.a1;
import java.lang.CharSequence;
import gn9.d;
import u07.u;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import zm9.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import w07.a;
import w07.l;
import w07.m;
import w07.d;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import gn9.e;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import gn9.f;
import gn9.g;
import gn9.h;

public final class a implements e$a	// class@0026f9
{
    public final Activity b;
    public final e0 c;
    public final RecyclerFragment d;

    public void a(Activity p0,e0 p1,RecyclerFragment p2){
       a.p(p0, "activity");
       a.p(p1, "page");
       a.p(p2, "mFragment");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public Object b(String p0,String p1,h p2){
       Object[] this;
       int i;
       d a;
       i a1;
       a tb;
       t$a uoa;
       i oi = i.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (!this.d.c1()) {
          return null;
       }
       this = new Object[0];
       e.C().w("HomeUniversalTabIJS2NativeInvoker", "--- onJSInvokeNativeWithJSONString: "+p0, this);
       if (p0 != null) {
          i = p0.hashCode();
          if (i != -1869751949) {
             if (i != -630641159) {
                if (i == 0x38d85976 && p0.equals("logSchoolModuleClickEvent")) {
                   a = d.a;
                   a tc = this.c;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidTwoRefs(p1, tc, a, d.class, "1")) {
                      a.p(tc, "page");
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.type = 1;
                      uElementPack.action2 = "SCHOOL_MODULE";
                      uElementPack.params = p1;
                      u1.B(new ClickMetaData().setLogPage(tc).setType(1).setElementPackage(uElementPack).setContentPackage(new ClientContent$ContentPackage()));
                   }
                }
             }else if(p0.equals("showSchoolTabAuthenticate")){
                a1 = i.a;
                tb = this.b;
                Objects.requireNonNull(a1);
                if (!PatchProxy.applyVoidOneRefs(tb, a1, oi, "3")) {
                   a.p(tb, "activity");
                   uoa = b.c(new t$a(tb));
                   uoa.B0(R.drawable.arg_RES_7f0805db);
                   uoa.X0(a1.p(R.string.arg_RES_7f104407));
                   uoa.z0(a1.p(R.string.arg_RES_7f104406));
                   uoa.T0(a1.p(R.string.arg_RES_7f104405));
                   uoa.u0(new d(tb));
                   uoa.X();
                }
             }
          }else if(p0.equals("tryShowSchoolTabGuide")){
             a1 = i.a;
             tb = this.b;
             Objects.requireNonNull(a1);
             if (!PatchProxy.applyVoidOneRefs(tb, a1, oi, "1")) {
                a.p(tb, "activity");
                SharedPreferences a2 = a.a;
                String str = "school_guide_shown";
                if (!a2.getBoolean(str, 0)) {
                   SharedPreferences$Editor uEditor = a2.edit();
                   uEditor.putBoolean(str, 1);
                   g.a(uEditor);
                   uoa = new t$a(tb);
                   uoa.a0(new a());
                   uoa.a0(new m());
                   uoa.a0(new d());
                   uoa.L(new b(R.layout.arg_RES_7f0d0120));
                   uoa.Q(R.id.widget_popup_bottom_anim_view);
                   uoa.G(e.a);
                   uoa.O(f.a);
                   uoa.B0(R.drawable.arg_RES_7f080dd8);
                   uoa.X0(a1.p(R.string.arg_RES_7f1043f0));
                   uoa.z0(a1.p(R.string.arg_RES_7f1043ef));
                   uoa.T0(a1.p(R.string.arg_RES_7f1043ed));
                   uoa.R0(a1.p(R.string.arg_RES_7f1043ee));
                   uoa.t0(g.b);
                   uoa.u0(new h(tb));
                   uoa.X();
                }
             }
          }
       }
       return null;
    }
}
