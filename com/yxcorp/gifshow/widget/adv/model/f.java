package com.yxcorp.gifshow.widget.adv.model.f;
import java.lang.Cloneable;
import com.yxcorp.gifshow.widget.adv.model.b;
import com.yxcorp.gifshow.widget.adv.model.c;
import com.yxcorp.gifshow.widget.adv.model.d;
import com.yxcorp.gifshow.widget.adv.model.e;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;
import lnc.a1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import androidx.core.content.ContextCompat;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.yxcorp.gifshow.v3.editor.j;
import uxb.p;
import uxb.l;
import uxb.k;
import uxb.u;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import mca.a;
import android.content.res.Resources;
import java.lang.Boolean;
import wba.d0;

public class f implements Cloneable	// class@00192e
{
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;
    public final List g;
    public final List h;
    public final ITimelineView$d i;
    public int j;
    public int k;
    public boolean l;
    public static int m = 0;
    public static int n = 10000;
    public static final a$a o;
    public static final a$a p;
    public static final a$a q;
    public static final a$b r;
    public static final ITimelineView$IRangeView$a$a s;
    public static final ITimelineView$IRangeView$a$a t;
    public static final ITimelineView$IRangeView$a$a u;
    public static final ITimelineView$IRangeView$a$a v;
    public static final ITimelineView$IRangeView$a$a w;

    static {
       f.o = b.a;
       f.p = c.a;
       f.q = d.a;
       f.r = e.a;
       ITimelineView$IRangeView$a$a iRangeView$a = new ITimelineView$IRangeView$a$a(a1.a(0x7f0604c8), a1.a(0x7f0604c8), a1.a(0x7f0604c8), a1.a(0x7f0604c8), 0);
       f.s = v0;
       ITimelineView$IRangeView$a$a iRangeView$a1 = new ITimelineView$IRangeView$a$a(a1.a(0x7f060514), a1.a(0x7f060514), a1.a(0x7f060514), a1.a(0x7f060514), 0);
       f.t = v0;
       iRangeView$a = new ITimelineView$IRangeView$a$a(ContextCompat.getColor(a.a().a(), 0x7f061f16), ContextCompat.getColor(a.a().a(), 0x7f061f16), ContextCompat.getColor(a.a().a(), 0x7f061f16), ContextCompat.getColor(a.a().a(), 0x7f061f16), 0);
       f.u = v0;
       ITimelineView$IRangeView$a$a iRangeView$a2 = new ITimelineView$IRangeView$a$a(ContextCompat.getColor(a.a().a(), 0x7f061f17), ContextCompat.getColor(a.a().a(), 0x7f061f17), ContextCompat.getColor(a.a().a(), 0x7f061f17), ContextCompat.getColor(a.a().a(), 0x7f061f17), 0);
       f.v = v0;
       iRangeView$a = new ITimelineView$IRangeView$a$a(a1.a(0x7f062049), a1.a(0x7f062049), a1.a(0x7f062049), a1.a(0x7f062049), 0);
       f.w = v0;
    }
    public void f(boolean p0){
       Integer integer;
       super();
       Integer[] integerArray = new Integer[]{integer};
       integer = Integer.valueOf(0);
       this.b = Lists.e(integerArray);
       Integer[] integerArray1 = new Integer[]{integer};
       this.c = Lists.e(integerArray1);
       this.d = new ArrayList();
       this.e = new ArrayList();
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.i = new ITimelineView$d();
       this.j = 0x3fffffff;
       this.k = 0xc0000000;
       this.l = p0;
    }
    public f a(){
       f obj = PatchProxy.apply(null, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f(this.l);
       obj.b = this.b;
       obj.c = this.c;
       obj.j = this.j;
       obj.k = this.k;
       f i = obj.i;
       f ti = this.i;
       Objects.requireNonNull(i);
       i.b = ti.b;
       i.m = ti.m;
       i.c = ti.c;
       i.d = ti.d;
       i.e = ti.e;
       i.f = ti.f;
       i.i = ti.i;
       i.k = ti.k;
       i.g = ti.g;
       i.h = ti.h;
       i.n = ti.n;
       i.o = ti.o;
       i.j = ti.j;
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          obj.d.add(iterator.next().F());
       }
       iterator = this.e.iterator();
       while (iterator.hasNext()) {
          obj.e.add(iterator.next().F());
       }
       iterator = this.f.iterator();
       while (iterator.hasNext()) {
          obj.f.add(iterator.next().F());
       }
       iterator = this.g.iterator();
       while (iterator.hasNext()) {
          obj.g.add(iterator.next().F());
       }
       iterator = this.h.iterator();
       while (iterator.hasNext()) {
          obj.h.add(iterator.next().F());
       }
       return obj;
    }
    public f b(j p0){
       f obj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (!l.m().WC(p0) && !l.l().fA(p0)) {
          obj.d = this.d;
       }
       if (!l.n().bo(p0)) {
          obj.e = this.e;
          obj.f = this.f;
       }
       return obj;
    }
    public Size c(int p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= this.c.size()) {
          i1.c(new RuntimeException("getAssetSize out of bound index:"+p0+"mAssetHeightList.size:"+this.c.size()));
          return new Size(-1, -1);
       }else {
          return new Size(this.b.get(p0).intValue(), this.c.get(p0).intValue());
       }
    }
    public Object clone(){
       return this.a();
    }
    public List d(){
       return this.g;
    }
    public void e(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       Integer[] integerArray = new Integer[]{Integer.valueOf(a.s(p0))};
       this.b = Lists.e(integerArray);
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(a.r(p0))};
       this.c = Lists.e(integerArray1);
       p0.e = this.b.get(0).intValue();
       p0.f = this.c.get(0).intValue();
       p0.d = (int)a.a().a().getResources().getDimension(0x7f070d65);
       p0.l = false;
       return;
    }
    public boolean f(int p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return d0.p(this.c(p0));
    }
}
