package com.kuaishou.ax2c.X2C_camera_item_mirror;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Item_Mirror;

public class X2C_camera_item_mirror implements IViewCreator	// class@000fdb
{

    public void X2C_camera_item_mirror(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Item_Mirror().createView(p0);
    }
}
