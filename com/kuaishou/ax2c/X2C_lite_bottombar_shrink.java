package com.kuaishou.ax2c.X2C_lite_bottombar_shrink;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Bottombar_Shrink;

public class X2C_lite_bottombar_shrink implements IViewCreator	// class@000ffd
{

    public void X2C_lite_bottombar_shrink(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Bottombar_Shrink().createView(p0);
    }
}
