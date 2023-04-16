package com.kuaishou.ax2c.X2C_share_photos_title_editor;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Share_Photos_Title_Editor;

public class X2C_share_photos_title_editor implements IViewCreator	// class@00106d
{

    public void X2C_share_photos_title_editor(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Share_Photos_Title_Editor().createView(p0);
    }
}
