package androidx.appcompat.view.menu.h;
import t1.b;
import androidx.appcompat.view.menu.e;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import a2.b;
import androidx.appcompat.view.menu.h$a;
import a2.b$b;
import android.view.MenuItem;
import android.view.MenuItem$OnActionExpandListener;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.view.ActionProvider;
import java.lang.UnsupportedOperationException;
import android.view.View;
import android.content.Context;
import r0.a;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.SubMenu;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.k$a;
import android.view.MenuItem$OnMenuItemClickListener;
import java.lang.Runnable;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import ag6.a;
import java.lang.Character;
import android.view.KeyEvent;
import java.lang.IllegalArgumentException;
import androidx.appcompat.view.menu.m;

public final class h implements b	// class@0005b0
{
    public View A;
    public b B;
    public MenuItem$OnActionExpandListener C;
    public boolean D;
    public ContextMenu$ContextMenuInfo E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public Drawable l;
    public int m;
    public e n;
    public m o;
    public Runnable p;
    public MenuItem$OnMenuItemClickListener q;
    public CharSequence r;
    public CharSequence s;
    public ColorStateList t;
    public PorterDuff$Mode u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public void h(e p0,int p1,int p2,int p3,int p4,CharSequence p5,int p6){
       super();
       this.i = 4096;
       this.k = 4096;
       this.m = 0;
       this.t = null;
       this.u = null;
       this.v = false;
       this.w = false;
       this.x = false;
       this.y = 16;
       this.z = 0;
       this.D = false;
       this.n = p0;
       this.a = p2;
       this.b = p1;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.z = p6;
    }
    public static void f(StringBuilder p0,int p1,int p2,String p3){
       if ((p1 & p2) == p2) {
          p0+p3;
       }
       return;
    }
    public boolean A(){
       return this.n.C();
    }
    public boolean B(){
       boolean b = (this.n.J() && this.i())? true: false;
       return b;
    }
    public boolean C(){
       boolean b = ((this.z & 4) == 4)? true: false;
       return b;
    }
    public b a(b p0){
       h tB = this.B;
       if (tB != null) {
          tB.h();
       }
       this.A = null;
       this.B = p0;
       this.n.M(true);
       h tB1 = this.B;
       if (tB1 != null) {
          tB1.j(new h$a(this));
       }
       return this;
    }
    public b b(){
       return this.B;
    }
    public boolean c(){
       boolean b = (!this.d() && !this.p())? true: false;
       return b;
    }
    public boolean collapseActionView(){
       if (!(this.z & 0x08)) {
          return false;
       }
       if (this.A == null) {
          return true;
       }
       h tC = this.C;
       if (tC == null || tC.onMenuItemActionCollapse(this)) {
          return this.n.f(this);
       }
       return false;
    }
    public boolean d(){
       boolean b = ((this.z & 2) == 2)? true: false;
       return b;
    }
    public void e(){
       this.n.K(this);
    }
    public boolean expandActionView(){
       if (!this.l()) {
          return false;
       }
       h tC = this.C;
       if (tC == null || tC.onMenuItemActionExpand(this)) {
          return this.n.m(this);
       }
       return false;
    }
    public final Drawable g(Drawable p0){
       if (p0 != null && (this.x != null && (this.v != null || this.w != null))) {
          p0 = a.r(p0).mutate();
          if (this.v != null) {
             a.o(p0, this.t);
          }
          if (this.w != null) {
             a.p(p0, this.u);
          }
          this.x = false;
       }
    label_002b :
       return p0;
    }
    public ActionProvider getActionProvider(){
       throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider\(\)");
    }
    public View getActionView(){
       h tA = this.A;
       if (tA != null) {
          return tA;
       }
       tA = this.B;
       if (tA == null) {
          return null;
       }
       View view = tA.d(this);
       this.A = view;
       return view;
    }
    public int getAlphabeticModifiers(){
       return this.k;
    }
    public char getAlphabeticShortcut(){
       return this.j;
    }
    public CharSequence getContentDescription(){
       return this.r;
    }
    public int getGroupId(){
       return this.b;
    }
    public Drawable getIcon(){
       h tl = this.l;
       if (tl != null) {
          return this.g(tl);
       }
       if (this.m == null) {
          return null;
       }
       Drawable uDrawable = a.d(this.n.w(), this.m);
       this.m = 0;
       this.l = uDrawable;
       return this.g(uDrawable);
    }
    public ColorStateList getIconTintList(){
       return this.t;
    }
    public PorterDuff$Mode getIconTintMode(){
       return this.u;
    }
    public Intent getIntent(){
       return this.g;
    }
    public int getItemId(){
       return this.a;
    }
    public ContextMenu$ContextMenuInfo getMenuInfo(){
       return this.E;
    }
    public int getNumericModifiers(){
       return this.i;
    }
    public char getNumericShortcut(){
       return this.h;
    }
    public int getOrder(){
       return this.c;
    }
    public SubMenu getSubMenu(){
       return this.o;
    }
    public CharSequence getTitle(){
       return this.e;
    }
    public CharSequence getTitleCondensed(){
       h tf = this.f;
       if (tf != null) {
       }else {
          tf = this.e;
       }
       return tf;
    }
    public CharSequence getTooltipText(){
       return this.s;
    }
    public int h(){
       return this.d;
    }
    public boolean hasSubMenu(){
       boolean b = (this.o != null)? true: false;
       return b;
    }
    public char i(){
       h tj = (this.n.I())? this.j: this.h;
       return tj;
    }
    public boolean isActionViewExpanded(){
       return this.D;
    }
    public boolean isCheckable(){
       int i = 1;
       if ((this.y & i) == i) {
       }else {
          i = false;
       }
       return i;
    }
    public boolean isChecked(){
       boolean b = ((this.y & 2) == 2)? true: false;
       return b;
    }
    public boolean isEnabled(){
       boolean b = (this.y & 0x10)? true: false;
       return b;
    }
    public boolean isVisible(){
       h tB = this.B;
       boolean b = true;
       if (tB != null && tB.g()) {
          if ((this.y & 0x08) || !this.B.b()) {
             b = false;
          }
          return b;
       }else if(!(this.y & 0x08)){
          b = false;
       }
       return b;
    }
    public String j(){
       char c = this.i();
       if (!c) {
          return "";
       }
       Resources resources = this.n.w().getResources();
       StringBuilder str = "";
       if (ViewConfiguration.get(this.n.w()).hasPermanentMenuKey()) {
          str = str+resources.getString(0x7f10001f);
       }
       h tk = (this.n.I())? this.k: this.i;
       h.f(str, tk, 0x10000, resources.getString(R.string.arg_RES_7f10001b));
       h.f(str, tk, 4096, resources.getString(R.string.arg_RES_7f100017));
       h.f(str, tk, 2, resources.getString(R.string.arg_RES_7f100016));
       h.f(str, tk, 1, resources.getString(R.string.arg_RES_7f10001c));
       h.f(str, tk, 4, resources.getString(R.string.arg_RES_7f10001e));
       h.f(str, tk, 8, resources.getString(R.string.arg_RES_7f10001a));
       if (c != 8) {
          if (c != 10) {
             str = (c != ' ')? str+c: str+resources.getString(0x7f10001d);
          }else {
             str = str+resources.getString(0x7f100019);
          }
       }else {
          str = str+resources.getString(0x7f100018);
       }
       return str;
    }
    public CharSequence k(k$a p0){
       CharSequence titleCondens = (p0.i())? this.getTitleCondensed(): this.getTitle();
       return titleCondens;
    }
    public boolean l(){
       boolean b = false;
       if (this.z & 0x08) {
          if (this.A == null) {
             h tB = this.B;
             if (tB != null) {
                this.A = tB.d(this);
             }
          }
          if (this.A != null) {
             b = true;
          }
       }
       return b;
    }
    public boolean m(){
       h tq = this.q;
       if (tq != null && tq.onMenuItemClick(this)) {
          return true;
       }
       if (this.n.h(this.n, this)) {
          return true;
       }
       tq = this.p;
       if (tq != null) {
          tq.run();
          return true;
       }else if(this.g != null){
          try{
             this.n.w().startActivity(this.g);
             return true;
          }catch(android.content.ActivityNotFoundException e0){
          }
          tq = this.B;
          if (tq != null && tq.e()) {
             return v1;
          }
          return false;
       }else {
          goto label_002e ;
       }
    }
    public boolean n(){
       boolean b = ((this.y & 32) == 32)? true: false;
       return b;
    }
    public boolean o(){
       boolean b = (this.y & 0x04)? true: false;
       return b;
    }
    public boolean p(){
       int i = 1;
       if ((this.z & i) == i) {
       }else {
          i = false;
       }
       return i;
    }
    public b q(int p0){
       Context uContext = this.n.w();
       LayoutInflater layoutInflat = LayoutInflater.from(uContext);
       LinearLayout linearLayout = new LinearLayout(uContext);
       this.r(a.c(layoutInflat, p0, linearLayout, false));
       return this;
    }
    public b r(View p0){
       this.A = p0;
       this.B = null;
       if (p0 != null && p0.getId() == -1) {
          h ta = this.a;
          if (ta > null) {
             p0.setId(ta);
          }
       }
       this.n.K(this);
       return this;
    }
    public void s(boolean p0){
       this.D = p0;
       this.n.M(false);
    }
    public MenuItem setActionProvider(ActionProvider p0){
       throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider\(\)");
    }
    public MenuItem setActionView(int p0){
       this.q(p0);
       return this;
    }
    public MenuItem setActionView(View p0){
       this.r(p0);
       return this;
    }
    public MenuItem setAlphabeticShortcut(char p0){
       if (this.j == p0) {
          return this;
       }
       this.j = Character.toLowerCase(p0);
       this.n.M(false);
       return this;
    }
    public MenuItem setAlphabeticShortcut(char p0,int p1){
       if (this.j == p0 && this.k == p1) {
          return this;
       }
       this.j = Character.toLowerCase(p0);
       this.k = KeyEvent.normalizeMetaState(p1);
       this.n.M(false);
       return this;
    }
    public MenuItem setCheckable(boolean p0){
       h ty = this.y;
       int i = p0 | (ty & 0xfe);
       this.y = i;
       if (ty != i) {
          this.n.M(false);
       }
       return this;
    }
    public MenuItem setChecked(boolean p0){
       if (this.y & 0x04) {
          this.n.X(this);
       }else {
          this.t(p0);
       }
       return this;
    }
    public MenuItem setContentDescription(CharSequence p0){
       this.setContentDescription(p0);
       return this;
    }
    public b setContentDescription(CharSequence p0){
       this.r = p0;
       this.n.M(false);
       return this;
    }
    public MenuItem setEnabled(boolean p0){
       this.y = (p0)? this.y | 0x10: this.y & 0xef;
       this.n.M(false);
       return this;
    }
    public MenuItem setIcon(int p0){
       this.l = null;
       this.m = p0;
       this.x = true;
       this.n.M(false);
       return this;
    }
    public MenuItem setIcon(Drawable p0){
       this.m = 0;
       this.l = p0;
       this.x = true;
       this.n.M(0);
       return this;
    }
    public MenuItem setIconTintList(ColorStateList p0){
       this.t = p0;
       this.v = true;
       this.x = true;
       this.n.M(false);
       return this;
    }
    public MenuItem setIconTintMode(PorterDuff$Mode p0){
       this.u = p0;
       this.w = true;
       this.x = true;
       this.n.M(false);
       return this;
    }
    public MenuItem setIntent(Intent p0){
       this.g = p0;
       return this;
    }
    public MenuItem setNumericShortcut(char p0){
       if (this.h == p0) {
          return this;
       }
       this.h = p0;
       this.n.M(false);
       return this;
    }
    public MenuItem setNumericShortcut(char p0,int p1){
       if (this.h == p0 && this.i == p1) {
          return this;
       }
       this.h = p0;
       this.i = KeyEvent.normalizeMetaState(p1);
       this.n.M(false);
       return this;
    }
    public MenuItem setOnActionExpandListener(MenuItem$OnActionExpandListener p0){
       this.C = p0;
       return this;
    }
    public MenuItem setOnMenuItemClickListener(MenuItem$OnMenuItemClickListener p0){
       this.q = p0;
       return this;
    }
    public MenuItem setShortcut(char p0,char p1){
       this.h = p0;
       this.j = Character.toLowerCase(p1);
       this.n.M(false);
       return this;
    }
    public MenuItem setShortcut(char p0,char p1,int p2,int p3){
       this.h = p0;
       this.i = KeyEvent.normalizeMetaState(p2);
       this.j = Character.toLowerCase(p1);
       this.k = KeyEvent.normalizeMetaState(p3);
       this.n.M(false);
       return this;
    }
    public void setShowAsAction(int p0){
       int i = p0 & 0x03;
       if (!i || (i != 1 && i != 2)) {
          throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
       }
       this.z = p0;
       this.n.K(this);
       return;
    }
    public MenuItem setShowAsActionFlags(int p0){
       this.x(p0);
       return this;
    }
    public MenuItem setTitle(int p0){
       this.setTitle(this.n.w().getString(p0));
       return this;
    }
    public MenuItem setTitle(CharSequence p0){
       this.e = p0;
       this.n.M(false);
       h to = this.o;
       if (to != null) {
          to.setHeaderTitle(p0);
       }
       return this;
    }
    public MenuItem setTitleCondensed(CharSequence p0){
       this.f = p0;
       this.n.M(false);
       return this;
    }
    public MenuItem setTooltipText(CharSequence p0){
       this.setTooltipText(p0);
       return this;
    }
    public b setTooltipText(CharSequence p0){
       this.s = p0;
       this.n.M(false);
       return this;
    }
    public MenuItem setVisible(boolean p0){
       if (this.z(p0)) {
          this.n.L(this);
       }
       return this;
    }
    public void t(boolean p0){
       h ty = this.y;
       int i = ty & 0xfd;
       int i1 = (p0)? 2: 0;
       i1 = i1 | i;
       this.y = i1;
       if (ty != i1) {
          this.n.M(false);
       }
       return;
    }
    public String toString(){
       h te = this.e;
       String str = (te != null)? te.toString(): null;
       return str;
    }
    public void u(boolean p0){
       int i = this.y & 0xfb;
       int i1 = (p0)? 4: 0;
       this.y = i1 | i;
       return;
    }
    public void v(boolean p0){
       this.y = (p0)? this.y | 0x20: this.y & 0xdf;
       return;
    }
    public void w(ContextMenu$ContextMenuInfo p0){
       this.E = p0;
    }
    public b x(int p0){
       this.setShowAsAction(p0);
       return this;
    }
    public void y(m p0){
       this.o = p0;
       p0.setHeaderTitle(this.getTitle());
    }
    public boolean z(boolean p0){
       h ty = this.y;
       int i = ty & 0xf7;
       boolean b = false;
       int i1 = (p0)? 0: 8;
       i1 = i1 | i;
       this.y = i1;
       if (ty != i1) {
          b = true;
       }
       return b;
    }
}
