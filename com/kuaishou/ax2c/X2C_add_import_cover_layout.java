package com.kuaishou.ax2c.X2C_add_import_cover_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Add_Import_Cover_Layout;

public class X2C_add_import_cover_layout implements IViewCreator	// class@000fca
{

    public void X2C_add_import_cover_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Add_Import_Cover_Layout().createView(p0);
    }
}
