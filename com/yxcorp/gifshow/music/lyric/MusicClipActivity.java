package com.yxcorp.gifshow.music.lyric.MusicClipActivity;
import ml8.d;
import im8.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import io.reactivex.subjects.PublishSubject;
import jqb.m;
import com.yxcorp.gifshow.util.t0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import qpb.j;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.android.model.music.Music;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.music.utils.g;
import kob.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import java.lang.Integer;
import jqb.l;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import android.view.Window;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.kwai.feature.post.api.music.data.MusicSource;
import qpb.m;
import java.util.Objects;
import java.lang.Number;
import tkd.b;
import tkd.d;
import om6.r;
import com.kuaishou.android.model.music.MusicType;
import java.util.concurrent.TimeUnit;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rpb.x;
import rpb.o0;
import rpb.r;
import rpb.k0;
import rpb.b;
import rpb.e0;
import com.kwai.framework.player.core.b;
import e17.i;
import jqb.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import lq.i;
import lnc.a1;
import com.kwai.feature.post.api.util.g;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;

public class MusicClipActivity extends GifshowActivity implements d, g	// class@002055
{
    public n A;
    public PublishSubject B;
    public PublishSubject C;
    public PublishSubject D;
    public PublishSubject E;
    public m F;
    public double G;
    public PresenterV2 H;
    public Music I;
    public t0 J;
    public boolean K;
    public o y;
    public m z;

