package bg3.e;
import qvb.q;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import bg3.e$a;
import bg3.e$b;
import bg3.e$c;
import bg3.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ks3.i0$a;
import ks3.i0;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import bg3.a;
import android.view.View$OnClickListener;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.LinearLayout;
import com.yxcorp.utility.n;
import java.lang.Integer;
import bg3.h;
import android.view.ViewOutlineProvider;
import java.util.Objects;
import f12.d;
import f12.c;
import ekd.k1;
import joc.z;
import com.yxcorp.gifshow.widget.SwipeLayout;
import mq5.h;
import mq5.b;
import qvb.a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import java.lang.Throwable;
import qvb.p;
import kp3.e;
import com.yxcorp.gifshow.entity.QPhoto;
import cq5.a$a;
import d61.y;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import yf3.a;
import android.widget.ImageView;
import ag3.a;
import cg3.b;
import bg3.d;
import java.lang.Runnable;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lb2.i;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import com.kwai.feature.api.live.base.service.statistics.CloseLiveReason;
import tq5.c;
import com.kuaishou.live.core.basic.utils.e;
import bg3.g;
import com.yxcorp.utility.TextUtils;
import ge5.d;
import lnc.w9;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kp3.a;
import joc.q;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.i;
import com.kuaishou.android.model.mix.CoverMeta;
import vb5.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import hb2.g$b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import bg3.e$d;
import androidx.recyclerview.widget.RecyclerView$n;
import bg3.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bg3.k;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import rb2.g;
import com.kwai.framework.model.user.User;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import java.util.Collection;
import ekd.q;
import qvb.n0;
import g9c.a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse$ChainBottomConfig;
import bg3.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import zf3.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public class e extends PresenterV2 implements q, g	// class@0003a4
{
    public d A;
    public RecyclerView B;
    public View C;
    public View D;
    public TextView E;
    public a$a F;
    public KwaiImageView G;
    public KwaiImageView H;
    public a I;
    public g J;
    public String K;
    public d L;
    public SelectShapeTextView M;
    public LinearLayout N;
    public boolean O;
    public Float P;
    public c Q;
    public i0$a R;
    public final a S;
    public b T;
    public final h U;
    public a0 p;
    public a q;
    public LiveStreamFeed r;
    public e s;
    public i t;
    public boolean u;
    public LiveSlidePlayService v;
    public LiveBizParam w;
    public SwipeLayout x;
    public l y;
    public m z;
    public static final int V = 0;
    public static String sLivePresenterClassName = "LiveMerchantChainBarPresenter";

    static {
       e.V = a1.d(0x7f070c56);
    }
    public void e(){
       super();
       this.K = "";
       this.O = true;
       this.R = new e$a(this);
       this.S = new e$b(this);
       this.T = new e$c(this);
       this.U = new c(this);
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "25")) {
          a0 o2 = this.p.O2;
          if (o2 != null) {
             o2.b(this.R);
          }
       }
       this.V8();
       return;
    }
    public void F8(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "2")) {
          return;
       }
       ViewStub viewStub = this.getActivity().findViewById(R.id.merchant_photo_feed_side_bar_layout_stub);
       if (viewStub != null) {
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d0f4b);
          viewStub.inflate();
       }
       View view = this.getActivity().findViewById(R.id.merchant_photo_feed_side_bar_layout);
       this.C = view;
       this.B = view.findViewById(0x7f0a2b1a);
       this.E = this.C.findViewById(0x7f0a2b19);
       this.G = this.getActivity().findViewById(0x7f0a303b);
       this.H = this.C.findViewById(0x7f0a2b16);
       view = this.getActivity().findViewById(R.id.photo_feed_side_bar_close_view);
       this.D = view;
       view.setOnClickListener(new a(this));
       this.M = this.C.findViewById(0x7f0a257b);
       this.N = this.C.findViewById(0x7f0a0505);
       n.V(this.C.findViewById(R.id.status_bar));
       e tB = this.B;
       int i = a1.e(4.00f);
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(tB, Integer.valueOf(i), this, uoe, "23")) {
          tB.setClipToOutline(true);
          tB.setOutlineProvider(new h(this, i));
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       this.L = c.b(activity);
       return;
    }
    public void J8(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "5")) {
          return;
       }
       k1.n(this);
       if (!PatchProxy.applyVoid(null, this, uoe, "24")) {
          a0 o2 = this.p.O2;
          if (o2 != null) {
             o2.c(this.R);
          }
       }
       uoe = this.x;
       if (uoe != null) {
          uoe.m(this.s);
       }
       if (this.W8()) {
          this.p.D2.le(this.U);
          this.q.f(this);
          this.O = true;
          uoe = this.v;
          if (uoe != null) {
             e tQ = this.Q;
             if (tQ != null) {
                uoe.d5(tQ);
             }
          }
          this.reset();
       }
       this.I = null;
       return;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "17")) {
          return;
       }
       this.s.o();
       return;
    }
    public void R8(QPhoto p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "19")) {
          return;
       }
       e tF = this.F;
       if (tF != null) {
          tF.b();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "12") && (this.getActivity() != null && (y.d(this.getActivity()) && (p0.getLivePlayConfig().mIsFromLiveMate == null || !p0.getLivePlayConfig().isLandscape())))) {
          this.getActivity().setRequestedOrientation(1);
       }
    label_0045 :
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "13")) {
          if (this.I == null) {
             b.B(LiveLogTag.MERCHANT, "mChainSideBarAdapter is null");
          }else if(r1.S2(p0.mEntity) && !p0.equals(this.I.r1())){
             int i = 0;
             this.G.setVisibility(i);
             this.q.m2(p0.getLiveStreamId());
             b.a(this.I, this.B, this.getActivity(), p0);
             if (this.p.h != null) {
                k1.s(new d(this, p0), this, 240);
             }else {
                this.P8();
                uoe = this.t;
                if (uoe != null) {
                   uoe.d(p0.mEntity, this.p.l, i);
                }
                if (this.getActivity() instanceof LivePlayActivity) {
                   this.p.w1.ub(CloseLiveReason.ENTER_OTHER_LIVE);
                   e.v(this.getActivity(), p0.mEntity, 61);
                }
             }
          }
       }
       return;
    }
    public void S8(){
       e tA;
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "10")) {
          tA = this.I;
          if (tA != null) {
             tA.x = new g(this);
          }
       }
       String str = TextUtils.k(this.r.getId());
       this.K = str;
       this.q.m2(str);
       b.a(this.I, this.B, this.getActivity(), new QPhoto(this.r));
       if (this.p.h != null) {
          tA = this.A;
          if (tA != null) {
             tA.a(this.s);
          }else {
          label_0054 :
             SwipeLayout swipeLayout = w9.c(this.getActivity());
             this.x = swipeLayout;
             if (swipeLayout != null) {
                swipeLayout.c(this.s);
             }
          }
       }else {
          goto label_0054 ;
       }
       this.s.A(e.V);
       this.s.l(this.getActivity());
       this.s.B(this.S);
       this.s.g(10);
       if (this.s.s()) {
          tA = this.y;
          if (tA != null) {
             tA.f(true);
          }
          tA = this.z;
          if (tA != null) {
             tA.f(true);
          }
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "20")) {
          int i = this.p.c.getWidth() / 8;
          int i1 = this.p.c.getHeight() / 8;
          if (i > 0 && (i1 > 0 && !i.a(this.G))) {
             ImageRequest[] imageRequest = b.e(this.p.c.getCoverMeta(), i, i1, new a(25));
             if (imageRequest.length) {
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-live:live");
                uoa.d(ImageSource.FEED_COVER);
                d uod = Fresco.newDraweeControllerBuilder().r(uoa.a());
                uod.y(this.G.getController());
                uod.u(imageRequest);
                AbstractDraweeController uAbstractDra = uod.e();
                this.G.setController(uAbstractDra);
                this.G.setVisibility(8);
             }
          }
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "21")) {
          a0 l1 = this.p.l1;
          if (l1 != null) {
             l1.a(true);
          }
       }
       return;
    }
    public void V8(){
       e tB;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          return;
       }
       if (this.W8()) {
          if (!PatchProxy.applyVoid(objArray, this, uoe, "22")) {
             a0 l = this.p.l;
             if (l == 25 || l == 61) {
                tB = this.D;
                if (tB != null && tB.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                   ViewGroup$MarginLayoutParams layoutParams = this.D.getLayoutParams();
                   layoutParams.topMargin = a1.e(41.00f) + n.A(this.getContext());
                   this.D.setLayoutParams(layoutParams);
                }
             }
          }
          this.p.D2.Km(this.U);
          this.q.h(this);
          this.I = this.B.getAdapter();
          if (this.B.getLayoutManager() == null) {
             tB = this.B;
             tB.setLayoutManager(new LinearLayoutManager(tB.getContext()));
             this.B.addItemDecoration(new e$d(this));
          }
          if (this.I == null) {
             a uoa = new a();
             this.I = uoa;
             this.B.setAdapter(uoa);
          }
          this.S8();
          if (this.u != null && (!PatchProxy.applyVoid(objArray, this, uoe, "9") && this.v != null)) {
             f uof = new f(this);
             this.Q = uof;
             this.v.P4(uof);
          }
       }
    label_00bb :
       return;
    }
    public boolean W8(){
       a0 obj = PatchProxy.apply(null, this, e.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.O2;
       boolean b = (obj != null && obj.d())? true: false;
       return b;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new k());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_SIDE_BAR_MERCHANT_PAGE_LIST");
       this.t = this.s8(i.class);
       this.r = this.r8("LIVE_SIDE_BAR_FEED");
       this.s = (this.p.h != null)? this.r8("LIVE_SIDE_BAR_SWIPE_MOVEMENT"): this.r8("LIVE_SIDE_BAR_MOVEMENT");
       this.u = this.v8("LIVE_IS_SLIDE_CONTAINER", Boolean.class).booleanValue();
       this.v = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.w = this.q8(LiveBizParam.class);
       if (this.p.h != null) {
          d uod = this.L.p();
          this.A = uod;
          if (uod != null) {
             this.y = uod.e;
             this.z = uod.d;
          }
       }
       this.J = this.t8("LIVE_SQUARE_REPLACE_FEED_LIST_SERVICE");
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.K = "";
       this.s.D(this.getActivity());
       e tA = this.A;
       if (tA != null) {
          tA.e(this.s);
       }
       if (this.s.q() == this.S) {
          this.s.B(null);
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoe, "8")) {
          return;
       }
       if (this.I == null) {
          return;
       }
       p1 = false;
       if (this.q.i2() != null) {
          QPhoto qPhoto = this.q.i2();
          if (!PatchProxy.applyVoidOneRefs(qPhoto, this, uoe, "11")) {
             User mId = qPhoto.mEntity.mUser.mId;
             Iterator iterator = this.q.getItems().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   QPhoto qPhoto1 = iterator.next();
                   if (TextUtils.n(qPhoto1.mEntity.mUser.mId, mId)) {
                      this.q.remove(qPhoto1);
                      this.q.add(p1, qPhoto1);
                   }
                }
                if (!q.f(this.q.getItems()) && !TextUtils.n(this.q.getItem(p1).mEntity.mUser.mId, mId)) {
                   this.q.add(p1, qPhoto);
                }
             }
          }
       }
       this.I.W0(this.q.getItems());
       this.I.k0();
       if (!q.f(this.q.getItems())) {
          this.E.setVisibility(8);
       }else if(this.q.k2() != null){
          this.E.setText(this.q.k2());
       }else {
          this.E.setText(R.string.arg_RES_7f101f04);
       }
       this.E.setVisibility(p1);
       if (this.O != null) {
          b.a(this.I, this.B, this.getActivity(), new QPhoto(this.r));
          this.O = p1;
       }
       uoe = 4;
       if (this.q.j2() != null) {
          this.H.setVisibility(p1);
          this.H.setImageURI(this.q.j2());
       }else {
          this.H.setVisibility(uoe);
       }
       LiveMerchantChainPhotoFeedResponse$ChainBottomConfig uChainBottom = this.q.h2();
       if (uChainBottom != null && !TextUtils.x(uChainBottom.mMoreZoneText)) {
          this.N.setVisibility(p1);
          this.M.setText(uChainBottom.mMoreZoneText);
          this.N.setOnClickListener(new b(this, uChainBottom));
          e tp = this.p;
          LiveStreamFeedWrapper mEntity = tp.c.mEntity;
          ClientContent$LiveStreamPackage liveStreamPa = tp.Z2.a();
          if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(mEntity, liveStreamPa, Integer.valueOf(7), null, a.class, "5") && mEntity != null)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MERCHANT_MORE_RACE_BUTTON";
             u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(a.a(mEntity, liveStreamPa, 7)).setFeedLogCtx(r1.O0(mEntity)));
          }
       }else {
          this.N.setVisibility(uoe);
       }
       return;
    }
}
