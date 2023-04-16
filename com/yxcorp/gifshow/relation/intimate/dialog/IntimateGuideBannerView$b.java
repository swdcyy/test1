package com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView;
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
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView$b$a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.List;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideConfig$BannerConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;

public class IntimateGuideBannerView$b extends RecyclerView$Adapter	// class@0018e1
{
    public final IntimateGuideBannerView e;

    public void IntimateGuideBannerView$b(IntimateGuideBannerView p0){
       this.e = p0;
       super();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, IntimateGuideBannerView$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getCount();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       IntimateGuideBannerView$b uob = IntimateGuideBannerView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       int i = -1;
       p1 = o5.b(this.e.getMBanners().get((p1 % this.e.getMBannerCount())).e, i);
       if (p1 != i && !q.f(this.e.D)) {
          p0.a.setPlaceHolderImage(R.drawable.arg_RES_7f082165);
          IntimateGuideConfig$BannerConfig mPic = this.e.D.get(p1).mPic;
          if (!TextUtils.x(mPic)) {
             p0.a.M(mPic, null);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       IntimateGuideBannerView$b uob = IntimateGuideBannerView$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new IntimateGuideBannerView$b$a(this, a.c(LayoutInflater.from(p0.getContext()), 0x7f0d0645, p0, false));
    }
}
