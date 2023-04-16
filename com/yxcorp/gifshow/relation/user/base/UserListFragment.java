package com.yxcorp.gifshow.relation.user.base.UserListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ecc.p0;
import y8c.t;
import com.yxcorp.gifshow.relation.user.base.UserListFragment$a;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import s2b.a;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import z8c.a;
import zbc.c;
import java.lang.Throwable;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import zbc.d;
import com.yxcorp.gifshow.relation.user.base.a;
import hka.l;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import o1.f;
import androidx.recyclerview.widget.RecyclerView$n;
import br8.c;
import y8c.g;
import com.yxcorp.gifshow.relation.user.adapter.e;
import br8.b;
import s2b.d;
import com.yxcorp.gifshow.relation.user.adapter.e$b;

public abstract class UserListFragment extends RecyclerFragment	// class@0019f8
{
    public UserListParam F;
    public a G;
    public PresenterV2 H;
    public static final int I;

    public void UserListFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, UserListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new p0());
       PatchProxy.onMethodExit(UserListFragment.class, "7");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, UserListFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UserListFragment$a(this, this);
    }
    public a Gh(UserListFragment p0,UserListParam p1){
       return null;
    }
    public abstract PresenterV2 Hh();
    public Map Ih(){
       Object obj = PatchProxy.apply(null, this, UserListFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImmutableMap.of("FRAGMENT", this, "userListParam", this.F);
    }
    public a Jh(){
       Object obj = PatchProxy.apply(null, this, UserListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(1, false, 1);
    }
    public c Kh(){
       return null;
    }
    public int Lh(){
       return 0;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(UserListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, UserListFragment.class, "10")) {
          return;
       }
       super.M1(p0, p1);
       if (p1 instanceof KwaiException) {
          KwaiException mErrorCode = p1.mErrorCode;
          if (mErrorCode == 63 || mErrorCode == 64) {
             this.getActivity().finish();
          }
       }
       return;
    }
    public d Mh(){
       Object obj = PatchProxy.apply(null, this, UserListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a;
    }
    public void Nh(int p0){
    }
    public boolean Oh(){
       return false;
    }
    public boolean S0(){
       Object obj = PatchProxy.apply(null, this, UserListFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.S1() ^ 0x01);
    }
    public int getLayoutResId(){
       return 0x7f0d051d;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(UserListFragment.class, null);
       return objectsByTag;
    }
    public boolean mh(){
       Object obj = PatchProxy.apply(null, this, UserListFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.S1();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserListFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.F = SerializableHook.getSerializable(this.getArguments(), "userListParam");
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, UserListFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       UserListFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserListFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, UserListFragment.class, "4")) {
          this.h0().setVerticalScrollBarEnabled(false);
          a uoa = this.Jh();
          this.G = uoa;
          uoa.o(f.c(this.getResources(), R.drawable.arg_RES_7f0807ca, null));
          this.h0().addItemDecoration(this.G);
          this.h0().addItemDecoration(new c(this.g7()));
          uoa = this.Gh(this, this.F);
          if (uoa != null) {
             this.C.h(uoa);
          }
          PresenterV2 presenterV2 = this.Hh();
          this.H = presenterV2;
          presenterV2.f(p0);
          Object[] objArray = new Object[]{this.Ih()};
          this.H.i(objArray);
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, UserListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e uoe = new e(new e$b(this));
       uoe.t1(this.Oh());
       return uoe;
    }
}
