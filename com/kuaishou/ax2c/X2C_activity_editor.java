package com.kuaishou.ax2c.X2C_activity_editor;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Activity_Editor;

public class X2C_activity_editor implements IViewCreator	// class@000fc7
{

    public void X2C_activity_editor(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Activity_Editor().createView(p0);
    }
}
