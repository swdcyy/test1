package androidx.appcompat.view.menu.m;
import android.view.SubMenu;
import androidx.appcompat.view.menu.e;
import android.content.Context;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.e$a;
import android.view.MenuItem;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.view.View;
import java.lang.String;
import java.lang.StringBuilder;

public class m extends e implements SubMenu	// class@0005ba
{
    public e B;
    public h C;

    public void m(Context p0,e p1,h p2){
       super(p0);
       this.B = p1;
       this.C = p2;
    }
    public e F(){
       return this.B.F();
    }
    public boolean H(){
       return this.B.H();
    }
    public boolean I(){
       return this.B.I();
    }
    public boolean J(){
       return this.B.J();
    }
    public void V(e$a p0){
       this.B.V(p0);
    }
    public boolean f(h p0){
       return this.B.f(p0);
    }
    public MenuItem getItem(){
       return this.C;
    }
    public boolean h(e p0,MenuItem p1){
       boolean b = (super.h(p0, p1) || this.B.h(p0, p1))? true: false;
       return b;
    }
    public Menu i0(){
       return this.B;
    }
    public boolean m(h p0){
       return this.B.m(p0);
    }
    public void setGroupDividerEnabled(boolean p0){
       this.B.setGroupDividerEnabled(p0);
    }
    public SubMenu setHeaderIcon(int p0){
       this.Y(p0);
       return this;
    }
    public SubMenu setHeaderIcon(Drawable p0){
       this.Z(p0);
       return this;
    }
    public SubMenu setHeaderTitle(int p0){
       this.b0(p0);
       return this;
    }
    public SubMenu setHeaderTitle(CharSequence p0){
       this.c0(p0);
       return this;
    }
    public SubMenu setHeaderView(View p0){
       this.d0(p0);
       return this;
    }
    public SubMenu setIcon(int p0){
       this.C.setIcon(p0);
       return this;
    }
    public SubMenu setIcon(Drawable p0){
       this.C.setIcon(p0);
       return this;
    }
    public void setQwertyMode(boolean p0){
       this.B.setQwertyMode(p0);
    }
    public String v(){
       m tC = this.C;
       int itemId = (tC != null)? tC.getItemId(): 0;
       if (!itemId) {
          return null;
       }else {
          return "android:menu:actionviewstates"+":"+itemId;
       }
    }
}
