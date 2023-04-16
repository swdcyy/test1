package com.kuaishou.ax2c.layouts.X2C_Camera_Item_Ultra;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.view.ViewStub;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;

public class X2C_Camera_Item_Ultra implements IViewCreator	// class@00109d
{

    public void X2C_Camera_Item_Ultra(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       ViewStub viewStub = new ViewStub(p0);
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.ultra_wide_layout_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1646);
       viewStub.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       return viewStub;
    }
}
