package com.yxcorp.gifshow.reminder.friend.find.friend.list.FriendTabFindFriendListFragment;
import mdc.b;
import wq6.k;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.reminder.friend.find.friend.list.FriendTabFindFriendListFragment$a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import fr6.a;
import wq6.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.relation.model.ExploreFriendParams;
import tkd.b;
import tkd.d;
import wu5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hdc.a;
import qrd.l1;
import rx5.c;
import f3b.o;
import hka.l;
import wq6.d;

public final class FriendTabFindFriendListFragment extends LazyInitSupportedFragment implements b, k	// class@001a94
{
    public PresenterV2 s;
    public BaseFragment t;
    public boolean u;
    public static final FriendTabFindFriendListFragment$a v;

    static {
       FriendTabFindFriendListFragment.v = new FriendTabFindFriendListFragment$a(null);
    }
    public void FriendTabFindFriendListFragment(){
       super();
       this.u = true;
    }
    public void E4(boolean p0,int p1){
       if (PatchProxy.isSupport(FriendTabFindFriendListFragment.class)) {
          PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, FriendTabFindFriendListFragment.class, "9");
       }
       return;
    }
    public void K9(){
       PatchProxy.applyVoid(null, this, FriendTabFindFriendListFragment.class, "10");
    }
    public int M(){
       return 1;
    }
    public a b0(){
       return j.a(this);
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FriendTabFindFriendListFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0537, p1, false);
       a.o(view, "inflate\(inflater, R.layo¡­ontent, container, false\)");
       return view;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendTabFindFriendListFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       this.t = d.a(0x6de3c81e).Ol(new ExploreFriendParams(true, true, this.o(), 100));
       e uoe = this.getChildFragmentManager().beginTransaction();
       FriendTabFindFriendListFragment tt = this.t;
       a.m(tt);
       uoe.v(R.id.fragment_container, tt);
       uoe.m();
       String str = "5";
       a uoa = PatchProxy.applyWithListener(null, this, FriendTabFindFriendListFragment.class, str);
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
          PatchProxy.onMethodExit(FriendTabFindFriendListFragment.class, str);
       }
       uoa.f(p0);
       Object[] objArray = new Object[true];
       objArray[0] = this;
       uoa.i(objArray);
       this.s = uoa;
       View[] viewArray = new View[true];
       viewArray[0] = p0;
       d.a(0x77cfa10c).Qa(this, viewArray);
       return;
    }
    public boolean lh(){
       return true;
    }
    public void mc(boolean p0,int p1){
       if (PatchProxy.isSupport(FriendTabFindFriendListFragment.class)) {
          PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, FriendTabFindFriendListFragment.class, "8");
       }
       return;
    }
    public String o(){
       String obj = PatchProxy.apply(null, this, FriendTabFindFriendListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u != null) {
          obj = "FRIEND_PYMK_PAGE";
       }else {
          obj = o.i(66);
          a.o(obj, "ProtoStringUtil.getPage\(¡­ackage.Page.FIND_FRIENDS\)");
       }
       return obj;
    }
    public void o7(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FriendTabFindFriendListFragment.class, "7")) {
          return;
       }
       FriendTabFindFriendListFragment tt = this.t;
       if (tt != null) {
          if (tt instanceof l) {
             objArray = tt;
          }
          if (objArray != null) {
             objArray.a();
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendTabFindFriendListFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.u = p0.getBoolean("KEY_FRIEND_PYMK_PAGE", true);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FriendTabFindFriendListFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       FriendTabFindFriendListFragment ts = this.s;
       if (ts != null) {
          ts.destroy();
       }
       this.s = null;
       return;
    }
    public d s8(){
       return j.b(this);
    }
    public d z5(){
       return j.c(this);
    }
}
