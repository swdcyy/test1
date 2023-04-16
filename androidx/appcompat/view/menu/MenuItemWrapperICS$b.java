package androidx.appcompat.view.menu.MenuItemWrapperICS$b;
import android.view.ActionProvider$VisibilityListener;
import androidx.appcompat.view.menu.MenuItemWrapperICS$a;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import a2.b$b;

public class MenuItemWrapperICS$b extends MenuItemWrapperICS$a implements ActionProvider$VisibilityListener	// class@00059c
{
    public b$b f;
    public final MenuItemWrapperICS g;

    public void MenuItemWrapperICS$b(MenuItemWrapperICS p0,Context p1,ActionProvider p2){
       this.g = p0;
       super(p0, p1, p2);
    }
    public boolean b(){
       return this.d.isVisible();
    }
    public View d(MenuItem p0){
       return this.d.onCreateActionView(p0);
    }
    public boolean g(){
       return this.d.overridesItemVisibility();
    }
    public void j(b$b p0){
       this.f = p0;
       this.d.setVisibilityListener(this);
    }
    public void onActionProviderVisibilityChanged(boolean p0){
       MenuItemWrapperICS$b tf = this.f;
       if (tf != null) {
          tf.onActionProviderVisibilityChanged(p0);
       }
       return;
    }
}
