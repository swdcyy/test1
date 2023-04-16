package androidx.appcompat.view.menu.MenuItemWrapperICS$d;
import android.view.MenuItem$OnMenuItemClickListener;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import java.lang.Object;
import android.view.MenuItem;
import v0.b;

public class MenuItemWrapperICS$d implements MenuItem$OnMenuItemClickListener	// class@00059e
{
    public final MenuItem$OnMenuItemClickListener a;
    public final MenuItemWrapperICS b;

    public void MenuItemWrapperICS$d(MenuItemWrapperICS p0,MenuItem$OnMenuItemClickListener p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public boolean onMenuItemClick(MenuItem p0){
       return this.a.onMenuItemClick(this.b.e(p0));
    }
}
