package com.yxcorp.gifshow.prettify.makeup.o;
import f1c.e;
import f1c.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import android.widget.LinearLayout;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.makeup.n;
import g9c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.util.List;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.prettify.makeup.e0;
import java.lang.Boolean;
import f1c.n0;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import p0c.f;
import n1c.l;
import com.yxcorp.gifshow.prettify.makeup.o$a;
import hka.h;

public class o implements e	// class@001191
{
    public PrettifyConfigView a;
    public n b;
    public d c;

    public void o(d p0){
       super();
       this.c = p0;
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.a.g();
       this.a.l(0);
       this.a.setVisibility(8);
       return;
    }
    public MakeupPart c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       o obj = PatchProxy.apply(objArray, this, o.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, n.class, "6");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.N0(obj.k);
       }
       return obj1;
    }
    public void d(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "10")) {
          return;
       }
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, n.class, "4")) {
          tb.W0(p0.getParts());
          tb.g1(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "11")) {
          return;
       }
       ViewStub viewStub = m1.f(p0, R.id.makeup_parts_list_stub);
       if (viewStub != null) {
          viewStub.inflate();
       }
       this.a = m1.f(p0, 0x7f0a2a62);
       return;
    }
    public void e(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "5")) {
          return;
       }
       this.a.l(0);
       e0.d(this.c.g(), this.a);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, o.class, "9")) {
          return;
       }
       e0.b(this.c.n(), this.a);
       return;
    }
    public void g(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "1")) {
          return;
       }
       this.a.k(p0);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, o.class, "12")) {
          return;
       }
       this.a.f();
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       this.a.setBackBtnOnClickListener(new n0(this));
       return;
    }
    public void j(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "6")) {
          return;
       }
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, n.class, "7")) {
          tb.l0(tb.k);
       }
       return;
    }
    public void k(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "4")) {
          return;
       }
       this.b.g1(p0);
       return;
    }
    public void l(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "3")) {
          return;
       }
       if (p0 == null || p0.length <= 1) {
          this.a.setDividerViewVisibility(8);
       }else {
          this.a.setDividerViewVisibility(4);
       }
       return;
    }
    public View m(){
       return this.a;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, o.class, "7")) {
          return;
       }
       n on = new n(this.c.b(), this.c.e(), new o$a(this));
       this.b = on;
       this.a.setAdapter(on);
       return;
    }
}
