package com.kuaishou.ax2c.X2C_camera_item_lyrics;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Item_Lyrics;

public class X2C_camera_item_lyrics implements IViewCreator	// class@000fda
{

    public void X2C_camera_item_lyrics(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Item_Lyrics().createView(p0);
    }
}
