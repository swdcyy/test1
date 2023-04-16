package com.kuaishou.ax2c.X2C_share_preview_cover_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Share_Preview_Cover_Container;

public class X2C_share_preview_cover_container implements IViewCreator	// class@00106f
{

    public void X2C_share_preview_cover_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Share_Preview_Cover_Container().createView(p0);
    }
}
