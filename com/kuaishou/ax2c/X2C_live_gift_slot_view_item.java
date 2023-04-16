package com.kuaishou.ax2c.X2C_live_gift_slot_view_item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Gift_Slot_View_Item;

public class X2C_live_gift_slot_view_item implements IViewCreator	// class@001025
{

    public void X2C_live_gift_slot_view_item(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Gift_Slot_View_Item().createView(p0);
    }
}
