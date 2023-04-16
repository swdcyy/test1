package com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import dac.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mrd.a;
import dac.g;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hac.b0;
import y8c.t;
import kac.b;
import hbc.a;
import dac.f;
import android.view.View$OnClickListener;
import dac.b;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import xac.f;
import yt5.b;
import vt5.e;
import au5.b;
import com.kwai.framework.model.user.User;
import g7c.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import g7c.i;
import java.lang.Throwable;
import java.lang.Boolean;
import k2b.l;
import com.yxcorp.gifshow.ContactsEmptyException;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import brd.y;
import java.util.List;
import android.view.View;
import android.os.Bundle;
import android.content.Context;
import i2b.a;
import crd.b;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import dac.h;
import io.reactivex.internal.functions.Functions;
import erd.g;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$a;
import s2b.a;
import s2b.d;
import na5.e;
import com.kwai.component.fpsrecorder.biz.FpsSocialBizType;
import androidx.recyclerview.widget.RecyclerView;
import na5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dac.n;
import java.util.Map;
import com.kwai.framework.model.user.QCurrentUser;
import wwb.o;
import dac.d;
import qvb.a;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.c;
import qvb.i;
import java.util.Objects;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.yxcorp.gifshow.relation.explore.fragment.b;
import lnc.c3$a;
import lnc.c3;
import xwb.c;
import java.lang.StringBuilder;
import g9c.d;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.relation.explore.activity.ExploreFriendActivity;
import android.content.Intent;
import y8c.g;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$b;

public class ExploreFriendContactFragment extends RecyclerFragment implements e	// class@001800
{
    public View F;
    public f G;
    public a H;
    public b I;
    public boolean J;
    public boolean K;
    public b L;
    public c M;
    public int N;
    public a O;
    public static final int P;

