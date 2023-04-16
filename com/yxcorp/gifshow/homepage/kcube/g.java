package com.yxcorp.gifshow.homepage.kcube.g;
import im8.g;
import com.kwai.kcube.decorator.IContainerDecorator;
import gsa.l;
import gsa.k0;
import psa.e0;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.homepage.kcube.g$a;
import com.yxcorp.gifshow.homepage.kcube.g$b;
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
import psa.f;
import zq6.p;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import hka.g;
import android.view.ViewGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import br6.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import i2b.a;
import com.kwai.kcube.ext.MvpDecoratorViewHolder;
import psa.d;
import psa.e;
import z1.a;
import msd.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import psa.j;
import java.util.Map;
import java.util.HashMap;

public class g extends IContainerDecorator implements g	// class@001733
{
    public final l h;
    public final j0 i;
    public final e0 j;
    public final PublishSubject k;
    public View l;
    public d m;
    public final b n;
    public final g o;

    public void g(){
       super();
       this.h = new l();
       this.i = new k0(this);
       this.j = new e0();
       this.k = PublishSubject.g();
       this.n = new g$a(this);
       this.o = new g$b(this);
    }
    public void f(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "1")) {
          return;
       }
       this.m = c.a(this.b());
       this.j.h(this.c(), this.b());
       if (!PatchProxy.applyVoid(objArray, this, og, "6")) {
          og = this.h;
          og.c = this.i;
          og.b = this.e();
          this.c().e0().a(a.p, new f(this));
       }
       this.b().i3(this.n);
       this.b().k3(this.o);
       return;
    }
    public List g(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       a[] obj = PatchProxy.applyOneRefs(p0, this, og, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new a[1];
       MvpDecoratorViewHolder mvpDecorator = PatchProxy.applyOneRefs(p0, this, og, "3");
       if (mvpDecorator != patchProxyRe) {
       }else {
          View view = a.f(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d06cb, null);
          this.l = view.findViewById(0x7f0a3f6a);
          mvpDecorator = new MvpDecoratorViewHolder(view, 0, new d(this), new e(this));
       }
       obj[0] = mvpDecorator;
       return Lists.e(obj);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new j());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       this.j.g();
       this.b().s3(this.n);
       this.b().t3(this.o);
       return;
    }
}
