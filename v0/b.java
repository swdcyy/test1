package v0.b;
import android.content.Context;
import java.lang.Object;
import android.view.MenuItem;
import t1.b;
import androidx.collection.SimpleArrayMap;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import android.view.SubMenu;
import t1.c;
import v0.f;

public abstract class b	// class@002dae
{
    public final Context a;
    public SimpleArrayMap b;
    public SimpleArrayMap c;

    public void b(Context p0){
       super();
       this.a = p0;
    }
    public final MenuItem e(MenuItem p0){
       MenuItemWrapperICS menuItemWrap;
       if (p0 instanceof b) {
          b uob = p0;
          if (this.b == null) {
             this.b = new SimpleArrayMap();
          }
          p0 = this.b.get(p0);
          if (p0 == null) {
             menuItemWrap = new MenuItemWrapperICS(this.a, uob);
             this.b.put(uob, menuItemWrap);
          }
       }
       return menuItemWrap;
    }
    public final SubMenu f(SubMenu p0){
       if (!p0 instanceof c) {
          return p0;
       }
       if (this.c == null) {
          this.c = new SimpleArrayMap();
       }
       SubMenu subMenu = this.c.get(p0);
       if (subMenu == null) {
          subMenu = new f(this.a, p0);
          this.c.put(p0, subMenu);
       }
       return subMenu;
    }
    public final void g(){
       b tb = this.b;
       if (tb != null) {
          tb.clear();
       }
       tb = this.c;
       if (tb != null) {
          tb.clear();
       }
       return;
    }
    public final void h(int p0){
       if (this.b == null) {
          return;
       }
       int i = 0;
       while (i < this.b.size()) {
          if (this.b.keyAt(i).getGroupId() == p0) {
             this.b.removeAt(i);
             i = i - 1;
          }
          i = i + 1;
       }
       return;
    }
    public final void i(int p0){
       if (this.b == null) {
          return;
       }
       int i = 0;
       while (i < this.b.size()) {
          if (this.b.keyAt(i).getItemId() == p0) {
             this.b.removeAt(i);
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
}
