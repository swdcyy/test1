package com.kuaishou.ax2c.layouts.X2C_Lite_Watching_Audience_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import java.lang.Boolean;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;

public class X2C_Lite_Watching_Audience_Layout implements IViewCreator	// class@0010ca
{

    public void X2C_Lite_Watching_Audience_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       CustomFadeEdgeRecyclerView uCustomFadeE = new CustomFadeEdgeRecyclerView(p0, null, null, Boolean.TRUE, Boolean.FALSE);
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-2, -2);
       v7.setId(R.id.live_watch_audience_recycler_view);
       v7.setElevation((float)(int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)));
       marginLayout.leftMargin = (int)TypedValue.applyDimension(1, 3.00f, c.c(resources));
       v7.setClipChildren(false);
       v7.setFadingEdgeLength((int)TypedValue.applyDimension(1, 100.00f, c.c(resources)));
       v7.setOverScrollMode(2);
       v7.setLayoutParams(marginLayout);
       return v7;
    }
}
