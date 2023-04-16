package com.kuaishou.ax2c.X2C_nasa_float_controller;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Nasa_Float_Controller;

public class X2C_nasa_float_controller implements IViewCreator	// class@00105a
{

    public void X2C_nasa_float_controller(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Nasa_Float_Controller().createView(p0);
    }
}
