package com.kuaishou.ax2c.layouts.X2C_Progress_Origin_Style_Dialog;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.AttrAnimProgressBar;
import android.util.AttributeSet;
import android.os.Looper;
import java.lang.Thread;
import android.widget.ProgressBar;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Long;
import java.lang.Exception;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import android.widget.Button;

public class X2C_Progress_Origin_Style_Dialog implements IViewCreator	// class@00111f
{

    public void X2C_Progress_Origin_Style_Dialog(){
       super();
    }
    public View createView(Context p0){
       long id;
       AppCompatTextView uAppCompatTe;
       AppCompatButton uAppCompatBu;
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       int i = -2;
       linearLayout.setGravity(17);
       linearLayout.setMinimumWidth(c.b(resources, R.dimen.arg_RES_7f07025f));
       linearLayout.setMinimumHeight(c.b(resources, R.dimen.arg_RES_7f07025f));
       linearLayout.setOrientation(1);
       linearLayout.setPadding((int)TypedValue.applyDimension(1, 19.50f, c.c(resources)), (int)TypedValue.applyDimension(1, 16.50f, c.c(resources)), (int)TypedValue.applyDimension(1, 19.50f, c.c(resources)), (int)TypedValue.applyDimension(1, 15.00f, c.c(resources)));
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(i, i));
       KwaiLoadingView kwaiLoadingV = new KwaiLoadingView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f07030d));
       kwaiLoadingV.setId(R.id.loading_view);
       layoutParams.gravity = 17;
       kwaiLoadingV.setLayoutParams(layoutParams);
       linearLayout.addView(kwaiLoadingV);
       AttributeSet uAttributeSe = null;
       AttrAnimProgressBar uAttrAnimPro = new AttrAnimProgressBar(linearLayout.getContext(), uAttributeSe);
       id = Looper.getMainLooper().getThread().getId();
       if (id - Thread.currentThread().getId()) {
          try{
             Field declaredFiel = ProgressBar.class.getDeclaredField("mUiThreadId");
             declaredFiel.setAccessible(1);
             declaredFiel.set(uAttrAnimPro, Long.valueOf(id));
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
       }
    }
}
