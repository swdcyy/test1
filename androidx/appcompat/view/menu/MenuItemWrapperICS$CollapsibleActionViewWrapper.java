package androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper;
import u0.c;
import android.widget.FrameLayout;
import android.view.View;
import android.content.Context;
import android.view.CollapsibleActionView;

public class MenuItemWrapperICS$CollapsibleActionViewWrapper extends FrameLayout implements c	// class@00059a
{
    public final CollapsibleActionView b;

    public void MenuItemWrapperICS$CollapsibleActionViewWrapper(View p0){
       super(p0.getContext());
       this.b = p0;
       this.addView(p0);
    }
    public void c(){
       this.b.onActionViewCollapsed();
    }
    public void f(){
       this.b.onActionViewExpanded();
    }
    public View getWrappedView(){
       return this.b;
    }
}
