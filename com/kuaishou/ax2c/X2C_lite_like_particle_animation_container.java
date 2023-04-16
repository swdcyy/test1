package com.kuaishou.ax2c.X2C_lite_like_particle_animation_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Like_Particle_Animation_Container;

public class X2C_lite_like_particle_animation_container implements IViewCreator	// class@000fff
{

    public void X2C_lite_like_particle_animation_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Like_Particle_Animation_Container().createView(p0);
    }
}
