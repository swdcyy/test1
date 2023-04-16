package androidx.appcompat.view.menu.b;
import android.view.View$OnKeyListener;
import android.widget.PopupWindow$OnDismissListener;
import v0.c;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import androidx.appcompat.view.menu.b$a;
import androidx.appcompat.view.menu.b$b;
import androidx.appcompat.view.menu.b$c;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import android.os.Handler;
import androidx.appcompat.widget.MenuPopupWindow;
import android.util.AttributeSet;
import w0.o;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.view.menu.e;
import java.util.List;
import java.lang.Object;
import androidx.appcompat.view.menu.b$d;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import a2.i0;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import ag6.a;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.os.Parcelable;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.j$a;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import java.util.Iterator;
import androidx.appcompat.view.menu.m;
import android.view.KeyEvent;
import a2.g;

public final class b extends c implements View$OnKeyListener, PopupWindow$OnDismissListener	// class@0005a6
{
    public PopupWindow$OnDismissListener A;
    public boolean B;
    public final Context c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public final List i;
    public final List j;
    public final ViewTreeObserver$OnGlobalLayoutListener k;
    public final View$OnAttachStateChangeListener l;
    public final o m;
    public int n;
    public int o;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public j$a y;
    public ViewTreeObserver z;
    public static final int C = 2131558411;

