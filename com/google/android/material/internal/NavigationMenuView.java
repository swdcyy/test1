package com.google.android.material.internal.NavigationMenuView;
import androidx.appcompat.view.menu.k;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.appcompat.view.menu.e;

public class NavigationMenuView extends RecyclerView implements k	// class@00169f
{

    public void NavigationMenuView(Context p0){
       super(p0, null);
    }
    public void NavigationMenuView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NavigationMenuView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setLayoutManager(new LinearLayoutManager(p0, 1, false));
    }
    public void d(e p0){
    }
    public int getWindowAnimations(){
       return 0;
    }
}
