package com.kuaishou.ax2c.X2C_lite_hour_rank_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Hour_Rank_Container;

public class X2C_lite_hour_rank_container implements IViewCreator	// class@000ffe
{

    public void X2C_lite_hour_rank_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Hour_Rank_Container().createView(p0);
    }
}
