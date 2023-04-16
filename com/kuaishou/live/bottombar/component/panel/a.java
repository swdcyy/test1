package com.kuaishou.live.bottombar.component.panel.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.lifecycle.LifecycleOwner;
import k61.f;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import k61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import z61.b;
import java.util.Objects;
import androidx.lifecycle.Observer;
import k61.b;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

public abstract class a extends RecyclerView$Adapter	// class@000d3a
{
    public LifecycleOwner e;
    public List f;
    public List g;
    public final f h;

    public void a(LifecycleOwner p0,f p1){
       super();
       this.e = p0;
       this.h = p1;
    }
    public void E0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
       }else {
          p0.a();
       }
       return;
    }
    public abstract c J0(ViewGroup p0,int p1);
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (q.f(this.f))? 0: this.f.size();
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       c a;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          MutableLiveData mutableLiveD = q.d(this.f, p1);
          if (mutableLiveD != null) {
             if (mutableLiveD.getValue() != null) {
                this.h.b(mutableLiveD.getValue());
             }
             uoa = this.e;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidTwoRefs(uoa, mutableLiveD, p0, c.class, "1")) {
                a = p0.a;
                if (a != null) {
                   c b = p0.b;
                   if (b != null) {
                      a.removeObserver(b);
                   }
                }
                p0.a = mutableLiveD;
                b uob = new b(p0);
                p0.b = uob;
                mutableLiveD.observe(uoa, uob);
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       c uoc;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (uoc != PatchProxyResult.class) {
          label_002d :
             return uoc;
          }
       }
       uoc = this.J0(p0, p1);
       if (this.g == null) {
          this.g = new ArrayList();
       }
       this.g.add(uoc);
       goto label_002d ;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (q.f(this.g)) {
          return;
       }
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
}
