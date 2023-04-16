package com.kuaishou.ax2c.layouts.X2C_Share_Photos_Title_Editor;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.LinearLayout$LayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.EditText;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatEditText;
import android.widget.TextView;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;

public class X2C_Share_Photos_Title_Editor implements IViewCreator	// class@00112c
{

    public void X2C_Share_Photos_Title_Editor(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       int i = -1;
       int i1 = -2;
       relativeLayo.setPadding(0, 0, 0, c.b(resources, R.dimen.arg_RES_7f070271));
       relativeLayo.setLayoutParams(new LinearLayout$LayoutParams(i, i1));
       CatchedEmojiEditText uCatchedEmoj = new CatchedEmojiEditText(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i, i1);
       uCatchedEmoj.setId(R.id.title_editor);
       layoutParams.addRule(9, i);
       layoutParams.addRule(14, i);
       layoutParams.rightMargin = c.b(resources, 0x7f070329);
       uCatchedEmoj.setBackgroundDrawable(null);
       uCatchedEmoj.setCursorVisible(0);
       uCatchedEmoj.setHint(R.string.arg_RES_7f1004d0);
       uCatchedEmoj.setImeOptions(6);
       uCatchedEmoj.setIncludeFontPadding(0);
       uCatchedEmoj.setRawInputType(0x20000);
       uCatchedEmoj.setTextColor(resources.getColor(R.color.arg_RES_7f061f94));
       uCatchedEmoj.setHintTextColor(resources.getColor(R.color.arg_RES_7f0616aa));
       try{
          int i2 = 1;
          Field declaredFiel = TextView.class.getDeclaredField("mCursorDrawableRes");
          declaredFiel.setAccessible(i2);
          declaredFiel.set(uCatchedEmoj, Integer.valueOf(R.drawable.arg_RES_7f080f09));
          uCatchedEmoj.setTextSize(0, (float)c.b(e0, R.dimen.arg_RES_7f070f72));
          uCatchedEmoj.setPadding((int)TypedValue.applyDimension(i2, 0, c.c(e0)), (int)TypedValue.applyDimension(i2, 0, c.c(e0)), (int)TypedValue.applyDimension(i2, 0, c.c(e0)), (int)TypedValue.applyDimension(i2, 0, c.c(e0)));
          uCatchedEmoj.setLayoutParams(layoutParams);
          relativeLayo.addView(uCatchedEmoj);
          AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
          layoutParams = new RelativeLayout$LayoutParams(i1, i1);
          uAppCompatTe.setId(R.id.title_number);
          layoutParams.topMargin = c.b(e0, 0x7f07030a);
          layoutParams.addRule(11, i);
          uAppCompatTe.setTextColor(e0.getColor(R.color.arg_RES_7f061a85));
          uAppCompatTe.setTextSize(0, (float)c.b(e0, R.dimen.arg_RES_7f070272));
          uAppCompatTe.setLayoutParams(layoutParams);
          relativeLayo.addView(uAppCompatTe);
          return relativeLayo;
       }catch(java.lang.Exception e0){
       }
    }
}
