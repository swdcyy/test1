package com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.LinkedHashSet;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gka.h;
import java.lang.CharSequence;
import android.widget.EditText;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.util.Set;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$d;
import java.lang.Boolean;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import wbc.a;
import java.util.Collection;
import qvb.n0;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$a;
import android.view.View$OnClickListener;
import wbc.i;
import android.view.View$OnKeyListener;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$b;
import android.text.TextWatcher;
import wbc.h;
import android.view.View$OnFocusChangeListener;
import qvb.i;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$e;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$c;

public class SearchBarPreviewFragment extends RecyclerFragment implements d	// class@0019bb
{
    public EditText F;
    public ImageView G;
    public boolean H;
    public SearchBarPreviewFragment$c I;
    public Set J;
    public SearchBarPreviewFragment$d K;
    public a L;
    public NpaLinearLayoutManager M;
    public static final int N;

    public void SearchBarPreviewFragment(){
       super();
       this.H = false;
       this.J = new LinkedHashSet();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SearchBarPreviewFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, SearchBarPreviewFragment.class, "3")) {
          return;
       }
       this.F.setText("");
       return;
    }
    public void Hh(ContactTargetItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarPreviewFragment.class, "10")) {
          return;
       }
       this.J.remove(p0);
       SearchBarPreviewFragment tK = this.K;
       if (tK != null) {
          tK.a(p0, false);
       }
       return;
    }
    public void Ih(SearchBarPreviewFragment$d p0){
       this.K = p0;
    }
    public void Jh(boolean p0){
       if (PatchProxy.isSupport(SearchBarPreviewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchBarPreviewFragment.class, "6")) {
          return;
       }
       if (this.H != p0) {
          this.g7().k0();
          this.M.scrollToPosition((this.g7().getItemCount() - 1));
       }
       this.H = p0;
       return;
    }
    public void Kh(a p0){
       this.L = p0;
    }
    public void Lh(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarPreviewFragment.class, "2")) {
          return;
       }
       this.J.clear();
       this.Jh(false);
       if (p0 != null && p0.size() > 0) {
          this.J.addAll(p0);
       }
       SearchBarPreviewFragment tI = this.I;
       if (tI != null) {
          tI.a();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarPreviewFragment.class, "1")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a0e9c);
       this.G = m1.f(p0, 0x7f0a0e9f);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0f56;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchBarPreviewFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SearchBarPreviewFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchBarPreviewFragment.class, "4")) {
          return;
       }
       this.doBindView(p0);
       super.onViewCreated(p0, p1);
       this.F.setOnClickListener(new SearchBarPreviewFragment$a(this));
       this.F.setOnKeyListener(new i(this));
       this.F.addTextChangedListener(new SearchBarPreviewFragment$b(this));
       this.F.setOnFocusChangeListener(new h(this));
       return;
    }
    public int qh(){
       return 0x7f0a34db;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SearchBarPreviewFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SearchBarPreviewFragment.class, "11")) {
          return;
       }
       super.v2(p0, p1);
       int count = this.q().getCount();
       this.M.scrollToPosition((count - 1));
       if (count > 0) {
          this.G.setVisibility(8);
       }else {
          this.G.setVisibility(0);
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, SearchBarPreviewFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchBarPreviewFragment$e(this);
    }
    public RecyclerView$LayoutManager xh(){
       NpaLinearLayoutManager obj = PatchProxy.apply(null, this, SearchBarPreviewFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NpaLinearLayoutManager(this.getContext(), 0, 0);
       this.M = obj;
       return obj;
    }
    public i yh(){
       SearchBarPreviewFragment$c obj = PatchProxy.apply(null, this, SearchBarPreviewFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SearchBarPreviewFragment$c(this);
       this.I = obj;
       return obj;
    }
}
