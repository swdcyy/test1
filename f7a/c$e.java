package f7a.c$e;
import erd.g;
import f7a.c;
import java.lang.Object;
import rd5.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.utility.Log;
import tkd.b;
import tkd.d;
import lyb.v;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.player.core.b;
import java.util.concurrent.atomic.AtomicReference;
import yg5.k0;
import f7a.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import vw9.f;
import android.os.Bundle;
import vw9.a;
import java.util.List;
import trd.t;
import com.kwai.component.tabs.panel.TabsPanelConfig$b;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import vw9.b;
import f7a.a;
import yg5.q0;
import com.kwai.component.tabs.panel.a;
import yg5.d0;
import f7a.d;
import com.kwai.component.tabs.panel.a$a;
import qrd.l1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public final class c$e implements g	// class@0022df
{
    public final c b;

    public void c$e(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       c c;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c$e.class, str)) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          c uoc = c.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, uoc, "5")) {
             Log.g("SlideAiTextP", "open AiTextPanel");
             if (!PatchProxy.applyVoid(objArray, p0, uoc, "7") && p0.C == null) {
                v ov = d.a(-724669335);
                c s = p0.s;
                String str1 = "mPhoto";
                if (s == null) {
                   a.S(str1);
                }
                c t = p0.t;
                if (t == null) {
                   a.S("mDetailPlayModule");
                }
                k0 ok0 = ov.kZ(s, t.getPlayer(), p0.D);
                s = p0.s;
                if (s == null) {
                   a.S(str1);
                }
                str1 = "fragmentContext";
                a.o(ok0, str1);
                TabsPanelConfig tabsPanelCon = PatchProxy.applyTwoRefs(s, ok0, objArray, b.class, str);
                if (tabsPanelCon != PatchProxyResult.class) {
                }else {
                   a.p(s, "photo");
                   a.p(ok0, str1);
                   str1 = a.b;
                   a.o(str1, "AiTextConstants.TAB_NAME");
                   TabsPanelConfig$b uob = new TabsPanelConfig$b();
                   uob.k(t.k(new f(ok0, new Bundle(), str1, a.a())));
                   uob.c(true);
                   uob.d(true);
                   uob.e(true);
                   uob.i(TabsPanelConfig$Style.STYLE_AI_TEXT);
                   uob.h(true);
                   uob.b(new b(s));
                   uob.g(a.a);
                   tabsPanelCon = uob.a();
                   a.o(tabsPanelCon, "panelBuilder.build\(\)");
                }
                a uoa = d0.a(tabsPanelCon);
                uoa.i(new d(p0));
                p0.C = uoa;
             }
             c = p0.C;
             a.m(c);
             if (!PatchProxy.applyVoidOneRefs(c, p0, uoc, "6") && !c.g()) {
                Activity activity = p0.getActivity();
                Objects.requireNonNull(activity);
                if (!c.h(activity.getSupportFragmentManager(), 0x7f0a01bd)) {
                   c.b();
                }
             }
             uoc = p0.C;
             a.m(uoc);
             c = p0.u;
             if (c == null) {
                a.S("mAnimationListeners");
             }
             uoc.k(c);
             p0 = p0.C;
             a.m(p0);
             p0.e(true, a.a());
          }
       }
       return;
    }
}
