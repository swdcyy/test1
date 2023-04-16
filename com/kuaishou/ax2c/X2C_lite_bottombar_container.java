package com.kuaishou.ax2c.X2C_lite_bottombar_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Bottombar_Container;

public class X2C_lite_bottombar_container implements IViewCreator	// class@000ffb
{

    public void X2C_lite_bottombar_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Bottombar_Container().createView(p0);
    }
}
