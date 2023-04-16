package com.kwai.live.gzone.turntable.b$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.turntable.b;
import n77.i;
import n77.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.b$c$a;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableTask;
import n77.m;
import erd.g;
import crd.b;
import brd.t;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import java.lang.ref.WeakReference;
import y43.a;
import mq5.h;
import mq5.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.c;
import t45.d;
import brd.z;
import n77.k;
import wl9.d;
import n77.l;
import wka.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import n77.j;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadAction;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.webkit.URLUtil;
import android.net.Uri;
import android.net.Uri$Builder;
import android.app.Activity;
import android.content.Context;
import vq5.d;
import java.lang.Integer;
import u37.h;
import u37.e;
import fq5.b;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterDownloadLogParam;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import s67.i1;
import com.kwai.framework.model.user.QCurrentUser;
import fg6.a;
import com.google.gson.Gson;
import e17.i;
import lnc.a1;
import com.kuaishou.live.gzone.widget.LiveGzoneDownloadProgressView;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import mrd.c;
import com.kwai.live.gzone.turntable.b$b;

public class b$c extends PresenterV2	// class@000e32
{
    public c A;
    public h B;
    public final b C;
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public LiveGzoneDownloadProgressView s;
    public KwaiImageView t;
    public c u;
    public b$b v;
    public LiveGzoneTurntableTask w;
    public a x;
    public int[] y;
    public c z;

