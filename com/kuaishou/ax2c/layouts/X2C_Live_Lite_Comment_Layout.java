package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Comment_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;

public class X2C_Live_Lite_Comment_Layout implements IViewCreator	// class@0010ee
{

    public void X2C_Live_Lite_Comment_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       uConstraintL.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       LiveLiteCommentRecyclerView liveLiteComm = new LiveLiteCommentRecyclerView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), (int)TypedValue.applyDimension(1, 0, c.c(resources)));
       liveLiteComm.setId(R.id.live_lite_comment_recycler_view);
       liveLiteComm.setBackgroundColor(resources.getColor(R.color.arg_RES_7f062057));
       layoutParams.h = 0;
       layoutParams.k = 0;
       layoutParams.d = 0;
       layoutParams.g = 0;
       layoutParams.A = 0x3f800000;
       layoutParams.c();
       liveLiteComm.setLayoutParams(layoutParams);
       uConstraintL.addView(liveLiteComm);
       return uConstraintL;
    }
}
