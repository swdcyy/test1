package androidx.appcompat.view.menu.e;
import t1.a;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.res.Resources;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.appcompat.view.menu.h;
import android.view.View;
import android.view.MenuItem;
import androidx.appcompat.view.menu.j;
import a2.b;
import androidx.appcompat.view.menu.m;
import android.view.SubMenu;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.appcompat.view.menu.e$a;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu$ContextMenuInfo;
import androidx.core.content.ContextCompat;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.view.ViewConfiguration;
import a2.j0;
import android.view.KeyEvent;
import android.os.Parcelable;
import android.view.KeyCharacterMap$KeyData;
import java.util.Collection;

public class e implements a	// class@0005ac
{
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public e$a e;
    public ArrayList f;
    public ArrayList g;
    public boolean h;
    public ArrayList i;
    public ArrayList j;
    public boolean k;
    public int l;
    public ContextMenu$ContextMenuInfo m;
    public CharSequence n;
    public Drawable o;
    public View p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ArrayList v;
    public CopyOnWriteArrayList w;
    public h x;
    public boolean y;
    public boolean z;
    public static final int[] A;

    static {
       e.A = new int[6]{1,4,5,3,2,0};
    }
    public void e(Context p0){
       super();
       this.l = 0;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.u = false;
       this.v = new ArrayList();
       this.w = new CopyOnWriteArrayList();
       this.y = false;
       this.a = p0;
       this.b = p0.getResources();
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = true;
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = true;
       this.f0(true);
    }
    public static int D(int p0){
       int[] a;
       int i = (0xffff0000 & p0) >> 16;
       if (i >= 0) {
          a = e.A;
          if (i < a.length) {
             return ((p0 & 0xffff) | (a[i] << 16));
          }
       }
       throw new IllegalArgumentException("order does not contain a valid category.");
    }
    public static int p(ArrayList p0,int p1){
       int i = p0.size() - 1;
       while (true) {
          if (i < 0) {
             return 0;
          }
          if (p0.get(i).h() <= p1) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return (i + 1);
    }
    public View A(){
       return this.p;
    }
    public ArrayList B(){
       this.t();
       return this.j;
    }
    public boolean C(){
       return this.t;
    }
    public Resources E(){
       return this.b;
    }
    public e F(){
       return this;
    }
    public ArrayList G(){
       if (this.h == null) {
          return this.g;
       }
       this.g.clear();
       int i = this.f.size();
       int i1 = 0;
       while (i1 < i) {
          h oh = this.f.get(i1);
          if (oh.isVisible()) {
             this.g.add(oh);
          }
          i1 = i1 + 1;
       }
       this.h = false;
       this.k = true;
       return this.g;
    }
    public boolean H(){
       return this.y;
    }
    public boolean I(){
       return this.c;
    }
    public boolean J(){
       return this.d;
    }
    public void K(h p0){
       this.k = true;
       this.M(true);
    }
    public void L(h p0){
       this.h = true;
       this.M(true);
    }
    public void M(boolean p0){
       if (this.q == null) {
          if (p0) {
             this.h = true;
             this.k = true;
          }
          this.i(p0);
       }else {
          this.r = true;
          if (p0) {
             this.s = true;
          }
       }
       return;
    }
    public boolean N(MenuItem p0,int p1){
       return this.O(p0, null, p1);
    }
    public boolean O(MenuItem p0,j p1,int p2){
       boolean b = false;
       if (p0 == null || !p0.isEnabled()) {
          return b;
       }
       boolean b1 = p0.m();
       b uob = p0.b();
       int i = (uob != null && uob.a())? 1: 0;
       if (p0.l()) {
          b1 = b1 | p0.expandActionView();
          if (b1) {
             this.e(true);
          }
       }else if(p0.hasSubMenu() || i){
          if (!(p2 & 0x04)) {
             this.e(b);
          }
          if (!p0.hasSubMenu()) {
             p0.y(new m(this.w(), this, p0));
          }
          m subMenu = p0.getSubMenu();
          if (i) {
             uob.f(subMenu);
          }
          b1 = b1 | this.l(subMenu, p1);
          if (!b1) {
             this.e(true);
          }
       }else if(!(p2 & 0x01)){
          this.e(true);
       }
       return b1;
    }
    public final void P(int p0,boolean p1){
       if (p0 >= 0 && p0 < this.f.size()) {
          this.f.remove(p0);
          if (p1) {
             this.M(true);
          }
       }
       return;
    }
    public void Q(j p0){
       Iterator iterator = this.w.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          j oj = weakReferenc.get();
          if (oj == null || oj == p0) {
             this.w.remove(weakReferenc);
          }
       }
       return;
    }
    public void R(Bundle p0){
       if (p0 == null) {
          return;
       }
       SparseArray sparseParcel = p0.getSparseParcelableArray(this.v());
       int i = this.size();
       int i1 = 0;
       while (i1 < i) {
          MenuItem item = this.getItem(i1);
          View actionView = item.getActionView();
          if (actionView != null && actionView.getId() != -1) {
             actionView.restoreHierarchyState(sparseParcel);
          }
          if (item.hasSubMenu()) {
             item.getSubMenu().R(p0);
          }
          i1 = i1 + 1;
       }
       int intx = p0.getInt("android:menu:expandedactionview");
       if (intx > 0) {
          MenuItem menuItem = this.findItem(intx);
          if (menuItem != null) {
             menuItem.expandActionView();
          }
       }
       return;
    }
    public void S(Bundle p0){
       this.j(p0);
    }
    public void T(Bundle p0){
       int i = this.size();
       SparseArray sparseArray = null;
       int i1 = 0;
       while (i1 < i) {
          MenuItem item = this.getItem(i1);
          View actionView = item.getActionView();
          if (actionView != null && actionView.getId() != -1) {
             if (sparseArray == null) {
                sparseArray = new SparseArray();
             }
             actionView.saveHierarchyState(sparseArray);
             if (item.isActionViewExpanded()) {
                p0.putInt("android:menu:expandedactionview", item.getItemId());
             }
          }
       label_0032 :
          if (item.hasSubMenu()) {
             item.getSubMenu().T(p0);
          }
          i1 = i1 + 1;
       }
       if (sparseArray != null) {
          p0.putSparseParcelableArray(this.v(), sparseArray);
       }
       return;
    }
    public void U(Bundle p0){
       this.k(p0);
    }
    public void V(e$a p0){
       this.e = p0;
    }
    public e W(int p0){
       this.l = p0;
       return this;
    }
    public void X(MenuItem p0){
       int groupId = p0.getGroupId();
       int i = this.f.size();
       this.h0();
       int i1 = 0;
       while (i1 < i) {
          h oh = this.f.get(i1);
          if (oh.getGroupId() == groupId && (oh.o() && oh.isCheckable())) {
             boolean b = (oh == p0)? true: false;
             oh.t(b);
          }
       label_0038 :
          i1 = i1 + 1;
       }
       this.g0();
       return;
    }
    public e Y(int p0){
       this.a0(0, null, p0, null, null);
       return this;
    }
    public e Z(Drawable p0){
       this.a0(0, null, 0, p0, null);
       return this;
    }
    public MenuItem a(int p0,int p1,int p2,CharSequence p3){
       int i = e.D(p2);
       h oh = this.g(p0, p1, p2, i, p3, this.l);
       e tm = this.m;
       if (tm != null) {
          oh.w(tm);
       }
       tm = this.f;
       tm.add(e.p(tm, i), oh);
       this.M(true);
       return oh;
    }
    public final void a0(int p0,CharSequence p1,int p2,Drawable p3,View p4){
       Resources resources = this.E();
       if (p4 != null) {
          this.p = p4;
          this.n = null;
          this.o = null;
       }else if(p0 > 0){
          this.n = resources.getText(p0);
       }else if(p1 != null){
          this.n = p1;
       }
       if (p2 > 0) {
          this.o = ContextCompat.getDrawable(this.w(), p2);
       }else if(p3 != null){
          this.o = p3;
       }
       this.p = null;
       this.M(false);
       return;
    }
    public MenuItem add(int p0){
       return this.a(0, 0, 0, this.b.getString(p0));
    }
    public MenuItem add(int p0,int p1,int p2,int p3){
       return this.a(p0, p1, p2, this.b.getString(p3));
    }
    public MenuItem add(int p0,int p1,int p2,CharSequence p3){
       return this.a(p0, p1, p2, p3);
    }
    public MenuItem add(CharSequence p0){
       return this.a(0, 0, 0, p0);
    }
    public int addIntentOptions(int p0,int p1,int p2,ComponentName p3,Intent[] p4,Intent p5,int p6,MenuItem[] p7){
       PackageManager packageManag = this.a.getPackageManager();
       int i = 0;
       List list = packageManag.queryIntentActivityOptions(p3, p4, p5, i);
       int i1 = (list != null)? list.size(): 0;
       p6 = p6 & 0x01;
       if (!p6) {
          this.removeGroup(p0);
       }
       while (i < i1) {
          ResolveInfo resolveInfo = list.get(i);
          ResolveInfo specificInde = resolveInfo.specificIndex;
          Intent intent = (specificInde < null)? p5: p4[specificInde];
          Intent intent1 = new Intent(intent);
          ResolveInfo activityInfo = resolveInfo.activityInfo;
          intent1.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
          MenuItem menuItem = this.add(p0, p1, p2, resolveInfo.loadLabel(packageManag)).setIcon(resolveInfo.loadIcon(packageManag)).setIntent(intent1);
          if (p7 != null) {
             resolveInfo = resolveInfo.specificIndex;
             if (resolveInfo >= null) {
                p7[resolveInfo] = menuItem;
             }
          }
          i = i + 1;
       }
       return i1;
    }
    public SubMenu addSubMenu(int p0){
       return this.addSubMenu(0, 0, 0, this.b.getString(p0));
    }
    public SubMenu addSubMenu(int p0,int p1,int p2,int p3){
       return this.addSubMenu(p0, p1, p2, this.b.getString(p3));
    }
    public SubMenu addSubMenu(int p0,int p1,int p2,CharSequence p3){
       h oh = this.a(p0, p1, p2, p3);
       m om = new m(this.a, this, oh);
       oh.y(om);
       return om;
    }
    public SubMenu addSubMenu(CharSequence p0){
       return this.addSubMenu(0, 0, 0, p0);
    }
    public void b(j p0){
       this.c(p0, this.a);
    }
    public e b0(int p0){
       this.a0(p0, null, 0, null, null);
       return this;
    }
    public void c(j p0,Context p1){
       this.w.add(new WeakReference(p0));
       p0.k(p1, this);
       this.k = true;
    }
    public e c0(CharSequence p0){
       this.a0(0, p0, 0, null, null);
       return this;
    }
    public void clear(){
       e tx = this.x;
       if (tx != null) {
          this.f(tx);
       }
       this.f.clear();
       this.M(true);
       return;
    }
    public void clearHeader(){
       this.o = null;
       this.n = null;
       this.p = null;
       this.M(false);
    }
    public void close(){
       this.e(true);
    }
    public void d(){
       e te = this.e;
       if (te != null) {
          te.a(this);
       }
       return;
    }
    public e d0(View p0){
       this.a0(0, null, 0, null, p0);
       return this;
    }
    public final void e(boolean p0){
       if (this.u != null) {
          return;
       }
       this.u = true;
       Iterator iterator = this.w.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          j oj = weakReferenc.get();
          if (oj == null) {
             this.w.remove(weakReferenc);
          }else {
             oj.b(this, p0);
          }
       }
       this.u = false;
       return;
    }
    public void e0(boolean p0){
       this.z = p0;
    }
    public boolean f(h p0){
       boolean b = false;
       if (!this.w.isEmpty() && this.x == p0) {
          this.h0();
          Iterator iterator = this.w.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             j oj = weakReferenc.get();
             if (oj == null) {
                this.w.remove(weakReferenc);
             }else {
                b = oj.j(this, p0);
                if (b) {
                   break ;
                }
             }
          }
          this.g0();
          if (b) {
             this.x = null;
          }
       }
       return b;
    }
    public final void f0(boolean p0){
       boolean b = true;
       if (!p0 || (this.b.getConfiguration().keyboard == b || !j0.f(ViewConfiguration.get(this.a), this.a))) {
          b = false;
       }
       this.d = b;
       return;
    }
    public MenuItem findItem(int p0){
       h oh;
       int i = this.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          oh = this.f.get(i1);
          if (oh.getItemId() == p0) {
             break ;
          }else if(oh.hasSubMenu()){
             MenuItem menuItem = oh.getSubMenu().findItem(p0);
             if (menuItem != null) {
                return menuItem;
             }
          }
          i1 = i1 + 1;
       }
       return oh;
    }
    public final h g(int p0,int p1,int p2,int p3,CharSequence p4,int p5){
       h oh = new h(this, p0, p1, p2, p3, p4, p5);
       return v8;
    }
    public void g0(){
       boolean b = false;
       this.q = b;
       if (this.r != null) {
          this.r = b;
          this.M(this.s);
       }
       return;
    }
    public MenuItem getItem(int p0){
       return this.f.get(p0);
    }
    public boolean h(e p0,MenuItem p1){
       e te = this.e;
       boolean b = (te != null && te.b(p0, p1))? true: false;
       return b;
    }
    public void h0(){
       if (this.q == null) {
          this.q = true;
          this.r = false;
          this.s = false;
       }
       return;
    }
    public boolean hasVisibleItems(){
       if (this.z != null) {
          return true;
       }
       int i = this.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if (this.f.get(i1).isVisible()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public final void i(boolean p0){
       if (this.w.isEmpty()) {
          return;
       }
       this.h0();
       Iterator iterator = this.w.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          j oj = weakReferenc.get();
          if (oj == null) {
             this.w.remove(weakReferenc);
          }else {
             oj.e(p0);
          }
       }
       this.g0();
       return;
    }
    public boolean isShortcutKey(int p0,KeyEvent p1){
       boolean b = (this.r(p0, p1) != null)? true: false;
       return b;
    }
    public final void j(Bundle p0){
       SparseArray sparseParcel = p0.getSparseParcelableArray("android:menu:presenters");
       if (sparseParcel != null && !this.w.isEmpty()) {
          Iterator iterator = this.w.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             j oj = weakReferenc.get();
             if (oj == null) {
                this.w.remove(weakReferenc);
             }else {
                int id = oj.getId();
                if (id > 0) {
                   Parcelable parcelable = sparseParcel.get(id);
                   if (parcelable != null) {
                      oj.c(parcelable);
                   }
                }
             }
          }
       }
       return;
    }
    public final void k(Bundle p0){
       if (this.w.isEmpty()) {
          return;
       }
       SparseArray sparseArray = new SparseArray();
       Iterator iterator = this.w.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          j oj = weakReferenc.get();
          if (oj == null) {
             this.w.remove(weakReferenc);
          }else {
             int id = oj.getId();
             if (id > 0) {
                Parcelable parcelable = oj.a();
                if (parcelable != null) {
                   sparseArray.put(id, parcelable);
                }
             }
          }
       }
       p0.putSparseParcelableArray("android:menu:presenters", sparseArray);
       return;
    }
    public final boolean l(m p0,j p1){
       boolean b = false;
       if (this.w.isEmpty()) {
          return b;
       }
       if (p1 != null) {
          b = p1.f(p0);
       }
       Iterator iterator = this.w.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          j oj = weakReferenc.get();
          if (oj == null) {
             this.w.remove(weakReferenc);
          }else if(!b){
             b = oj.f(p0);
          }
       }
       return b;
    }
    public boolean m(h p0){
       boolean b = false;
       if (this.w.isEmpty()) {
          return b;
       }
       this.h0();
       Iterator iterator = this.w.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          j oj = weakReferenc.get();
          if (oj == null) {
             this.w.remove(weakReferenc);
          }else {
             b = oj.g(this, p0);
             if (b) {
                break ;
             }
          }
       }
       this.g0();
       if (b) {
          this.x = p0;
       }
       return b;
    }
    public int n(int p0){
       return this.o(p0, 0);
    }
    public int o(int p0,int p1){
       int i = this.size();
       if (p1 < 0) {
          p1 = 0;
       }
       while (true) {
          if (p1 >= i) {
             return -1;
          }
          if (this.f.get(p1).getGroupId() == p0) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public boolean performIdentifierAction(int p0,int p1){
       return this.N(this.findItem(p0), p1);
    }
    public boolean performShortcut(int p0,KeyEvent p1,int p2){
       h oh = this.r(p0, p1);
       boolean b = (oh != null)? this.N(oh, p2): false;
       if (p2 & 0x02) {
          this.e(true);
       }
       return b;
    }
    public int q(int p0){
       int i = this.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return -1;
          }
          if (this.f.get(i1).getItemId() == p0) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return i1;
    }
    public h r(int p0,KeyEvent p1){
       h oh;
       e tv = this.v;
       tv.clear();
       this.s(tv, p0, p1);
       if (tv.isEmpty()) {
          return null;
       }
       int metaState = p1.getMetaState();
       KeyCharacterMap$KeyData keyData = new KeyCharacterMap$KeyData();
       p1.getKeyData(keyData);
       int i = tv.size();
       if (i == 1) {
          return tv.get(0);
       }
       boolean b = this.I();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          oh = tv.get(i1);
          char alphabeticSh = (b)? oh.getAlphabeticShortcut(): oh.getNumericShortcut();
          KeyCharacterMap$KeyData meta = keyData.meta;
          if (alphabeticSh == meta[0]) {
             int i2 = metaState & 0x02;
             if (i2) {
             label_004d :
                if (alphabeticSh == meta[2]) {
                   int i3 = metaState & 0x02;
                   if (i3) {
                      break ;
                   }
                }
                if (b && (alphabeticSh == 8 && p0 == 67)) {
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                break ;
             }
          }else {
             goto label_004d ;
          }
       }
       return oh;
    }
    public void removeGroup(int p0){
       int i = this.n(p0);
       if (i >= 0) {
          int i1 = this.f.size() - i;
          int i2 = 0;
          int i3 = i2 + 1;
          while (i2 < i1 && this.f.get(i).getGroupId() == p0) {
             this.P(i, false);
             i2 = i3;
          }
          this.M(true);
       }
       return;
    }
    public void removeItem(int p0){
       this.P(this.q(p0), true);
    }
    public void s(List p0,int p1,KeyEvent p2){
       boolean b = this.I();
       int modifiers = p2.getModifiers();
       KeyCharacterMap$KeyData keyData = new KeyCharacterMap$KeyData();
       if (!p2.getKeyData(keyData) && p1 != 67) {
          return;
       }
       int i = this.f.size();
       int i1 = 0;
       while (i1 < i) {
          h oh = this.f.get(i1);
          if (oh.hasSubMenu()) {
             oh.getSubMenu().s(p0, p1, p2);
          }
          char alphabeticSh = (b)? oh.getAlphabeticShortcut(): oh.getNumericShortcut();
          int alphabeticMo = (b)? oh.getAlphabeticModifiers(): oh.getNumericModifiers();
          int i2 = 0x1100f;
          int i3 = modifiers & i2;
          alphabeticMo = alphabeticMo & i2;
          KeyCharacterMap$KeyData keyData1 = (i3 == alphabeticMo)? 1: null;
          if (keyData1 && alphabeticSh) {
             keyData1 = keyData.meta;
             if (alphabeticSh != keyData1[0] && (alphabeticSh == keyData1[2] || (b && (alphabeticSh == 8 && (p1 == 67 && oh.isEnabled()))))) {
                p0.add(oh);
             }
          }
       label_007a :
          i1 = i1 + 1;
       }
       return;
    }
    public void setGroupCheckable(int p0,boolean p1,boolean p2){
       int i = this.f.size();
       int i1 = 0;
       while (i1 < i) {
          h oh = this.f.get(i1);
          if (oh.getGroupId() == p0) {
             oh.u(p2);
             oh.setCheckable(p1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void setGroupDividerEnabled(boolean p0){
       this.y = p0;
    }
    public void setGroupEnabled(int p0,boolean p1){
       int i = this.f.size();
       int i1 = 0;
       while (i1 < i) {
          h oh = this.f.get(i1);
          if (oh.getGroupId() == p0) {
             oh.setEnabled(p1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void setGroupVisible(int p0,boolean p1){
       int i = this.f.size();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          h oh = this.f.get(i1);
          if (oh.getGroupId() == p0 && oh.z(p1)) {
             i2 = 1;
          }
          i1 = i1 + 1;
       }
       if (i2) {
          this.M(true);
       }
       return;
    }
    public void setQwertyMode(boolean p0){
       this.c = p0;
       this.M(false);
    }
    public int size(){
       return this.f.size();
    }
    public void t(){
       ArrayList uArrayList = this.G();
       if (this.k == null) {
          return;
       }
       Iterator iterator = this.w.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          j oj = weakReferenc.get();
          if (oj == null) {
             this.w.remove(weakReferenc);
          }else {
             i = i | oj.h();
          }
       }
       if (i) {
          this.i.clear();
          this.j.clear();
          int i1 = uArrayList.size();
          i = 0;
          while (i < i1) {
             h oh = uArrayList.get(i);
             if (oh.n()) {
                this.i.add(oh);
             }else {
                this.j.add(oh);
             }
             i = i + 1;
          }
       }else {
          this.i.clear();
          this.j.clear();
          this.j.addAll(this.G());
       }
       this.k = false;
       return;
    }
    public ArrayList u(){
       this.t();
       return this.i;
    }
    public String v(){
       return "android:menu:actionviewstates";
    }
    public Context w(){
       return this.a;
    }
    public h x(){
       return this.x;
    }
    public Drawable y(){
       return this.o;
    }
    public CharSequence z(){
       return this.n;
    }
}
