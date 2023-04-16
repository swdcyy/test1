package androidx.appcompat.view.menu.MenuItemWrapperICS$a;
import a2.b;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import android.content.Context;
import android.view.ActionProvider;
import android.view.View;
import android.view.SubMenu;
import v0.b;

public class MenuItemWrapperICS$a extends b	// class@00059b
{
    public final ActionProvider d;
    public final MenuItemWrapperICS e;

    public void MenuItemWrapperICS$a(MenuItemWrapperICS p0,Context p1,ActionProvider p2){
       this.e = p0;
       super(p1);
       this.d = p2;
    }
    public boolean a(){
       return this.d.hasSubMenu();
    }
    public View c(){
       return this.d.onCreateActionView();
    }
    public boolean e(){
       return this.d.onPerformDefaultAction();
    }
    public void f(SubMenu p0){
       this.d.onPrepareSubMenu(this.e.f(p0));
    }
}