    public void MusicClipActivity(){
       super();
       this.B = PublishSubject.g();
       this.C = PublishSubject.g();
       this.D = PublishSubject.g();
       this.E = PublishSubject.g();
       this.F = new m();
       this.G = 0;
       this.J = new t0();
       this.K = false;
    }
    public int M(){
       return 4;
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, MusicClipActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ClientContent$ContentPackage();
    }
    public void doBindView(View p0){
    }
    public int f(){
       return 56;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicClipActivity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MusicClipActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MusicClipActivity.class, new j());
       }else {
          obj.put(MusicClipActivity.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 51;
    }
    public String getPageParams(){
       MusicClipActivity obj = PatchProxy.apply(null, this, MusicClipActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I;
       String str = "&is_musician=";
       if (obj == null || !obj.isSearchDispatchMusic()) {
          return str+g.b(this.I);
       }
       String str1 = "keyword="+this.I.mSearchKeyWord+"&ussid="+this.I.mUssid+str+g.b(this.I);
       str = this.y.g();
       if (!TextUtils.isEmpty(str)) {
          str1 = "taskId="+str+"&"+str1;
       }
       return str1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MusicClipActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, MusicClipActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.y.c()) {
          return "ks://clip_music/edit";
       }
       return "ks://clip_music/record";
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(MusicClipActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MusicClipActivity.class, "13")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1000) {
          if (p1 == -1) {
             p2.putExtra("EXTRA_IS_FROM_CLIP", false);
             this.setResult(-1, p2);
             this.finish();
          }else if(!p1){
             l.a(this, p2);
          }
       }
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, MusicClipActivity.class, "12")) {
          return;
       }
       this.setResult(0);
       this.finish();
       return;
    }
    public void onCreate(Bundle p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicClipActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.getIntent() == null) {
          this.finish();
          return;
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, MusicClipActivity.class, "2")) {
             o oo1 = new o(this.getIntent());
             this.y = oo1;
             Object obj1 = PatchProxy.apply(objArray, oo1, oo, "8");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = b.a(oo1.a.getParcelableExtra("music"));
             }
             this.I = obj1;
          }
          if (this.I == null) {
             this.finish();
             return;
          }else {
             this.setContentView(R.layout.arg_RES_7f0d0ff8);
             this.doBindView(this.getWindow().getDecorView());
             w9.a(this);
             if (!PatchProxy.applyVoid(objArray, this, MusicClipActivity.class, "3") && (this.y.d() == MusicSource.RECOMMEND_MUSIC && this.I.isRecommendMusic())) {
                this.F.setBusinessType(11);
             }
          label_008b :
             if (!PatchProxy.applyVoid(objArray, this, MusicClipActivity.class, "4")) {
                m om = new m();
                this.z = om;
                om.a = this.I;
                om.d = (long)this.y.e();
                MusicClipActivity tz = this.z;
                MusicClipActivity ty = this.y;
                Objects.requireNonNull(ty);
                Music obj = PatchProxy.apply(objArray, ty, oo, "10");
                long l = (obj != patchProxyRe)? obj.longValue(): ty.a.getLongExtra("start_time", 0);
                tz.e = l;
                MusicClipActivity tz1 = this.z;
                m d = tz1.d;
                if (d <= 0) {
                   tz1.d = (!d - -1)? 0x222e0: (long)d.a(-831446984).uK(0);
                }
             label_00f0 :
                tz1 = this.I;
                if (tz1.mType == MusicType.SOUNDTRACK) {
                   obj = tz1.mDuration;
                   this.z.d = (obj <= null)? 0x7fffffff: (long)((float)obj * 1000.00f);
                }
             label_010e :
                Music mCopyrightTi = tz1.mCopyrightTimeLimitInSecond;
                if (mCopyrightTi != null) {
                   this.z.i = TimeUnit.SECONDS.toMillis((long)mCopyrightTi);
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, MusicClipActivity.class, "5")) {
                PresenterV2 presenterV2 = new PresenterV2();
                this.H = presenterV2;
                presenterV2.U7(new x());
                this.H.U7(new o0());
                this.H.U7(new r());
                this.H.U7(new k0());
                this.H.U7(new b());
                this.H.U7(new e0());
                this.H.f(this.findViewById(R.id.root));
                Object[] objArray1 = new Object[]{this};
                this.H.i(objArray1);
             }
             return;
          }
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MusicClipActivity.class, "11")) {
          return;
       }
       MusicClipActivity tH = this.H;
       if (tH != null) {
          tH.destroy();
       }
       this.F.b();
       super.onDestroy();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MusicClipActivity.class, "9")) {
          return;
       }
       super.onPause();
       this.z.l = true;
       b uob = this.u3();
       if (uob != null) {
          uob.pause();
       }
       this.F.c();
       return;
    }
    public void onResume(){
       MusicClipActivity musicClipAct = MusicClipActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, musicClipAct, "8")) {
          return;
       }
       super.onResume();
       boolean b = false;
       this.z.l = b;
       if (!PatchProxy.applyVoid(objArray, this, musicClipAct, "6") && this.K == null) {
          boolean b1 = true;
          this.K = b1;
          MusicClipActivity tI = this.I;
          Music mCopyrightTi = tI.mCopyrightTimeLimitInSecond;
          if (mCopyrightTi != null && ((float)tI.mUsedDuration - ((float)mCopyrightTi * 1000.00f) < 0 && (tI.mDuration > mCopyrightTi && this.z.d - TimeUnit.SECONDS.toMillis((long)mCopyrightTi) > 0))) {
             Object[] objArray1 = new Object[b1];
             objArray1[b] = Integer.valueOf(this.I.mCopyrightTimeLimitInSecond);
             i.b(R.style.arg_RES_7f110668, 0x7f100835, objArray1);
             if (!PatchProxy.applyVoidOneRefs(this, objArray, k.class, "42")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MUSIC_COPYRIGHT_CLIPS_TOAST";
                u1.D0("", this, 7, uElementPack, null, null);
             }
          }
       }
       if (!i.h()) {
          this.J.c();
       }
       b uob = this.u3();
       if (uob != null && uob.isPrepared()) {
          uob.start();
       }
       g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0619d6));
       this.F.e(this.I);
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, MusicClipActivity.class, "10")) {
          return;
       }
       super.onStop();
       if (!i.h()) {
          this.J.a();
       }
       return;
    }
    public final b u3(){
       MusicClipActivity tz = this.z;
       m j = (tz != null)? tz.j: null;
       return j;
    }
}
