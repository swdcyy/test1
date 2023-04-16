package com.kuaishou.ax2c.layouts.X2C_Smartalbum_Horizontal_Cardlist_Fragment_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;

public class X2C_Smartalbum_Horizontal_Cardlist_Fragment_V2 implements IViewCreator	// class@001138
{

    public void X2C_Smartalbum_Horizontal_Cardlist_Fragment_V2(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f07008d)));
       RecyclerView recyclerView = new RecyclerView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f070c00));
       recyclerView.setId(R.id.album_list_recyclerview);
       layoutParams.gravity = 48;
       layoutParams.topMargin = c.b(resources, 0x7f070271);
       recyclerView.setClipToPadding(false);
       recyclerView.setVerticalScrollBarEnabled(false);
       recyclerView.setHorizontalScrollBarEnabled(false);
       recyclerView.setTag("album_animation_album_card_list");
       recyclerView.setPadding(c.b(resources, R.dimen.arg_RES_7f07025d), false, c.b(resources, R.dimen.arg_RES_7f070549), false);
       recyclerView.setLayoutParams(layoutParams);
       uFrameLayout.addView(recyclerView);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.album_new_count_tip);
       layoutParams.gravity = 1;
       layoutParams.topMargin = c.b(resources, 0x7f07034b);
       uAppCompatTe.setBackgroundResource(R.drawable.arg_RES_7f082109);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060751));
       uAppCompatTe.setTextSize(2, 14.00f);
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setLayoutParams(layoutParams);
       uFrameLayout.addView(uAppCompatTe);
       return uFrameLayout;
    }
}
