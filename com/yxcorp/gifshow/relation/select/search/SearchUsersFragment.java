package com.yxcorp.gifshow.relation.select.search.SearchUsersFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.select.search.SearchUsersFragment$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import rbc.n;
import java.util.Set;
import ubc.b;
import rbc.a;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import y8c.g;
import wbc.m;
import qvb.i;
import java.lang.Boolean;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import tbc.d;
import i2b.a;
import java.util.Map;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import br8.c;
import br8.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.relation.select.search.SearchUsersFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.library.widget.refresh.RefreshLayout;
import wbc.l;
import com.kwai.library.widget.refresh.RefreshLayout$g;

public class SearchUsersFragment extends RecyclerFragment	// class@0019be
{
    public a F;
    public boolean G;
    public String H;
    public SelectUsersBundle I;
    public static final int J;

    public void SearchUsersFragment(){
       super();
       this.H = "";
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SearchUsersFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchUsersFragment$b(this, this);
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, SearchUsersFragment.class, "10")) {
          return;
       }
       if (!TextUtils.x(this.H)) {
          n on = this.Ih();
          if (!on.s1().isEmpty()) {
             SearchUsersFragment tF = this.F;
             if (tF != null) {
                tF.U5(new b(on.s1(), -1));
             }
             on.r1();
          }
       }
       this.H = "";
       return;
    }
    public final SelectUsersBundle Hh(){
       SelectUsersBundle obj = PatchProxy.apply(null, this, SearchUsersFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.I == null) {
          obj = new SelectUsersBundle();
          if (this.getArguments() != null && SerializableHook.getSerializable(this.getArguments(), "key_select_users_bundle") != null) {
             obj = SerializableHook.getSerializable(this.getArguments(), "key_select_users_bundle");
          }
          this.I = obj;
       }
       return this.I;
    }
    public n Ih(){
       Object obj = PatchProxy.apply(null, this, SearchUsersFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.g7();
    }
    public m Jh(){
       Object obj = PatchProxy.apply(null, this, SearchUsersFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.q();
    }
    public void Kh(boolean p0){
       this.G = p0;
    }
    public void Lh(a p0){
       this.F = p0;
    }
    public void Mh(String p0,boolean p1){
       if (PatchProxy.isSupport(SearchUsersFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SearchUsersFragment.class, "9")) {
          return;
       }
       if (!TextUtils.n(this.H, p0) && !TextUtils.x(p0)) {
          if (!p1) {
             if (this.Ih() != null) {
                this.Ih().w1(p0);
             }
             if (this.Jh() != null) {
                this.Jh().V1(p0);
                this.Jh().a();
             }
          }
          this.H = p0;
       }
       return;
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       Object obj = PatchProxy.apply(null, this, SearchUsersFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.Hh().isHalfScreen()) {
          return false;
       }
       return true;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SearchUsersFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.Hh().isHalfScreen() && d.c(this.Hh())) {
          return a.h(p0, 0x7f0d050f, p1, false, 1);
       }
       return a.g(p0, 0x7f0d050f, p1, false);
    }
    public g g7(){
       return this.Ih();
    }
    public int getLayoutResId(){
       return 0x7f0d050f;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchUsersFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SearchUsersFragment.class, null);
       return objectsByTag;
    }
    public boolean mh(){
       return true;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchUsersFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.h0().addItemDecoration(new c(this.Ih()));
       this.h0().addOnScrollListener(new SearchUsersFragment$a(this, p0));
       this.Ac().setOnRefreshListener(new l(this));
       return;
    }
    public i q(){
       return this.Jh();
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, SearchUsersFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       n on = new n(this.Hh().isHalfScreen(), this.G, this.F, d.c(this.I));
       on.x1(this.Hh().getLimitConditions());
       on.w1(this.H);
       return on;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, SearchUsersFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(this.Hh().getBizId(), this.H);
    }
}
