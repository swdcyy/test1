package com.kuaishou.ax2c.layouts.X2C_Lite_Like_Particle_Animation_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;

public class X2C_Lite_Like_Particle_Animation_Container implements IViewCreator	// class@0010be
{

    public void X2C_Lite_Like_Particle_Animation_Container(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       int i = c.b(resources, R.dimen.arg_RES_7f07058b);
       uFrameLayout.setId(R.id.lite_like_particle_animation_container);
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(i, c.b(resources, R.dimen.arg_RES_7f07058a)));
       return uFrameLayout;
    }
}
