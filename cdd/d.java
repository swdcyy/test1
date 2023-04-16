package cdd.d;
import nfd.y3;
import cdd.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.result.a;
import com.yxcorp.plugin.search.SearchPage;
import java.util.List;
import java.util.ArrayList;
import nfd.y0;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import android.content.Context;
import androidx.fragment.app.Fragment;
import e7d.h;
import h8d.b;
import h8d.a;
import java.lang.String;
import y8c.g;
import cdd.e;
import zed.q;
import nfd.o1;
import a9c.e;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import y8c.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.plugin.search.result.LayoutStyle;
import add.g;
import g9c.a;
import com.yxcorp.plugin.search.entity.SearchItem;
import add.f;
import add.e;
import nfd.h0;
import com.yxcorp.gifshow.entity.QPhoto;
import nfd.g3;
import com.yxcorp.plugin.search.response.SearchCommodityItem;
import com.yxcorp.plugin.search.entity.CommodityLiveStatus;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.ViewGroup;
import android.view.View;
import z99.a;
import androidx.recyclerview.widget.RecyclerView;
import z99.a$a;

public class d extends i implements y3	// class@00052e
{
    public final SearchPage A;
    public final ArrayList B;
    public q C;
    public e D;
    public BaseFragment E;
    public int F;
    public int G;
    public int H;
    public final a y;
    public final a z;

    public void d(BaseFragment p0,a p1,int p2,SearchPage p3,List p4){
       super();
       ArrayList uArrayList = new ArrayList();
       this.B = uArrayList;
       this.F = -1;
       this.G = y0.x();
       this.H = y0.t();
       this.E = p0;
       this.y = p1;
       p1.u = this;
       uArrayList.add(p1);
       if (!q.f(p4)) {
          uArrayList.addAll(p4);
       }
       this.A = p3;
       b uob = a.a(p0.getContext(), p1.c, p3, p2);
       a uoa = new a(uob);
       this.z = uoa;
       this.n1("FEED_ITEM_VIEW_PARAM", uob);
       this.D = new e(p0, p3, p1, uoa);
       return;
    }
    public void d(BaseFragment p0,a p1,int p2,SearchPage p3,q p4,List p5){
       super(new o1());
       ArrayList uArrayList = new ArrayList();
       this.B = uArrayList;
       this.F = -1;
       this.G = y0.x();
       this.H = y0.t();
       this.E = p0;
       this.y = p1;
       p1.u = this;
       this.A = p3;
       uArrayList.add(p1);
       this.C = p4;
       if (p4 != null) {
          uArrayList.add(p4);
       }
       if (!q.f(p5)) {
          uArrayList.addAll(p5);
       }
       b uob = a.a(p0.getContext(), p1.c, p3, p2);
       a uoa = new a(uob);
       this.z = uoa;
       this.n1("FEED_ITEM_VIEW_PARAM", uob);
       this.D = new e(p0, p3, p1, uoa);
       return;
    }
    public void A(int p0){
       this.F = p0;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.l1(p0);
    }
    public int G(){
       return this.F;
    }
    public ArrayList a1(int p0,f p1){
       return this.B;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.f != null) {
          p0.f = this.E;
       }
       return this.D.e(this, this.f0(p0.b), p0);
    }
    public int f0(int p0){
       LayoutStyle obj;
       SearchItem mGoods;
       d tG;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = g.a(this.E);
       SearchItem searchItem = this.N0(p0);
       int i = (searchItem != null)? f.a(searchItem): e.b;
       d tC = this.C;
       int i1 = 0;
       p0 = (tC != null && tC.t.a(p0, searchItem))? 1: 0;
       if (i == e.l) {
          if (obj == LayoutStyle.FLOW) {
             return e.Y0;
          }else if(searchItem.mPhoto.isAd()){
             uod = this.A;
             SearchPage aGGREGATE = SearchPage.AGGREGATE;
             if (uod == aGGREGATE) {
                tC = this.H;
                if (tC == 1 || tC == 2) {
                   return e.Q;
                }
             }
             if (uod != aGGREGATE && p0) {
                return e.Q;
             }
          }else if(p0){
             return e.n;
          }
       }else if(i == e.E){
          if (g3.u(this.y.c, searchItem) && p0) {
             return e.F;
          }
       }else if(i == e.H){
          if (this.y.c != null && searchItem != null) {
             mGoods = searchItem.mGoods;
             if (mGoods != null && (mGoods.mStatus == CommodityLiveStatus.VIDEO.mStatus && mGoods.mPhoto != null)) {
                i1 = 1;
             }
          }
          if (i1) {
             return e.G;
          }
       }else {
          tC = 3;
          if (i == e.e) {
             if (searchItem.mPhoto.isVideoType()) {
                searchItem.mPhoto.setExtraSaveProgressTime(0xea60);
                if (obj == LayoutStyle.FLOW) {
                   return e.W0;
                }else {
                   tG = this.G;
                   if (tG == 1 || tG == 2) {
                      mGoods = searchItem.mPhoto;
                      if (mGoods != null && !mGoods.getStereoType()) {
                         return e.f;
                      }
                   }
                }
             }else if(searchItem.mPhoto.isImageType()){
                if (obj == LayoutStyle.FLOW) {
                   return e.X0;
                }else if(!r1.v3(searchItem.mPhoto.mEntity) && !r1.X2(searchItem.mPhoto.mEntity)){
                   tG = this.G;
                   if (tG == 1 || tG == tC) {
                      return e.g;
                   }
                }
             }
          }else if(i == e.O){
             if (searchItem.mPhoto.isVideoType() && searchItem.mPhoto.isAd()) {
                tG = this.H;
                if (tG == 1 || tG == tC) {
                   return e.P;
                }
             }
          }else if(i == e.p && obj == LayoutStyle.FLOW){
             return e.q;
          }
       }
       return i;
    }
    public f h1(ViewGroup p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.D.a(p0, p1);
    }
    public final void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       super.k1(p0);
       a.a(p0.itemView, R.id.play_view_container);
       return;
    }
    public final void l1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       super.l1(p0);
       a.b(p0.itemView, R.id.play_view_container);
       return;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(0x7f0a30e1), null, uoa, "1")) {
          a.a.c(p0, R.id.play_view_container);
       }
       super.u0(p0);
       return;
    }
    public final void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       a.c(p0, R.id.play_view_container);
       super.z0(p0);
       return;
    }
}
