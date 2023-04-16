package e72.o;
import e72.a;
import qvb.f;
import java.lang.String;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import za2.w;
import o02.e;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import qvb.n0;
import e72.b;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListSkinConfig;
import java.util.List;
import com.kuaishou.live.core.show.doublelist.response.LiveDoubleListFeedResponse;
import la6.b;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListRefreshData;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import tkd.b;
import tkd.d;
import lm9.a;

public class o extends f implements a	// class@00268f
{
    public final int p;
    public final int q;
    public final String r;
    public List s;
    public LiveDoubleListSkinConfig t;
    public String u;

    public void o(int p0,String p1,int p2){
       super();
       this.p = p0;
       this.r = p1;
       this.q = p2;
    }
    public t I1(){
       t ot;
       b uob;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, oo, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.p == 4) {
          ot = PatchProxy.apply(objArray, this, oo, "3");
          if (ot != patchProxyRe) {
          }else {
             ot = e.m().e(this.h2()).map(new e()).subscribeOn(d.b).observeOn(d.a);
          }
          return ot;
       }else {
          ot = PatchProxy.apply(objArray, this, oo, "2");
          if (ot != patchProxyRe) {
          }else {
             int i = 8;
             if (this.K()) {
                uob = e.f();
                o tr = this.r;
                if (this.q != 1) {
                   i = 0;
                }
                ot = uob.c(tr, i).map(new e()).subscribeOn(d.b).observeOn(d.a);
             }else {
                uob = e.f();
                String str = this.h2();
                o tr1 = this.r;
                if (this.q != 1) {
                   i = 0;
                }
                ot = uob.b(str, tr1, i).map(new e()).subscribeOn(d.b).observeOn(d.a);
             }
          }
          return ot;
       }
    }
    public LiveDoubleListSkinConfig M0(){
       return this.t;
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public final String h2(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().mCursor;
       }
       return objArray;
    }
    public void i2(LiveDoubleListFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "4")) {
          return;
       }
       super.d2(p0, p1);
       LiveDoubleListFeedResponse mData = p0.mData;
       if (mData != null) {
          this.s = mData.mBanners;
          this.t = mData.mLiveDoubleListSkinConfig;
       }
       if (!TextUtils.isEmpty(p0.mPageTitle)) {
          this.u = p0.mPageTitle;
       }
       ArrayList uArrayList = new ArrayList();
       if (!q.f(p0.mFeeds)) {
          uArrayList.addAll(p0.mFeeds);
       }
       LiveDoubleListFeedResponse mData1 = p0.mData;
       if (mData1 != null && !q.f(mData1.mFeeds)) {
          uArrayList.addAll(p0.mData.mFeeds);
       }
       d.a(-1638991736).processFeedsListAsync(uArrayList);
       return;
    }
    public List t(){
       return this.s;
    }
}
