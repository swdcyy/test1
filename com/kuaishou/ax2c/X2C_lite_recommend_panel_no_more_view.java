package com.kuaishou.ax2c.X2C_lite_recommend_panel_no_more_view;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Recommend_Panel_No_More_View;

public class X2C_lite_recommend_panel_no_more_view implements IViewCreator	// class@001002
{

    public void X2C_lite_recommend_panel_no_more_view(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Recommend_Panel_No_More_View().createView(p0);
    }
}
