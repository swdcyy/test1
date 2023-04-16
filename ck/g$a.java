package ck.g$a;
import android.view.View$OnClickListener;
import ck.g;
import java.lang.Object;
import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;
import androidx.appcompat.view.menu.h;
import android.view.MenuItem;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.e;
import ck.g$c;

public class g$a implements View$OnClickListener	// class@000d1c
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       this.b.D(true);
       h itemData = p0.getItemData();
       g$a tb = this.b;
       boolean b = tb.e.O(itemData, tb, 0);
       if (itemData != null && (itemData.isCheckable() && b)) {
          this.b.g.R0(itemData);
       }
    label_0026 :
       this.b.D(0);
       this.b.e(0);
       return;
    }
}
