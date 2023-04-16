package com.kuaishou.ax2c.layouts.X2C_Live_Pk_Combo_Win_Group_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.kuaishou.ax2c.layouts.X2C_Live_Pk_Combo_Win_Left_Top_View_Group_Layout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.kuaishou.ax2c.layouts.X2C_Live_Pk_Combo_Win_Right_Top_View_Group_Layout;

public class X2C_Live_Pk_Combo_Win_Group_Layout implements IViewCreator	// class@001105
{

    public void X2C_Live_Pk_Combo_Win_Group_Layout(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       uConstraintL.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       View view = new X2C_Live_Pk_Combo_Win_Left_Top_View_Group_Layout().createView(uConstraintL.getContext());
       view.setId(R.id.live_pk_combo_win_left_top_view);
       view.setLayoutParams(view.getLayoutParams());
       uConstraintL.addView(view);
       view = new X2C_Live_Pk_Combo_Win_Right_Top_View_Group_Layout().createView(uConstraintL.getContext());
       view.setId(R.id.live_pk_combo_win_right_top_view);
       view.setLayoutParams(view.getLayoutParams());
       uConstraintL.addView(view);
       return uConstraintL;
    }
}
