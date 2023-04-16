package jb1.s$c;
import k51.c;
import jb1.s;
import db1.b;
import jb1.s$c$a;
import jb1.s$c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import db1.c;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import b61.b;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.kwai.framework.model.user.UserExtraInfo;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import nf1.c;
import g9c.a;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import bb1.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.u1;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import sfc.a;
import android.content.Context;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import jb1.u;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class s$c extends c	// class@002b20
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public c t;
    public TextView u;
    public final b v;
    public final b w;
    public final d x;
    public final s y;
    public static String sLivePresenterClassName = "LiveAdminNewStyleListAdapter$LiveAdminPresenter";

    public void s$c(s p0){
       this.y = p0;
       super();
       this.v = new b();
       this.w = new s$c$a(this);
       this.x = new s$c$b(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s$c.class, "3")) {
          return;
       }
       g.d(this.p, this.t.a, HeadImageSize.MIDDLE);
       this.q.setText(b.c(this.t.a));
       c a = this.t.a;
       if (a.mExtraInfo == null) {
          return;
       }
       if (a.isWatching()) {
          this.s.setTextColor(a1.a(R.color.arg_RES_7f0607c5));
          this.s.setBackground(a1.f(R.drawable.arg_RES_7f0810a7));
       }else {
          this.s.setTextColor(a1.a(R.color.arg_RES_7f0607d6));
          this.s.setBackground(a1.f(R.drawable.arg_RES_7f0810a4));
       }
       if (TextUtils.x(this.t.a.mExtraInfo.mAdminLastVisitDisplay)) {
          this.s.setVisibility(8);
       }else {
          this.s.setVisibility(0);
          this.s.setText(this.t.a.mExtraInfo.mAdminLastVisitDisplay);
       }
       this.r.setText(c.d(this.t.a.mExtraInfo.mIconSegments, a1.d(R.dimen.arg_RES_7f070283)));
       this.u.setText(this.t.a.mExtraInfo.mSendGiftAmount);
       s$c ty = this.y;
       if (!ty.O.contains(Integer.valueOf(ty.P0(this.t)))) {
          a = this.t.a;
          String str = (a.mExtraInfo.mAssistantType == 1)? "SUPER": "NORMAL";
          String str1 = str;
          s d = this.y.D;
          if (d != null) {
             objArray = d.a();
          }
          if (!PatchProxy.applyVoidThreeRefs(a, str1, objArray, null, f.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ADMINISTRATOR_INFO_ITEM";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("administrator_type", str1);
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = objArray;
             uContentPack.userPackage = f.a(a);
             u1.u0(9, uElementPack, uContentPack);
          }
          ty = this.y;
          ty.O.add(Integer.valueOf(ty.P0(this.t)));
       }
       return;
    }
    public void P8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$c.class, "5")) {
          return;
       }
       if (p0 == null) {
          b.B(LiveLogTag.LIVE_ADMIN, "error without throwable");
          return;
       }else {
          try{
             new a(this.y.H).b(p0);
          }catch(java.lang.Exception e0){
             b.I(LiveLogTag.LIVE_ADMIN, "handle error", p0);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$c.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1890);
       this.p = m1.f(p0, 0x7f0a1889);
       this.r = m1.f(p0, 0x7f0a188e);
       this.u = m1.f(p0, 0x7f0a1888);
       this.q = m1.f(p0, 0x7f0a188b);
       m1.f(p0, R.id.live_admin_setting).setOnClickListener(new u(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s$c.class, "1")) {
          return;
       }
       this.t = this.q8(c.class);
       return;
    }
}
