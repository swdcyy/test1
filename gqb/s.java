package gqb.s;
import android.view.View$OnClickListener;
import gqb.u;
import java.lang.Object;
import android.view.View;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.SystemUtil;
import e17.i;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import qm9.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import gqb.t;
import msd.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import mhc.o2;
import mhc.m2;
import uo7.b0;
import uo7.l;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.kuaishou.android.model.music.MusicType;
import uo7.k;
import ohc.k;
import com.yxcorp.gifshow.entity.QPhoto;
import vhc.q;
import fp7.c;
import uo7.g0;
import fp7.k;
import rhc.d0;
import fp7.q;
import vhc.o;
import cp7.d;
import cp7.j;
import com.kwai.sharelib.a;
import uo7.u;
import uo7.f0;

public final class s implements View$OnClickListener	// class@002b91
{
    public final u b;

    public void s(u p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       s tb = this.b;
       if (tb.r != null) {
          if (!SystemUtil.U(tb.getContext()) && !SystemUtil.Q(tb.getContext())) {
             i.a(R.style.arg_RES_7f11066a, 0x7f103754);
          }
          u r = tb.r;
          String str = "4";
          boolean b = true;
          if (!PatchProxy.applyVoidOneRefs(r, null, MusicRadioLogger.class, str)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHARE_PHOTO";
             ClientContent$ContentPackage uContentPack = i.b(r);
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             uClickEvent.elementPackage = uElementPack;
             uClickEvent.contentPackage = uContentPack;
             u1.u(b, uElementPack, uContentPack);
          }
          r = tb.r;
          u ou = u.class;
          if (!PatchProxy.applyVoidOneRefs(r, tb, ou, str) && tb.getActivity() instanceof GifshowActivity) {
             ForwardGridSectionFragment uForwardGrid = ForwardGridSectionFragment.W0.c(tb.getActivity(), t.b);
             Activity uActivity = tb.getActivity();
             u r1 = tb.r;
             Music mId = (r1 != null)? r1.mId: "";
             KsShareBuilder ksShareBuild = new KsShareBuilder(uActivity, "KS_MUSIC_PLAYER", mId, o2.c(16), uForwardGrid);
             str.g(new m2());
             JsonObject jsonObject = PatchProxy.applyOneRefs(r, tb, ou, "5");
             if (jsonObject != PatchProxyResult.class) {
             }else {
                jsonObject = new JsonObject();
                jsonObject.c0("musicTitle", r.mName);
                jsonObject.c0("musicDesc", r.mArtist);
                jsonObject.c0("musicCoverUrl", r.mImageUrl);
                jsonObject.c0("musicType", String.valueOf(r.mType.mValue));
                jsonObject.c0("musicId", r.mId);
             }
             str.e(jsonObject);
             new a(new k(tb.q, false, str.a()), tb.s).f("wechat", new q(tb.q, b, new c())).f("wechatMoments", new q(tb.q, false, new k())).f("wechatWow", new q(tb.q, false, new q())).f("qq", new o(tb.q, false, new d())).f("qzone", new o(tb.q, false, new j())).f("wechatMomentsUserChoose", new d0(tb.q)).l();
          }
       }
    label_0151 :
       return;
    }
}
