package com.yxcorp.gifshow.relation.select.search.SearchBarFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment$a$a;
import android.text.TextWatcher;
import android.widget.EditText;
import wbc.f;
import android.widget.TextView$OnEditorActionListener;
import wbc.e;
import android.view.View$OnFocusChangeListener;
import wbc.g;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import java.lang.Exception;
import com.yxcorp.gifshow.relation.select.search.a;
import java.lang.Runnable;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import wbc.b;
import wbc.d;
import ekd.m1;
import mrd.c;

public class SearchBarFragment$a extends PresenterV2	// class@0019b2
{
    public View p;
    public View q;
    public EditText r;
    public ImageView s;
    public View t;
    public TextView u;
    public c v;
    public final SearchBarFragment w;

    public void SearchBarFragment$a(SearchBarFragment p0){
       this.w = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SearchBarFragment$a.class, "3")) {
          return;
       }
       this.r.addTextChangedListener(new SearchBarFragment$a$a(this));
       this.r.setOnEditorActionListener(new f(this));
       this.r.setOnFocusChangeListener(new e(this));
       this.X7(this.v.subscribe(new g(this), Functions.e));
       if (!TextUtils.x(this.w.l.getSearchText())) {
          this.r.setText(this.w.l.getSearchText());
          this.S8();
       }else {
          this.R8();
       }
       return;
    }
    public void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarFragment$a.class, "5")) {
          return;
       }
       if (p0 != null) {
          try{
             this.getActivity().getSystemService("input_method").hideSoftInputFromWindow(p0.getWindowToken(), 2);
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, SearchBarFragment$a.class, "6")) {
          return;
       }
       this.P8(this.r);
       this.q.postDelayed(new a(this), 100);
       return;
    }
    public final void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SearchBarFragment$a.class, "4")) {
          return;
       }
       this.r.setHint(R.string.arg_RES_7f104534);
       this.q.setOnClickListener(objArray);
       this.u.setVisibility(8);
       this.r.setVisibility(0);
       this.s.setVisibility(0);
       this.t.setVisibility(8);
       this.t.setOnClickListener(new b(this));
       this.p.setVisibility(0);
       this.p.setOnClickListener(new d(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarFragment$a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a37a6);
       this.u = m1.f(p0, 0x7f0a1404);
       this.p = m1.f(p0, 0x7f0a064d);
       this.t = m1.f(p0, 0x7f0a073b);
       this.s = m1.f(p0, 0x7f0a379e);
       this.r = m1.f(p0, 0x7f0a0ca8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SearchBarFragment$a.class, "1")) {
          return;
       }
       this.v = this.r8("SELECT_USERS_SWITCH_TO_SEARCH_SUBJECT");
       return;
    }
}
