package com.kuaishou.ax2c.X2C_share_toolbar;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Share_Toolbar;

public class X2C_share_toolbar implements IViewCreator	// class@001071
{

    public void X2C_share_toolbar(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Share_Toolbar().createView(p0);
    }
}
