package dlc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.f$a;
import dlc.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import dlc.c;
import erd.o;
import brd.t;
import dlc.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import dlc.b;
import lnc.b9;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout$a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout;
import android.view.View$OnClickListener;
import alc.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import hf5.b;
import qm6.b$a;
import android.content.Context;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;
import qm6.b;
import com.kuaishou.android.model.mix.HotspotParams;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import com.kuaishou.android.post.HotspotArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.Boolean;
import tkc.a;
import android.content.SharedPreferences;
import com.kwai.framework.abtest.f;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class f extends PresenterV2	// class@002248
{
    public final m A;
    public SlidePlayTrendingBottomLayout p;
    public t q;
    public b$a r;
    public f s;
    public PublishSubject t;
    public TrendingInfo u;
    public int v;
    public String w;
    public b x;
    public b y;
    public final View$OnClickListener z;

    public void f(){
       super();
       this.z = new f$a(this);
       this.A = new f$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if ((this.w).equals("poster")) {
          this.P8();
       }else if(this.W8(this.s.get())){
          this.R8();
       }
       g e = Functions.e;
       this.X7(this.q.map(c.b).subscribe(new a(this), e));
       this.X7(this.t.subscribe(new b(this), e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       b9.a(this.y);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.p.getAdapter().a(this.z);
       return;
    }
    public final void R8(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "7")) {
          return;
       }
       this.p.getAdapter().c(this.A);
       if (!PatchProxy.applyVoid(null, this, uof, "12")) {
          TrendingInfo trendingInfo = this.s.get();
          if (trendingInfo != null) {
             int i = this.v + 1;
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(trendingInfo, Integer.valueOf(i), null, null, a.class, "17")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                i3 oi3 = i3.f();
                oi3.d("wordId", trendingInfo.mWordId);
                oi3.d("trending_id", trendingInfo.mId);
                oi3.d("trending_name", trendingInfo.mDesc);
                oi3.c("trending_top", Integer.valueOf(trendingInfo.mTop));
                oi3.c("trending_feedcount", Integer.valueOf(trendingInfo.mFeedCount));
                oi3.d("popular_type", trendingInfo.mPopularType);
                oi3.d("trending_type", trendingInfo.mTrendingType);
                oi3.c("trending_index", Integer.valueOf(i));
                if (!TextUtils.isEmpty(null)) {
                   oi3.d("bamboo_entry_source", null);
                }
                uElementPack.params = oi3.e();
                uElementPack.name = "POPULAR_PAGE";
                uElementPack.action2 = "SUBMIT_BUTTON";
                u1.u0(6, uElementPack, null);
             }
          }
       }
       return;
    }
    public void S8(RecordPostPlugin p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "15")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Object[] objArray = null;
       TrendingInfo trendingInfo = PatchProxy.apply(objArray, this, uof, "13");
       if (trendingInfo != patchProxyRe) {
       }else {
          trendingInfo = this.s.get();
          trendingInfo = (trendingInfo != null)? trendingInfo.mChallengeBoardPostScheme: objArray;
       }
       if (!TextUtils.isEmpty(trendingInfo)) {
          Intent intent = new Intent();
          intent.setData(Uri.parse(trendingInfo));
          if (this.getActivity() != null) {
             this.getActivity().startActivity(intent);
          }
       }else {
          QPhoto currentPhoto = this.x.getCurrentPhoto();
          b$a uoa = PatchProxy.applyOneRefs(currentPhoto, this, uof, "9");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new b$a(this.getActivity(), 0);
             uoa.s(0);
             if (currentPhoto != null && currentPhoto.getMagicFace() != null) {
                uoa.M(currentPhoto.getMagicFace().mId);
             }
             if (currentPhoto != null && currentPhoto.getMusic() != null) {
                uoa.S(currentPhoto.getMusic().mId);
                uoa.W(currentPhoto.getMusic().mType.mValue);
             }else if(currentPhoto != null && currentPhoto.getSoundTrack() != null){
                uoa.S(currentPhoto.getSoundTrack().mId);
                uoa.W(currentPhoto.getSoundTrack().mType.mValue);
             }
          }
          this.r = uoa;
          Object[] obj = PatchProxy.apply(objArray, this, uof, "14");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else {
             TrendingInfo trendingInfo2 = this.s.get();
             if (trendingInfo2 != null) {
                objArray = trendingInfo2.mDesc;
             }
          }
          if (!TextUtils.isEmpty(objArray)) {
             this.r.e0(objArray);
          }
          b uob = this.r.f();
          if (this.W8(this.s.get()) && !PatchProxy.applyVoidOneRefs(uob, this, uof, "16")) {
             TrendingInfo trendingInfo1 = this.s.get();
             HotspotParams hotspotParam = new HotspotParams();
             hotspotParam.mConnectType = 0;
             hotspotParam.mId = trendingInfo1.mWordId;
             hotspotParam.mName = trendingInfo1.mDesc;
             uob.getArgs().getHotspotParams().set(hotspotParam);
          }
          p0.Um(this.getActivity(), uob);
       }
       return;
    }
    public final boolean V8(){
       Object obj = PatchProxy.apply(null, this, f.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.a.getBoolean("enableRelatedHotspot", b) && f.a("ShowPostEntrance2")) {
          b = true;
       }
       return b;
    }
    public final boolean W8(TrendingInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.mEnableRelatedHotspot != null && this.V8()))? true: false;
       return b;
    }
    public final void X8(TrendingInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       if (p0 != null) {
          TrendingInfo mTrendingTyp = p0.mTrendingType;
          if (mTrendingTyp != null && mTrendingTyp.equals("poster")) {
             this.P8();
          }else if(this.W8(p0)){
             this.R8();
          }else if(PatchProxy.applyVoid(null, this, f.class, "8")){
             this.p.getAdapter().b();
          }
       }else {
          goto label_001d ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a4067);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.x = this.q8(b.class);
       this.q = this.r8("TRENDING_INFO_ITEM_CLICK_OBSERVABLE");
       this.s = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       this.t = this.r8("CURRENT_PLAY_FEED_INDEX_IN_TRENDING_INFO");
       this.w = this.r8("TRENDING_REQUEST_INIT_TRENDING_TYPE");
       return;
    }
}
