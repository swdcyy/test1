package com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView;
import qp7.d;
import com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView$uploader$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView$recyclerScrolledLogger$2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import kotlin.jvm.internal.a;
import qp7.x0;
import cr7.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import tyc.k2;
import lnc.a1;
import tyc.j2;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$n;
import cr7.a;
import com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView$onBindData$$inlined$apply$lambda$1;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import cr7.e;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import cr7.f;
import cr7.g;
import t2b.b;
import cr7.c;
import cr7.d;
import t2b.b$e;
import t2b.b$c;

public final class IMQuickReplyElementView extends d	// class@0017e9
{
    public RecyclerView l;
    public a m;
    public final p n;
    public final p o;
    public HashMap p;

    public void IMQuickReplyElementView(){
       super();
       this.n = s.c(new IMQuickReplyElementView$uploader$2(this));
       this.o = s.c(new IMQuickReplyElementView$recyclerScrolledLogger$2(this));
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, IMQuickReplyElementView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.k()), R.layout.arg_RES_7f0d0618, this.m(), false);
       a.o(obj, "LayoutInflater.from\(cont¡­ayout, parentView, false\)");
       return obj;
    }
    public void q(x0 p0){
       a uoa = this;
       Object obj = p0;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(obj, uoa, IMQuickReplyElementView.class, "5")) {
       }else {
          a.p(obj, "viewModel");
          IMQuickReplyElementView l = uoa.l;
          if (l == null) {
             a.S("recyclerView");
          }
          int i = 0;
          l.setLayoutManager(new LinearLayoutManager(l.getContext(), i, i));
          k2 ok2 = new k2(a1.d(0x7f07034b), false, 0, 0, 0, 0, null, 126, null);
          l.addItemDecoration(v5);
          a uoa1 = new a();
          uoa1.f = new IMQuickReplyElementView$onBindData$$inlined$apply$lambda$1(uoa);
          uoa.m = uoa1;
          l.setAdapter(uoa1);
          l.setVisibility(i);
          e uoe = new e(uoa);
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(uoe, obj, oj, "1")) {
             a.p(uoe, "observer");
             obj.d.d(obj.c(), uoe);
          }
          f uof = new f(uoa);
          if (!PatchProxy.applyVoidOneRefs(uof, obj, oj, "3")) {
             a.p(uof, "observer");
             obj.e.d(obj.c(), uof);
          }
          g og = new g(uoa);
          if (!PatchProxy.applyVoidOneRefs(og, obj, oj, "5")) {
             a.p(og, "observer");
             obj.f.d(obj.c(), og);
          }
       }
       return;
    }
    public void r(){
       IMQuickReplyElementView iMQuickReply = IMQuickReplyElementView.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, iMQuickReply, "4")) {
          return;
       }
       View view = this.p().findViewById(R.id.quick_reply_recyclerview);
       a.o(view, "view.findViewById\(R.id.quick_reply_recyclerview\)");
       this.l = view;
       if (!PatchProxy.applyVoid(objArray, this, iMQuickReply, "7")) {
          b uob = this.v();
          IMQuickReplyElementView tl = this.l;
          if (tl == null) {
             a.S("recyclerView");
          }
          uob.d(tl, new c(this), new d(this));
          this.v().b();
       }
       return;
    }
    public final b v(){
       Object obj = PatchProxy.apply(null, this, IMQuickReplyElementView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
}
