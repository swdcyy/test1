package com.kuaishou.ax2c.X2C_lite_bottombar_editor;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Bottombar_Editor;

public class X2C_lite_bottombar_editor implements IViewCreator	// class@000ffc
{

    public void X2C_lite_bottombar_editor(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Bottombar_Editor().createView(p0);
    }
}
