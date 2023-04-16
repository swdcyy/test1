package com.yxcorp.gifshow.map.search.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.map.search.SearchFragment;
import com.yxcorp.map.fragment.ResortAndHistoryFragment;
import android.graphics.Rect;
import com.yxcorp.gifshow.map.search.a$b;
import com.yxcorp.gifshow.map.search.a$c;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import l6b.f;
import com.yxcorp.map.search.SearchEditorLayout$b;
import com.yxcorp.map.search.SearchEditorLayout;
import com.yxcorp.map.search.SearchStateLogic;
import iy5.e;
import java.lang.Boolean;
import android.widget.EditText;
import android.content.Context;
import android.widget.FrameLayout;
import com.yxcorp.utility.n;
import crd.b;
import lnc.b9;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import cjd.e;
import erd.o;
import l6b.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.model.response.CityRoamingSearchPresetWordsResponse$PresetWord;
import com.kwai.robust.PatchProxyResult;
import rm8.a;
import android.content.SharedPreferences;
import java.lang.System;
import java.lang.reflect.Type;
import km8.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.map.search.a$a;
import android.view.View$OnClickListener;
import g6b.c;

public final class a extends PresenterV2	// class@001cd7
{
    public final a A;
    public final d B;
    public SearchFragment C;
    public ResortAndHistoryFragment D;
    public c p;
    public final Rect q;
    public SearchEditorLayout r;
    public View s;
    public FrameLayout t;
    public TextView u;
    public b v;
    public LocationSuggestionFragment w;
    public SearchStateLogic x;
    public Set y;
    public boolean z;

    public void a(SearchFragment p0,ResortAndHistoryFragment p1){
       super();
       this.C = p0;
       this.D = p1;
       this.q = new Rect();
       this.A = new a$b(this);
       this.B = new a$c(this);
    }
    public static final View P8(a p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mStatusBarView");
       }
       return p0;
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          a tr1 = this.r;
          if (tr1 != null) {
             tr1.setEditorActionListener(new f(this));
          }
          tr1 = this.r;
          SearchStateLogic searchStateL = (tr1 != null)? tr1.getSearchStateLogic(): objArray;
          this.x = searchStateL;
          e uoe = (searchStateL != null)? searchStateL.b(): objArray;
          if (uoe != null) {
             uoe.h = true;
          }
          if (uoe) {
             uoe.g = 0x7f061e5e;
          }
          if (uoe) {
             uoe.i(true);
          }
          if (uoe) {
             uoe.k(true);
          }
          if (searchStateL != null) {
             searchStateL.g();
          }
          if (searchStateL != null) {
             searchStateL.l = this.B;
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          a tr = this.r;
          String str = "8";
          if (tr != null && (!PatchProxy.isSupport(SearchEditorLayout.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, tr, SearchEditorLayout.class, str))) {
             tr.b.requestFocusFromTouch();
             n.b0(tr.getContext(), tr.b, false);
          }
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, uoa, str)) {
             b9.a(this.v);
             Object obj = b.a(0x330163e);
             a.o(obj, "Singleton.get\(KwaiApiService::class.java\)");
             this.v = obj.getCityRoamingSearchPresetWords().map(new e()).subscribe(new g(this, true), Functions.d());
          }
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          return;
       }
       b9.a(this.v);
       a tC = this.C;
       if (tC != null) {
          objArray = tC.getActivity();
       }
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       objArray.l3(this.A);
       return;
    }
    public final CityRoamingSearchPresetWordsResponse$PresetWord R8(){
       String obj1;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       SharedPreferences obj = PatchProxy.apply(objArray, this, uoa, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.a;
       boolean b = false;
       if (!obj.getBoolean("last_trending_word_has_shown", b)) {
          obj1 = PatchProxy.apply(objArray, this, uoa, "13");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if((System.currentTimeMillis() - obj.getLong("last_show_trending_word_start_time", 0)) - (long)0x5265c00 > 0){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             b = true;
          }
       }
       CityRoamingSearchPresetWordsResponse$PresetWord presetWord = (b)? a.a(CityRoamingSearchPresetWordsResponse$PresetWord.class): objArray;
       if (!b || presetWord == null) {
          presetWord = CityRoamingSearchPresetWordsResponse$PresetWord.class;
          obj1 = obj.getString("last_show_preset_word", "null");
          if (obj1 != null && obj1 != "") {
             objArray = b.a(obj1, presetWord);
          }
          presetWord = objArray;
       }
       return presetWord;
    }
    public final void S8(boolean p0){
       CharSequence uCharSequenc;
       a tx1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "10")) {
          return;
       }
       if (!p0) {
          CityRoamingSearchPresetWordsResponse$PresetWord presetWord = this.R8();
          a tx = this.x;
          Object[] objArray = null;
          if (tx != null) {
             e uoe = tx.b();
             if (uoe != null) {
                uCharSequenc = uoe.b();
             label_002e :
                if (presetWord != null && (uCharSequenc != null && presetWord.mIsTopPresetWord != null)) {
                   Object[] objArray1 = PatchProxy.apply(objArray, this, uoa, "12");
                   if (objArray1 != patchProxyRe) {
                   }else {
                      a tr = this.r;
                      if (tr != null) {
                         objArray = Boolean.valueOf(tr.getGlobalVisibleRect(this.q));
                      }
                      objArray1 = objArray;
                   }
                   a.m(objArray1);
                   if (objArray1.booleanValue()) {
                      Object obj = PatchProxy.applyTwoRefs(uCharSequenc, presetWord, this, uoa, "11");
                      if (obj != patchProxyRe) {
                         presetWord = obj.booleanValue();
                      }else if(!TextUtils.x(uCharSequenc) && a.g(uCharSequenc, presetWord.mSearchWord)){
                         presetWord = true;
                      }else {
                         presetWord = false;
                      }
                      if (presetWord) {
                         a.e(true);
                         a.d(System.currentTimeMillis());
                      }
                   }
                }
             label_0086 :
                presetWord = this.R8();
                if (presetWord == null) {
                   tx1 = this.x;
                   if (tx1 != null) {
                      e uoe1 = tx1.b();
                      if (uoe1 != null) {
                         uoe1.j(this.n8(R.string.arg_RES_7f10057b));
                      }
                   }
                   tx1 = this.x;
                   if (tx1 != null) {
                      tx1.g();
                   }
                }else {
                   a tx2 = this.x;
                   if (tx2 != null) {
                      e uoe2 = tx2.b();
                      if (uoe2 != null) {
                         uoe2.j(presetWord.mSearchWord);
                      }
                   }
                   tx1 = this.x;
                   if (tx1 != null) {
                      tx1.g();
                   }
                }
             }
          }
          uCharSequenc = objArray;
          goto label_002e ;
       }
    label_00be :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.r = m1.f(p0, 0x7f0a37a6);
       this.t = m1.f(p0, 0x7f0a129a);
       this.u = m1.f(p0, 0x7f0a0644);
       p0 = m1.f(p0, R.id.status_bar_padding_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­.status_bar_padding_view\)");
       this.s = p0;
       View[] viewArray = new View[]{this.r};
       n.Z(0, viewArray);
       a tu = this.u;
       if (tu != null) {
          tu.setOnClickListener(new a$a(this));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("PHOTO_MAP_MAP_PAGE_STATE");
       return;
    }
}
