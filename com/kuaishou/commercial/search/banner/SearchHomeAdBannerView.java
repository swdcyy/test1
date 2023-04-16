package com.kuaishou.commercial.search.banner.SearchHomeAdBannerView;
import jm9.a;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView;
import android.content.Context;
import com.yxcorp.gifshow.plugin.impl.search.BannerEntity;
import k2b.e0;
import java.util.Collection;
import ekd.q;
import android.widget.FrameLayout;
import lnc.a1;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.commercial.search.banner.SearchHomeAdBannerView$a;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.commercial.search.banner.SearchHomeAdBannerView$b;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity;
import java.lang.Integer;
import yx.j0;
import java.lang.Throwable;
import jm9.b;

public class SearchHomeAdBannerView extends KwaiBannerView implements a	// class@00154b
{
    public final BannerEntity D;
    public final e0 E;
    public b F;

    public void SearchHomeAdBannerView(Context p0,BannerEntity p1,e0 p2){
       super(p0);
       this.D = p1;
       this.E = p2;
       if (q.f(p1.mBannerList)) {
          this.setVisibility(8);
          return;
       }else {
          this.setIndicatorMarginEnd(a1.e(8.00f));
          this.setIndicatorMarginBottomOrigin(a1.e(8.00f));
          this.setAspectRatio(2.69f);
          ArrayList uArrayList = PatchProxy.apply(null, this, SearchHomeAdBannerView.class, "4");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             for (int i = 0; i < this.D.mBannerList.size(); i++) {
                KwaiBannerView$b uob = new KwaiBannerView$b(null, null, null, null, String.valueOf(i));
                uArrayList.add(this.D.mBannerList.size());
             }
          }
          this.setBanner(uArrayList);
          BannerEntity duration = this.D.duration;
          if (duration <= null) {
             duration = 5;
          }
          this.setLoopInterval(((long)duration * 1000));
          this.setListener(new SearchHomeAdBannerView$a(this));
          return;
       }
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SearchHomeAdBannerView.class, "7")) {
          return;
       }
       this.n();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SearchHomeAdBannerView.class, "6")) {
          return;
       }
       this.m();
       return;
    }
    public RecyclerView$Adapter c(){
       Object obj = PatchProxy.apply(null, this, SearchHomeAdBannerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchHomeAdBannerView$b(this);
    }
    public int getLayoutResId(){
       return 0x7f0d134d;
    }
    public BannerItemEntity o(int p0){
       Object[] obj;
       Object[] objArray;
       if (PatchProxy.isSupport(SearchHomeAdBannerView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SearchHomeAdBannerView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == -1) {
          objArray = new Object[0];
          j0.c("SearchAdBannerView", "getSelectOrClickItemEntity position error", objArray);
          return null;
       }else if(q.f(this.D.mBannerList)){
          objArray = new Object[0];
          j0.c("SearchAdBannerView", "getSelectOrClickItemEntity data list error", objArray);
          return null;
       }else {
          try{
             return this.D.mBannerList.get(p0);
          }catch(java.lang.Exception e5){
             obj = new Object[v2];
             j0.d(v3, e5, obj);
             return v1;
          }
       }
    }
    public void setAdBannerListener(b p0){
       this.F = p0;
    }
}