    public void b$c(b p0){
       this.C = p0;
       super();
       int[] ointArray = new int[2];
       this.y = ointArray;
       this.A = new i(this);
       this.B = new g(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "3")) {
          return;
       }
       this.s.setOnClickListener(new b$c$a(this));
       this.X8(this.w);
       this.X7(this.u.subscribe(new m(this)));
       if (11 == this.w.mType) {
          d.a(-1986139969).registerGlobalDownloadListener(String.valueOf(this.hashCode()), new WeakReference(this.A));
       }
       this.x.z.Km(this.B);
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(c.class).observeOn(a).subscribe(new k(this)));
       t ot = f.f(d.class).observeOn(a);
       this.X7(ot.subscribe(new l(this)));
       this.X7(f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new j(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "9")) {
          return;
       }
       this.x.z.le(this.B);
       if (11 == this.w.mType) {
          d.a(-1986139969).unregisterGlobalDownloadListener(String.valueOf(this.hashCode()));
       }
       return;
    }
    public final GameCenterDownloadParams P8(GameCenterDownloadParams$DownloadInfo p0,GameCenterDownloadParams$DownloadAction p1){
       GameCenterDownloadParams obj = PatchProxy.applyTwoRefs(p0, p1, this, b$c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GameCenterDownloadParams();
       obj.mDownloadId = p0.mGameId;
       obj.mDownloadUrl = p0.mUrl;
       obj.mGameIconUrl = p0.mGameIcon;
       obj.mPackageName = p0.mPackageName;
       obj.mGameName = p0.mGameName;
       obj.mLogParam = p0.mStatsticData;
       obj.mAction = p1;
       return obj;
    }
    public final void R8(String p0){
       b$c uoc = b$c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "22")) {
          return;
       }
       if (URLUtil.isNetworkUrl(p0)) {
          Uri$Builder obj = PatchProxy.applyOneRefs(p0, this, uoc, "23");
          if (obj != PatchProxyResult.class) {
             p0 = obj;
          }else {
             obj = Uri.parse("kwailive://webview?").buildUpon();
             obj.appendQueryParameter("url", p0);
             p0 = obj.build().toString();
          }
       }
       this.C.y.U.r4(p0, this.getActivity());
       return;
    }
    public final void S8(String p0,int p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "20")) {
          return;
       }
       this.X7(e.d().b(this.x.m.getLiveStreamId(), p0, p1).subscribe(Functions.d(), Functions.d()));
       return;
    }
    public final void V8(){
       b$c uoc = b$c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "17")) {
          return;
       }
       GameCenterDownloadParams gameCenterDo = new GameCenterDownloadParams();
       b$c tw = this.w;
       gameCenterDo.mDownloadId = tw.mGameId;
       gameCenterDo.mDownloadUrl = tw.mLink;
       gameCenterDo.mGameIconUrl = tw.mGameIcon;
       gameCenterDo.mAction = GameCenterDownloadParams$DownloadAction.START;
       gameCenterDo.mPackageName = tw.mPkgName;
       gameCenterDo.mGameName = tw.mGameName;
       GameCenterDownloadLogParam gameCenterDo1 = PatchProxy.apply(objArray, this, uoc, "18");
       if (gameCenterDo1 != PatchProxyResult.class) {
       }else {
          gameCenterDo1 = new GameCenterDownloadLogParam();
          gameCenterDo1.sceneId = "128";
          gameCenterDo1.authorId = this.x.m.d();
          gameCenterDo1.photoId = this.x.m.getLiveStreamId();
          gameCenterDo1.imeiId = TextUtils.k(SystemUtil.m(a.B));
          gameCenterDo1.gameId = TextUtils.k(this.w.mGameId);
          gameCenterDo1.refer = "liveroom_turntable";
          gameCenterDo1.mFansTopExt = i1.c(this.x.Q().mEntity);
          gameCenterDo1.userId = QCurrentUser.me().getId();
       }
       gameCenterDo.mLogParam = a.a.q(gameCenterDo1);
       d.a(-1986139969).gameDownload(this.getActivity(), gameCenterDo);
       i.a(R.style.arg_RES_7f11066a, 0x7f102426);
       return;
    }
    public final void W8(GameCenterDownloadParams$DownloadInfo p0){
       b$c ts;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "8")) {
          return;
       }
       boolean b = true;
       this.s.setEnabled(b);
       int i = 0x7f103c08;
       int i1 = 0x7f101144;
       if (p0 == null) {
          ts = this.s;
          str = (SystemUtil.M(this.getActivity(), this.w.mPkgName))? a1.p(i): a1.p(i1);
          ts.setText(str);
          this.s.setBackgroundProgress(100);
       }else {
          GameCenterDownloadParams$DownloadInfo mStage = p0.mStage;
          Objects.requireNonNull(mStage);
          int i2 = -1;
          switch (mStage.hashCode()){
              case 0xae7a2e7a:
                if (mStage.equals("cancel")) {
                   i2 = 0;
                }
                break;
              case 0xc454c22d:
                if (mStage.equals("progress")) {
                   i2 = 1;
                }
                break;
              case 0xc84dc82d:
                if (mStage.equals("resume")) {
                   i2 = 2;
                }
                break;
              case 0xdc453139:
                if (mStage.equals("complete")) {
                   i2 = 3;
                }
                break;
              case 0x379175:
                if (mStage.equals("wait")) {
                   i2 = 4;
                }
                break;
              case 0x5c4d208:
                if (mStage.equals("error")) {
                   i2 = 5;
                }
                break;
              case 0x65825f6:
                if (mStage.equals("pause")) {
                   i2 = 6;
                }
                break;
              case 0x68ac462:
                if (mStage.equals("start")) {
                   i2 = 7;
                }
                break;
              default:
          }
          switch (i2){
              case 0:
                this.s.setBackgroundProgress(100);
                this.s.setText(a1.p(i1));
                break;
              case 1:
              case 7:
              case 2:
                this.s.setBackgroundProgress(p0.getPercent());
                this.s.setText(p0.getPercent()+"%");
                this.s.setSelected(b);
                break;
              case 3:
                this.s.setBackgroundProgress(100);
                ts = this.s;
                str = (SystemUtil.M(this.getActivity(), this.w.mPkgName))? a1.p(i): a1.p(R.string.arg_RES_7f101174);
                ts.setText(str);
                break;
              case 4:
              case 6:
              case 5:
                this.s.setBackgroundProgress(p0.getPercent());
                this.s.setText(a1.p(R.string.arg_RES_7f100aac));
                break;
              default:
          }
       }
       return;
    }
    public final void X8(LiveGzoneTurntableTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "10")) {
          return;
       }
       this.p.P(p0.mPicUrl);
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       int i = 17;
       if (!TextUtils.x(p0.mTip)) {
          spannableStr.append(p0.mTip);
          spannableStr.setSpan(new ForegroundColorSpan(-1), 0, (spannableStr.length() - 1), i);
       }
       spannableStr.append("  ");
       Object[] objArray = new Object[]{Integer.valueOf(p0.mRequirementCount),Integer.valueOf(p0.mRequirement)};
       spannableStr.append(String.format("\(%d/%d\)", objArray));
       int i1 = (spannableStr.toString()).lastIndexOf(47);
       spannableStr.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0615c0)), (i1 - (String.valueOf(p0.mRequirementCount)).length()), i1, i);
       this.q.setText(spannableStr);
       Object[] objArray1 = new Object[]{Integer.valueOf(p0.mObtainedDrawCount),Integer.valueOf(p0.mDayLimit)};
       this.r.setText(String.format(a1.p(R.string.arg_RES_7f104e8b), objArray1));
       this.s.setSelected(0);
       LiveGzoneTurntableTask mType = p0.mType;
       if (11 == mType) {
          this.W8(d.a(-1986139969).getGameCenterDownloadInfoByGameId(this.w.mGameId));
       }else if(10 == mType){
          if (p0.mObtainedDrawCount == p0.mDayLimit) {
             this.s.setText(a1.p(R.string.arg_RES_7f101134));
             this.s.setEnabled(0);
          }else {
             this.s.setText(a1.p(R.string.arg_RES_7f101110));
             this.s.setEnabled(1);
          }
       }else if(p0.mObtainedDrawCount == p0.mDayLimit){
          this.s.setText(a1.p(R.string.arg_RES_7f104e85));
          this.s.setEnabled(0);
       }else if(TextUtils.x(p0.mLink) && (p0.isWatchLiveTimeType() || p0.isVisitSpecificPageType())){
          this.s.setText(a1.p(R.string.arg_RES_7f10248d));
          this.s.setEnabled(0);
       }else {
          this.s.setText(a1.p(R.string.arg_RES_7f104e8d));
          this.s.setEnabled(1);
       }
       if (!q.f(p0.mCornerMarkUrl)) {
          this.t.P(p0.mCornerMarkUrl);
          this.t.setVisibility(0);
       }else {
          this.t.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a26fb);
       this.q = m1.f(p0, 0x7f0a3d5f);
       this.s = m1.f(p0, 0x7f0a3d60);
       this.r = m1.f(p0, 0x7f0a007a);
       this.t = m1.f(p0, 0x7f0a40c0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       this.u = this.r8("LIVE_TURNTABLE_SCROLL_SUBJECT");
       this.v = this.r8("LIVE_GZONE_TURNTABLE_TASK_ITEM_CALLBACK");
       this.w = this.q8(LiveGzoneTurntableTask.class);
       this.x = this.q8(a.class);
       return;
    }
    public void onEvent(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "6")) {
          return;
       }
       if (p0 != null && (p0.a != null && TextUtils.n(p0.b, this.w.mGameId))) {
          b$c tw = this.w;
          tw.mObtainedDrawCount = tw.mDayLimit;
          this.X8(tw);
          this.v.b();
       }
    label_002b :
       return;
    }
}
