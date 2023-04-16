package com.google.android.flexbox.FlexboxLayoutManager$b;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.lang.Object;
import com.google.android.flexbox.FlexboxLayoutManager$a;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import com.google.android.flexbox.a;
import java.util.List;
import qj.b;
import java.lang.String;
import java.lang.StringBuilder;

public class FlexboxLayoutManager$b	// class@001604
{
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final FlexboxLayoutManager h;
    public static final boolean i;

    public void FlexboxLayoutManager$b(FlexboxLayoutManager p0){
       this.h = p0;
       super();
       this.d = 0;
    }
    public void FlexboxLayoutManager$b(FlexboxLayoutManager p0,FlexboxLayoutManager$a p1){
       super(p0);
    }
    public void a(){
       int i;
       if (!this.h.M()) {
          FlexboxLayoutManager$b th = this.h;
          if (th.g != null) {
             i = (this.e != null)? th.o.i(): th.getWidth() - this.h.o.n();
             this.c = i;
          label_0040 :
             return;
          }
       }
       i = (this.e != null)? this.h.o.i(): this.h.o.n();
       this.c = i;
       goto label_0040 ;
    }
    public void b(View p0){
       FlexboxLayoutManager$b th = this.h;
       FlexboxLayoutManager p = (th.c == null)? th.p: th.o;
       if (!th.M() && this.h.g != null) {
          this.c = (this.e != null)? p.g(p0) + p.p(): p.d(p0);
       }else if(this.e != null){
          this.c = p.d(p0) + p.p();
       }else {
          this.c = p.g(p0);
       }
       int position = this.h.getPosition(p0);
       this.a = position;
       boolean b = false;
       this.g = b;
       FlexboxLayoutManager$b th1 = this.h;
       a c = th1.j.c;
       if (position == -1) {
          position = 0;
       }
       position = c[position];
       if (position != -1) {
          b = position;
       }
       this.b = b;
       th = this.b;
       if (th1.i.size() > th) {
          this.a = this.h.i.get(th).o;
       }
       return;
    }
    public void c(){
       FlexboxLayoutManager$b th;
       FlexboxLayoutManager c;
       this.a = -1;
       this.b = -1;
       this.c = Integer.MIN_VALUE;
       boolean b = false;
       this.f = b;
       this.g = b;
       int i = 2;
       if (this.h.M()) {
          th = this.h;
          c = th.c;
          if (c == null) {
             if (th.b == 1) {
                b = true;
             }
             this.e = b;
          }else if(c == i){
             b = true;
          }
          this.e = b;
       }else {
          th = this.h;
          c = th.c;
          if (c == null) {
             if (th.b == 3) {
                b = true;
             }
             this.e = b;
          }else if(c == i){
             b = true;
          }
          this.e = b;
       }
       return;
    }
    public String toString(){
       return "AnchorInfo{mPosition="+this.a+", mFlexLinePosition="+this.b+", mCoordinate="+this.c+", mPerpendicularCoordinate="+this.d+", mLayoutFromEnd="+this.e+", mValid="+this.f+", mAssignedFromSavedState="+this.g+'}';
    }
}
