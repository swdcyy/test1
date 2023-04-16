package com.kuaishou.live.audience.component.push.LiveAudiencePushFragment;
import ml8.d;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.audience.component.push.LiveAudiencePushFragment$1;
import android.view.View;
import t02.a0;
import android.view.View$OnClickListener;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import v21.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import lnc.x6;
import lnc.y6;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import uf2.a;
import com.kwai.robust.PatchProxyResult;
import qm6.b;
import java.util.HashMap;
import android.util.Pair;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import uf2.c;
import java.io.File;
import com.kuaishou.live.audience.component.push.LiveAudiencePushCoverLayout;
import java.lang.Boolean;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;
import android.net.Uri$Builder;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import java.util.Map;
import android.net.Uri;
import java.util.List;
import android.app.Activity;
import androidx.collection.SimpleArrayMap;
import uf2.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import ekd.m1;
import com.kuaishou.live.audience.component.push.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.video.api.camera.CameraResolutionParameters;
import u71.d;
import java.lang.Math;
import android.os.Bundle;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.live.camerahost.view.LiveAnimCameraView;
import android.view.ViewStub;
import com.kuaishou.live.core.show.modifycover.b;
import com.kuaishou.live.audience.component.push.LiveAudiencePushFragment$a;
import com.kuaishou.live.core.show.modifycover.a;
import lc2.k;
import java.util.Objects;
import com.kuaishou.live.core.show.modifycover.a$a;
import lm6.g;
import lc2.f;
import erd.g;
import crd.b;
import eoc.f;
import wkd.b;
import com.kuaishou.live.core.show.coverandbackground.cover.b;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.modifycover.c;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.live.core.show.modifycover.d;
import com.gifshow.tuna.player.poi.e;
import t45.d;
import brd.z;
import lc2.g;
import erd.r;
import lc2.d;
import lc2.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import lnc.b9;
import ekd.k1;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.widget.FrameLayout;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.audience.component.push.i;
import lc2.h;
import lc2.e;
import s0d.f;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.e;
import java.lang.StringBuilder;
import j80.c;
import com.kuaishou.live.audience.component.push.j;
import io.reactivex.g;

public class LiveAudiencePushFragment extends RxFragment implements d	// class@000bc9
{
    public LiveAudiencePushCoverLayout c;
    public b d;
    public Fragment e;
    public LiveAnimCameraView f;
    public View g;
    public b h;
    public a0 i;
    public View$OnClickListener j;
    public final AudienceBizRelation k;
    public final a l;
    public b m;
    public b n;
    public long o;
    public boolean p;
    public static final HashMap q;

