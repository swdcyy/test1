package a2.u;
import android.view.View;
import java.lang.Object;
import android.view.ViewParent;
import a2.l0;
import a2.i0;

public class u	// class@0000ba
{
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public void u(View p0){
       super();
       this.c = p0;
    }
    public boolean a(float p0,float p1,boolean p2){
       int i = 0;
       if (this.m()) {
          ViewParent viewParent = this.i(i);
          if (viewParent != null) {
             return l0.a(viewParent, this.c, p0, p1, p2);
          }
       }
       return i;
    }
    public boolean b(float p0,float p1){
       int i = 0;
       if (this.m()) {
          ViewParent viewParent = this.i(i);
          if (viewParent != null) {
             return l0.b(viewParent, this.c, p0, p1);
          }
       }
       return i;
    }
    public boolean c(int p0,int p1,int[] p2,int[] p3){
       return this.d(p0, p1, p2, p3, 0);
    }
    public boolean d(int p0,int p1,int[] p2,int[] p3,int p4){
       int i;
       int i1;
       boolean b = false;
       if (this.m()) {
          ViewParent viewParent = this.i(p4);
          if (viewParent == null) {
             return b;
          }else if(p0 || p1){
             if (p3 != null) {
                this.c.getLocationInWindow(p3);
                i = p3[b];
                i1 = p3[1];
             }else {
                i = 0;
                i1 = 0;
             }
             if (p2 == null) {
                p2 = this.j();
             }
             p2[b] = b;
             p2[1] = b;
             l0.c(viewParent, this.c, p0, p1, p2, p4);
             if (p3 != null) {
                this.c.getLocationInWindow(p3);
                p3[b] = p3[b] - i;
                p3[1] = p3[1] - i1;
             }
             if (p2[b] || p2[1]) {
                b = true;
             }
          }else if(p3 != null){
             p3[b] = b;
             p3[1] = b;
          }
       }
       return b;
    }
    public void e(int p0,int p1,int p2,int p3,int[] p4,int p5,int[] p6){
       this.h(p0, p1, p2, p3, p4, p5, p6);
    }
    public boolean f(int p0,int p1,int p2,int p3,int[] p4){
       return this.h(p0, p1, p2, p3, p4, 0, null);
    }
    public boolean g(int p0,int p1,int p2,int p3,int[] p4,int p5){
       return this.h(p0, p1, p2, p3, p4, p5, null);
    }
    public final boolean h(int p0,int p1,int p2,int p3,int[] p4,int p5,int[] p6){
       int i;
       int i1;
       int[] ointArray2;
       u ou = this;
       int[] ointArray = p4;
       if (this.m()) {
          ViewParent viewParent = this.i(p5);
          if (viewParent == null) {
             return false;
          }else if(!p0 && (!p1 && (p2 || p3))){
             if (ointArray) {
                ou.c.getLocationInWindow(ointArray);
                i = ointArray[0];
                i1 = ointArray[1];
             }else {
                i = 0;
                i1 = 0;
             }
             if (p6 == null) {
                int[] ointArray1 = this.j();
                ointArray1[0] = false;
                ointArray1[1] = false;
                ointArray2 = ointArray1;
             }else {
                ointArray2 = p6;
             }
             l0.d(viewParent, ou.c, p0, p1, p2, p3, p5, ointArray2);
             if (ointArray != null) {
                ou.c.getLocationInWindow(ointArray);
                ointArray[0] = ointArray[0] - i;
                ointArray[1] = ointArray[1] - i1;
             }
             return 1;
          }else if(ointArray != null){
             ointArray[0] = false;
             ointArray[1] = false;
          }
       }
       return false;
    }
    public final ViewParent i(int p0){
       if (!p0) {
          return this.a;
       }
       if (p0 != 1) {
          return null;
       }
       return this.b;
    }
    public final int[] j(){
       if (this.e == null) {
          int[] ointArray = new int[2];
          this.e = ointArray;
       }
       return this.e;
    }
    public boolean k(){
       return this.l(0);
    }
    public boolean l(int p0){
       boolean b = (this.i(p0) != null)? true: false;
       return b;
    }
    public boolean m(){
       return this.d;
    }
    public void n(boolean p0){
       if (this.d != null) {
          i0.U0(this.c);
       }
       this.d = p0;
       return;
    }
    public final void o(int p0,ViewParent p1){
       if (p0) {
          if (p0 == 1) {
             this.b = p1;
          }
       }else {
          this.a = p1;
       }
       return;
    }
    public boolean p(int p0){
       return this.q(p0, 0);
    }
    public boolean q(int p0,int p1){
       if (this.l(p1)) {
          return true;
       }
       if (this.m()) {
          u tc = this.c;
          for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
             if (l0.f(parent, tc, this.c, p0, p1)) {
                this.o(p1, parent);
                l0.e(parent, tc, this.c, p0, p1);
                return true;
             }else if(parent instanceof View){
                tc = parent;
             }
          }
       }
       return false;
    }
    public void r(){
       this.s(0);
    }
    public void s(int p0){
       ViewParent viewParent = this.i(p0);
       if (viewParent != null) {
          l0.g(viewParent, this.c, p0);
          this.o(p0, null);
       }
       return;
    }
}
