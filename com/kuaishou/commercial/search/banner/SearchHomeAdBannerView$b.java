package com.kuaishou.commercial.search.banner.SearchHomeAdBannerView$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.commercial.search.banner.SearchHomeAdBannerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Integer;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import lnc.o5;
import yx.j0;
import com.yxcorp.gifshow.plugin.impl.search.BannerEntity;
import java.util.List;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$IconEntity;
import java.util.Collection;
import ekd.q;
import com.kuaishou.commercial.search.banner.SearchHomeAdBannerView$b$b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kuaishou.commercial.search.banner.SearchHomeAdBannerView$b$a;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import com.facebook.drawee.view.DraweeView;

public class SearchHomeAdBannerView$b extends RecyclerView$Adapter	// class@00154a
{
    public final SearchHomeAdBannerView e;

    public void SearchHomeAdBannerView$b(SearchHomeAdBannerView p0){
       this.e = p0;
       super();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, SearchHomeAdBannerView$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getCount();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       SearchHomeAdBannerView$b uob = SearchHomeAdBannerView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       p1 = p1 % this.e.getMBannerCount();
       int i = -1;
       int i1 = o5.b(this.e.getMBanners().get(p1).e, i);
       int i2 = 0;
       if (i1 == i) {
          Object[] objArray = new Object[i2];
          j0.c("SearchAdBannerView", "onBindViewHolder position error", objArray);
          return;
       }else {
          BannerItemEntity uBannerItemE = this.e.D.mBannerList.get(i1);
          BannerItemEntity mItemImg = uBannerItemE.mItemImg;
          if (mItemImg != null && !q.f(mItemImg.mUrl)) {
             p0.a.P(uBannerItemE.mItemImg.mUrl);
          }
          if (TextUtils.x(uBannerItemE.mPromotion)) {
             p0.b.setVisibility(8);
          }else {
             SearchHomeAdBannerView$b$b uob$b = p0;
             uob$b.b.setText(uBannerItemE.mPromotion);
             uob$b.b.setVisibility(i2);
          }
          p0.itemView.setOnClickListener(new SearchHomeAdBannerView$b$a(this, i1, p1));
          return;
       }
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       SearchHomeAdBannerView$b$b obj;
       SearchHomeAdBannerView$b uob = SearchHomeAdBannerView$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SearchHomeAdBannerView$b$b(this, a.c(LayoutInflater.from(p0.getContext()), 0x7f0d134e, p0, false));
       obj.a.setAspectRatio(2.69f);
       return obj;
    }
}
