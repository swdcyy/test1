package com.kwai.library.widget.viewpager.RecyclerViewPager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import com.kwai.library.widget.viewpager.a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.library.widget.viewpager.RecyclerViewPager$a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Math;
import com.kwai.library.widget.viewpager.a$a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$d;
import java.lang.Runnable;
import android.view.ViewGroup;

public class RecyclerViewPager extends RecyclerView	// class@000a73
{
    public final String b;
    public final a c;
    public t d;
    public List e;
    public int f;
    public int g;

    public void RecyclerViewPager(Context p0){
       super(p0, null);
    }
    public void RecyclerViewPager(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RecyclerViewPager(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = this.getClass().getSimpleName();
       this.e = new ArrayList();
       LinearLayoutManager linearLayout = new LinearLayoutManager(p0, 0, 0);
       super.setLayoutManager(linearLayout);
       t ot = new t();
       this.d = ot;
       ot.b(this);
       a uoa = new a(linearLayout);
       this.c = uoa;
       this.addOnScrollListener(uoa);
       uoa.b = new RecyclerViewPager$a(this);
    }
    public boolean fling(int p0,int p1){
       return super.fling(p0, p1);
    }
    public int getCurrentItem(){
       return this.f;
    }
    public void setCurrent(int p0){
       this.z(p0, false);
    }
    public void setLayoutManager(RecyclerView$LayoutManager p0){
    }
    public void x(RecyclerViewPager$c p0){
       this.e.add(p0);
    }
    public void y(RecyclerViewPager$c p0){
       this.e.remove(p0);
    }
    public final void z(int p0,boolean p1){
       RecyclerView$Adapter adapter = this.getAdapter();
       if (adapter != null && adapter.getItemCount() > 0) {
          int i = 0;
          p0 = Math.min(Math.max(p0, i), (adapter.getItemCount() - 1));
          if (p0 == this.f && this.c.g()) {
             return;
          }else {
             RecyclerViewPager tf = this.f;
             if (p0 == tf && p1) {
                return;
             }else {
                float f = (float)tf;
                this.f = p0;
                if (!this.c.g()) {
                   tf = this.c;
                   tf.j();
                   a f1 = tf.f;
                   f = f1.b + (float)f1.a;
                }
                RecyclerViewPager tc = this.c;
                int i1 = (p1)? 2: 3;
                tc.d = i1;
                if (tc.h != p0) {
                   i = 1;
                }
                tc.h = p0;
                tc.e(2);
                if (i) {
                   tc.d(p0);
                }
                if (!p1) {
                   this.scrollToPosition(p0);
                   return;
                }else {
                   float f2 = (float)p0;
                   if (Math.abs((f2 - f)) - 0x40400000 > 0) {
                      int i2 = (f2 - f > 0)? p0 - 3: p0 + 3;
                      this.scrollToPosition(i2);
                      this.post(new RecyclerViewPager$d(p0, this));
                   }else {
                      this.smoothScrollToPosition(p0);
                   }
                }
             }
          }
       }
       return;
    }
}