    static {
       LiveAudiencePushFragment.q = new LiveAudiencePushFragment$1();
    }
    public void LiveAudiencePushFragment(View p0,a0 p1,View$OnClickListener p2,AudienceBizRelation p3){
       super();
       this.l = new l(this);
       this.o = 0;
       this.p = false;
       this.g = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
    }
    public final void Vg(View p0){
       FragmentActivity activity1;
       b uob;
       Uri obj3;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveAudiencePushFragment.class, "5")) {
          return;
       }
       RecordPostPlugin recordPostPl = y6.r(RecordPostPlugin.class);
       FragmentActivity activity = this.getActivity();
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "7";
       Object[] objArray = null;
       String obj2 = PatchProxy.apply(objArray, obj, LiveAudiencePushFragment.class, str);
       if (obj2 != patchProxyRe) {
       }else {
          int i = 2;
          int i1 = 1;
          int i2 = 0;
          if (obj.k != null) {
             obj2 = PatchProxy.apply(objArray, obj, LiveAudiencePushFragment.class, "8");
             if (obj2 != patchProxyRe) {
             }else {
                Pair second = LiveAudiencePushFragment.q.get(obj.k).second;
                if (TextUtils.x(second)) {
                   second = a1.p(R.string.arg_RES_7f105104);
                }
                objArray = new Object[i1];
                objArray[i2] = second;
                obj2 = String.format(a1.p(R.string.arg_RES_7f1050fa), objArray);
             }
             str = c.a(obj.i);
             activity1 = this.getActivity();
             File currentCover = obj.c.getCurrentCoverFile();
             String currentTitle = obj.c.getCurrentTitle();
             Pair first = LiveAudiencePushFragment.q.get(obj.k).first;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray1 = new Object[9];
                objArray1[i2] = obj2;
                objArray1[i1] = "MORE_START_LIVE";
                objArray1[i] = str;
                objArray1[3] = activity1;
                objArray1[4] = currentCover;
                objArray1[5] = currentTitle;
                objArray1[6] = first;
                objArray1[7] = null;
                objArray1[8] = Boolean.FALSE;
                uob = PatchProxy.apply(objArray1, null, uoa, "1");
                if (uob != patchProxyRe) {
                }
             }
             Uri$Builder uBuilder = a.b(StreamType.VOICEPARTY.toInt(), false, currentCover, currentTitle, null, null, false);
             if (!TextUtils.isEmpty(obj2)) {
                uBuilder.appendQueryParameter("tips", obj2);
             }
             ArrayMap uArrayMap = new ArrayMap();
             uArrayMap.put("livesubtype", "voiceparty");
             uArrayMap.put("voicepartytype", first);
             if (!TextUtils.isEmpty("MORE_START_LIVE")) {
                uArrayMap.put("livesource", "MORE_START_LIVE");
             }
             if (!TextUtils.isEmpty(str)) {
                uArrayMap.put("sourcelivetype", str);
             }
             uob = a.c(activity1, a.a(uBuilder.build(), uArrayMap, null, null));
          }else {
             obj2 = c.a(obj.i);
             activity1 = this.getActivity();
             File currentCover1 = obj.c.getCurrentCoverFile();
             String currentTitle1 = obj.c.getCurrentTitle();
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray2 = new Object[]{"MORE_START_LIVE",obj2,activity1,currentCover1,currentTitle1};
                obj3 = PatchProxy.apply(objArray2, null, uoa, "4");
                if (obj3 != patchProxyRe) {
                   obj2 = obj3;
                }
             }
             obj3 = a.b(StreamType.VIDEO.toInt(), false, currentCover1, currentTitle1, null, null, false).build();
             ArrayMap uArrayMap1 = PatchProxy.applyTwoRefs("MORE_START_LIVE", obj2, null, uoa, str);
             if (uArrayMap1 != patchProxyRe) {
             }else {
                uArrayMap1 = new ArrayMap();
                if (!TextUtils.isEmpty("MORE_START_LIVE")) {
                   uArrayMap1.put("livesource", "MORE_START_LIVE");
                }
                if (!TextUtils.isEmpty(obj2)) {
                   uArrayMap1.put("sourcelivetype", obj2);
                }
             }
             uob = a.c(activity1, a.a(obj3, uArrayMap1, null, null));
          }
          obj2 = uob;
       }
       recordPostPl.Um(activity, obj2);
       LiveAudiencePushFragment j = obj.j;
       if (j != null) {
          j.onClick(obj1);
       }
       return;
    }
    public void doBindView(View p0){
       LiveAnimCameraView liveAnimCame1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "6";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePushFragment.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "7")) {
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          showEvent.elementPackage = uElementPack;
          uElementPack.action2 = "LIVE_PREVIEW_TITLE_CARD";
          u1.g0(showEvent);
       }
       this.c = m1.f(p0, 0x7f0a19af);
       m1.a(p0, new h(this), R.id.live_audience_start_push_layout);
       this.getActivity().F2(this.l);
       this.e = y6.r(RecordPostPlugin.class).Pj();
       CameraResolutionParameters uCameraResol = new CameraResolutionParameters();
       d uod = d.a("1280x720");
       d a = uod.a;
       uCameraResol.mPreviewWidth = a;
       uod = uod.b;
       uCameraResol.mPreviewHeight = uod;
       uCameraResol.mPreviewMaxSize = Math.max(a, uod);
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, "TakePictureType", TakePictureType.LIVE_PLAY);
       SerializableHook.putSerializable(uBundle, "TakePictureParameters", uCameraResol);
       this.e.setArguments(uBundle);
       uCameraResol = this.e.getView();
       String str1 = "11";
       LiveAnimCameraView liveAnimCame = PatchProxy.applyOneRefs(uCameraResol, this, LiveAudiencePushFragment.class, str1);
       if (liveAnimCame != patchProxyRe) {
       }else {
          int i = 0x7f0a0632;
          int i1 = 0x7f0a1ae8;
          if (uCameraResol != null) {
             liveAnimCame1 = uCameraResol.findViewById(i1);
             if (liveAnimCame1 == null) {
                ViewStub viewStub = uCameraResol.findViewById(i);
                if (viewStub != null) {
                   liveAnimCame1 = viewStub.inflate();
                }
             }
          }else {
             liveAnimCame1 = null;
          }
          if (liveAnimCame1 == null) {
             LiveAnimCameraView liveAnimCame2 = this.getActivity().findViewById(i1);
             if (liveAnimCame2 == null) {
                ViewStub viewStub1 = this.getActivity().findViewById(i);
                if (viewStub1 != null) {
                   liveAnimCame2 = viewStub1.inflate();
                }
             }
             liveAnimCame = liveAnimCame2;
          }else {
             liveAnimCame = liveAnimCame1;
          }
       }
       this.f = liveAnimCame;
       b uob = new b(this.c, this.getActivity(), new LiveAudiencePushFragment$a(this));
       this.d = uob;
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidTwoRefs(null, null, uob, b.class, "1")) {
          b a1 = uob.a;
          if (a1 != null) {
             a1.setListener(uob.q);
             uob.j = f.a(g.class, new f(uob));
             if (!PatchProxy.applyVoid(null, uob, b.class, "10") && !b.a(-1057460702).e()) {
                e.a().Y().map(new e()).subscribe(new c(uob), Functions.d());
             }
             if (!PatchProxy.applyVoid(null, uob, b.class, str1)) {
                e.a().I().map(new e()).subscribe(new d(uob), e.b);
             }
             if (!PatchProxy.applyVoidOneRefs(null, uob, b.class, "9")) {
                if (!TextUtils.x(null)) {
                   uob.o = true;
                   uob.b = null;
                   uob.e.f(null);
                }else {
                   b uob1 = b.a(-1057460702);
                   Objects.requireNonNull(uob1);
                   t ot = PatchProxy.apply(null, uob1, b.class, str);
                   if (ot != patchProxyRe) {
                   }else {
                      ot = uob1.g.observeOn(d.a);
                   }
                   uob.k = ot.filter(new g(uob)).subscribe(new d(uob), e.b);
                }
             }
             if (!PatchProxy.applyVoidOneRefs(null, uob, b.class, "2") && b.a(-1057460702).e()) {
                uob.m = true;
                uob.g.c();
                uob.g.d((uob.n ^ true));
             }
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudiencePushFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0a3f, p1, false);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudiencePushFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.h);
       b9.a(this.m);
       b9.a(this.n);
       LiveAudiencePushFragment td = this.d;
       if (td != null) {
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoid(objArray, td, b.class, "3")) {
             b9.a(td.i);
             b9.a(td.j);
             b9.a(td.k);
             b9.a(td.l);
             td.n = false;
             td.o = false;
             td.m = false;
             k1.n(td);
          }
       }
       this.getActivity().l3(this.l);
       if (!PatchProxy.applyVoid(objArray, this, LiveAudiencePushFragment.class, "10")) {
          Fragment uFragment = this.i.Z2.b().getChildFragmentManager().findFragmentByTag("take_cover");
          if (uFragment != null && uFragment.isAdded()) {
             this.i.Z2.b().getChildFragmentManager().beginTransaction().u(uFragment).m();
          }
          this.g.findViewById(R.id.live_audience_full_screen_fragment_shape).setVisibility(8);
          this.f.setVisibility(8);
          this.g.setVisibility(0);
          if (!this.i.E.isPlaying()) {
             this.i.E.startPlay();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudiencePushFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       p0.setOnClickListener(i.b);
       LiveAudiencePushFragment td = this.d;
       Objects.requireNonNull(td);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, td, b.class, "6")) {
          b9.a(td.l);
          i = -1057460702;
          td.l = b.a(i).d().observeOn(d.a).filter(new h(td)).subscribe(new e(td), e.b);
          if (td.n == null) {
             td.a.setLiveCover(b.a(i).b());
          }
          if (td.o == null) {
             td.a.setCaption(b.a(i).c());
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudiencePushFragment.class, "3")) {
          this.h = t.create(new j(this, f.x().r(QCurrentUser.ME.getAvatars()).v(), b.a(-1504323719).c("live_push_avatar_cache").getAbsolutePath()+File.separator+"avatar_cover.jpg")).subscribe();
       }
       return;
    }
}
