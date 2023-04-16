package com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment;
import g06.q;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import y8c.g;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.music.widget.search.a;
import y8c.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment$c;
import ty5.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import java.util.Map;
import kqb.d0;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import lnc.a1;
import z8c.a;
import bld.b;
import android.content.Context;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import qvb.i;
import com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment$b;

public class SearchMusicSuggestFragment extends RecyclerFragment implements q	// class@0020ae
{
    public int F;
    public String G;
    public b H;
    public MusicSearchUiOption I;

    public void SearchMusicSuggestFragment(){
       super();
    }
    public void A5(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchMusicSuggestFragment.class, "9")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity().isFinishing()) {
          return;
       }
       if (TextUtils.n(p0, this.G)) {
          return;
       }
       this.G = p0;
       if (TextUtils.x(p0)) {
          if (this.g7() != null) {
             this.g7().M0();
             this.g7().k0();
             this.g7().r1("");
             this.g7().s1("");
          }
          return;
       }else {
          this.a();
          return;
       }
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SearchMusicSuggestFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchMusicSuggestFragment$c(this, this);
    }
    public void Gh(b p0){
       this.H = p0;
    }
    public boolean N5(){
       boolean b;
       SearchMusicSuggestFragment obj = PatchProxy.apply(null, this, SearchMusicSuggestFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.I;
       if (obj != null) {
          b = (!obj.getForbidSubFragmentLogPage())? true: false;
       }else {
          b = super.N5();
       }
       return b;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       boolean b;
       SearchMusicSuggestFragment obj = PatchProxy.apply(null, this, SearchMusicSuggestFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.I;
       if (obj != null) {
          b = (!obj.getForbidSubFragmentLogPage())? true: false;
       }else {
          b = super.Xg();
       }
       return b;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SearchMusicSuggestFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       SearchMusicSuggestFragment tI = this.I;
       tI = (tI != null && tI.isDarkMode())? 1: 0;
       int i = (tI)? 2: 0;
       return a.h(p0, 0x7f0d00f4, p1, false, i);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchMusicSuggestFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SearchMusicSuggestFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       SearchMusicSuggestFragment obj = PatchProxy.apply(null, this, SearchMusicSuggestFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!d0.b()) {
          obj = this.F;
          if (obj == null || obj == true) {
             return true;
          }
       }
       return super.i0();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchMusicSuggestFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = this.getArguments().getInt("enter_type", 0);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       SearchMusicSuggestFragment tI;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchMusicSuggestFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, SearchMusicSuggestFragment.class, "5") && p0 != null) {
          tI = this.I;
          if (tI != null && MusicSearchUiOption.Companion.a(tI.getMainColorId())) {
             p0.setBackgroundColor(a1.a(this.I.getMainColorId()));
          }
       }
       a uoa = new a(1, false, 1);
       if (this.F == 2) {
          b uob = new b();
          uob.v(this.getContext().getResources().getColor(R.color.arg_RES_7f0609be));
          uob.t(this.getContext().getResources().getDimension(R.dimen.arg_RES_7f070195));
          uob.s(DrawableCreator$Shape.Rectangle);
          uoa.o(uob.a());
       }
       tI = this.I;
       if (tI != null && MusicSearchUiOption.Companion.a(tI.getDividerColorId())) {
          uoa.h().setTint(a1.a(this.I.getDividerColorId()));
       }
       this.h0().addItemDecoration(uoa);
       this.h0().addOnScrollListener(new SearchMusicSuggestFragment$a(this));
       return;
    }
    public g vh(){
       a obj = PatchProxy.apply(null, this, SearchMusicSuggestFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = (this.F == 2)? true: false;
       obj = new a(b, this.H);
       obj.A = this.I;
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, SearchMusicSuggestFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchMusicSuggestFragment$b(this);
    }
}
