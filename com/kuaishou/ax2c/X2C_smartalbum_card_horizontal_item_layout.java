package com.kuaishou.ax2c.X2C_smartalbum_card_horizontal_item_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Smartalbum_Card_Horizontal_Item_Layout;

public class X2C_smartalbum_card_horizontal_item_layout implements IViewCreator	// class@001077
{

    public void X2C_smartalbum_card_horizontal_item_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Smartalbum_Card_Horizontal_Item_Layout().createView(p0);
    }
}
