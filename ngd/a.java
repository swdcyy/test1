package ngd.a;
import com.yxcorp.gifshow.widget.m;
import ngd.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.fontscale.FontScaleHelper;
import mgd.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Objects;
import oe6.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.app.Application;
import o56.a;
import cw9.f$a;
import cw9.f;
import cw9.e;
import tkd.b;
import tkd.d;
import nu5.b;
import android.content.Context;

public final class a extends m	// class@001e30
{
    public final b c;

    public void a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       b r = this.c.r;
       if (r == null) {
          a.S("fragment");
       }
       int i = FontScaleHelper.b(this.c.q);
       a uoa = a.class;
       boolean b = true;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(r, Integer.valueOf(i), null, uoa, "2")) {
          a.p(r, "page");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SET_SUCCESS_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("font_result", String.valueOf((i + b)));
          uElementPack.params = oi3.e();
          u1.L("", r, b, uElementPack, null);
       }
       a tc = this.c;
       Objects.requireNonNull(tc);
       b uob = b.class;
       if (!PatchProxy.applyVoid(null, tc, uob, "5")) {
          if (tc.p == FontScaleHelper.e() && !tc.q - e.Q()) {
             Activity activity = tc.getActivity();
             if (activity != null) {
                activity.finish();
             }
          }else if(PatchProxy.applyVoid(null, tc, uob, "6")){
             a = e.a;
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean("HasChangeFontScaleManual", b);
             g.a(uEditor);
             SharedPreferences$Editor uEditor1 = a.edit();
             uEditor1.putBoolean("EnableFollowSystemFontScale", tc.p);
             g.a(uEditor1);
             SharedPreferences$Editor uEditor2 = a.edit();
             uEditor2.putFloat("SettingsFontScale", tc.q);
             g.a(uEditor2);
             f$a uoa1 = new f$a();
             uoa1.b(FontScaleHelper.d());
             uoa1.c(e.e());
             uoa1.d(e.Q());
             e.f(a.b(), uoa1.a());
             d.a(0x304f5b72).cg(a.B);
          }
       }
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
