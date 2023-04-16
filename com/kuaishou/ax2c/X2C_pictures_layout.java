package com.kuaishou.ax2c.X2C_pictures_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Pictures_Layout;

public class X2C_pictures_layout implements IViewCreator	// class@00105f
{

    public void X2C_pictures_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Pictures_Layout().createView(p0);
    }
}
