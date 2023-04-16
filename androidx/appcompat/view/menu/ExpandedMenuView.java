package androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.e$b;
import androidx.appcompat.view.menu.k;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;
import android.content.Context;
import android.util.AttributeSet;
import w0.x;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListAdapter;
import java.lang.Object;

public final class ExpandedMenuView extends ListView implements e$b, k, AdapterView$OnItemClickListener	// class@000598
{
    public e b;
    public int c;
    public static final int[] d;

    static {
       ExpandedMenuView.d = new int[2]{0x10100d4,0x1010129};
    }
    public void ExpandedMenuView(Context p0,AttributeSet p1){
       super(p0, p1, 0x1010074);
    }
    public void ExpandedMenuView(Context p0,AttributeSet p1,int p2){
       super(p0, p1);
       this.setOnItemClickListener(this);
       x ox = x.v(p0, p1, ExpandedMenuView.d, p2, 0);
       if (ox.s(0)) {
          this.setBackgroundDrawable(ox.g(0));
       }
       int i = 1;
       if (ox.s(i)) {
          this.setDivider(ox.g(i));
       }
       ox.w();
       return;
    }
    public void d(e p0){
       this.b = p0;
    }
    public boolean g(h p0){
       return this.b.N(p0, 0);
    }
    public int getWindowAnimations(){
       return this.c;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.setChildrenDrawingCacheEnabled(false);
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       this.g(this.getAdapter().getItem(p2));
    }
}
