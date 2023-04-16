package com.kuaishou.ax2c.X2C_ksa_album_select_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Ksa_Album_Select_Container;

public class X2C_ksa_album_select_container implements IViewCreator	// class@000ff3
{

    public void X2C_ksa_album_select_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Ksa_Album_Select_Container().createView(p0);
    }
}
