package dlc.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import dlc.m$a;
import android.view.View$OnClickListener;
import android.view.View;
import dlc.m$b;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.util.List;
import tkc.f;
import usd.q;
import sy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import xkc.a;
import io.reactivex.subjects.PublishSubject;
import alc.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout;
import brd.y;

public final class m extends PresenterV2	// class@00225c
{
    public f p;
    public f q;
    public PublishSubject r;
    public y s;
    public View t;
    public View u;
    public a v;
    public SlidePlayTrendingBottomLayout w;

    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "11")) {
          return;
       }
       m tu = this.u;
       if (tu == null) {
          a.S("mNextTrendingBar");
       }
       tu.setOnClickListener(new m$a(this));
       tu = this.t;
       if (tu == null) {
          a.S("mInnerNextTrendingIcon");
       }
       tu.setOnClickListener(new m$b(this));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, m.class, "12")) {
          return;
       }
       m tq = this.q;
       if (tq == null) {
          a.S("mCurrentPlayHotTrendingInfoReference");
       }
       TrendingInfo trendingInfo = tq.get();
       if (trendingInfo != null) {
          m tp = this.p;
          String str = "mTrendingFeedPageList";
          if (tp == null) {
             a.S(str);
          }
          int i = 0;
          int i1 = q.n(tp.p2().indexOf(trendingInfo), i);
          int i2 = i1 + 1;
          m tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          int i3 = tp1.p2().size() + i1;
          if (i2 <= i3) {
             m tp2 = this.p;
             while (tp2 == null) {
                a.S(str);
                break ;
                i2 = i2 + 1;
             }
             int i4 = i2 % tp2.p2().size();
             m tp3 = this.p;
             if (tp3 == null) {
                a.S(str);
             }
             TrendingInfo trendingInfo1 = tp3.p2().get(i4);
             if (!trendingInfo1.isSubTrending()) {
                m tv = this.v;
                String str1 = "mSlidePlayViewModel";
                if (tv == null) {
                   a.S(str1);
                }
                m tv1 = this.v;
                if (tv1 == null) {
                   a.S(str1);
                }
                i2 = tv.q(tv1.j());
                tv1 = this.v;
                if (tv1 == null) {
                   a.S(str1);
                }
                QPhoto currentPhoto = tv1.getCurrentPhoto();
                if (currentPhoto != null) {
                   m tp4 = this.p;
                   if (tp4 == null) {
                      a.S(str);
                   }
                   a.o(currentPhoto, "it");
                   int i5 = tp4.y2(currentPhoto);
                   m tp5 = this.p;
                   if (tp5 == null) {
                      a.S(str);
                   }
                   int i6 = tp5.x2(currentPhoto) - i5;
                   if ((i4 - i1) == 1) {
                      i2 = i2 + i6;
                      tp2 = this.v;
                      if (tp2 == null) {
                         a.S(str1);
                      }
                      if (i2 < tp2.Q()) {
                         tp2 = this.v;
                         if (tp2 == null) {
                            a.S(str1);
                         }
                         if (i6 == 1) {
                            i = true;
                         }
                         tp2.k(i2, i);
                      label_00e1 :
                         if (!PatchProxy.applyVoidOneRefs(trendingInfo1, null, a.class, "14")) {
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            i3 oi3 = i3.f();
                            oi3.d("wordId", trendingInfo1.mWordId);
                            oi3.d("trending_id", trendingInfo1.mId);
                            oi3.d("trending_name", trendingInfo1.mDesc);
                            oi3.c("trending_top", Integer.valueOf(trendingInfo1.mTop));
                            oi3.c("trending_feedcount", Integer.valueOf(trendingInfo1.mFeedCount));
                            oi3.d("popular_type", trendingInfo1.mPopularType);
                            oi3.d("trending_type", trendingInfo1.mTrendingType);
                            uElementPack.params = oi3.e();
                            uElementPack.name = "POPULAR_PAGE";
                            uElementPack.action2 = "NEXT_HOTLIST_BUTTON";
                            u1.u(1, uElementPack, null);
                         }
                      }
                   }
                   tp = this.r;
                   if (tp == null) {
                      a.S("mOnTrendingInfoItemClickPublishSubject");
                   }
                   tp.onNext(new a(trendingInfo1));
                   goto label_00e1 ;
                }
             }else if(i2 != i3){
                goto label_0142 ;
             }
          }
       }
    label_0146 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "10")) {
          return;
       }
       View view = m1.f(p0, R.id.trending_bottom_bar);
       a.o(view, "ViewBindUtils.bindWidget¡­R.id.trending_bottom_bar\)");
       this.w = view;
       view = m1.f(p0, R.id.inner_next_trending);
       a.o(view, "ViewBindUtils.bindWidget¡­R.id.inner_next_trending\)");
       this.t = view;
       p0 = m1.f(p0, R.id.next_trending_bar);
       a.o(p0, "ViewBindUtils.bindWidget¡­, R.id.next_trending_bar\)");
       this.u = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "9")) {
          return;
       }
       f obj = this.r8("TRENDING_FEED_PAGE_LIST");
       a.o(obj, "inject\(AccessIds.TRENDING_FEED_PAGE_LIST\)");
       this.p = obj;
       obj = this.r8("TRENDING_INFO_ITEM_CLICK_OBSERVABLE");
       a.o(obj, "inject\(TrendingAccessIds¡­FO_ITEM_CLICK_OBSERVABLE\)");
       this.r = obj;
       obj = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       a.o(obj, "injectRef\(TrendingAccess¡­T_PLAY_HOT_TRENDING_INFO\)");
       this.q = obj;
       Object obj1 = this.q8(a.class);
       a.o(obj1, "inject\(ISlidePlayProvider::class.java\)");
       this.v = obj1;
       obj1 = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVABLE");
       a.o(obj1, "inject\(TrendingAccessIds¡­G_INFO_CHANGE_OBSERVABLE\)");
       this.s = obj1;
       return;
    }
}
