package com.kuaishou.ax2c.layouts.X2C_Share_Edit_Input_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.ax2c.layouts.X2C_Share_Photos_Title_Editor;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText;
import android.widget.EditText;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import com.kwai.library.widget.edittext.SafeEditText;

public class X2C_Share_Edit_Input_Layout implements IViewCreator	// class@001128
{

    public void X2C_Share_Edit_Input_Layout(){
       super();
    }
    public View createView(Context p0){
       String str = "mCursorDrawableRes";
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       int i = -1;
       linearLayout.setId(R.id.edit_wrap);
       boolean b = false;
       linearLayout.setClipToPadding(b);
       int i1 = 1;
       linearLayout.setOrientation(i1);
       linearLayout.setPadding(b, b, b, (int)TypedValue.applyDimension(i1, 12.00f, c.c(resources)));
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(i, i));
       View view = new X2C_Share_Photos_Title_Editor().createView(linearLayout.getContext());
       view.setId(R.id.photos_tilte_bar);
       view.setVisibility(8);
       view.setLayoutParams(view.getLayoutParams());
       linearLayout.addView(view);
       view = new View(linearLayout.getContext());
       view.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060a83));
       view.setId(R.id.title_decollator);
       view.setVisibility(8);
       view.setLayoutParams(new LinearLayout$LayoutParams(i, (int)TypedValue.applyDimension(b, 0x3f800000, c.c(resources))));
       linearLayout.addView(view);
       FrameLayout uFrameLayout = new FrameLayout(linearLayout.getContext());
       uFrameLayout.setId(R.id.editor_container);
       uFrameLayout.setLayoutParams(new LinearLayout$LayoutParams(i, i));
       linearLayout.addView(uFrameLayout);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout.getContext());
       uAppCompatTe.setId(R.id.bubble_anchor);
       uAppCompatTe.setText(R.string.arg_RES_7f104015);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060bd3));
       uAppCompatTe.setTextSize(b, (float)c.b(resources, R.dimen.arg_RES_7f070f71));
       int i2 = 4;
       uAppCompatTe.setVisibility(i2);
       uAppCompatTe.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       uFrameLayout.addView(uAppCompatTe);
       CatchedEmojiEditText uCatchedEmoj = new CatchedEmojiEditText(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, i);
       uCatchedEmoj.setId(R.id.editor_hint);
       uCatchedEmoj.setBackgroundDrawable(null);
       uCatchedEmoj.setCursorVisible(b);
       uCatchedEmoj.setGravity(51);
       uCatchedEmoj.setIncludeFontPadding(b);
       uCatchedEmoj.setRawInputType(0x20000);
       uCatchedEmoj.setTextColor(resources.getColor(R.color.arg_RES_7f062057));
       try{
          int i3 = 0x7f080f09;
          Field declaredFiel = TextView.class.getDeclaredField(str);
          declaredFiel.setAccessible(i1);
          declaredFiel.set(uCatchedEmoj, Integer.valueOf(i3));
          uCatchedEmoj.setTextSize(b, (float)c.b(resources, R.dimen.arg_RES_7f070f72));
          uCatchedEmoj.setVisibility(i2);
          uCatchedEmoj.setAllowAutoAdjustHintSize(b);
          uCatchedEmoj.setPadding(c.b(resources, R.dimen.arg_RES_7f070253), c.b(resources, R.dimen.arg_RES_7f070253), c.b(resources, R.dimen.arg_RES_7f070253), c.b(resources, R.dimen.arg_RES_7f070253));
          uCatchedEmoj.setLayoutParams(layoutParams);
          uFrameLayout.addView(uCatchedEmoj);
          CatchedEmojiEditText uCatchedEmoj1 = new CatchedEmojiEditText(uFrameLayout.getContext());
          FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(i, i);
          uCatchedEmoj1.setId(R.id.editor);
          uCatchedEmoj1.setBackgroundDrawable(null);
          uCatchedEmoj1.setCursorVisible(b);
          uCatchedEmoj1.setGravity(51);
          uCatchedEmoj1.setHint(R.string.arg_RES_7f104014);
          uCatchedEmoj1.setIncludeFontPadding(b);
          uCatchedEmoj1.setRawInputType(0x20000);
          uCatchedEmoj1.setTextColor(resources.getColor(R.color.arg_RES_7f061f94));
          i = resources.getColor(R.color.arg_RES_7f0616aa);
          try{
             uCatchedEmoj1.setHintTextColor(i);
             Field declaredFiel1 = TextView.class.getDeclaredField(e0);
             declaredFiel1.setAccessible(true);
             declaredFiel1.set(uCatchedEmoj1, Integer.valueOf(R.drawable.arg_RES_7f080f09));
             uCatchedEmoj1.setTextSize(b, (float)c.b(resources, R.dimen.arg_RES_7f070f72));
             uCatchedEmoj1.setAllowAutoAdjustHintSize(b);
             uCatchedEmoj1.setPadding(c.b(resources, R.dimen.arg_RES_7f070253), c.b(resources, R.dimen.arg_RES_7f070253), c.b(resources, R.dimen.arg_RES_7f070253), c.b(resources, R.dimen.arg_RES_7f070253));
             uCatchedEmoj1.setLayoutParams(layoutParams1);
             uFrameLayout.addView(uCatchedEmoj1);
             return linearLayout;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
}