    public void ExploreFriendContactFragment(){
       super();
       this.J = false;
       this.K = false;
       this.M = a.g();
       this.N = 0;
       this.O = new g(this);
    }
    public static void Gh(ExploreFriendContactFragment p0){
       if (p0.isAdded()) {
          super.u();
       }
       return;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ExploreFriendContactFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new b0());
       PatchProxy.onMethodExit(ExploreFriendContactFragment.class, "2");
       return obj;
    }
    public t Bh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ExploreFriendContactFragment.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       ExploreFriendContactFragment uExploreFrie = PatchProxy.apply(objArray, this, ExploreFriendContactFragment.class, "20");
       if (uExploreFrie != patchProxyRe) {
       }else if(this.H == null){
          a uoa = new a(0x7f0805df, 0x7f100805, 0x7f100811, 0x7f104242, 0x7f100dbd, new f(this));
          this.H = patchProxyRe;
       }
       uExploreFrie = this.H;
       return new b(this, uExploreFrie, true, this.I);
    }
    public boolean Dh(){
       return false;
    }
    public final void Hh(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendContactFragment.class, "21")) {
          return;
       }
       if (this.Ac() != null) {
          this.Ac().setEnabled(true);
       }
       this.a();
       return;
    }
    public final f Ih(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendContactFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.G == null) {
          this.G = new f();
       }
       return this.G;
    }
    public String Jh(){
       ExploreFriendContactFragment obj = PatchProxy.apply(null, this, ExploreFriendContactFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       String str = (obj == null)? "": obj.h2();
       return str;
    }
    public final b Kh(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendContactFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.L == null) {
          this.L = b.c().u00();
       }
       return this.L;
    }
    public void Lh(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendContactFragment.class, "24")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       PymkLogSender.reportClickUser(85, this.Jh(), p0, this.O);
       i.a(p0, 85, "to_profile");
       return;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(ExploreFriendContactFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ExploreFriendContactFragment.class, "17")) {
          return;
       }
       l.a("contact request error ", p1);
       if (p1 instanceof ContactsEmptyException) {
          a uoa = new a(null, 0, p1.getMessage(), null, 0, 0);
          super.M1(p0, new KwaiException(v10));
       }else {
          super.M1(p0, p1);
       }
       return;
    }
    public void O8(){
    }
    public boolean S0(){
       return false;
    }
    public void S2(Fragment p0){
    }
    public void Td(boolean p0){
       if (PatchProxy.isSupport(ExploreFriendContactFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ExploreFriendContactFragment.class, "19")) {
          return;
       }
       if (this.getParentFragment() instanceof TabHostFragment) {
          this.getParentFragment().Jh(2);
       }
       if (this.Kh().a(this.getActivity())) {
          this.Kh().b();
       }
       this.Hh();
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendContactFragment.class, "22")) {
          return;
       }
       super.a();
       this.N = this.N + 1;
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendContactFragment.class, "14")) {
          return;
       }
       super.c0();
       this.M.onNext(Boolean.FALSE);
       return;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, ExploreFriendContactFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.I);
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExploreFriendContactFragment.class, "6")) {
          return;
       }
       super.fh(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ExploreFriendContactFragment.class, "4") && this.F == null) {
          this.F = a.a(this.getContext(), 0x7f0d021c);
       }
       if (PatchProxy.apply(objArray, this, ExploreFriendContactFragment.class, "5") != PatchProxyResult.class) {
       }else {
          this.I.c.e().compose(c.c(this.m(), FragmentEvent.DESTROY)).subscribe(new h(this, this.I.c.c()), Functions.e);
       }
       l.b("doInitAfterViewCreated");
       this.C.h(new ExploreFriendContactFragment$a(this));
       new e(FpsSocialBizType.RELATION, "CONTACT", this, this.h0()).a();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExploreFriendContactFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ExploreFriendContactFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ExploreFriendContactFragment.class, new n());
       }else {
          obj.put(ExploreFriendContactFragment.class, null);
       }
       return obj;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendContactFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.i0() && (this.I.e() && o.c(QCurrentUser.me().getId())))? true: false;
       return b;
    }
    public boolean lh(){
       return true;
    }
    public boolean mh(){
       return true;
    }
    public String o(){
       return "FIND_FRIENDS_CONTACT";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendContactFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.I = d.a(this);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendContactFragment.class, "23")) {
          return;
       }
       super.onDestroy();
       ExploreFriendContactFragment tI = this.I;
       if (tI != null) {
          tI.c.j();
       }
       tI = this.G;
       if (tI != null && !q.f(tI.getItems())) {
          RxBus.f.b(new c(this.q().getItems().size()));
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendContactFragment.class, "18")) {
          return;
       }
       super.onResume();
       if (this.Kh().a(this.getActivity())) {
          if (this.getParentFragment() instanceof TabHostFragment && this.J == null) {
             this.J = true;
             TabHostFragment parentFragme = this.getParentFragment();
             String str = "contact";
             Objects.requireNonNull(parentFragme);
             if (!PatchProxy.applyVoidOneRefs(str, parentFragme, TabHostFragment.class, "19")) {
                parentFragme.Jh(parentFragme.v.c(str));
             }
          }
          if (this.I.e()) {
             this.Kh().b();
             this.Hh();
          }else if(this.K == null){
             this.I.b(false);
             this.K = true;
          }
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendContactFragment.class, "13")) {
          return;
       }
       c3.c(this.getView(), new b(this));
       if (!this.I.e()) {
          this.I.a.k();
       }
       this.M.onNext(Boolean.TRUE);
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ExploreFriendContactFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ExploreFriendContactFragment.class, "15")) {
          return;
       }
       super.v2(p0, p1);
       l.b("onFinishLoading getPageList\(\).getItems\(\).size "+this.q().getItems().size());
       if (p0) {
          if (q.f(this.q().getItems())) {
             this.ia().m1(this.F);
          }else if(!this.ia().U0(this.F)){
             ExploreFriendContactFragment tF1 = this.F;
             if (PatchProxy.applyVoidOneRefs(tF1, this, ExploreFriendContactFragment.class, "16") || (tF1 != null && tF1.getParent() instanceof ViewGroup)) {
                tF1.getParent().removeView(tF1);
             }
          label_0085 :
             this.ia().P0(this.F);
          }
          Object[] objArray = new Object[]{String.valueOf(this.q().getItems().size())};
          String str = this.getString(R.string.arg_RES_7f100803, objArray);
          ExploreFriendContactFragment tF = this.F;
          if (tF != null) {
             tF.findViewById(R.id.title).setText(str);
          }
          if (this.getActivity() instanceof ExploreFriendActivity) {
             this.getActivity().setResult(2049, new Intent().putExtra("contactsCount", this.q().getCount()));
          }
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendContactFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ExploreFriendContactFragment$b(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendContactFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Ih();
    }
}
