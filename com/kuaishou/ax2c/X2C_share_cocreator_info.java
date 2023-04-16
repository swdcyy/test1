package com.kuaishou.ax2c.X2C_share_cocreator_info;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Share_Cocreator_Info;

public class X2C_share_cocreator_info implements IViewCreator	// class@001065
{

    public void X2C_share_cocreator_info(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Share_Cocreator_Info().createView(p0);
    }
}
