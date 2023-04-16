package com.yxcorp.gifshow.map.search.SearchFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.map.search.SearchFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.yxcorp.gifshow.map.search.SearchFragment$d;
import com.yxcorp.gifshow.map.search.SearchFragment$mSearchHistoryItemCallback$1;
import l6b.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.map.search.a;
import com.yxcorp.map.fragment.ResortAndHistoryFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.map.search.SearchEditorLayout;
import com.yxcorp.gifshow.map.search.SearchFragment$e;
import com.yxcorp.map.search.SearchEditorLayout$a;
import com.yxcorp.gifshow.map.search.SearchFragment$c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.Fragment;
import e3d.a;
import c3d.a;
import f07.b;
import g6b.c;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import h3d.b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import lnc.g2;

public final class SearchFragment extends BaseFragment implements g2$a	// class@001cd0
{
    public g2 j;
    public ResortAndHistoryFragment k;
    public SearchEditorLayout l;
    public a m;
    public SearchFragment$b n;
    public SearchFragment$c o;
    public final SearchFragment$d p;
    public final ISearchHistoryItemClickCallback q;
    public static final SearchFragment$a r;

    static {
       SearchFragment.r = new SearchFragment$a(null);
    }
    public void SearchFragment(){
       super(null, null, null, null, 15, null);
       this.p = super(this);
       this.q = new SearchFragment$mSearchHistoryItemCallback$1(this);
    }
    public static final a ch(SearchFragment p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("mSearchCallerContext");
       }
       return p0;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, SearchFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a(this, this.k));
       PatchProxy.onMethodExit(SearchFragment.class, "4");
       return obj;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SearchFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d050c, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       MapCenterInfo mCurrentCent;
       b a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       SearchEditorLayout searchEditor = m1.f(p0, R.id.search_layout);
       this.l = searchEditor;
       if (searchEditor != null) {
          searchEditor.setCancelBtnClickListener(new SearchFragment$e(this));
       }
       SearchFragment to = this.o;
       p1 = null;
       SearchFragment$c b = (to != null)? to.b: p1;
       ResortAndHistoryFragment resortAndHis = PatchProxy.applyOneRefs(b, p1, ResortAndHistoryFragment.class, "1");
       if (resortAndHis != PatchProxyResult.class) {
       }else {
          resortAndHis = new ResortAndHistoryFragment();
          if (!TextUtils.x(b)) {
             Bundle uBundle = new Bundle();
             uBundle.putString("tab_name", b);
             resortAndHis.setArguments(uBundle);
          }
       }
       this.k = resortAndHis;
       a uoa = new a();
       a uoa1 = new a();
       uoa1.a(new b(40.92f, 116.29f));
       a uoa2 = new a();
       this.m = uoa2;
       SearchFragment to1 = this.o;
       if (to1 != null) {
          uoa2.b = to1.a();
          c uoc = to1.a();
          if (uoc != null) {
             uoc = uoc.f;
             if (uoc != null) {
                mCurrentCent = uoc.mCurrentCenterLatLng;
             label_0095 :
                b uob = null;
                a = (mCurrentCent != null)? mCurrentCent.a: uob;
                if (mCurrentCent != null) {
                   uob = mCurrentCent.b;
                }
                uoa1.a(new b(a, uob));
             }
          }
          mCurrentCent = p1;
          goto label_0095 ;
       }
       SearchFragment tk = this.k;
       if (tk != null) {
          if (!PatchProxy.applyVoidOneRefs(uoa, tk, ResortAndHistoryFragment.class, "11")) {
             tk.j.d = uoa;
          }
          to = this.p;
          if (!PatchProxy.applyVoidOneRefs(to, tk, ResortAndHistoryFragment.class, "14")) {
             tk.j.h = to;
          }
          tk.n = this.q;
          if (!PatchProxy.applyVoidOneRefs(uoa1, tk, ResortAndHistoryFragment.class, "12")) {
             to.e = uoa1;
          }
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.v(R.id.history_content, tk);
          uoe.m();
       }
       if (!PatchProxy.applyVoid(p1, this, SearchFragment.class, "3")) {
          if (this.j == null) {
             this.j = new g2(this, this);
          }
          to = this.j;
          if (to != null) {
             Object[] objArray = new Object[2];
             objArray[0] = this;
             tk = this.m;
             if (tk == null) {
                a.S("mSearchCallerContext");
             }
             objArray[1] = tk;
             to.b(objArray);
          }
       }
       return;
    }
}
