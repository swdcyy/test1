package androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup;
import java.lang.Object;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.Math;
import java.lang.System;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$c;

public class StaggeredGridLayoutManager$LazySpanLookup	// class@0008d3
{
    public int[] a;
    public List b;

    public void StaggeredGridLayoutManager$LazySpanLookup(){
       super();
    }
    public void a(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem p0){
       if (this.b == null) {
          this.b = new ArrayList();
       }
       int i = this.b.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = this.b.get(i1);
             if (lazySpanLook.b == p0.b) {
                this.b.remove(i1);
             }
             if (lazySpanLook.b >= p0.b) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             this.b.add(p0);
             return;
          }
       }
       this.b.add(i1, p0);
       return;
    }
    public void b(){
       StaggeredGridLayoutManager$LazySpanLookup ta = this.a;
       if (ta != null) {
          Arrays.fill(ta, -1);
       }
       this.b = null;
       return;
    }
    public void c(int p0){
       int[] ointArray;
       StaggeredGridLayoutManager$LazySpanLookup ta = this.a;
       if (ta == null) {
          ointArray = new int[(Math.max(p0, 10) + 1)];
          this.a = ointArray;
          Arrays.fill(ointArray, -1);
       }else if(p0 >= ta.length){
          ointArray = new int[this.o(p0)];
          this.a = ointArray;
          System.arraycopy(ta, 0, ointArray, 0, ta.length);
          StaggeredGridLayoutManager$LazySpanLookup ta1 = this.a;
          Arrays.fill(ta1, ta.length, ta1.length, -1);
       }
       return;
    }
    public int d(int p0){
       StaggeredGridLayoutManager$LazySpanLookup tb = this.b;
       if (tb != null) {
          int i = tb.size() - 1;
          while (i >= 0) {
             if (this.b.get(i).b >= p0) {
                this.b.remove(i);
             }
             i = i - 1;
          }
       }
       return this.h(p0);
    }
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e(int p0,int p1,int p2,boolean p3){
       StaggeredGridLayoutManager$LazySpanLookup tb = this.b;
       if (tb == null) {
          return null;
       }
       int i = tb.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = this.b.get(i1);
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem b = lazySpanLook.b;
          if (b >= p1) {
             break ;
          }else if(b >= p0 && (p2 && (lazySpanLook.c == p2 || (p3 && lazySpanLook.e != null)))){
             return lazySpanLook;
          }else {
             i1 = i1 + 1;
          }
       }
       return null;
    }
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f(int p0){
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook;
       StaggeredGridLayoutManager$LazySpanLookup tb = this.b;
       if (tb == null) {
          return null;
       }
       int i = tb.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          lazySpanLook = this.b.get(i);
          if (lazySpanLook.b == p0) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return lazySpanLook;
    }
    public int g(int p0){
       StaggeredGridLayoutManager$LazySpanLookup ta = this.a;
       if (ta == null || p0 >= ta.length) {
          return -1;
       }
       return ta[p0];
    }
    public int h(int p0){
       StaggeredGridLayoutManager$LazySpanLookup ta = this.a;
       if (ta == null) {
          return -1;
       }
       if (p0 >= ta.length) {
          return -1;
       }
       int i = this.i(p0);
       if (i == -1) {
          ta = this.a;
          Arrays.fill(ta, p0, ta.length, -1);
          return this.a.length;
       }else {
          i = Math.min((i + 1), this.a.length);
          Arrays.fill(this.a, p0, i, -1);
          return i;
       }
    }
    public final int i(int p0){
       if (this.b == null) {
          return -1;
       }
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = this.f(p0);
       if (lazySpanLook != null) {
          this.b.remove(lazySpanLook);
       }
       int i = this.b.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (this.b.get(i1).b >= p0) {
             label_002b :
                if (i1 != -1) {
                   break ;
                }else {
                   return -1;
                }
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_002b ;
          }
       }
       this.b.remove(i1);
       return this.b.get(i1).b;
    }
    public void j(int p0,int p1){
       StaggeredGridLayoutManager$LazySpanLookup ta = this.a;
       if (ta != null && p0 < ta.length) {
          int i = p0 + p1;
          this.c(i);
          StaggeredGridLayoutManager$LazySpanLookup ta1 = this.a;
          System.arraycopy(ta1, p0, ta1, i, ((ta1.length - p0) - p1));
          Arrays.fill(this.a, p0, i, -1);
          this.l(p0, p1);
       }
       return;
    }
    public void k(int p0,int p1){
       StaggeredGridLayoutManager$LazySpanLookup ta = this.a;
       if (ta != null && p0 < ta.length) {
          int i = p0 + p1;
          this.c(i);
          StaggeredGridLayoutManager$LazySpanLookup ta1 = this.a;
          System.arraycopy(ta1, i, ta1, p0, ((ta1.length - p0) - p1));
          ta = this.a;
          Arrays.fill(ta, (ta.length - p1), ta.length, -1);
          this.m(p0, p1);
       }
       return;
    }
    public final void l(int p0,int p1){
       StaggeredGridLayoutManager$LazySpanLookup tb = this.b;
       if (tb == null) {
          return;
       }
       int i = tb.size() - 1;
       while (i >= 0) {
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = this.b.get(i);
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem b = lazySpanLook.b;
          if (b >= p0) {
             int i1 = b + p1;
             lazySpanLook.b = i1;
          }
          i = i - 1;
       }
       return;
    }
    public final void m(int p0,int p1){
       StaggeredGridLayoutManager$LazySpanLookup tb = this.b;
       if (tb == null) {
          return;
       }
       int i = p0 + p1;
       int i1 = tb.size() - 1;
       while (i1 >= 0) {
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = this.b.get(i1);
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem b = lazySpanLook.b;
          if (b >= p0) {
             if (b < i) {
                this.b.remove(i1);
             }else {
                int i2 = b - p1;
                lazySpanLook.b = i2;
             }
          }
          i1 = i1 - 1;
       }
       return;
    }
    public void n(int p0,StaggeredGridLayoutManager$c p1){
       this.c(p0);
       this.a[p0] = p1.e;
    }
    public int o(int p0){
       int len = this.a.length;
       while (len <= p0) {
          len = len * 2;
       }
       return len;
    }
}
