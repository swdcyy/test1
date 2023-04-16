package com.yxcorp.gifshow.trending.list.TrendingListAdapter;
import y8c.g;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.TrendingInfo;
import com.yxcorp.gifshow.trending.list.TrendingListAdapter$TrendingInfoTitle;
import lnc.a1;
import g9c.a;
import y8c.f;
import java.util.ArrayList;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import y8c.f$b;
import com.yxcorp.gifshow.trending.list.TrendingListAdapter$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Number;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import zkc.i;
import n3d.a;
import java.util.Map;
import zkc.k;
import zkc.e;
import zkc.v;
import zkc.u;
import ml8.c;

public class TrendingListAdapter extends g	// class@001daa
{
    public Map A;
    public a B;
    public PublishSubject C;
    public PublishSubject w;
    public PublishSubject x;
    public c y;
    public boolean z;

    public void TrendingListAdapter(){
       super();
       this.z = false;
    }
    public void W0(List p0){
       TrendingListAdapter trendingList = TrendingListAdapter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, trendingList, "5")) {
          return;
       }
       if (PatchProxy.applyVoidOneRefs(p0, this, trendingList, "6") || (p0 != null && !p0.isEmpty())) {
          int i = -1;
          int i1 = 0;
          while (i1 < p0.size()) {
             TrendingInfo trendingInfo = p0.get(i1);
             if (trendingInfo != null) {
                if (trendingInfo instanceof TrendingListAdapter$TrendingInfoTitle) {
                   break ;
                }else if(trendingInfo.isRisingTrending()){
                   i = i1;
                   break ;
                }
             }
             i1 = i1 + 1;
          }
          if (i >= 0) {
             TrendingListAdapter$TrendingInfoTitle trendingInfo1 = new TrendingListAdapter$TrendingInfoTitle();
             trendingInfo1.mTrendingTitle = a1.p(0x7f104da6);
             p0.add(i, trendingInfo1);
          }
       }
    label_0051 :
       super.W0(p0);
       return;
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       TrendingListAdapter trendingList = TrendingListAdapter.class;
       if (PatchProxy.isSupport(trendingList)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, trendingList, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.y};
       return j.a(obj);
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TrendingListAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TrendingListAdapter$a uoa = new TrendingListAdapter$a(this, p0, this.w, this.x, this.C);
       return obj;
    }
    public int f0(int p0){
       TrendingListAdapter trendingList = TrendingListAdapter.class;
       if (PatchProxy.isSupport(trendingList)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, trendingList, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       TrendingInfo trendingInfo = this.N0(p0);
       if (trendingInfo instanceof TrendingListAdapter$TrendingInfoTitle) {
          return 1;
       }else if(trendingInfo.isRisingTrending()){
          return 2;
       }else {
          trendingInfo = trendingInfo.mSubTrendingInfos;
          if (trendingInfo != null && trendingInfo.size() > 0) {
             return 3;
          }else {
             return 0;
          }
       }
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       TrendingListAdapter trendingList = TrendingListAdapter.class;
       if (PatchProxy.isSupport(trendingList)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, trendingList, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       int i = 0x7f0d162e;
       if (this.z != null) {
          if (p1 != 1) {
             view = a.i(p0, i);
             obj.U7(new i(this.B, this.A));
          }else {
             view = a.i(p0, R.layout.arg_RES_7f0d1630);
             obj.U7(new k());
          }
       }else if(p1 != 1){
          if (p1 != 2) {
             if (p1 != 3) {
                view = a.i(p0, i);
                obj.U7(new e());
             }else {
                view = a.i(p0, R.layout.arg_RES_7f0d1631);
                obj.U7(new e());
                obj.U7(new v());
             }
          }else {
             view = a.i(p0, R.layout.arg_RES_7f0d1634);
             obj.U7(new u());
          }
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d1630);
          obj.U7(new k());
       }
       return new f(view, obj);
    }
}
