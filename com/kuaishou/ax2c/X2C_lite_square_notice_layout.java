package com.kuaishou.ax2c.X2C_lite_square_notice_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Square_Notice_Layout;

public class X2C_lite_square_notice_layout implements IViewCreator	// class@001009
{

    public void X2C_lite_square_notice_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Square_Notice_Layout().createView(p0);
    }
}
