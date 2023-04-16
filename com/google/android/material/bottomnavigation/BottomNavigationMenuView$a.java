package com.google.android.material.bottomnavigation.BottomNavigationMenuView$a;
import android.view.View$OnClickListener;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import java.lang.Object;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import androidx.appcompat.view.menu.h;
import android.view.MenuItem;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.e;

public class BottomNavigationMenuView$a implements View$OnClickListener	// class@001646
{
    public final BottomNavigationMenuView b;

    public void BottomNavigationMenuView$a(BottomNavigationMenuView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       h itemData = p0.getItemData();
       BottomNavigationMenuView$a tb = this.b;
       if (!tb.y.O(itemData, tb.x, 0)) {
          itemData.setChecked(true);
       }
       return;
    }
}
