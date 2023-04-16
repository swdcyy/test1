package com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment;
import g7c.b;
import com.yxcorp.gifshow.relation.user.base.UserListFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment$a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import s2b.a;
import com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gcc.a;
import zbc.c;
import com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment$b;
import java.lang.Throwable;
import java.lang.Boolean;
import android.view.View;
import androidx.fragment.app.Fragment;
import ji5.a;
import ii5.b;
import com.kwai.framework.model.user.User;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import y8c.s;
import g9c.a;
import ekd.s0;
import qvb.i;
import xac.j;
import qvb.n0;
import com.yxcorp.gifshow.model.response.UsersResponse;
import java.lang.Integer;
import com.kwai.framework.model.user.UserExtraInfo;
import tkd.b;
import tkd.d;
import nx5.c;
import hcc.j0;
import hcc.h;
import rq4.r;
import rq4.n;
import lnc.i3;
import rq4.m;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.q;
import brd.t;
import ccc.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wkd.b;
import com.yxcorp.gifshow.pymk.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.relation.user.adapter.e;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import com.yxcorp.gifshow.relation.user.adapter.c;

public class FollowerListFragment extends UserListFragment implements b	// class@0019fd
{
    public b J;
    public int K;
    public b L;
    public static final int M;

    public void FollowerListFragment(){
       super();
       this.K = 0;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, FollowerListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FollowerListFragment$a(this, this);
    }
    public a Gh(UserListFragment p0,UserListParam p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, FollowerListFragment.class, "14");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new FollowerListFragment$c(this);
    }
    public PresenterV2 Hh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, FollowerListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a(R.string.arg_RES_7f10103c));
       PatchProxy.onMethodExit(FollowerListFragment.class, "2");
       return obj;
    }
    public c Kh(){
       Object obj = PatchProxy.apply(null, this, FollowerListFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FollowerListFragment$b(this);
    }
    public int Lh(){
       return this.K;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(FollowerListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, FollowerListFragment.class, "10")) {
          return;
       }
       super.M1(p0, p1);
       if (this.getView() != null) {
          a.a(p1, this.getView().findViewById(R.id.search_result), "/rest/n/relation/fol?fan", "relation");
       }
       this.L.c(false);
       return;
    }
    public void Nh(int p0){
       this.K = p0;
    }
    public boolean Oh(){
       return true;
    }
    public int P5(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowerListFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = s.b(this.h0(), this.g7());
       int i1 = 0;
       while (true) {
          if (i1 > i) {
             return -1;
          }
          User user = this.g7().N0(i1);
          if (user != null && s0.a(user.getId(), p0.getId())) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       p0.mPosition = i1;
       return i1;
    }
    public String Ph(){
       Object[] objArray = null;
       UsersResponse obj = PatchProxy.apply(objArray, this, FollowerListFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q().L0();
       if (obj != null) {
          objArray = obj.mPrsid;
       }
       return objArray;
    }
    public n0 Qh(){
       Object obj = PatchProxy.apply(null, this, FollowerListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(this.F.mUserId, 2);
    }
    public void Rh(User p0,int p1){
       if (PatchProxy.isSupport(FollowerListFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FollowerListFragment.class, "11")) {
          return;
       }
       User mExtraInfo = p0.mExtraInfo;
       if (mExtraInfo != null && mExtraInfo.mRecoTextInfo != null) {
          d.a(0x37332120).vy(p0, 7);
       }
       j0.m(p0, p1, null, this.F.mNoticeType, this.getPage());
       p1 = (p0.mNewest != null)? 71: 40;
       String str = this.Ph();
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), str, p0, Boolean.FALSE, null, h.class, "4")) {
          r or = h.a(p1, str);
          or.d = 1;
          n on = new n();
          on.a = p0.getId();
          on.d = p0.mPosition + 1;
          on.f = 1;
          on.g = p0.mNewest;
          on.h = p0.mFollowFromPage;
          or.g = on;
          i3 oi3 = i3.f();
          oi3.c("IS_RESEARCH", Integer.valueOf(0));
          p0.i = oi3.e();
          PymkLogSender.sendClientLog(or);
       }
       return;
    }
    public boolean S0(){
       return false;
    }
    public void Sf(User p0,int p1){
       if (PatchProxy.isSupport(FollowerListFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FollowerListFragment.class, "16")) {
          return;
       }
       p1 = (p0.mNewest != null)? 71: 40;
       String str = this.Ph();
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), str, p0, null, h.class, "5")) {
          r or = h.a(p1, str);
          int i = (p0.isFollowingOrFollowRequesting())? 2: 10;
          or.d = i;
          n on = new n();
          on.a = p0.getId();
          on.d = p0.mPosition + 1;
          on.g = p0.mNewest;
          on.h = p0.mFollowFromPage;
          p0 = p0.mPage;
          if (p0 != null) {
             int i1 = -1;
             switch (p0.hashCode()){
                 case 0xed8e89a9:
                   if (p0.equals("profile")) {
                      i1 = 0;
                   }
                   break;
                 case 0x32b0ec:
                   if (p0.equals("live")) {
                      i1 = 1;
                   }
                   break;
                 case 0x3559df:
                   if (p0.equals("reco")) {
                      i1 = 2;
                   }
                   break;
                 case 0x65b3e32:
                   if (p0.equals("photo")) {
                      i1 = 3;
                   }
                   break;
                 default:
             }
             switch (i1){
                 case 0:
                   on.f = 2;
                   break;
                 case 1:
                   on.f = 4;
                   break;
                 case 2:
                   on.f = 1;
                   break;
                 case 3:
                   on.f = 3;
                   break;
                 default:
                   on.f = 0;
             }
          }else {
             on.f = 1;
          }
          or.g = on;
          PymkLogSender.sendClientLog(or);
       }
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, FollowerListFragment.class, "6")) {
          return;
       }
       super.c0();
       FollowerListFragment tL = this.L;
       if (tL != null) {
          tL.b();
       }
       return;
    }
    public int f(){
       return 4;
    }
    public int getLayoutResId(){
       return 0x7f0d04c7;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowerListFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FollowerListFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 86;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowerListFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.J = RxBus.f.f(q.class).subscribe(new a(this));
       this.L = new b();
       if (this.K0()) {
          this.L.a(this.o());
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FollowerListFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       b.a(0x7f4e4530).b(this);
       FollowerListFragment tJ = this.J;
       if (tJ != null) {
          tJ.dispose();
       }
       this.L.b();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowerListFragment.class, "15")) {
          return;
       }
       super.onViewCreated(p0, p1);
       b.a(0x7f4e4530).a(this);
       RecyclerView recyclerView = this.h0();
       recyclerView.removeItemDecorationAt((recyclerView.getItemDecorationCount() - 2));
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, FollowerListFragment.class, "5")) {
          return;
       }
       super.u();
       FollowerListFragment tL = this.L;
       if (tL != null) {
          tL.a(this.o());
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       User mNewest;
       if (PatchProxy.isSupport(FollowerListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, FollowerListFragment.class, "9")) {
          return;
       }
       super.v2(p0, p1);
       List items = this.q().getItems();
       for (int i = 0; i < items.size(); i = i + 1) {
          items.get(i).mPosition = i;
       }
       if (p0 && this.q() instanceof j) {
          this.K = this.q().g1();
       }
       if (!q.f(items)) {
          mNewest = items.get(0).mNewest;
       }
       mNewest.w = false;
       QCurrentUser.me().setFollowerCount(items.size()).commitChanges();
       if (this.getView() != null) {
          a.b(this.getView().findViewById(R.id.search_result));
       }
       this.L.c(true);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, FollowerListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = new c(new e$b(this), this.F.mUserId);
       uoc.t1(true);
       return uoc;
    }
    public i yh(){
       return this.Qh();
    }
}
