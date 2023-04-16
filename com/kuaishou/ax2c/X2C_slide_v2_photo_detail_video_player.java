package com.kuaishou.ax2c.X2C_slide_v2_photo_detail_video_player;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Slide_V2_Photo_Detail_Video_Player;

public class X2C_slide_v2_photo_detail_video_player implements IViewCreator	// class@001075
{

    public void X2C_slide_v2_photo_detail_video_player(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Slide_V2_Photo_Detail_Video_Player().createView(p0);
    }
}
