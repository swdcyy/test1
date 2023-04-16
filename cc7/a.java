package cc7.a;
import androidx.recyclerview.widget.m$e;
import cc7.c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Math;
import java.lang.Number;
import l79.l;
import ec7.a;
import com.yxcorp.gifshow.models.EmptyQMedia;
import java.lang.Boolean;
import android.graphics.Canvas;
import java.lang.Float;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import o79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import g79.a;
import w69.x;

public class a extends m$e	// class@00052e
{
    public final c d;
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
    public boolean o;
    public RecyclerView p;
    public boolean q;

    public void a(c p0,int p1,boolean p2,boolean p3){
       super();
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.m = false;
       this.d = p0;
       this.k = p1;
       this.l = p2;
       this.q = p3;
    }
    public void A(RecyclerView$ViewHolder p0,int p1){
    }
    public void B(boolean p0){
       this.m = p0;
    }
    public void C(boolean p0,int p1,int p2){
       this.n = p0;
       this.g = (float)p1;
       this.h = (float)p2;
    }
    public RecyclerView$ViewHolder b(RecyclerView$ViewHolder p0,List p1,int p2,int p3){
       int i8;
       int i9;
       a uoa = this;
       RecyclerView$ViewHolder viewHolder = p0;
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "9");
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
             if (uoa.m != null) {
                i8 = uoa.p.getAdapter().getItemCount() - 1;
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
             if (uoa.m != null) {
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
             if (uoa.m != null) {
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
             if (uoa.m != null) {
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       super.c(p0, p1);
       if (p0 != null && !p0.isComputingLayout()) {
          this.d.c(p1);
       }
       return;
    }
    public float i(RecyclerView$ViewHolder p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (p0 != PatchProxyResult.class) {
          return p0.floatValue();
       }
       float f = (this.m != null)? 0: 0x3f000000;
       return f;
    }
    public int j(RecyclerView p0,RecyclerView$ViewHolder p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.p = p0;
       if (this.q != null) {
          int adapterPosit = p1.getAdapterPosition();
          l adapter = p0.getAdapter();
          if (adapter != null && adapter.L0(adapterPosit) instanceof EmptyQMedia) {
             return m$e.s(0, 0);
          }
       }
       return m$e.s(this.k, 0);
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
    public boolean q(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.q() && this.l != null)? true: false;
       return b;
    }
    public void t(Canvas p0,RecyclerView p1,RecyclerView$ViewHolder p2,float p3,float p4,int p5,boolean p6){
       a uoa1;
       a uoa3;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "10")) {
             return;
          }
       }
       Log.b("HorizontalItemTouchHelperCallback", "onChildDraw\(\) called with: viewHolder = ["+p2+"], dX = ["+p3+"], dY = ["+p4+"]");
       if (this.n != null) {
          uoa = this.g;
          if (p4 - uoa >= 0) {
             uoa = this.h;
             if (p4 - uoa <= 0) {
             label_0077 :
                a uoa2 = uoa1;
                if (this.o != null) {
                   uoa1 = this.i;
                   if (p3 - uoa1 >= 0) {
                      uoa1 = this.j;
                      if (p3 - uoa1 <= 0) {
                      label_008b :
                         super.t(p0, p1, p2, uoa3, uoa2, p5, p6);
                         return;
                      }
                   }
                   uoa3 = uoa1;
                   goto label_008b ;
                }else {
                   goto label_008b ;
                }
             }
          }
          uoa1 = uoa;
          goto label_0077 ;
       }else {
          goto label_0077 ;
       }
    }
    public boolean x(RecyclerView p0,RecyclerView$ViewHolder p1,RecyclerView$ViewHolder p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.f = p2.getAdapterPosition();
       this.d.m(p1, p2, p0);
       return true;
    }
    public void z(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       super.z(p0, p1);
       if (p1) {
          Log.b("HorizontalItemTouchHelperCallback", "onSelectedChanged\(\) called with: viewHolder = ["+p0+"], actionState = ["+p1+"]");
          this.d.f(p0);
       }
       if (p1 == 2) {
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
             int adapterPosit = p0.getAdapterPosition();
             this.e = adapterPosit;
             this.f = adapterPosit;
          }
       }else if(p1 || (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5") && (this.e == this.f || PatchProxy.applyVoid(null, null, d.class, "11"))))){
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CHANGE_PICTURE_INDEX";
          uElementPack.type = 1;
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.type = 1;
          uClickEvent.elementPackage = uElementPack;
          a.c.f().e(uClickEvent);
       }
       return;
    }
}
