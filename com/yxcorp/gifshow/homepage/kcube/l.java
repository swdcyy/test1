package com.yxcorp.gifshow.homepage.kcube.l;
import im8.g;
import com.kwai.kcube.decorator.IContainerDecorator;
import gsa.l;
import psa.e0;
import io.reactivex.subjects.PublishSubject;
import gsa.k0;
import com.yxcorp.gifshow.homepage.kcube.l$a;
import com.yxcorp.gifshow.homepage.kcube.l$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import wq6.f;
import pr6.d;
import zq6.r;
import bo5.a;
import psa.x;
import zq6.p;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import hka.g;
import android.view.ViewGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import xf6.f;
import uv8.m1;
import br6.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import psa.w;
import psa.t;
import com.kwai.kcube.ext.MvpDecoratorViewHolder;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import psa.s;
import z1.a;
import msd.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import nsd.u;
import psa.b0;
import java.util.Map;
import java.util.HashMap;
import android.view.LayoutInflater;
import i2b.a;
import psa.u;
import psa.v;

public class l extends IContainerDecorator implements g	// class@00173d
{
    public final l h;
    public final e0 i;
    public final PublishSubject j;
    public d k;
    public final j0 l;
    public final b m;
    public final g n;
    public View o;

    public void l(){
       super();
       this.h = new l();
       this.i = new e0();
       this.j = PublishSubject.g();
       this.l = new k0(this);
       this.m = new l$a(this);
       this.n = new l$b(this);
    }
    public void f(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "1")) {
          return;
       }
       this.k = c.a(this.b());
       this.i.h(this.c(), this.b());
       if (!PatchProxy.applyVoid(objArray, this, ol, "2")) {
          this.h.b = this.e();
          this.h.c = this.l;
          this.c().e0().a(a.p, new x(this));
       }
       this.b().i3(this.m);
       this.b().k3(this.n);
       return;
    }
    public List g(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = l.class;
       a[] obj = PatchProxy.applyOneRefs(p0, this, ol, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0;
       if (!d.R() && (!f.g() && m1.g())) {
          a[] uoaArray = new a[]{this.i(p0)};
          return Lists.e(uoaArray);
       }else {
          obj = new a[2];
          obj[0] = this.i(p0);
          Object obj1 = PatchProxy.applyOneRefs(p0, this, ol, "7");
          if (obj1 != patchProxyRe) {
          }else {
             w ow = new w(this);
             obj1 = PatchProxy.applyTwoRefs(p0, ow, null, t.class, "1");
             if (obj1 != patchProxyRe) {
             }else {
                a.p(p0, "parent");
                a.p(ow, "callerContextProvider");
                FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
                uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
                ViewStub viewStub = new ViewStub(p0.getContext());
                viewStub.setId(R.id.view_stub_aegon_debug_info);
                viewStub.setLayoutResource(R.layout.arg_RES_7f0d0787);
                viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
                uFrameLayout.addView(viewStub);
                viewStub = new ViewStub(p0.getContext());
                viewStub.setId(R.id.view_stub_hodor_debug_info);
                viewStub.setLayoutResource(R.layout.arg_RES_7f0d07dc);
                viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
                uFrameLayout.addView(viewStub);
                MvpDecoratorViewHolder mvpDecorator = new MvpDecoratorViewHolder(uFrameLayout, 0, s.a, ow, null, false, null, 112, null);
                obj1 = new FrameLayout$LayoutParams(-1, -1);
             }
          }
          obj[1] = obj1;
          return Lists.e(obj);
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l.class, new b0());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       this.i.g();
       this.b().s3(this.m);
       this.b().t3(this.n);
       return;
    }
    public final a i(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = a.f(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d06cb, null);
       this.o = view.findViewById(0x7f0a3f6a);
       return new MvpDecoratorViewHolder(view, 0, new u(this), new v(this));
    }
}
