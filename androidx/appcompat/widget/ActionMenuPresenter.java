package androidx.appcompat.widget.ActionMenuPresenter;
import a2.b$a;
import androidx.appcompat.view.menu.a;
import android.content.Context;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuPresenter$e;
import androidx.appcompat.view.menu.i;
import android.content.res.Configuration;
import u0.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionMenuView;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import androidx.appcompat.widget.ActionMenuPresenter$d;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter$c;
import java.lang.Runnable;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.m;
import java.lang.Object;
import androidx.appcompat.view.menu.h;
import a2.b;
import androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton;
import android.view.ViewParent;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuPresenter$a;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.k$a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e$b;
import androidx.appcompat.widget.ActionMenuPresenter$b;
import androidx.appcompat.view.menu.ActionMenuItemView$b;

public class ActionMenuPresenter extends a implements b$a	// class@0005cf
{
    public ActionMenuPresenter$a A;
    public ActionMenuPresenter$c B;
    public ActionMenuPresenter$b C;
    public final ActionMenuPresenter$e D;
    public int E;
    public ActionMenuPresenter$OverflowMenuButton l;
    public Drawable m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public final SparseBooleanArray y;
    public ActionMenuPresenter$d z;

    public void ActionMenuPresenter(Context p0){
       super(p0, 0x7f0d0003, 0x7f0d0002);
       this.y = new SparseBooleanArray();
       this.D = new ActionMenuPresenter$e(this);
    }
    public boolean A(){
       ActionMenuPresenter tz = this.z;
       boolean b = (tz != null && tz.d())? true: false;
       return b;
    }
    public void B(Configuration p0){
       if (this.t == null) {
          this.s = a.b(this.c).d();
       }
       a td = this.d;
       if (td != null) {
          td.M(true);
       }
       return;
    }
    public void C(boolean p0){
       this.w = p0;
    }
    public void D(ActionMenuView p0){
       this.j = p0;
       p0.d(this.d);
    }
    public void E(Drawable p0){
       ActionMenuPresenter tl = this.l;
       if (tl != null) {
          tl.setImageDrawable(p0);
       }else {
          this.n = true;
          this.m = p0;
       }
       return;
    }
    public void F(boolean p0){
       this.o = p0;
       this.p = true;
    }
    public boolean G(){
       if (this.o != null && !this.A()) {
          a td = this.d;
          if (td != null && (this.j != null && (this.B == null && !td.B().isEmpty()))) {
             ActionMenuPresenter$d uod = new ActionMenuPresenter$d(this, this.c, this.d, this.l, true);
             ActionMenuPresenter$c uoc = new ActionMenuPresenter$c(this, td);
             this.B = uoc;
             this.j.post(uoc);
             return true;
          }
       }
    label_003e :
       return false;
    }
    public Parcelable a(){
       ActionMenuPresenter$SavedState savedState = new ActionMenuPresenter$SavedState();
       savedState.b = this.E;
       return savedState;
    }
    public void b(e p0,boolean p1){
       this.u();
       super.b(p0, p1);
    }
    public void c(Parcelable p0){
       if (!p0 instanceof ActionMenuPresenter$SavedState) {
          return;
       }
       ActionMenuPresenter$SavedState b = p0.b;
       if (b > null) {
          MenuItem menuItem = this.d.findItem(b);
          if (menuItem != null) {
             this.f(menuItem.getSubMenu());
          }
       }
       return;
    }
    public void d(boolean p0){
       if (p0) {
          super.f(null);
       }else {
          a td = this.d;
          if (td != null) {
             td.e(false);
          }
       }
       return;
    }
    public void e(boolean p0){
       ArrayList uArrayList;
       int i1;
       super.e(p0);
       this.j.requestLayout();
       a td = this.d;
       int i = 0;
       if (td != null) {
          uArrayList = td.u();
          i1 = uArrayList.size();
          int i2 = 0;
          while (i2 < i1) {
             b uob = uArrayList.get(i2).b();
             if (uob != null) {
                uob.i(this);
             }
             i2 = i2 + 1;
          }
       }
       td = this.d;
       uArrayList = (td != null)? td.B(): null;
       if (this.o != null && uArrayList != null) {
          i1 = uArrayList.size();
          if (i1 == 1) {
             i = uArrayList.get(i).isActionViewExpanded() ^ 0x01;
          }else if(i1 > 0){
             i = 1;
          }
       }
       if (i) {
          if (this.l == null) {
             this.l = new ActionMenuPresenter$OverflowMenuButton(this, this.b);
          }
          ViewGroup parent = this.l.getParent();
          if (parent != this.j) {
             if (parent != null) {
                parent.removeView(this.l);
             }
             td = this.j;
             td.addView(this.l, td.F());
          }
       }else {
          ActionMenuPresenter tl = this.l;
          if (tl != null) {
             a tj = this.j;
             if (tl.getParent() == tj) {
                tj.removeView(this.l);
             }
          }
       }
       this.j.setOverflowReserved(this.o);
       return;
    }
    public boolean f(m p0){
       boolean b = false;
       if (!p0.hasVisibleItems()) {
          return b;
       }
       m om = p0;
       while (om.i0() != this.d) {
          om = om.i0();
       }
       View view = this.v(om.getItem());
       if (view == null) {
          return b;
       }
       this.E = p0.getItem().getItemId();
       int i = p0.size();
       int i1 = 0;
       while (i1 < i) {
          MenuItem item = p0.getItem(i1);
          if (item.isVisible() && item.getIcon() != null) {
             b = true;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       ActionMenuPresenter$a uoa = new ActionMenuPresenter$a(this, this.c, p0, view);
       this.A = uoa;
       uoa.g(b);
       this.A.j();
       super.f(p0);
       return true;
    }
    public boolean h(){
       ArrayList uArrayList;
       int i1;
       int i7;
       int measuredWidt;
       boolean b;
       int i9;
       a uoa = this;
       a d = uoa.d;
       View view = null;
       boolean i = 0;
       if (d != null) {
          uArrayList = d.G();
          i1 = uArrayList.size();
       }else {
          uArrayList = view;
          i1 = 0;
       }
       ActionMenuPresenter s = uoa.s;
       ActionMenuPresenter r = uoa.r;
       int i2 = View$MeasureSpec.makeMeasureSpec(i, i);
       a j = uoa.j;
       int i3 = 0;
       ActionMenuPresenter uActionMenuP = null;
       int i4 = 0;
       int i5 = 0;
       while (i3 < i1) {
          h oh = uArrayList.get(i3);
          if (oh.d()) {
             i4 = i4 + 1;
          }else if(oh.p()){
             i5 = i5 + 1;
          }else {
             uActionMenuP = 1;
          }
          if (uoa.w != null && oh.isActionViewExpanded()) {
             s = null;
          }
          i3 = i3 + 1;
       }
       if (uoa.o != null && (uActionMenuP || (i5 + i4) > s)) {
          s = s - 1;
       }
       int i6 = s - i4;
       ActionMenuPresenter y = uoa.y;
       y.clear();
       if (uoa.u != null) {
          uActionMenuP = uoa.x;
          i4 = r / uActionMenuP;
          i7 = uActionMenuP + ((r % uActionMenuP) / i4);
       }else {
          i7 = 0;
          i4 = 0;
       }
       i5 = 0;
       int i8 = 0;
       while (i5 < i1) {
          h oh1 = uArrayList.get(i5);
          if (oh1.d()) {
             View view1 = uoa.r(oh1, view, j);
             if (uoa.u != null) {
                i4 = i4 - ActionMenuView.L(view1, i7, i4, i2, i);
             }else {
                view1.measure(i2, i2);
             }
             measuredWidt = view1.getMeasuredWidth();
             r = r - measuredWidt;
             if (!i8) {
                i8 = measuredWidt;
             }
             measuredWidt = oh1.getGroupId();
             b = true;
             if (measuredWidt) {
                y.put(measuredWidt, b);
             }
             oh1.v(b);
             i9 = i1;
          }else if(oh1.p()){
             measuredWidt = oh1.getGroupId();
             b = y.get(measuredWidt);
             i = (i6 > 0 || (b && (r > 0 && (uoa.u == null || i4 > 0))))? true: false;
             int i10 = i;
             i9 = i1;
             if (i) {
                View view2 = uoa.r(oh1, null, j);
                if (uoa.u != null) {
                   int i11 = ActionMenuView.L(view2, i7, i4, i2, 0);
                   i4 = i4 - i11;
                   if (!i11) {
                      i10 = 0;
                   }
                }else {
                   view2.measure(i2, i2);
                }
                i = i10;
                i1 = view2.getMeasuredWidth();
                r = r - i1;
                if (!i8) {
                   i8 = i1;
                }
                if (uoa.u != null) {
                   if (r >= 0) {
                   label_00f7 :
                      i1 = 1;
                   label_00fa :
                      i = i & i1;
                   }
                }else {
                   i1 = r + i8;
                   if (i1 > 0) {
                      goto label_00f7 ;
                   }
                }
                i1 = 0;
                goto label_00fa ;
             }
             if (i && measuredWidt) {
                y.put(measuredWidt, true);
             }else if(b){
                y.put(measuredWidt, false);
                i1 = 0;
                while (i1 < i5) {
                   h oh2 = uArrayList.get(i1);
                   if (oh2.getGroupId() == measuredWidt) {
                      if (oh2.n()) {
                         i6 = i6 + 1;
                      }
                      oh2.v(false);
                   }
                   i1 = i1 + 1;
                   int i12 = this;
                }
             }
             if (i) {
                i6 = i6 - 1;
             }
             oh1.v(i);
          }else {
             i9 = i1;
             oh1.v(false);
          label_0139 :
             i5 = i5 + 1;
             view = null;
             uoa = this;
             i1 = i9;
             i = 0;
          }
          uoa = 0;
          goto label_0139 ;
       }
       return true;
    }
    public void k(Context p0,e p1){
       super.k(p0, p1);
       Resources resources = p0.getResources();
       a uoa = a.b(p0);
       if (this.p == null) {
          this.o = true;
       }
       if (this.v == null) {
          this.q = uoa.c();
       }
       if (this.t == null) {
          this.s = uoa.d();
       }
       ActionMenuPresenter tq = this.q;
       Drawable uDrawable = null;
       if (this.o != null) {
          if (this.l == null) {
             ActionMenuPresenter$OverflowMenuButton overflowMenu = new ActionMenuPresenter$OverflowMenuButton(this, this.b);
             this.l = overflowMenu;
             if (this.n != null) {
                overflowMenu.setImageDrawable(this.m);
                this.m = uDrawable;
                this.n = false;
             }
             this.l.measure(View$MeasureSpec.makeMeasureSpec(false, false), View$MeasureSpec.makeMeasureSpec(false, false));
          }
          tq = tq - this.l.getMeasuredWidth();
       }else {
          this.l = uDrawable;
       }
       this.r = tq;
       this.x = (int)(c.c(resources).density * 56.00f);
       return;
    }
    public k m(ViewGroup p0){
       k ok = super.m(p0);
       if (this.j != ok) {
          ok.setPresenter(this);
       }
       return ok;
    }
    public void n(h p0,k$a p1){
       p1.k(p0, 0);
       p1.setItemInvoker(this.j);
       if (this.C == null) {
          this.C = new ActionMenuPresenter$b(this);
       }
       p1.setPopupCallback(this.C);
       return;
    }
    public boolean p(ViewGroup p0,int p1){
       if (p0.getChildAt(p1) == this.l) {
          return false;
       }
       super.p(p0, p1);
       return true;
    }
    public View r(h p0,View p1,ViewGroup p2){
       View actionView = p0.getActionView();
       if (actionView == null || p0.l()) {
          actionView = super.r(p0, p1, p2);
       }
       int i = (p0.isActionViewExpanded())? 8: 0;
       actionView.setVisibility(i);
       ViewGroup$LayoutParams layoutParams = actionView.getLayoutParams();
       if (!p2.checkLayoutParams(layoutParams)) {
          actionView.setLayoutParams(p2.E(layoutParams));
       }
       return actionView;
    }
    public boolean t(int p0,h p1){
       return p1.n();
    }
    public boolean u(){
       return (this.x() | this.y());
    }
    public final View v(MenuItem p0){
       View childAt;
       a tj = this.j;
       if (tj == null) {
          return null;
       }
       int childCount = tj.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = tj.getChildAt(i);
          if (childAt instanceof k$a && childAt.getItemData() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public Drawable w(){
       ActionMenuPresenter tl = this.l;
       if (tl != null) {
          return tl.getDrawable();
       }
       if (this.n != null) {
          return this.m;
       }
       return null;
    }
    public boolean x(){
       ActionMenuPresenter tB = this.B;
       if (tB != null) {
          a tj = this.j;
          if (tj != null) {
             tj.removeCallbacks(tB);
             this.B = null;
             return true;
          }
       }
       tB = this.z;
       if (tB != null) {
          tB.dismiss();
          return true;
       }else {
          return false;
       }
    }
    public boolean y(){
       ActionMenuPresenter tA = this.A;
       if (tA == null) {
          return false;
       }
       tA.dismiss();
       return true;
    }
    public boolean z(){
       boolean b = (this.B != null || this.A())? true: false;
       return b;
    }
}
