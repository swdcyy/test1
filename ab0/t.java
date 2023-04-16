package ab0.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ab0.t$d;
import ab0.t$e;
import erd.g;
import crd.b;
import brd.t;
import android.widget.LinearLayout;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import android.view.ViewPropertyAnimator;
import ab0.t$c;
import android.animation.Animator$AnimatorListener;
import com.kwai.framework.model.user.QCurrentUser;
import fb0.l;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q2b.h$b;
import k2b.u1;
import android.view.View;
import ekd.m1;
import android.widget.ImageButton;
import android.widget.TextView;
import ab0.t$a;
import android.view.View$OnClickListener;
import ab0.t$b;

public final class t extends PresenterV2	// class@000053
{
    public ImageButton p;
    public LinearLayout q;
    public TextView r;
    public SlipSwitchButton s;
    public LinearLayout t;
    public PublishSubject u;
    public PublishSubject v;
    public b w;
    public long x;

    public void t(){
       super();
    }
    public static final SlipSwitchButton P8(t p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mSwitchBtn");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       t tv = this.v;
       if (tv == null) {
          a.S("mHideSettingPublisher");
       }
       this.X7(tv.subscribe(new t$d(this), t$e.b));
       return;
    }
    public final void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t.class, "6")) {
          return;
       }
       t tq = this.q;
       String str = "mSettingsViewContainer";
       if (tq == null) {
          a.S(str);
       }
       if (tq.getVisibility() == 8) {
          return;
       }else {
          tq = this.u;
          if (tq == null) {
             a.S("mFinishSettingPublisher");
          }
          t ts = this.s;
          if (ts == null) {
             a.S("mSwitchBtn");
          }
          tq.onNext(Boolean.valueOf(ts.getSwitch()));
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          tq.animate().alpha(0).setListener(new t$c(this)).setDuration(300).start();
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          boolean b = qCurrentUser.isEnableLocalIntelligenceAlbum();
          l ol = l.class;
          if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), objArray, ol, "23")) {
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page = 0x7d10;
             JsonObject jsonObject = new JsonObject();
             String str1 = "open";
             String str2 = (b)? str1: "close";
             jsonObject.c0("intelligent_album_status", str2);
             urlPackage.params = jsonObject.toString();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "INTELLIGENT_SETUP";
             JsonObject jsonObject1 = new JsonObject();
             if (!b) {
                str1 = "close";
             }
             jsonObject1.c0("intelligent_album_status", str1);
             uElementPack.params = jsonObject1.toString();
             h$b uob = h$b.e(10, "INTELLIGENT_SETUP");
             uob.u(urlPackage);
             uob.k(uElementPack);
             u1.r0(uob);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       if (p0 != null) {
          View view = m1.f(p0, R.id.setting_btn);
          a.o(view, "bindWidget\(it, R.id.setting_btn\)");
          this.p = view;
          view = m1.f(p0, R.id.floating_setting_container);
          a.o(view, "bindWidget\(it, R.id.floating_setting_container\)");
          this.q = view;
          view = m1.f(p0, R.id.finish_btn);
          a.o(view, "bindWidget\(it, R.id.finish_btn\)");
          this.r = view;
          view = m1.f(p0, R.id.close_smart_album_slip_button);
          a.o(view, "bindWidget\(it, R.id.close_smart_album_slip_button\)");
          this.s = view;
          p0 = m1.f(p0, R.id.setting_content_container);
          a.o(p0, "bindWidget\(it, R.id.setting_content_container\)");
          this.t = p0;
          t tp = this.p;
          if (tp == null) {
             a.S("mSettingBtn");
          }
          tp.setOnClickListener(new t$a(this));
          tp = this.r;
          if (tp == null) {
             a.S("mFinishBtn");
          }
          tp.setOnClickListener(new t$b(this));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       Object obj = this.r8("smartalbum_finish_setting");
       a.o(obj, "inject\(SMARTALBUM_FINISH_SETTING\)");
       this.u = obj;
       obj = this.r8("smartalbum_hide_setting");
       a.o(obj, "inject\(SMARTALBUM_HIDE_SETTING\)");
       this.v = obj;
       return;
    }
}
