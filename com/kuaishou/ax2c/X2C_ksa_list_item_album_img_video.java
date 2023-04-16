package com.kuaishou.ax2c.X2C_ksa_list_item_album_img_video;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Ksa_List_Item_Album_Img_Video;

public class X2C_ksa_list_item_album_img_video implements IViewCreator	// class@000ff5
{

    public void X2C_ksa_list_item_album_img_video(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Ksa_List_Item_Album_Img_Video().createView(p0);
    }
}
