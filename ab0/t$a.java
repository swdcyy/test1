package ab0.t$a;
import com.yxcorp.gifshow.widget.m;
import ab0.t;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import ab0.v;
import android.view.View$OnClickListener;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.library.widget.button.SlipSwitchButton;
import ab0.u;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import fb0.l;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class t$a extends m	// class@00004e
{
    public final t c;

    public void t$a(t p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, t$a.class, "1")) {
          return;
       }
       t$a tc = this.c;
       Objects.requireNonNull(tc);
       t ot = t.class;
       String str = "QCurrentUser.me\(\)";
       if (!PatchProxy.applyVoid(null, tc, ot, "4")) {
          t q = tc.q;
          String str2 = "mSettingsViewContainer";
          if (q == null) {
             a.S(str2);
          }
          q.setVisibility(0);
          q = tc.q;
          if (q == null) {
             a.S(str2);
          }
          q.animate().alpha(0x3f800000).setListener(null).setDuration(300).start();
          q = tc.q;
          if (q == null) {
             a.S(str2);
          }
          q.setOnClickListener(new v(tc));
          if (!PatchProxy.applyVoid(null, tc, ot, "5")) {
             ot = tc.t;
             if (ot == null) {
                a.S("mSettingContentContainer");
             }
             ot.setOnClickListener(null);
             ot = tc.s;
             String str3 = "mSwitchBtn";
             if (ot == null) {
                a.S(str3);
             }
             QCurrentUser qCurrentUser1 = QCurrentUser.me();
             a.o(qCurrentUser1, str);
             ot.g(qCurrentUser1.isEnableLocalIntelligenceAlbum(), 0, 0);
             ot = tc.s;
             if (ot == null) {
                a.S(str3);
             }
             ot.setOnSwitchChangeListener(new u(tc));
          }
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, str);
       boolean b = qCurrentUser.isEnableLocalIntelligenceAlbum();
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, ol, "21")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 0x7d10;
          JsonObject jsonObject = new JsonObject();
          String str1 = (b)? "open": "close";
          jsonObject.c0("intelligent_album_status", str1);
          urlPackage.params = jsonObject.toString();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "INTELLIGENT_SET_BUTTON";
          u1.A(urlPackage, "", 1, uElementPack, null);
       }
       PatchProxy.onMethodExit(t$a.class, "1");
       return;
    }
}
