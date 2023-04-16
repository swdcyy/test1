package com.kwai.feature.component.SearchStateLogic;
import android.content.Context;
import com.kwai.feature.component.widget.SearchEditorLayout;
import java.lang.Object;
import java.util.ArrayList;
import iy5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.widget.SearchTipsLayout;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import ty5.d;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.component.SearchStateLogic$SearchActionImpl;
import com.kwai.feature.component.SearchStateLogic$d;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.component.SearchStateLogic$b;
import com.kwai.feature.component.SearchStateLogic$c;

public class SearchStateLogic	// class@0011e2
{
    public Context a;
    public int b;
    public ViewGroup c;
    public SearchEditorLayout d;
    public View e;
    public View f;
    public View g;
    public View h;
    public SearchStateLogic$c i;
    public e j;
    public List k;
    public d l;
    public boolean m;
    public boolean n;
    public boolean o;
    public static final int p = 2131376022;
    public static final int q = 2131376080;
    public static final int r = 2131376074;

    public void SearchStateLogic(Context p0,SearchEditorLayout p1){
       super();
       this.a = p0;
       this.d = p1;
       this.k = new ArrayList();
       this.j = new e();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SearchStateLogic.class, "3")) {
          return;
       }
       SearchStateLogic tc = this.c;
       if (tc == null) {
          return;
       }
       int b = this.j.g();
       this.m = b;
       if (b) {
          b = SearchStateLogic.q;
          if (!this.e(b)) {
             SearchTipsLayout searchTipsLa = new SearchTipsLayout(this.a);
             searchTipsLa.setId(b);
             this.f = searchTipsLa;
             tc.addView(searchTipsLa);
             searchTipsLa.setVisibility(8);
          }else if(this.m == null && this.e(SearchStateLogic.q)){
             tc.removeView(this.f);
          }
       }else {
          goto label_0038 ;
       }
       b = this.j.f();
       this.n = b;
       if (b) {
          b = SearchStateLogic.r;
          if (!this.e(b)) {
             View view = a.c(this.a, R.layout.arg_RES_7f0d1399, objArray);
             view.setId(b);
             tc.addView(view);
             this.g = view;
             view.setVisibility(8);
          }else if(this.n == null && this.e(SearchStateLogic.r)){
             tc.removeView(this.g);
          }
       }else {
          goto label_0070 ;
       }
       return;
    }
    public e b(){
       return this.j;
    }
    public SearchEditorLayout c(){
       return this.d;
    }
    public d d(){
       return this.l;
    }
    public final boolean e(int p0){
       SearchStateLogic searchStateL = SearchStateLogic.class;
       if (PatchProxy.isSupport(searchStateL)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, searchStateL, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       searchStateL = this.c;
       boolean b = (searchStateL != null && searchStateL.findViewById(p0) != null)? true: false;
       return b;
    }
    public void f(int p0){
       SearchStateLogic searchStateL = SearchStateLogic.class;
       if (PatchProxy.isSupport(searchStateL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, searchStateL, "11")) {
          return;
       }
       SearchStateLogic tb = this.b;
       if (!PatchProxy.isSupport(searchStateL) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tb), Integer.valueOf(p0), this, searchStateL, "13")) {
          this.b = p0;
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3 && p0 != 4) {
                   SearchStateLogic$SearchActionImpl.IDLE.doStateAction(this, p0);
                }else {
                   SearchStateLogic$SearchActionImpl.SEARCH_ACTION.doStateAction(this, p0);
                }
             }else {
                SearchStateLogic$SearchActionImpl.INPUT.doStateAction(this, p0);
             }
          }else {
             SearchStateLogic$SearchActionImpl.FOCUS.doStateAction(this, p0);
          }
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, SearchStateLogic.class, "10")) {
          return;
       }
       this.a();
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          SearchStateLogic$b uob = iterator.next();
          if (uob == null) {
             continue ;
          }else {
             uob.a(this.j);
          }
       }
       return;
    }
    public void h(boolean p0){
       SearchStateLogic searchStateL = SearchStateLogic.class;
       if (PatchProxy.isSupport(searchStateL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, searchStateL, "4")) {
          return;
       }
       searchStateL = this.c;
       if (searchStateL != null && this.e != null) {
          int p = SearchStateLogic.p;
          if (searchStateL.findViewById(p) != null) {
             searchStateL = this.e;
             int i = (p0)? 0: 8;
             searchStateL.setVisibility(i);
             searchStateL = this.i;
             if (searchStateL != null && p0) {
                searchStateL.a(p);
             }
          }
       }
    label_003a :
       return;
    }
    public void i(boolean p0){
       SearchStateLogic searchStateL = SearchStateLogic.class;
       if (PatchProxy.isSupport(searchStateL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, searchStateL, "5")) {
          return;
       }
       int i = 0;
       if (this.m != null) {
          searchStateL = this.f;
          if (searchStateL != null) {
             int i1 = (p0)? 0: 8;
             searchStateL.setVisibility(i1);
          }
       }
       if (this.n != null) {
          searchStateL = this.g;
          if (searchStateL != null) {
             if (!p0) {
                i = 8;
             }
             searchStateL.setVisibility(i);
             searchStateL = this.i;
             if (searchStateL != null && p0) {
                searchStateL.b(SearchStateLogic.r, this.d.getKeyword());
             }
          }
       }
       return;
    }
}
