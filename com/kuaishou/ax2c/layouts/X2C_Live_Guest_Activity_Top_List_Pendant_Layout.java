package com.kuaishou.ax2c.layouts.X2C_Live_Guest_Activity_Top_List_Pendant_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import cw9.c;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;

public class X2C_Live_Guest_Activity_Top_List_Pendant_Layout implements IViewCreator	// class@0010e5
{

    public void X2C_Live_Guest_Activity_Top_List_Pendant_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       KwaiImageView kwaiImageVie = new KwaiImageView(p0);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f07033d), c.b(resources, 0x7f0702d2));
       kwaiImageVie.setId(R.id.live_guest_activity_top_list_pendant_container);
       layoutParams.bottomMargin = c.b(resources, 0x7f07033f);
       layoutParams.leftMargin = c.b(resources, 0x7f07025d);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setLayoutParams(layoutParams);
       return kwaiImageVie;
    }
}
