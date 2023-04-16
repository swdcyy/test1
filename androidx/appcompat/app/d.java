package androidx.appcompat.app.d;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import java.lang.CharSequence;
import android.view.Window$Callback;
import java.util.ArrayList;
import androidx.appcompat.app.d$a;
import androidx.appcompat.app.d$b;
import androidx.appcompat.widget.i;
import androidx.appcompat.app.d$e;
import w0.k;
import androidx.appcompat.widget.Toolbar$e;
import android.view.ViewGroup;
import java.lang.Runnable;
import android.view.View;
import a2.i0;
import androidx.appcompat.app.ActionBar$c;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.KeyCharacterMap;
import androidx.appcompat.app.ActionBar$a;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import androidx.appcompat.app.ActionBar$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.ActionBar$b;
import androidx.appcompat.app.c;
import android.widget.AdapterView$OnItemSelectedListener;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import androidx.appcompat.app.d$c;
import androidx.appcompat.app.d$d;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.e$a;
import androidx.appcompat.view.menu.e;

public class d extends ActionBar	// class@00058e
{
    public k d;
    public boolean e;
    public Window$Callback f;
    public boolean g;
    public boolean h;
    public ArrayList i;
    public final Runnable j;
    public final Toolbar$e k;

    public void d(Toolbar p0,CharSequence p1,Window$Callback p2){
       super();
       this.i = new ArrayList();
       this.j = new d$a(this);
       d$b uob = new d$b(this);
       this.k = uob;
       this.d = new i(p0, false);
       d$e uoe = new d$e(this, p2);
       this.f = uoe;
       this.d.setWindowCallback(uoe);
       p0.setOnMenuItemClickListener(uob);
       this.d.setWindowTitle(p1);
    }
    public boolean A(){
       this.d.A().removeCallbacks(this.j);
       i0.k0(this.d.A(), this.j);
       return true;
    }
    public boolean B(){
       boolean b = (!this.d.getVisibility())? true: false;
       return b;
    }
    public ActionBar$c C(){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void D(Configuration p0){
    }
    public void E(){
       this.d.A().removeCallbacks(this.j);
    }
    public boolean F(int p0,KeyEvent p1){
       Menu menu = this.q0();
       if (menu == null) {
          return 0;
       }
       int deviceId = (p1 != null)? p1.getDeviceId(): -1;
       boolean b = true;
       if (KeyCharacterMap.load(deviceId).getKeyboardType() == b) {
          b = false;
       }
       menu.setQwertyMode(b);
       return menu.performShortcut(p0, p1, 0);
    }
    public boolean G(KeyEvent p0){
       if (p0.getAction() == 1) {
          this.H();
       }
       return true;
    }
    public boolean H(){
       return this.d.f();
    }
    public void I(){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void J(ActionBar$a p0){
       this.i.remove(p0);
    }
    public void K(ActionBar$c p0){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void L(int p0){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void M(ActionBar$c p0){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void N(Drawable p0){
       this.d.e(p0);
    }
    public void O(int p0){
       this.P(a.c(LayoutInflater.from(this.d.getContext()), p0, this.d.A(), false));
    }
    public void P(View p0){
       this.Q(p0, new ActionBar$LayoutParams(-2, -2));
    }
    public void Q(View p0,ActionBar$LayoutParams p1){
       if (p0 != null) {
          p0.setLayoutParams(p1);
       }
       this.d.M(p0);
       return;
    }
    public void R(boolean p0){
    }
    public void S(boolean p0){
       int i = (p0)? 4: 0;
       this.U(i, 4);
       return;
    }
    public void T(int p0){
       this.U(p0, -1);
    }
    public void U(int p0,int p1){
       this.d.l(((p0 & p1) | ((~ p1) & this.d.w())));
    }
    public void V(boolean p0){
       int i = (p0)? 16: 0;
       this.U(i, 16);
       return;
    }
    public void W(boolean p0){
       int i = (p0)? 2: 0;
       this.U(i, 2);
       return;
    }
    public void X(boolean p0){
       int i = (p0)? 8: 0;
       this.U(i, 8);
       return;
    }
    public void Y(boolean p0){
       this.U(p0, 1);
    }
    public void Z(int p0){
       this.d.p(p0);
    }
    public void a0(Drawable p0){
       this.d.x(p0);
    }
    public void b0(int p0){
       this.d.setIcon(p0);
    }
    public void c0(Drawable p0){
       this.d.setIcon(p0);
    }
    public void d0(SpinnerAdapter p0,ActionBar$b p1){
       this.d.G(p0, new c(p1));
    }
    public void e0(int p0){
       this.d.setLogo(p0);
    }
    public void f(ActionBar$a p0){
       this.i.add(p0);
    }
    public void f0(Drawable p0){
       this.d.K(p0);
    }
    public void g(ActionBar$c p0){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void g0(int p0){
       if (p0 == 2) {
          throw new IllegalArgumentException("Tabs not supported in this configuration");
       }
       this.d.o(p0);
       return;
    }
    public void h(ActionBar$c p0,int p1){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void h0(int p0){
       if (this.d.n() != 1) {
          throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
       }
       this.d.O(p0);
       return;
    }
    public void i(ActionBar$c p0,int p1,boolean p2){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void i0(boolean p0){
    }
    public void j(ActionBar$c p0,boolean p1){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public void j0(int p0){
       d td = this.d;
       CharSequence text = (p0)? td.getContext().getText(p0): null;
       td.y(text);
       return;
    }
    public boolean k(){
       return this.d.a();
    }
    public void k0(CharSequence p0){
       this.d.y(p0);
    }
    public boolean l(){
       if (!this.d.H()) {
          return false;
       }
       this.d.collapseActionView();
       return true;
    }
    public void l0(int p0){
       d td = this.d;
       CharSequence text = (p0)? td.getContext().getText(p0): null;
       td.setTitle(text);
       return;
    }
    public void m(boolean p0){
       if (p0 == this.h) {
          return;
       }
       this.h = p0;
       int i = this.i.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.i.get(i1).a(p0);
       }
       return;
    }
    public void m0(CharSequence p0){
       this.d.setTitle(p0);
    }
    public View n(){
       return this.d.J();
    }
    public void n0(CharSequence p0){
       this.d.setWindowTitle(p0);
    }
    public int o(){
       return this.d.w();
    }
    public void o0(){
       this.d.setVisibility(0);
    }
    public int p(){
       return this.d.getHeight();
    }
    public int q(){
       return 0;
    }
    public final Menu q0(){
       if (this.g == null) {
          this.d.F(new d$c(this), new d$d(this));
          this.g = true;
       }
       return this.d.P();
    }
    public int r(){
       return 0;
    }
    public Window$Callback r0(){
       return this.f;
    }
    public int s(){
       return -1;
    }
    public void s0(){
       Menu menu = this.q0();
       View view = null;
       Menu menu1 = (menu instanceof e)? menu: view;
       if (menu1 != null) {
          menu1.h0();
       }
       menu.clear();
       if (!this.f.onCreatePanelMenu(0, menu) || !this.f.onPreparePanel(0, view, menu)) {
          menu.clear();
       }
       if (menu1 != null) {
          menu1.g0();
       }
       return;
    }
    public ActionBar$c t(){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public CharSequence u(){
       return this.d.getSubtitle();
    }
    public ActionBar$c v(int p0){
       throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    public int w(){
       return 0;
    }
    public Context x(){
       return this.d.getContext();
    }
    public CharSequence y(){
       return this.d.getTitle();
    }
    public void z(){
       this.d.setVisibility(8);
    }
}
