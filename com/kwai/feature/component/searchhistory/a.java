package com.kwai.feature.component.searchhistory.a;
import br8.b;
import y8c.g;
import com.kwai.feature.component.impl.ISearchHistoryItemClickCallback;
import g06.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.util.List;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.feature.component.searchhistory.a$c;
import y8c.f;
import com.kwai.feature.component.searchhistory.a$d;
import android.view.View;
import i2b.a;
import com.kwai.feature.component.searchhistory.a$b;
import ml8.c;
import com.kwai.feature.component.searchhistory.a$e;
import com.kwai.feature.component.searchhistory.a$a;

public abstract class a extends g implements b	// class@00129b
{
    public a$a A;
    public boolean B;
    public e w;
    public ISearchHistoryItemClickCallback x;
    public a$d y;
    public a$c z;

    public void a(ISearchHistoryItemClickCallback p0){
       super();
       this.x = p0;
    }
    public void a(e p0){
       super();
       this.w = p0;
    }
    public long E(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (p0 >= super.getItemCount()) {
          return -1;
       }else {
          return (long)this.N0(p0).mHeaderId;
       }
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.W0(p0);
       a tw = this.w;
       if (tw != null) {
          tw.y9(p0);
       }
       return;
    }
    public RecyclerView$ViewHolder d(ViewGroup p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       RecyclerView$ViewHolder viewHolder = (obj != null)? obj.d(p0): null;
       return viewHolder;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 1;
       if (p0 == (this.getItemCount() - i)) {
          i = 2;
       }
       return i;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (super.getItemCount() > 0)? super.getItemCount() + 1: 0;
       return i;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v1();
       if (p1 == 2) {
          return new f(a.i(p0, this.y.d()), new a$b(this));
       }else {
          return new f(a.i(p0, this.y.c(p1)), new a$e(this));
       }
    }
    public abstract a$a r1();
    public abstract a$c s1();
    public void t(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "8")) {
          return;
       }
       if (this.N0(p1) == null) {
          return;
       }
       uoa = this.z;
       if (uoa != null) {
          uoa.a(p0, this.N0(p1), p1);
       }
       return;
    }
    public abstract String t1();
    public abstract a$d u1();
    public void v1(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.B != null) {
          return;
       }
       this.B = true;
       this.y = this.u1();
       this.z = this.s1();
       this.A = this.r1();
       return;
    }
}
