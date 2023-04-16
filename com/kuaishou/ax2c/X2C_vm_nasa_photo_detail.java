package com.kuaishou.ax2c.X2C_vm_nasa_photo_detail;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Vm_Nasa_Photo_Detail;

public class X2C_vm_nasa_photo_detail implements IViewCreator	// class@00107c
{

    public void X2C_vm_nasa_photo_detail(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Vm_Nasa_Photo_Detail().createView(p0);
    }
}
