package b8a.u$c;
import com.yxcorp.gifshow.widget.m;
import b8a.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import bm5.f;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Map;
import b8a.w;
import androidx.fragment.app.Fragment;
import wx6.d;
import de5.a;
import p5a.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment$a;
import java.lang.Boolean;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import qrd.l1;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class u$c extends m	// class@0003fc
{
    public final u c;

    public void u$c(u p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       u ou1;
       String str3;
       String str4;
       NasaPanoramaDetailFragment$a u;
       u s1;
       NasaPanoramaDetailFragment$a uoa1;
       u ou2;
       String str9;
       NasaPanoramaDetailFragment nasaPanorama;
       Map map;
       String str10;
       u t;
       Object obj = this;
       u ou = u.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, u$c.class, str)) {
          return;
       }
       u$c c = obj.c;
       Objects.requireNonNull(c);
       Object[] objArray = null;
       String str1 = "mPhoto";
       String str2 = "mFragment";
       if (PatchProxy.applyVoid(objArray, c, ou, "14")) {
          ou1 = ou;
          str3 = str1;
          str4 = str2;
       }else {
          RxBus.f.b(new f(true));
          u q = c.q;
          String str5 = "mDetailParam";
          if (q == null) {
             a.S(str5);
          }
          String str6 = "mPlayModule";
          if (q.getDetailPlayConfig().usePlayerKitPlayer()) {
             if (!PatchProxy.applyVoid(objArray, c, ou, "17")) {
                q = c.x;
                if (q == null) {
                   a.S("mPanoramaViewModel");
                }
                map = q.o0();
                s1 = c.s;
                if (s1 == null) {
                   a.S(str2);
                }
                str10 = String.valueOf(s1.hashCode());
                t = c.t;
                if (t == null) {
                   a.S(str6);
                }
                d uod = t.w();
                a.o(uod, "mPlayModule.playerKitSessionKeyGenerator");
                map.put(str10, uod);
             }
          }else if(PatchProxy.applyVoid(objArray, c, ou, "16")){
             q = c.x;
             if (q == null) {
                a.S("mPanoramaViewModel");
             }
             map = q.p0();
             s1 = c.s;
             if (s1 == null) {
                a.S(str2);
             }
             str10 = String.valueOf(s1.hashCode());
             t = c.t;
             if (t == null) {
                a.S(str6);
             }
             e player = t.getPlayer();
             a.o(player, "mPlayModule.player");
             map.put(str10, player);
          }
          Activity activity = c.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          c supportFragm = activity.getSupportFragmentManager();
          a.o(supportFragm, "\(activity as FragmentAct¡­y\).supportFragmentManager");
          u = NasaPanoramaDetailFragment.u;
          u r1 = c.r;
          if (r1 == null) {
             a.S(str1);
          }
          s1 = c.s;
          if (s1 == null) {
             a.S(str2);
          }
          String str7 = String.valueOf(s1.hashCode());
          s1 = c.q;
          if (s1 == null) {
             a.S(str5);
          }
          boolean b = s1.getDetailPlayConfig().usePlayerKitPlayer();
          Objects.requireNonNull(u);
          NasaPanoramaDetailFragment$a uoa = NasaPanoramaDetailFragment$a.class;
          if (PatchProxy.isSupport2(uoa, str)) {
             uoa1 = uoa;
             str4 = str2;
             str2 = str7;
             str3 = str1;
             ou2 = r1;
             if (PatchProxy.applyVoidFourRefsWithListener(supportFragm, r1, str7, Boolean.valueOf(b), u, NasaPanoramaDetailFragment$a.class, "1")) {
                ou1 = ou;
             label_01ce :
                ou = c.x;
                if (ou == null) {
                   a.S("mPanoramaViewModel");
                }
                ou.r0().setValue(Boolean.TRUE);
             }
          }else {
             str3 = str1;
             str4 = str2;
             uoa1 = uoa;
             str2 = str7;
             ou2 = r1;
          }
          a.p(supportFragm, "fragmentManager");
          a.p(ou2, "photo");
          a.p(str2, "mediaPlayerKey");
          int i = 0;
          Object[] objArray1 = new Object[i];
          o.C().w("NasaPanoramaDetailFragm", "show "+ou2.getPhotoId()+", usePlayKit "+b, objArray1);
          String str8 = "PANORAMA_DETAIL_FRAGMENT_TAG";
          if (supportFragm.findFragmentByTag(str8) == null) {
             e uoe = supportFragm.beginTransaction();
             uoe.y(R.anim.arg_RES_7f0100ce, i);
             str7 = "3";
             if (PatchProxy.isSupport2(uoa1, str7)) {
                ou1 = ou;
                str9 = str7;
                str6 = str8;
                nasaPanorama = PatchProxy.applyThreeRefsWithListener(ou2, str2, Boolean.valueOf(b), u, NasaPanoramaDetailFragment$a.class, "3");
                if (nasaPanorama != PatchProxyResult.class) {
                label_01bf :
                   uoe.g(0x1020002, nasaPanorama, str6);
                   uoe.o();
                }
             }else {
                ou1 = ou;
                str9 = str7;
                str6 = str8;
             }
             nasaPanorama = new NasaPanoramaDetailFragment();
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "ARG_PHOTO", ou2);
             uBundle.putString("ARG_MEDIA_PLAYER_CACHED_KEY", str2);
             uBundle.putBoolean("ARG_USE_PLAYER_KIT", b);
             nasaPanorama.setArguments(uBundle);
             PatchProxy.onMethodExit(uoa1, str9);
             goto label_01bf ;
          }else {
             ou1 = ou;
          }
          PatchProxy.onMethodExit(uoa1, str);
          goto label_01ce ;
       }
       u$c c1 = obj.c;
       Objects.requireNonNull(c1);
       if (!PatchProxy.applyVoid(null, c1, ou1, "19")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PANORAMIC_ENTRANCE_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          u r = c1.r;
          if (r == null) {
             a.S(str3);
          }
          uContentPack.photoPackage = w1.f(r.mEntity);
          u s = c1.s;
          if (s == null) {
             a.S(str4);
          }
          u1.M("", s, 1, uElementPack, uContentPack, null);
       }
       return;
    }
}
