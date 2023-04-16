package com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import java.util.ArrayList;
import com.kwai.library.widget.popup.bubble.BubbleInterface$UiMode;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k07.n;
import k07.o;
import com.kwai.library.widget.popup.common.f;
import android.view.View;
import java.lang.CharSequence;
import w07.l;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.library.widget.popup.bubble.b;
import com.kwai.library.widget.popup.bubble.b$a;
import m07.c;
import k07.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import k07.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k07.g;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class a$c extends c$b	// class@000977
{
    public a G;
    public List H;
    public View I;
    public int J;
    public int K;
    public CharSequence L;
    public int M;
    public BubbleInterface$Position N;
    public g O;
    public int P;
    public List Q;
    public RecyclerView$Adapter R;
    public RecyclerView$LayoutManager S;
    public List T;
    public int U;
    public h V;
    public boolean W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public BubbleInterface$UiMode e0;
    public int f0;
    public boolean g0;
    public int h0;
    public Drawable i0;
    public BubbleInterface$Position j0;

    public void a$c(Activity p0){
       super(p0);
       this.H = new ArrayList();
       this.M = 17;
       this.U = 1;
       this.W = true;
       this.e0 = BubbleInterface$UiMode.DEFAULT;
       this.g0 = false;
       this.j0 = BubbleInterface$Position.LEFT;
       this.t = "popup_type_bubble";
       this.u = PopupInterface$Excluded.SAME_TYPE;
       a.p(this, "builder");
       this.y = new n(this);
       a.p(this, "builder");
       this.z = new o(this);
       this.N = BubbleInterface$Position.TOP;
       this.X = f.b(15.00f);
    }
    public static int[] f0(View p0,BubbleInterface$Position p1){
       int[] ointArray = new int[2];
       if (p0 == null) {
          return ointArray;
       }
       p0.getLocationInWindow(ointArray);
       if (p1 == BubbleInterface$Position.TOP) {
          ointArray[0] = ointArray[0] + (p0.getWidth() / 2);
       }else if(p1 == BubbleInterface$Position.BOTTOM){
          ointArray[0] = ointArray[0] + (p0.getWidth() / 2);
          ointArray[1] = ointArray[1] + p0.getHeight();
       }else if(p1 == BubbleInterface$Position.RIGHT){
          ointArray[0] = ointArray[0] + p0.getWidth();
          ointArray[1] = ointArray[1] + (p0.getHeight() / 2);
       }else {
          ointArray[1] = ointArray[1] + (p0.getHeight() / 2);
       }
       return ointArray;
    }
    public a$c A0(int p0){
       this.U = p0;
       return this;
    }
    public a$c B0(int p0){
       this.a0 = p0;
       return this;
    }
    public a$c C0(int p0){
       this.b0 = p0;
       return this;
    }
    public a$c D0(BubbleInterface$Position p0){
       this.N = p0;
       return this;
    }
    public a$c E0(int p0){
       this.c0 = p0;
       return this;
    }
    public a$c F0(CharSequence p0){
       this.L = p0;
       return this;
    }
    public a$c a0(int p0,l p1){
       this.H.add(p0, p1);
       return this;
    }
    public a$c b0(l p0){
       this.H.add(p0);
       return this;
    }
    public a$c c0(RecyclerView$n p0){
       ArrayList uArrayList = new ArrayList();
       this.T = uArrayList;
       uArrayList.add(p0);
       return this;
    }
    public a$c d0(int p0){
       b uob = b.m.e(this, p0);
       this.D0(uob.c());
       c uoc = new c(uob);
       this.a0(0, uoc);
       this.L(new e(this));
       return this;
    }
    public a e0(){
       a uoa = new a(this);
       this.G = uoa;
       return uoa;
    }
    public View g0(){
       return this.I;
    }
    public a h0(){
       return this.G;
    }
    public List i0(){
       return this.Q;
    }
    public BubbleInterface$Position j0(){
       return this.N;
    }
    public c k(){
       return this.e0();
    }
    public h k0(){
       return this.V;
    }
    public BubbleInterface$UiMode l0(){
       return this.e0;
    }
    public a$c m0(RecyclerView$Adapter p0){
       this.R = p0;
       return this;
    }
    public a$c n0(int p0,int p1){
       this.J = p0;
       this.K = p1;
       return this;
    }
    public a$c o0(View p0){
       this.I = p0;
       return this;
    }
    public a$c p0(int p0){
       this.Z = p0;
       return this;
    }
    public a$c q0(boolean p0){
       this.W = p0;
       return this;
    }
    public a$c r0(List p0){
       this.Q = p0;
       return this;
    }
    public a$c s0(int p0){
       this.f0 = p0;
       return this;
    }
    public a$c t0(g p0){
       this.O = p0;
       return this;
    }
    public a$c u0(int p0){
       this.M = p0;
       return this;
    }
    public a$c v0(int p0){
       this.X = p0;
       return this;
    }
    public a$c w0(int p0,BubbleInterface$Position p1){
       this.h0 = p0;
       this.j0 = p1;
       return this;
    }
    public a$c x0(RecyclerView$LayoutManager p0){
       this.S = p0;
       return this;
    }
    public a$c y0(h p0){
       this.V = p0;
       return this;
    }
    public a$c z0(int p0){
       this.P = p0;
       return this;
    }
}
