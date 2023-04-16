package androidx.appcompat.widget.MenuPopupWindow;
import w0.o;
import androidx.appcompat.widget.ListPopupWindow;
import android.os.Build$VERSION;
import android.widget.PopupWindow;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Method;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import android.transition.Transition;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView;

public class MenuPopupWindow extends ListPopupWindow implements o	// class@00060e
{
    public o K;
    public static Method L;

    static {
       try{
          if (Build$VERSION.SDK_INT <= 28) {
             Class[] uClassArray = new Class[]{Boolean.TYPE};
             MenuPopupWindow.L = PopupWindow.class.getDeclaredMethod("setTouchModal", uClassArray);
          }
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public void MenuPopupWindow(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, null, p2, p3);
    }
    public void N(Object p0){
       if (Build$VERSION.SDK_INT >= 23) {
          this.G.setEnterTransition(null);
       }
       return;
    }
    public void O(Object p0){
       if (Build$VERSION.SDK_INT >= 23) {
          this.G.setExitTransition(null);
       }
       return;
    }
    public void P(o p0){
       this.K = p0;
    }
    public void Q(boolean p0){
       if (Build$VERSION.SDK_INT <= 28) {
          Method l = MenuPopupWindow.L;
          if (l != null) {
             try{
                Object[] objArray = new Object[]{Boolean.valueOf(p0)};
                l.invoke(this.G, objArray);
             }catch(java.lang.Exception e0){
             }
          }
       }else {
          this.G.setTouchModal(p0);
       }
       return;
    }
    public void a(e p0,MenuItem p1){
       MenuPopupWindow tK = this.K;
       if (tK != null) {
          tK.a(p0, p1);
       }
       return;
    }
    public void b(e p0,MenuItem p1){
       MenuPopupWindow tK = this.K;
       if (tK != null) {
          tK.b(p0, p1);
       }
       return;
    }
    public DropDownListView s(Context p0,boolean p1){
       MenuPopupWindow$MenuDropDownListView menuDropDown = new MenuPopupWindow$MenuDropDownListView(p0, p1);
       menuDropDown.setHoverListener(this);
       return menuDropDown;
    }
}
