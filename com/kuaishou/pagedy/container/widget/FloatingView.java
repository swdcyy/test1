package com.kuaishou.pagedy.container.widget.FloatingView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import java.lang.String;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import yz7.n;
import android.widget.FrameLayout$LayoutParams;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.app.Activity;
import java.lang.Exception;

public abstract class FloatingView extends AppCompatTextView implements View$OnClickListener	// class@000a7a
{

    public void FloatingView(Context p0){
       super(p0);
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new OvalShape());
       shapeDrawabl.getPaint().setColor(Color.parseColor("#66FF0000"));
       shapeDrawabl.getPaint().setAntiAlias(true);
       shapeDrawabl.getPaint().setStyle(Paint$Style.FILL);
       this.setBackgroundDrawable(shapeDrawabl);
       this.setOnClickListener(this);
       this.setText(this.getFloatingText());
       this.setTextColor(-1);
       this.setTypeface(Typeface.DEFAULT_BOLD);
       this.setTextSize(14.00f);
       this.setGravity(17);
       this.setId(this.q());
    }
    public abstract String getFloatingText();
    public final void p(Fragment p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatingView.class, "1")) {
          return;
       }
       if (p0 != null && p0.getActivity() != null) {
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(n.c(p0.getActivity(), 50.00f), n.c(p0.getActivity(), 50.00f));
          layoutParams.gravity = 21;
          layoutParams.rightMargin = this.r(p0.getActivity());
          int i = this.s(p0.getActivity());
          try{
             layoutParams.topMargin = i;
             if (p0 instanceof DialogFragment && p0.getDialog() != null) {
                Dialog dialog = p0.getDialog();
                view = dialog.findViewById(this.q());
                if (view != null && view.getParent() instanceof ViewGroup) {
                   view.getParent().removeView(view);
                }
                dialog.addContentView(this, layoutParams);
             }else {
                view = p0.getActivity().findViewById(this.q());
                if (view != null && view.getParent() instanceof ViewGroup) {
                   view.getParent().removeView(view);
                }
                p0.getActivity().addContentView(this, layoutParams);
             }
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public abstract int q();
    public int r(Context p0){
       return 0;
    }
    public int s(Context p0){
       return 0;
    }
}
