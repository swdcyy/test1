package com.kuaishou.ax2c.X2C_import_cover_thumbnail_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Import_Cover_Thumbnail_Layout;

public class X2C_import_cover_thumbnail_layout implements IViewCreator	// class@000ff0
{

    public void X2C_import_cover_thumbnail_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Import_Cover_Thumbnail_Layout().createView(p0);
    }
}
