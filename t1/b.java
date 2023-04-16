package t1.b;
import android.view.MenuItem;
import a2.b;
import android.view.View;
import java.lang.CharSequence;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public interface abstract b implements MenuItem	// class@002c3d
{

    b a(b p0);
    b b();
    boolean c();
    boolean collapseActionView();
    boolean d();
    boolean expandActionView();
    View getActionView();
    int getAlphabeticModifiers();
    CharSequence getContentDescription();
    ColorStateList getIconTintList();
    PorterDuff$Mode getIconTintMode();
    int getNumericModifiers();
    CharSequence getTooltipText();
    boolean isActionViewExpanded();
    MenuItem setActionView(int p0);
    MenuItem setActionView(View p0);
    MenuItem setAlphabeticShortcut(char p0,int p1);
    b setContentDescription(CharSequence p0);
    MenuItem setIconTintList(ColorStateList p0);
    MenuItem setIconTintMode(PorterDuff$Mode p0);
    MenuItem setNumericShortcut(char p0,int p1);
    MenuItem setShortcut(char p0,char p1,int p2,int p3);
    void setShowAsAction(int p0);
    MenuItem setShowAsActionFlags(int p0);
    b setTooltipText(CharSequence p0);
}
