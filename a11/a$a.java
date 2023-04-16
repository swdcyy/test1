package a11.a$a;
import a11.n;
import a11.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import fm1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import ul2.s;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;

public class a$a implements n	// class@000019
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "4")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "13")) {
          ClientContent$LiveStreamPackage liveStreamPa = ta.h.Z2.a();
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, p0, null, a.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GIFT_PANEL_RIGHTS_CENTER";
             i3 oi3 = i3.f();
             oi3.d("button_text", TextUtils.k(p0));
             oi3.d("type", "USER_GUARD");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.L("", null, 1, uElementPack, uContentPack);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.j.c("GIFT_PANEL");
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "3")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a.class, "12")) {
          a.a(ta.h.Z2.a());
       }
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a.class, "10") && !QCurrentUser.me().isLogined()) {
          y.a(ta.i.getContext(), ta.i.getActivity().getUrl(), "live_gift_vip_grade", 196, a1.p(R.string.arg_RES_7f102d6e), ta.h.c.mEntity, null, null, null);
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "5")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "14")) {
          ClientContent$LiveStreamPackage liveStreamPa = ta.h.Z2.a();
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, p0, null, a.class, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GIFT_PANEL_RIGHTS_CENTER";
             i3 oi3 = i3.f();
             oi3.d("button_text", TextUtils.k(p0));
             oi3.d("type", "USER_GUARD");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.C0("", null, 9, uElementPack, uContentPack);
          }
       }
       return;
    }
}
