package androidx.appcompat.view.menu.MenuItemWrapperICS$c;
import android.view.MenuItem$OnActionExpandListener;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import java.lang.Object;
import android.view.MenuItem;
import v0.b;

public class MenuItemWrapperICS$c implements MenuItem$OnActionExpandListener	// class@00059d
{
    public final MenuItem$OnActionExpandListener a;
    public final MenuItemWrapperICS b;

    public void MenuItemWrapperICS$c(MenuItemWrapperICS p0,MenuItem$OnActionExpandListener p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public boolean onMenuItemActionCollapse(MenuItem p0){
       return this.a.onMenuItemActionCollapse(this.b.e(p0));
    }
    public boolean onMenuItemActionExpand(MenuItem p0){
       return this.a.onMenuItemActionExpand(this.b.e(p0));
    }
}
