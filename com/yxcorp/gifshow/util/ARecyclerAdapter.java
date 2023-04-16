package com.yxcorp.gifshow.util.ARecyclerAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.util.ARecyclerAdapter$b;
import nsd.u;
import java.util.HashMap;
import android.util.SparseArray;
import java.util.ArrayList;
import vsd.d;
import com.yxcorp.gifshow.util.ARecyclerAdapter$c;
import msd.l;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.util.ARecyclerAdapter$d;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.ARecyclerAdapter$a;
import java.lang.Integer;
import com.yxcorp.gifshow.util.ARecyclerAdapter$type$1;
import msd.a;
import com.yxcorp.gifshow.util.ARecyclerAdapter$register$$inlined$apply$lambda$1;
import java.util.Map;
import com.yxcorp.gifshow.util.ARecyclerAdapter$e;
import java.util.List;
import java.util.Iterator;
import android.view.ViewGroup;

public final class ARecyclerAdapter extends RecyclerView$Adapter	// class@001ec9
{
    public final HashMap e;
    public final SparseArray f;
    public final SparseArray g;
    public final ArrayList h;
    public static final ARecyclerAdapter$b i;

    static {
       ARecyclerAdapter.i = new ARecyclerAdapter$b(null);
    }
    public void ARecyclerAdapter(){
       super();
       this.e = new HashMap();
       this.f = new SparseArray(0);
       this.g = new SparseArray(0);
       this.h = new ArrayList();
    }
    public static int N0(ARecyclerAdapter p0,d p1,ARecyclerAdapter$c p2,l p3,int p4,Object p5){
       return p0.M0(p1, null, p3);
    }
    public void B0(RecyclerView$ViewHolder p0){
       a.p(p0, "holder");
       p0.d(p0.b());
    }
    public void D0(RecyclerView$ViewHolder p0){
       a.p(p0, "holder");
       p0.e(p0.b());
    }
    public void E0(RecyclerView$ViewHolder p0){
       a.p(p0, "holder");
       p0.b();
       p0.f(null);
    }
    public final Object J0(Object p0){
       return p0;
    }
    public final ARecyclerAdapter$a K0(){
       return new ARecyclerAdapter$a(this);
    }
    public final Integer L0(d p0){
       Integer integer = this.e.get(p0);
       if (integer != null) {
       }else {
          integer = null;
          this.O0(integer, new ARecyclerAdapter$type$1(p0));
       }
       return integer;
    }
    public final int M0(d p0,ARecyclerAdapter$c p1,l p2){
       int i;
       a.p(p0, "type");
       a.p(p2, "factory");
       Integer integer = this.e.get(p0);
       if (integer != null) {
          this.O0(integer, new ARecyclerAdapter$register$$inlined$apply$lambda$1(this, p0));
          i = integer.intValue();
       }else {
          int i1 = this.e.size();
          if (p1 != null) {
             this.f.put(i1, p1);
          }
          this.g.put(i1, p2);
          this.e.put(p0, Integer.valueOf(i1));
          i = i1;
       }
       return i;
    }
    public final Object O0(Object p0,a p1){
       p1.invoke();
       return p0;
    }
    public int f0(int p0){
       return this.h.get(p0).b();
    }
    public int getItemCount(){
       return this.h.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a.p(p0, "holder");
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       a.p(p0, "holder");
       a.p(p2, "payloads");
       Object obj = this.h.get(p1);
       a.o(obj, "items[position]");
       p0.f(obj.a());
       int i = p2.size();
       if (i) {
          if (i != 1) {
             Iterator iterator = p2.iterator();
             while (iterator.hasNext()) {
                p0.c(p1, obj.a(), iterator.next());
             }
          }else {
             p0.c(p1, obj.a(), p2.get(0));
          }
       }else {
          p0.c(p1, obj.a(), null);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a.p(p0, "parent");
       return this.g.get(p1).invoke(p0);
    }
}
