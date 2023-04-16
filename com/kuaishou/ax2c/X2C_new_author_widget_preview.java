package com.kuaishou.ax2c.X2C_new_author_widget_preview;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_New_Author_Widget_Preview;

public class X2C_new_author_widget_preview implements IViewCreator	// class@00105b
{

    public void X2C_new_author_widget_preview(){
       super();
    }
    public View createView(Context p0){
       return new X2C_New_Author_Widget_Preview().createView(p0);
    }
}
