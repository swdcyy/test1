package l79.m;
import cc7.c;
import ia9.c;
import l79.m$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import q79.d;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import r79.a;
import w69.k;
import com.yxcorp.gifshow.album.preview.b$a;
import com.yxcorp.gifshow.album.preview.b;
import j79.a;
import ga9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import ga9.c;
import ia9.d;
import java.util.List;
import l79.o;
import ec7.a;
import r79.c;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.TypeCastException;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import c79.c$a;
import c79.c;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.models.QMedia;
import java.io.File;
import o79.o;
import l79.p;
import c79.e;
import android.widget.TextView;
import java.lang.CharSequence;
import ic7.a;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import p79.c;
import l79.m$c;
import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Number;
import l79.m$b;
import l79.n;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import cc7.b;
import androidx.recyclerview.widget.RecyclerView;
import usd.q;
import java.lang.StringBuilder;
import java.util.Collections;

public class m extends c implements c	// class@002cc6
{
    public final int j;
    public m$c k;
    public m$b l;
    public boolean m;
    public int n;
    public int o;
    public final Fragment p;
    public final d q;
    public final int r;
    public final int s;
    public final Set t;
    public final boolean u;
    public static final m$a v;

    static {
       m.v = new m$a(null);
    }
    public void m(Fragment p0,d p1,int p2,int p3,Set p4,boolean p5){
       a.q(p0, "fragment");
       a.q(p1, "viewModel");
       a.q(p4, "invisibleSet");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.j = b.b(p1.s0().m().h(), 0x3f800000).c;
       this.o = -1;
    }
    public void m(Fragment p0,d p1,int p2,int p3,Set p4,boolean p5,int p6,u p7){
       if (p6 & 0x20) {
          p5 = p1.s0().i().b();
       }
       super(p0, p1, p2, p3, p4, p5);
       return;
    }
    public b T0(int p0){
       b uob;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          uob = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "1");
          if (uob != PatchProxyResult.class) {
          label_002e :
             return uob;
          }
       }
       uob = this.q.s0().n().a(AbsSelectedItemViewBinder.class, this.p, p0);
       goto label_002e ;
    }
    public void U0(d p0,int p1,List p2){
       m m;
       boolean b;
       CompatImageView uCompatImage;
       String path;
       o d;
       o f;
       float ratio;
       QMedia qMedia;
       String str1;
       RecyclerView$ViewHolder itemView;
       long duration;
       TextView textView1;
       o oo;
       p op;
       AbsSelectedItemViewBinder uAbsSelected1;
       a uoa = this;
       c$a obj = p2;
       Object obj1 = p0;
       if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(obj1, Integer.valueOf(p1), p2, this, m.class, "4")) {
          a.q(obj1, "holder");
          String str = "payloads";
          a.q(obj, str);
          Object obj2 = uoa.L0(p1);
          m = uoa.m;
          Objects.requireNonNull(obj1);
          if (!PatchProxy.isSupport(o.class) || !PatchProxy.applyVoidThreeRefs(obj2, p2, Boolean.valueOf(m), obj1, o.class, "2")) {
             a.q(obj, str);
             int i = 0;
             if (!p2.isEmpty()) {
                obj = obj.get(i);
                if (obj != null) {
                   b = obj.booleanValue();
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                }
             }else {
                b = true;
             }
             if (obj2 != null) {
                if (b) {
                   obj = new c$a();
                   obj.c(3.00f);
                   obj.b(R.color.arg_RES_7f060b27);
                   c uoc = obj.a();
                   AbsSelectedItemViewBinder uAbsSelected = null;
                   if (obj2.getDataType() == DataType.IMAGE) {
                      uCompatImage = obj1.b().n();
                      if (uCompatImage == null) {
                         a.L();
                      }
                      path = obj2.getPath();
                      d = obj1.d;
                      f = obj1.f;
                      ratio = obj2.getRatio();
                      qMedia = (obj2 instanceof QMedia)? obj2.mThumbnailFile: uAbsSelected;
                      o.a(uCompatImage, path, d, f, f, ratio, qMedia, uoc);
                   }else if(obj2.getDataType() == DataType.VIDEO){
                      uCompatImage = obj1.b().n();
                      if (uCompatImage == null) {
                         a.L();
                      }
                      path = obj2.getPath();
                      d = obj1.d;
                      o f1 = obj1.f;
                      ratio = obj2.getRatio();
                      v0 = obj2 instanceof QMedia;
                      qMedia = (obj)? obj2.mThumbnailFile: uAbsSelected;
                      if (obj) {
                         p obj3 = obj2;
                         oo = f1;
                         obj3 = new p(obj1, obj2, obj3.id, obj3.mModified);
                         op = v16;
                      }else {
                         oo = f1;
                         op = uAbsSelected;
                      }
                      o.b(uCompatImage, path, d, oo, oo, ratio, qMedia, op, uoc);
                   }else {
                      uCompatImage = obj1.b().n();
                      if (uCompatImage == null) {
                         a.L();
                      }
                      path = obj2.getPath();
                      d = obj1.d;
                      f = obj1.e;
                      ratio = obj2.getRatio();
                      qMedia = (obj2 instanceof QMedia)? obj2.mThumbnailFile: uAbsSelected;
                      o.a(uCompatImage, path, d, f, f, ratio, qMedia, uoc);
                   }
                }
                if (obj2.getDataType() == DataType.IMAGE) {
                   TextView textView = obj1.b().l();
                   if (textView != null) {
                      str1 = (m != null)? "0:03": "";
                      textView.setText(str1);
                   }
                }else if(obj2.getDataType() == DataType.VIDEO){
                   duration = obj2.getDuration();
                   textView1 = obj1.b().l();
                   if (textView1 != null) {
                      textView1.setText(a.b(duration));
                   }
                }else {
                   duration = obj2.getDuration();
                   textView1 = obj1.b().l();
                   if (textView1 != null) {
                      textView1.setText(a.b(duration));
                   }
                }
             }
          label_01b3 :
             str1 = "itemView";
             if (CollectionsKt___CollectionsKt.H1(obj1.g, obj2)) {
                itemView = obj1.itemView;
                a.h(itemView, str1);
                itemView.setVisibility(4);
             }else {
                itemView = obj1.itemView;
                a.h(itemView, str1);
                itemView.setVisibility(i);
             }
             if (obj1.i != null) {
                View view = obj1.b().o();
                if (view != null) {
                   if (obj2 != null && obj2.isSelected() == true) {
                      i = true;
                   }
                   c.k(view, i, 300, 0x3f800000);
                }
             }
          }
       }
       return;
    }
    public d W0(View p0,int p1,b p2){
       Object obj = p2;
       if (PatchProxy.isSupport(m.class)) {
          o oo = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), obj, this, m.class, "2");
          if (oo != PatchProxyResult.class) {
          label_003e :
             return oo;
          }
       }
       a.q(p0, "itemRootView");
       a.q(obj, "viewBinder");
       o oo1 = new o(p0, this.r, this.s, this.j, this.t, obj, this.k, this.u);
       goto label_003e ;
    }
    public ViewModel X0(){
       return this.q;
    }
    public final void Y0(){
       if (PatchProxy.applyVoid(null, this, m.class, "6")) {
          return;
       }
       a te = this.e;
       a.h(te, "mList");
       Iterator iterator = te.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj.setSelected(false);
          this.m0(i, Boolean.FALSE);
          i = i1;
       }
       this.o = -1;
       return;
    }
    public int Z0(){
       Object obj = PatchProxy.apply(null, this, m.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getItemCount();
    }
    public final void a1(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "5")) {
          return;
       }
       if (p0 >= 0 && p0 < this.e.size()) {
          this.e.get(p0).setSelected(true);
          this.m0(p0, Boolean.FALSE);
          this.o = p0;
       }
       return;
    }
    public final void b1(m$b p0){
       this.l = p0;
    }
    public void c(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "9")) {
          return;
       }
       a.q(p0, "viewHolder");
       p0 = p0.itemView;
       a.h(p0, "viewHolder.itemView");
       c.m(p0, p0.getScaleX(), 0x3f800000, 100);
       m tl = this.l;
       if (tl != null) {
          tl.e();
       }
       return;
    }
    public final void d1(m$c p0){
       this.k = p0;
    }
    public void f(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "8")) {
          return;
       }
       a.q(p0, "viewHolder");
       p0 = p0.itemView;
       a.h(p0, "viewHolder.itemView");
       c.m(p0, p0.getScaleX(), 0x3f8ccccd, 300);
       m tl = this.l;
       if (tl != null) {
          tl.b();
       }
       return;
    }
    public int f0(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = n.a[this.e.get(p0).getDataType().ordinal()];
       int i = 1;
       if (p0 != i && p0 != 2) {
          if (p0 == 3) {
             i = 0;
          }else {
             throw new NoWhenBranchMatchedException();
          }
       }
       return i;
    }
    public int k(){
       return this.n;
    }
    public void l(int p0){
       b.b(this, p0);
    }
    public boolean m(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,RecyclerView p2){
       int i1;
       int this;
       StringBuilder obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, m.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "fromViewHolder");
       a.q(p1, "targetViewHolder");
       a.q(p2, "recyclerView");
       int adapterPosit = p0.getAdapterPosition();
       int i = q.u(p1.getAdapterPosition(), (this.getItemCount() - 1));
       obj = -1;
       if (adapterPosit == obj || i == obj) {
          return false;
       }
       Log.g("SelectedItemAdapter", "swap position "+adapterPosit+' '+i);
       if (adapterPosit < i) {
          for (i1 = adapterPosit; i1 < i; i1 = this) {
             this = i1 + 1;
             Collections.swap(this.e, i1, this);
          }
       }else {
          i1 = i + 1;
          if (adapterPosit >= i1) {
             int i2 = adapterPosit;
             int i3 = i2 - 1;
             Collections.swap(this.e, i2, i3);
             while (i2 != i1) {
                i2 = i2 - 1;
             }
          }
       }
       this.o0(adapterPosit, i);
       p1 = p1.itemView;
       a.h(p1, "targetViewHolder.itemView");
       this.n = p1.getLeft();
       m tk = this.k;
       if (tk != null) {
          tk.a(adapterPosit, i);
       }
       return 1;
    }
}
