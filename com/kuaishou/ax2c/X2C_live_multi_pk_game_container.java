package com.kuaishou.ax2c.X2C_live_multi_pk_game_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Multi_Pk_Game_Container;

public class X2C_live_multi_pk_game_container implements IViewCreator	// class@001042
{

    public void X2C_live_multi_pk_game_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Multi_Pk_Game_Container().createView(p0);
    }
}
