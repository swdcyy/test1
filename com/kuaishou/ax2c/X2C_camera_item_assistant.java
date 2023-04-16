package com.kuaishou.ax2c.X2C_camera_item_assistant;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Item_Assistant;

public class X2C_camera_item_assistant implements IViewCreator	// class@000fd6
{

    public void X2C_camera_item_assistant(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Item_Assistant().createView(p0);
    }
}
