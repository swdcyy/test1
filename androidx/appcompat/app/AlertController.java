package androidx.appcompat.app.AlertController;
import android.content.Context;
import q0.e;
import android.view.Window;
import java.lang.Object;
import androidx.appcompat.app.AlertController$a;
import androidx.appcompat.app.AlertController$g;
import android.content.DialogInterface;
import ll8.c$b;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.widget.Button;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ListView;
import android.view.KeyEvent;
import androidx.core.widget.NestedScrollView;
import android.view.ViewStub;
import android.view.ViewParent;
import java.lang.CharSequence;
import android.content.DialogInterface$OnClickListener;
import android.os.Message;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build$VERSION;
import a2.i0;
import androidx.appcompat.app.AlertController$b;
import androidx.core.widget.NestedScrollView$b;
import androidx.appcompat.app.AlertController$c;
import java.lang.Runnable;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertController$d;
import android.widget.AbsListView$OnScrollListener;
import androidx.appcompat.app.AlertController$e;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import ag6.a;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import androidx.appcompat.app.AlertController$RecycleListView;
import android.widget.ListAdapter;

public class AlertController	// class@000568
{
    public NestedScrollView A;
    public int B;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public Handler R;
    public final View$OnClickListener S;
    public final Context a;
    public final e b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    public void AlertController(Context p0,e p1,Window p2){
       super();
       this.n = false;
       this.B = 0;
       this.I = -1;
       this.Q = 0;
       this.S = new AlertController$a(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.R = new AlertController$g(p1);
       TypedArray typedArray = p0.obtainStyledAttributes(null, c$b.j, R.attr.arg_RES_7f040101, false);
       this.J = typedArray.getResourceId(false, false);
       this.K = typedArray.getResourceId(2, false);
       this.L = typedArray.getResourceId(4, false);
       this.M = typedArray.getResourceId(5, false);
       this.N = typedArray.getResourceId(7, false);
       this.O = typedArray.getResourceId(3, false);
       this.P = typedArray.getBoolean(6, true);
       this.d = typedArray.getDimensionPixelSize(true, false);
       typedArray.recycle();
       p1.d(true);
    }
    public static boolean a(View p0){
       if (p0.onCheckIsTextEditor()) {
          return true;
       }
       if (!p0 instanceof ViewGroup) {
          return false;
       }
       int childCount = p0.getChildCount();
       while (true) {
          if (childCount <= 0) {
             return false;
          }
          childCount = childCount - 1;
          if (AlertController.a(p0.getChildAt(childCount))) {
             break ;
          }
       }
       return true;
    }
    public static void f(View p0,View p1,View p2){
       int i = 4;
       if (p1 != null) {
          int i1 = (p0.canScrollVertically(-1))? 0: 4;
          p1.setVisibility(i1);
       }
       if (p2 != null) {
          if (p0.canScrollVertically(1)) {
             i = 0;
          }
          p2.setVisibility(i);
       }
       return;
    }
    public static boolean z(Context p0){
       TypedValue typedValue = new TypedValue();
       boolean b = true;
       p0.getTheme().resolveAttribute(R.attr.arg_RES_7f040100, typedValue, b);
       if (typedValue.data != null) {
       }else {
          b = false;
       }
       return b;
    }
    public final void b(Button p0){
       LinearLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.gravity = 1;
       layoutParams.weight = 0x3f000000;
       p0.setLayoutParams(layoutParams);
    }
    public int c(int p0){
       TypedValue typedValue = new TypedValue();
       this.a.getTheme().resolveAttribute(p0, typedValue, true);
       return typedValue.resourceId;
    }
    public ListView d(){
       return this.g;
    }
    public void e(){
       this.b.setContentView(this.j());
       this.y();
    }
    public boolean g(int p0,KeyEvent p1){
       AlertController tA = this.A;
       boolean b = (tA != null && tA.executeKeyEvent(p1))? true: false;
       return b;
    }
    public boolean h(int p0,KeyEvent p1){
       AlertController tA = this.A;
       boolean b = (tA != null && tA.executeKeyEvent(p1))? true: false;
       return b;
    }
    public final ViewGroup i(View p0,View p1){
       ViewGroup viewGroup;
       ViewGroup viewGroup1;
       if (p0 == null) {
          if (p1 instanceof ViewStub) {
             viewGroup = p1.inflate();
          }
          return viewGroup;
       }else if(p1 != null){
          ViewParent parent = p1.getParent();
          if (parent instanceof ViewGroup) {
             parent.removeView(p1);
          }
       }
       if (p0 instanceof ViewStub) {
          viewGroup1 = p0.inflate();
       }
       return viewGroup1;
    }
    public final int j(){
       AlertController tK = this.K;
       if (tK == null) {
          return this.J;
       }
       if (this.Q == 1) {
          return tK;
       }
       return this.J;
    }
    public void k(int p0,CharSequence p1,DialogInterface$OnClickListener p2,Message p3,Drawable p4){
       Message message = (p2 != null)? this.R.obtainMessage(p0, p2): null;
       if (p0 != -3) {
          if (p0 != -2) {
             if (p0 == -1) {
                this.p = p1;
                this.q = message;
                this.r = p4;
             }else {
                throw new IllegalArgumentException("Button does not exist");
             }
          }else {
             this.t = p1;
             this.u = message;
             this.v = p4;
          }
       }else {
          this.x = p1;
          this.y = message;
          this.z = p4;
       }
       return;
    }
    public void l(View p0){
       this.G = p0;
    }
    public void m(int p0){
       this.C = null;
       this.B = p0;
       AlertController tD = this.D;
       if (tD != null) {
          if (p0) {
             tD.setVisibility(0);
             this.D.setImageResource(this.B);
          }else {
             tD.setVisibility(8);
          }
       }
       return;
    }
    public void n(Drawable p0){
       this.C = p0;
       int i = 0;
       this.B = i;
       AlertController tD = this.D;
       if (tD != null) {
          if (p0 != null) {
             tD.setVisibility(i);
             this.D.setImageDrawable(p0);
          }else {
             tD.setVisibility(8);
          }
       }
       return;
    }
    public void o(CharSequence p0){
       this.f = p0;
       AlertController tF = this.F;
       if (tF != null) {
          tF.setText(p0);
       }
       return;
    }
    public final void p(ViewGroup p0,View p1,int p2,int p3){
       View view = this.c.findViewById(R.id.scrollIndicatorUp);
       View view1 = this.c.findViewById(R.id.scrollIndicatorDown);
       if (Build$VERSION.SDK_INT >= 23) {
          i0.L0(p1, p2, p3);
          if (view != null) {
             p0.removeView(view);
          }
          if (view1 != null) {
             p0.removeView(view1);
          }
       }else {
          AlertController uAlertContro = null;
          if (view != null && !(p2 & 0x01)) {
             p0.removeView(view);
             view = uAlertContro;
          }
          if (view1 != null && !(p2 & 0x02)) {
             p0.removeView(view1);
             view1 = uAlertContro;
          }
          if (view != null || view1 != null) {
             if (this.f != null) {
                this.A.setOnScrollChangeListener(new AlertController$b(this, view, view1));
                this.A.post(new AlertController$c(this, view, view1));
             }else {
                uAlertContro = this.g;
                if (uAlertContro != null) {
                   uAlertContro.setOnScrollListener(new AlertController$d(this, view, view1));
                   this.g.post(new AlertController$e(this, view, view1));
                }else if(view != null){
                   p0.removeView(view);
                }
                if (view1 != null) {
                   p0.removeView(view1);
                }
             }
          }
       }
    label_0079 :
       return;
    }
    public void q(CharSequence p0){
       this.e = p0;
       AlertController tE = this.E;
       if (tE != null) {
          tE.setText(p0);
       }
       return;
    }
    public void r(int p0){
       this.h = null;
       this.i = p0;
       this.n = false;
    }
    public void s(View p0){
       this.h = p0;
       this.i = 0;
       this.n = false;
    }
    public void t(View p0,int p1,int p2,int p3,int p4){
       this.h = p0;
       this.i = 0;
       this.n = true;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
    }
    public final void u(ViewGroup p0){
       int i1;
       AlertController tz;
       Button uButton = p0.findViewById(0x1020019);
       this.o = uButton;
       uButton.setOnClickListener(this.S);
       int i = 1;
       AlertController uAlertContro = null;
       if (TextUtils.isEmpty(this.p) && this.r == null) {
          this.o.setVisibility(8);
          i1 = 0;
       }else {
          this.o.setText(this.p);
          AlertController tr = this.r;
          if (tr != null) {
             tr.setBounds(0, 0, this.d, this.d);
             this.o.setCompoundDrawables(this.r, uAlertContro, uAlertContro, uAlertContro);
          }
          this.o.setVisibility(0);
          i1 = 1;
       }
       Button uButton1 = p0.findViewById(0x102001a);
       this.s = uButton1;
       uButton1.setOnClickListener(this.S);
       if (TextUtils.isEmpty(this.t) && this.v == null) {
          this.s.setVisibility(8);
       }else {
          this.s.setText(this.t);
          tz = this.v;
          if (tz != null) {
             tz.setBounds(0, 0, this.d, this.d);
             this.s.setCompoundDrawables(this.v, uAlertContro, uAlertContro, uAlertContro);
          }
          this.s.setVisibility(0);
          i1 = i1 | 0x02;
       }
       uButton1 = p0.findViewById(0x102001b);
       this.w = uButton1;
       uButton1.setOnClickListener(this.S);
       if (TextUtils.isEmpty(this.x) && this.z == null) {
          this.w.setVisibility(8);
       }else {
          this.w.setText(this.x);
          tz = this.z;
          if (tz != null) {
             tz.setBounds(0, 0, this.d, this.d);
             this.w.setCompoundDrawables(this.z, uAlertContro, uAlertContro, uAlertContro);
          }
          this.w.setVisibility(0);
          i1 = i1 | 0x04;
       }
       if (AlertController.z(this.a)) {
          if (i1 == i) {
             this.b(this.o);
          }else if(i1 == 2){
             this.b(this.s);
          }else if(i1 == 4){
             this.b(this.w);
          }
       }
       if (!i1) {
          i = 0;
       }
       if (!i) {
          p0.setVisibility(8);
       }
       return;
    }
    public final void v(ViewGroup p0){
       NestedScrollView nestedScroll = this.c.findViewById(R.id.scrollView);
       this.A = nestedScroll;
       int b = false;
       nestedScroll.setFocusable(b);
       this.A.setNestedScrollingEnabled(b);
       TextView textView = p0.findViewById(0x102000b);
       this.F = textView;
       if (textView == null) {
          return;
       }
       AlertController tf = this.f;
       if (tf != null) {
          textView.setText(tf);
       }else {
          b = 8;
          textView.setVisibility(b);
          this.A.removeView(this.F);
          if (this.g != null) {
             p0 = this.A.getParent();
             int i = p0.indexOfChild(this.A);
             p0.removeViewAt(i);
             p0.addView(this.g, i, new ViewGroup$LayoutParams(-1, -1));
          }else {
             p0.setVisibility(b);
          }
       }
       return;
    }
    public final void w(ViewGroup p0){
       AlertController th = this.h;
       AlertController uAlertContro = null;
       if (th != null) {
       }else if(this.i != null){
          th = a.c(LayoutInflater.from(this.a), this.i, p0, uAlertContro);
       }else {
          th = null;
       }
       if (th != null) {
          uAlertContro = 1;
       }
       if (!uAlertContro || !AlertController.a(th)) {
          this.c.setFlags(0x20000, 0x20000);
       }
       if (uAlertContro) {
          FrameLayout uFrameLayout = this.c.findViewById(R.id.custom);
          uFrameLayout.addView(th, new ViewGroup$LayoutParams(-1, -1));
          if (this.n != null) {
             uFrameLayout.setPadding(this.j, this.k, this.l, this.m);
          }
          if (this.g != null) {
             p0.a = 0;
          }
       }else {
          p0.setVisibility(8);
       }
       return;
    }
    public final void x(ViewGroup p0){
       int i = 0x7f0a3f72;
       if (this.G != null) {
          p0.addView(this.G, 0, new ViewGroup$LayoutParams(-1, -2));
          this.c.findViewById(i).setVisibility(8);
       }else {
          this.D = this.c.findViewById(0x1020006);
          if ((TextUtils.isEmpty(this.e) ^ 0x01) && this.P != null) {
             TextView textView = this.c.findViewById(R.id.alertTitle);
             this.E = textView;
             textView.setText(this.e);
             AlertController tB = this.B;
             if (tB != null) {
                this.D.setImageResource(tB);
             }else {
                tB = this.C;
                if (tB != null) {
                   this.D.setImageDrawable(tB);
                }else {
                   this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                   this.D.setVisibility(8);
                }
             }
          }else {
             this.c.findViewById(i).setVisibility(8);
             this.D.setVisibility(8);
             p0.setVisibility(8);
          }
       }
       return;
    }
    public final void y(){
       View view = this.c.findViewById(R.id.parentPanel);
       View view1 = view.findViewById(R.id.topPanel);
       View view2 = view.findViewById(R.id.contentPanel);
       View view3 = view.findViewById(R.id.buttonPanel);
       ViewGroup viewGroup = view.findViewById(R.id.customPanel);
       this.w(viewGroup);
       ViewGroup viewGroup1 = this.i(viewGroup.findViewById(R.id.topPanel), view1);
       ViewGroup viewGroup2 = this.i(viewGroup.findViewById(R.id.contentPanel), view2);
       ViewGroup viewGroup3 = this.i(viewGroup.findViewById(R.id.buttonPanel), view3);
       this.v(viewGroup2);
       this.u(viewGroup3);
       this.x(viewGroup1);
       AlertController uAlertContro = 8;
       int i = 0;
       AlertController uAlertContro1 = (viewGroup.getVisibility() != uAlertContro)? 1: null;
       boolean b = (viewGroup1 != null && viewGroup1.getVisibility() != uAlertContro)? true: false;
       boolean b1 = (viewGroup3.getVisibility() != uAlertContro)? true: false;
       if (!b1) {
          view2 = viewGroup2.findViewById(R.id.textSpacerNoButtons);
          if (view2 != null) {
             view2.setVisibility(i);
          }
       }
       if (b) {
          uAlertContro = this.A;
          if (uAlertContro != null) {
             uAlertContro.setClipToPadding(true);
          }
          view2 = null;
          if (this.f != null || this.g != null) {
             view2 = viewGroup1.findViewById(R.id.titleDividerNoCustom);
          }
          if (view2 != null) {
             view2.setVisibility(i);
          }
       }else {
          View view4 = viewGroup2.findViewById(R.id.textSpacerNoTitle);
          if (view4 != null) {
             view4.setVisibility(i);
          }
       }
       AlertController tg = this.g;
       if (tg instanceof AlertController$RecycleListView) {
          tg.a(b, b1);
       }
       if (!uAlertContro1) {
          uAlertContro1 = this.g;
          if (uAlertContro1 == null) {
             uAlertContro1 = this.A;
          }
          if (uAlertContro1 != null) {
             if (b1) {
                i = 2;
             }
             this.p(viewGroup2, uAlertContro1, (b | i), 3);
          }
       }
       uAlertContro1 = this.g;
       if (uAlertContro1 != null) {
          tg = this.H;
          if (tg != null) {
             uAlertContro1.setAdapter(tg);
             tg = this.I;
             if (tg > -1) {
                uAlertContro1.setItemChecked(tg, true);
                uAlertContro1.setSelection(tg);
             }
          }
       }
       return;
    }
}
