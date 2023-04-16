package com.kwai.emotion.adapter.match.search.f;
import qvb.q;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.emotion.adapter.match.search.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotion.adapter.match.search.e;
import zj5.j;
import zj5.a;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import im8.c;
import qvb.i;
import y8c.g;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.emotion.adapter.match.search.f$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.emotion.adapter.match.search.g;
import android.view.ViewStub;
import qvb.a;
import android.widget.EditText;
import pk5.b;
import zj5.p;
import android.widget.TextView$OnEditorActionListener;
import zj5.n;
import java.util.concurrent.TimeUnit;
import brd.t;
import zj5.q;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import qvb.n0;
import java.lang.Throwable;
import qvb.p;
import android.text.Editable;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.widget.HorizontalScrollingRecyclerView;
import zj5.u;
import java.util.Map;
import java.util.HashMap;
import zj5.l;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;

public class f extends PresenterV2 implements q, g	// class@000d6d
{
    public b A;
    public EditText p;
    public j q;
    public l r;
    public PublishSubject s;
    public HorizontalScrollingRecyclerView t;
    public d u;
    public a v;
    public e w;
    public ViewStub x;
    public g y;
    public String z;

    public void f(){
       super();
       this.z = "";
       this.A = new f$a(this, 200, 10);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       this.w = new e(this.q.a(), this.q.b);
       ArrayList uArrayList = PatchProxy.apply(objArray, this, uof, "5");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(this);
          f tr = this.r;
          if (tr != null) {
             uArrayList.add(new c("SEARCH_GIF_INTERACT_CALLBACK", tr));
          }
       }
       a uoa = new a(uArrayList);
       this.v = uoa;
       uoa.q1(this.w);
       this.u = new d(this.v);
       this.t.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), 0, 0));
       this.t.setAdapter(this.u);
       this.t.addItemDecoration(new f$b(this));
       f tw = this.w;
       g og = new g(this.x, tw, this.u);
       this.y = og;
       tw.h(og);
       this.w.h(this);
       this.A.d(this.p);
       this.p.setOnEditorActionListener(new p(this));
       this.U7(new n(this.t, this.w));
       this.X7(this.s.throttleFirst(2000, TimeUnit.MILLISECONDS).subscribe(new q(this), Functions.d()));
       if (this.q.a()) {
          this.P8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       this.w.u1();
       this.A.e();
       return;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       String str = (this.p.getText().toString()).trim();
       this.z = str;
       this.w.i2(str);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a34da);
       this.x = m1.f(p0, 0x7f0a3f2b);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new u());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("EDIT_TEXT");
       this.q = this.r8("SEARCH_GIF_CONFIG");
       this.r = this.t8("SEARCH_GIF_INTERACT_CALLBACK");
       this.s = this.r8("SEARCH_GIF_REQUEST");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "8")) {
          return;
       }
       this.v.Y0(p0);
       if (this.r != null && this.w.isEmpty()) {
          this.r.a(this.z);
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, f.class, "9")) {
          return;
       }
       if (this.r != null && this.w.isEmpty()) {
          this.r.a(this.z);
       }
       return;
    }
}
