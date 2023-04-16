package com.kuaishou.ax2c.X2C_progress_origin_style_dialog;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Progress_Origin_Style_Dialog;

public class X2C_progress_origin_style_dialog implements IViewCreator	// class@001060
{

    public void X2C_progress_origin_style_dialog(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Progress_Origin_Style_Dialog().createView(p0);
    }
}
