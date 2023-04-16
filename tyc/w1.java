package tyc.w1;
import androidx.recyclerview.widget.m$e;
import tyc.m3;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Math;
import java.lang.Number;
import android.graphics.Canvas;
import java.lang.Float;
import gq.a;
import java.lang.StringBuilder;
import q87.c;

public class w1 extends m$e	// class@003dd0
{
    public final m3 d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public RecyclerView o;

    public void w1(m3 p0,int p1){
       super();
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.l = false;
       this.d = p0;
       this.k = p1;
    }
    public void A(RecyclerView$ViewHolder p0,int p1){
    }
    public void B(RecyclerView$ViewHolder p0,int p1){
    }
    public void C(RecyclerView$ViewHolder p0,int p1){
       if (PatchProxy.isSupport(w1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, w1.class, "5")) {
          return;
       }
       int adapterPosit = p0.getAdapterPosition();
       this.e = adapterPosit;
       this.f = adapterPosit;
       return;
    }
    public boolean a(RecyclerView p0,RecyclerView$ViewHolder p1,RecyclerView$ViewHolder p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, w1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.a(p0, p1, p2);
    }
    public RecyclerView$ViewHolder b(RecyclerView$ViewHolder p0,List p1,int p2,int p3){
       int i8;
       int i9;
       w1 ow1 = this;
       RecyclerView$ViewHolder viewHolder = p0;
       if (PatchProxy.isSupport(w1.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, w1.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p2 + viewHolder.itemView.getWidth();
       int i1 = p3 + viewHolder.itemView.getHeight();
       RecyclerView$ViewHolder viewHolder1 = null;
       int i2 = p2 - viewHolder.itemView.getLeft();
       int i3 = p3 - viewHolder.itemView.getTop();
       int i4 = p1.size();
       int i5 = viewHolder.itemView.getWidth() / 2;
       int i6 = 0;
       int i7 = -1;
       while (i6 < i4) {
          RecyclerView$ViewHolder viewHolder2 = p1.get(i6);
          if (i2 > 0) {
             int right = viewHolder2.itemView.getRight();
             if (ow1.l != null) {
                i8 = ow1.o.getAdapter().getItemCount() - 1;
                if (viewHolder2.getAdapterPosition() < i8) {
                   right = right - i5;
                }
             }else {
                i9 = -1;
             }
             right = right - i;
             if (right < 0 && viewHolder2.itemView.getRight() > viewHolder.itemView.getRight()) {
                i8 = Math.abs(right);
                if (i8 > i7) {
                   i7 = i8;
                   viewHolder1 = viewHolder2;
                }
             }
          }else {
             i9 = -1;
          }
       label_00a2 :
          if (i2 < 0) {
             i8 = viewHolder2.itemView.getLeft();
             if (ow1.l != null) {
                i8 = i8 + i5;
             }
             i8 = i8 - p2;
             if (i8 > 0 && viewHolder2.itemView.getLeft() < viewHolder.itemView.getLeft()) {
                i8 = Math.abs(i8);
                if (i8 > i7) {
                   i7 = i8;
                   viewHolder1 = viewHolder2;
                }
             }
          }
       label_00c9 :
          if (i3 < 0) {
             i8 = viewHolder2.itemView.getTop();
             if (ow1.l != null) {
                i8 = i8 / 2;
             }
             i8 = i8 - p3;
             if (i8 > 0 && viewHolder2.itemView.getTop() < viewHolder.itemView.getTop()) {
                i8 = Math.abs(i8);
                if (i8 > i7) {
                   i7 = i8;
                   viewHolder1 = viewHolder2;
                }
             }
          }
       label_00f1 :
          if (i3 > 0) {
             i8 = viewHolder2.itemView.getBottom();
             if (ow1.l != null) {
                i8 = i8 * 2;
             }
             i8 = i8 - i1;
             if (i8 < 0 && viewHolder2.itemView.getBottom() > viewHolder.itemView.getBottom()) {
                i8 = Math.abs(i8);
                if (i8 > i7) {
                   i7 = i8;
                   viewHolder1 = viewHolder2;
                }
             }
          }
       label_0118 :
          i6 = i6 + 1;
       }
       return viewHolder1;
    }
    public void c(RecyclerView p0,RecyclerView$ViewHolder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w1.class, "8")) {
          return;
       }
       super.c(p0, p1);
       if (p0 != null && !p0.isComputingLayout()) {
          this.d.c(p1);
       }
       return;
    }
    public float i(RecyclerView$ViewHolder p0){
       p0 = PatchProxy.applyOneRefs(p0, this, w1.class, "11");
       if (p0 != PatchProxyResult.class) {
          return p0.floatValue();
       }
       float f = (this.l != null)? 0: 0x3f000000;
       return f;
    }
    public int j(RecyclerView p0,RecyclerView$ViewHolder p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, w1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.o = p0;
       if (this.d.b(p1)) {
          return m$e.s(this.k, 0);
       }
       return 0;
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, w1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
    public boolean q(){
       Object obj = PatchProxy.apply(null, this, w1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.q();
    }
    public void t(Canvas p0,RecyclerView p1,RecyclerView$ViewHolder p2,float p3,float p4,int p5,boolean p6){
       w1 ow11;
       w1 ow13;
       w1 ow1 = w1.class;
       int i = 0;
       if (PatchProxy.isSupport(ow1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, ow1, "10")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().s("HorizontalItemTouchHelperCallback", "onChildDraw\(\) called with: viewHolder = ["+p2+"], dX = ["+p3+"], dY = ["+p4+"]", objArray1);
       if (this.m != null) {
          ow1 = this.g;
          if (p4 - ow1 >= 0) {
             ow1 = this.h;
             if (p4 - ow1 <= 0) {
             label_007d :
                w1 ow12 = ow11;
                if (this.n != null) {
                   ow11 = this.i;
                   if (p3 - ow11 >= 0) {
                      ow11 = this.j;
                      if (p3 - ow11 <= 0) {
                      label_0091 :
                         super.t(p0, p1, p2, ow13, ow12, p5, p6);
                         return;
                      }
                   }
                   ow13 = ow11;
                   goto label_0091 ;
                }else {
                   goto label_0091 ;
                }
             }
          }
          ow11 = ow1;
          goto label_007d ;
       }else {
          goto label_007d ;
       }
    }
    public boolean x(RecyclerView p0,RecyclerView$ViewHolder p1,RecyclerView$ViewHolder p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, w1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.f = p2.getAdapterPosition();
       return this.d.m(p1, p2, p0);
    }
    public void z(RecyclerView$ViewHolder p0,int p1){
       w1 ow1 = w1.class;
       if (PatchProxy.isSupport(ow1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ow1, "4")) {
          return;
       }
       super.z(p0, p1);
       if (p1) {
          Object[] objArray = new Object[0];
          a.D().s("HorizontalItemTouchHelperCallback", "onSelectedChanged\(\) called with: viewHolder = ["+p0+"], actionState = ["+p1+"]", objArray);
          this.d.f(p0);
       }
       if (p1 == 2 && p0 != null) {
          this.C(p0, p1);
       }else if(!p1){
          this.B(p0, p1);
       }
       return;
    }
}
