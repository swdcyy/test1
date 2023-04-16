package com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$showItemKeyWords$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import bm9.a;

public final class AdSearchDoubleFeedClickRecommendPresenter$showItemKeyWords$1 extends Lambda implements l	// class@00155c
{
    public final int $index;
    public final String $keyWord;
    public final AdSearchDoubleFeedClickRecommendPresenter this$0;

    public void AdSearchDoubleFeedClickRecommendPresenter$showItemKeyWords$1(AdSearchDoubleFeedClickRecommendPresenter p0,String p1,int p2){
       this.this$0 = p0;
       this.$keyWord = p1;
       this.$index = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchDoubleFeedClickRecommendPresenter$showItemKeyWords$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       AdSearchDoubleFeedClickRecommendPresenter$showItemKeyWords$1 t$keyWord = this.$keyWord;
       a.m(t$keyWord);
       this.this$0.X8(t$keyWord, this.$index);
       AdSearchDoubleFeedClickRecommendPresenter$showItemKeyWords$1 tthis$0 = this.this$0;
       t$keyWord = this.$keyWord;
       Objects.requireNonNull(tthis$0);
       if (PatchProxy.applyVoidOneRefs(t$keyWord, tthis$0, AdSearchDoubleFeedClickRecommendPresenter.class, "18") || (tthis$0.getActivity() != null && !TextUtils.x(t$keyWord))) {
          AdSearchDoubleFeedClickRecommendPresenter r = tthis$0.r;
          if (r != null) {
             Activity activity = tthis$0.getActivity();
             a.m(activity);
             a.o(activity, "activity!!");
             a.m(t$keyWord);
             AdSearchDoubleFeedClickRecommendPresenter q = tthis$0.q;
             if (q == null) {
                a.S("mPhoto");
             }
             String searchSessio = q.getSearchSessionId();
             a.o(searchSessio, "mPhoto.searchSessionId");
             r.cg(activity, t$keyWord, searchSessio);
          }
       }
       return;
    }
}
