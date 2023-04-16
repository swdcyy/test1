package h52.e;
import im8.g;
import k51.c;
import h52.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f12.d;
import f12.c;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import android.content.Context;
import com.kuaishou.live.core.basic.utils.e;
import android.view.View;
import com.kuaishou.live.core.show.closepage.audience.widget.LivePlayClosedFeedRecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h52.e$b;
import androidx.recyclerview.widget.RecyclerView$n;
import t02.a0;
import f42.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;
import o02.f;
import o02.e;
import p91.m;
import brd.t;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import h52.d;
import sfc.a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.show.closepage.audience.feed.recommand.LivePlayClosedV2RecommendLiveResponse;
import java.util.List;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import h52.j;
import ekd.m1;
import h52.h;
import java.util.Map;
import java.util.HashMap;
import m52.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e extends c implements g	// class@002c53
{
    public int p;
    public a0 q;
    public a r;
    public LivePlayClosedFeedRecyclerView s;
    public c t;
    public View u;
    public BaseFragment v;
    public LivePlayClosedV2RecommendLiveResponse w;
    public d x;
    public i y;
    public static String sLivePresenterClassName = "LivePlayClosedV2FeedPresenter";

    public void e(){
       super();
       this.p = 3;
       this.y = new e$a(this);
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       this.x = c.b(this.getActivity());
       NpaGridLayoutManager npaGridLayou = new NpaGridLayoutManager(this.getContext(), 2);
       if (!e.r(this.getActivity())) {
          this.x.S(this.getActivity(), this.s);
       }else {
          this.s.setLiveSlideContainer(this.x);
       }
       this.s.setLayoutManager(npaGridLayou);
       this.s.addItemDecoration(new e$b(this));
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          long l = f.e(this.q);
          long l1 = f.d(l);
          b.d0(LiveLogTag.LIVE_AUDIENCE_CLOSE, "requestRecommendLives", "maxDelayMs", Long.valueOf(l), "delayMs", Long.valueOf(l1));
          this.X7(e.a().k0(this.q.Z2.getLiveStreamId(), objArray).delaySubscription(l1, TimeUnit.MILLISECONDS).map(new e()).subscribe(new d(this), new a()));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.x.z(this.getActivity(), this.s);
       return;
    }
    public List P8(LivePlayClosedV2RecommendLiveResponse p0,int p1){
       ArrayList obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       List items = p0.getItems();
       int i = items.size();
       int i1 = 0;
       while (i1 < i && i1 < p1) {
          QPhoto qPhoto = items.get(i1);
          if (qPhoto != null) {
             j oj = new j();
             oj.f = qPhoto;
             oj.c = p0.mLlsid;
             oj.d = p0.mCursor;
             oj.b = p0.mLiveStreamEndType;
             if (!i1) {
                LivePlayClosedV2RecommendLiveResponse mRecommendLi = p0.mRecommendLiveAutoPlay;
                if (mRecommendLi != null) {
                   oj.e = mRecommendLi;
                }
             }
             obj.add(oj);
          }
          i1 = i1 + 1;
       }
       j oj1 = new j();
       oj1.a = 1;
       oj1.c = p0.mLlsid;
       oj1.b = p0.mLiveStreamEndType;
       oj1.g = new ArrayList();
       for (int i2 = 3; i2 < i; i2++) {
          oj1.g.add(items.get(i2));
       }
       obj.add(oj1);
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a22c3);
       this.u = m1.f(p0, 0x7f0a22b5);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new h());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.r = this.r8("LIVE_PLAY_CLOSED_V2_CALLBACK");
       this.v = this.r8("LIVE_PLAY_CLOSED_FRAGMENT");
       return;
    }
}
