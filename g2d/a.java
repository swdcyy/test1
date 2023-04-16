package g2d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.login.model.LoginParams;
import mrd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import g2d.a$a;
import g2d.a$b;
import a3d.i;
import g2d.a$c;
import ou5.a;
import v0d.g;
import u07.t$a;
import android.app.Activity;
import u07.f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import mw4.a;
import v0d.j;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.content.Context;
import g2d.a$d;
import n3d.a;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.loginaction.LoginHelper;

public abstract class a	// class@002587
{
    public final GifshowActivity a;
    public final LoginParams b;
    public final c c;

    public void a(GifshowActivity p0,LoginParams p1,c p2){
       a.p(p0, "activity");
       a.p(p1, "loginParams");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public abstract void a();
    public final void b(boolean p0){
       a$a a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       a = a$a.a;
       a$b a1 = a$b.a;
       i oi = new i(p0, this.b, new a$c(this));
       if (!PatchProxy.applyVoidFourRefs(uoa, a, a1, oi, null, g.class, "11")) {
          t$a uoa1 = f.e(new t$a(uoa));
          uoa1.V(g.b);
          uoa1.L(oi);
          uoa1.G(a);
          uoa1.O(a1);
          uoa1.Y(PopupInterface.a);
       }
       return;
    }
    public final GifshowActivity c(){
       return this.a;
    }
    public final LoginParams d(){
       return this.b;
    }
    public final c e(){
       return this.c;
    }
    public final void f(LoginUserResponse p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (p1 && (a.g() || j.b())) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          LoginHelper.g(uActivityCon.e(), p0, p1, null, "auto_dialog", false);
          return;
       }else {
          LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.REGISTER_USER_INFO_SETTING);
          loginPageLau.b(this.a);
          loginPageLau.g(this.b);
          loginPageLau.i(260);
          loginPageLau.h(new a$d(p0, p1));
          loginPageLau.f();
          return;
       }
    }
}