    public void b(Context p0,View p1,int p2,int p3,boolean p4){
       super();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new b$a(this);
       this.l = new b$b(this);
       this.m = new b$c(this);
       this.n = 0;
       this.o = 0;
       this.c = p0;
       this.p = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.w = false;
       this.r = this.F();
       Resources resources = p0.getResources();
       this.d = Math.max((c.c(resources).widthPixels / 2), c.b(resources, 0x7f07001d));
       this.h = new Handler();
    }
    public final MenuPopupWindow B(){
       MenuPopupWindow menuPopupWin = new MenuPopupWindow(this.c, null, this.e, this.f);
       menuPopupWin.P(this.m);
       menuPopupWin.H(this);
       menuPopupWin.G(this);
       menuPopupWin.z(this.p);
       menuPopupWin.C(this.o);
       menuPopupWin.F(true);
       menuPopupWin.E(2);
       return menuPopupWin;
    }
    public final int C(e p0){
       int i = this.j.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return -1;
          }
          if (p0 == this.j.get(i1).b) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return i1;
    }
    public final MenuItem D(e p0,e p1){
       MenuItem item;
       int i = p0.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          item = p0.getItem(i1);
          if (item.hasSubMenu() && p1 == item.getSubMenu()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return item;
    }
    public final View E(b$d p0,e p1){
       int headersCount;
       MenuItem menuItem = this.D(p0.b, p1);
       if (menuItem == null) {
          return null;
       }
       ListView listView = p0.a();
       ListAdapter adapter = listView.getAdapter();
       int i = 0;
       if (adapter instanceof HeaderViewListAdapter) {
          headersCount = adapter.getHeadersCount();
          adapter = adapter.getWrappedAdapter();
       }else {
          headersCount = 0;
       }
       int count = adapter.getCount();
       while (true) {
          if (i < count) {
             if (menuItem == adapter.c(i)) {
             label_0039 :
                if (i == -1) {
                   break ;
                }else {
                   i = (i + headersCount) - listView.getFirstVisiblePosition();
                   if (i < 0 || i >= listView.getChildCount()) {
                      return null;
                   }else {
                      return listView.getChildAt(i);
                   }
                }
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_0039 ;
          }
       }
       return null;
    }
    public final int F(){
       int i = 1;
       if (i0.B(this.p) == i) {
          i = 0;
       }
       return i;
    }
    public final int G(int p0){
       b tj = this.j;
       ListView listView = tj.get((tj.size() - 1)).a();
       int[] ointArray = new int[2];
       listView.getLocationOnScreen(ointArray);
       Rect rect = new Rect();
       this.q.getWindowVisibleDisplayFrame(rect);
       if (this.r == 1) {
          if (((ointArray[0] + listView.getWidth()) + p0) > rect.right) {
             return 0;
          }
          return 1;
       }else if((ointArray[0] - p0) < 0){
          return 1;
       }else {
          return 0;
       }
    }
    public final void H(e p0){
       boolean b;
       b$d uod1;
       View view;
       int i3;
       LayoutInflater layoutInflat = LayoutInflater.from(this.c);
       d uod = new d(p0, layoutInflat, this.g, b.C);
       b = true;
       if (!this.d() && this.w != null) {
          uod.d(b);
       }else if(this.d()){
          uod.d(c.z(p0));
       }
       int i = c.q(uod, null, this.c, this.d);
       MenuPopupWindow menuPopupWin = this.B();
       menuPopupWin.q(uod);
       menuPopupWin.B(i);
       menuPopupWin.C(this.o);
       if (this.j.size() > 0) {
          b tj = this.j;
          uod1 = tj.get((tj.size() - b));
          view = this.E(uod1, p0);
       }else {
          uod1 = null;
          view = uod1;
       }
       if (view != null) {
          menuPopupWin.Q(false);
          menuPopupWin.N(null);
          int i1 = this.G(i);
          int i2 = (i1 == b)? 1: 0;
          this.r = i1;
          if (Build$VERSION.SDK_INT >= 26) {
             menuPopupWin.z(view);
             i3 = 0;
          }else {
             int[] ointArray = new int[2];
             this.p.getLocationOnScreen(ointArray);
             int[] ointArray1 = new int[2];
             view.getLocationOnScreen(ointArray1);
             if ((this.o & 0x07) == 5) {
                ointArray[0] = ointArray[0] + this.p.getWidth();
                ointArray1[0] = ointArray1[0] + view.getWidth();
             }
             i3 = ointArray1[0] - ointArray[0];
             i1 = ointArray1[b] - ointArray[b];
          }
          if ((this.o & 5) == 5) {
             if (i2) {
             label_00c4 :
                i3 = i3 + i;
             label_00c7 :
                menuPopupWin.n(i3);
                menuPopupWin.I(b);
                menuPopupWin.j(0);
             }else {
                i = view.getWidth();
             }
          }else if(i2){
             i = view.getWidth();
             goto label_00c4 ;
          }
          i3 = i3 - i;
          goto label_00c7 ;
       }else if(this.s != null){
          menuPopupWin.n(this.u);
       }
       if (this.t != null) {
          menuPopupWin.j(this.v);
       }
       menuPopupWin.D(this.p());
       this.j.add(new b$d(menuPopupWin, p0, this.r));
       menuPopupWin.show();
       ListView listView = menuPopupWin.i();
       listView.setOnKeyListener(this);
       if (uod1 == null && (this.x != null && p0.z() != null)) {
          FrameLayout uFrameLayout = a.c(layoutInflat, R.layout.arg_RES_7f0d0012, listView, false);
          uFrameLayout.setEnabled(false);
          uFrameLayout.findViewById(0x1020016).setText(p0.z());
          listView.addHeaderView(uFrameLayout, null, false);
          menuPopupWin.show();
       }
    label_012e :
       return;
    }
    public Parcelable a(){
       return null;
    }
    public void b(e p0,boolean p1){
       int i = this.C(p0);
       if (i < 0) {
          return;
       }
       int i1 = i + 1;
       if (i1 < this.j.size()) {
          this.j.get(i1).b.e(false);
       }
       b$d uod = this.j.remove(i);
       uod.b.Q(this);
       if (this.B != null) {
          uod.a.O(null);
          uod.a.A(false);
       }
       uod.a.dismiss();
       i = this.j.size();
       this.r = (i > 0)? this.j.get((i - 1)).c: this.F();
       if (!i) {
          this.dismiss();
          b ty = this.y;
          if (ty != null) {
             ty.b(p0, true);
          }
          b tz = this.z;
          if (tz != null) {
             if (tz.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
             }
             this.z = null;
          }
          this.q.removeOnAttachStateChangeListener(this.l);
          this.A.onDismiss();
       }else if(p1){
          this.j.get(false).b.e(false);
       }
       return;
    }
    public void c(Parcelable p0){
    }
    public boolean d(){
       int i = 0;
       if (this.j.size() > 0 && this.j.get(i).a.d()) {
          i = true;
       }
       return i;
    }
    public void dismiss(){
       int i = this.j.size();
       if (i > 0) {
          b$d[] uodArray = new b$d[i];
          b$d[] uodArray1 = this.j.toArray(uodArray);
          i = i - 1;
          while (i >= 0) {
             object oobject = uodArray1[i];
             if (oobject.a.d()) {
                oobject.a.dismiss();
             }
             i = i - 1;
          }
       }
       return;
    }
    public void e(boolean p0){
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          c.A(iterator.next().a().getAdapter()).notifyDataSetChanged();
       }
       return;
    }
    public boolean f(m p0){
       Iterator iterator = this.j.iterator();
       while (true) {
          if (iterator.hasNext()) {
             b$d uod = iterator.next();
             if (p0 == uod.b) {
                uod.a().requestFocus();
                return true;
             }
          }else if(p0.hasVisibleItems()){
             this.n(p0);
             b ty = this.y;
             if (ty != null) {
                ty.c(p0);
                break ;
             }
             break ;
          }else {
             return false;
          }
       }
       return true;
    }
    public boolean h(){
       return false;
    }
    public ListView i(){
       ListView listView;
       if (this.j.isEmpty()) {
          listView = null;
       }else {
          b tj = this.j;
          listView = tj.get((tj.size() - 1)).a();
       }
       return listView;
    }
    public void l(j$a p0){
       this.y = p0;
    }
    public void n(e p0){
       p0.c(this, this.c);
       if (this.d()) {
          this.H(p0);
       }else {
          this.i.add(p0);
       }
       return;
    }
    public void onDismiss(){
       b$d uod;
       int i = this.j.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             uod = this.j.get(i1);
             if (!uod.a.d()) {
             label_001f :
                if (uod != null) {
                   uod.b.e(false);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             uod = null;
             goto label_001f ;
          }
       }
       return;
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (p2.getAction() != 1 || p1 != 82) {
          return false;
       }
       this.dismiss();
       return true;
    }
    public void r(View p0){
       if (this.p != p0) {
          this.p = p0;
          this.o = g.b(this.n, i0.B(p0));
       }
       return;
    }
    public void show(){
       if (this.d()) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          this.H(iterator.next());
       }
       this.i.clear();
       b tp = this.p;
       this.q = tp;
       if (tp != null) {
          b uob = (this.z == null)? 1: null;
          ViewTreeObserver viewTreeObse = tp.getViewTreeObserver();
          this.z = viewTreeObse;
          if (uob) {
             viewTreeObse.addOnGlobalLayoutListener(this.k);
          }
          this.q.addOnAttachStateChangeListener(this.l);
       }
       return;
    }
    public void t(boolean p0){
       this.w = p0;
    }
    public void u(int p0){
       if (this.n != p0) {
          this.n = p0;
          this.o = g.b(p0, i0.B(this.p));
       }
       return;
    }
    public void v(int p0){
       this.s = true;
       this.u = p0;
    }
    public void w(PopupWindow$OnDismissListener p0){
       this.A = p0;
    }
    public void x(boolean p0){
       this.x = p0;
    }
    public void y(int p0){
       this.t = true;
       this.v = p0;
    }
}
