package com.kuaishou.ax2c.X2C_lite_anchor_info_area_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Anchor_Info_Area_Container;

public class X2C_lite_anchor_info_area_container implements IViewCreator	// class@000ff9
{

    public void X2C_lite_anchor_info_area_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Anchor_Info_Area_Container().createView(p0);
    }
}
