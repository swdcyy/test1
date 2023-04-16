package com.kwai.library.widget.edittext.StrokeEditLayout;
import android.text.TextWatcher;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.CharSequence;
import android.content.res.Resources;
import cw9.c;
import com.yxcorp.utility.n;
import com.kwai.library.widget.edittext.StrokeEditLayout$InnerStrokeTextView;
import android.widget.TextView;
import android.view.View;
import com.kwai.library.widget.edittext.SafeEditText;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatEditText;
import android.widget.EditText;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ukd.a;
import android.text.Editable;
import com.kwai.library.widget.edittext.StrokeEditLayout$a;
import android.text.TextUtils;

public class StrokeEditLayout extends FrameLayout implements TextWatcher	// class@00092c
{
    public StrokeEditLayout$InnerStrokeTextView b;
    public SafeEditText c;
    public CharSequence d;
    public int e;
    public int f;
    public int g;
    public float h;
    public StrokeEditLayout$a i;

    public void StrokeEditLayout(Context p0){
       super(p0, null);
    }
    public void StrokeEditLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void StrokeEditLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = "";
       this.e = 2;
       this.f = 0;
       this.g = -1;
       this.h = 14.00f;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.w5);
       this.d = typedArray.getText(0);
       this.e = typedArray.getDimensionPixelSize(2, c.b(this.getResources(), 0x7f0710d1));
       this.f = typedArray.getColor(1, this.f);
       this.g = typedArray.getColor(3, this.g);
       this.h = (float)typedArray.getDimensionPixelSize(4, n.c(this.getContext(), this.h));
       typedArray.recycle();
       this.removeAllViews();
       StrokeEditLayout$InnerStrokeTextView innerStrokeT = new StrokeEditLayout$InnerStrokeTextView(p0);
       this.b = innerStrokeT;
       innerStrokeT.setTextSize(0, this.h);
       this.b.setGravity(17);
       this.b.setPadding(2, 0, 0, 0);
       this.b.setSingleLine();
       this.b.setText(this.d);
       this.b.setStrokeColor(this.f);
       this.b.setStrokeSize(this.e);
       this.b.setTextColor(this.g);
       this.b.setHintTextColor(this.g);
       this.addView(this.b, -1, -1);
       SafeEditText safeEditText = new SafeEditText(p0);
       this.c = safeEditText;
       safeEditText.setBackgroundDrawable(null);
       this.c.addTextChangedListener(this);
       this.c.setTextColor(0);
       this.c.setHintTextColor(0);
       this.c.setTextSize(0, this.h);
       this.c.setGravity(this.b.getGravity());
       this.c.setSingleLine();
       this.c.setHint(this.d);
       a.o(this.c, "mCursorDrawableRes", Integer.valueOf(R.drawable.arg_RES_7f082554));
       this.b.setPadding(this.c.getPaddingLeft(), this.c.getPaddingTop(), this.c.getPaddingRight(), this.c.getPaddingBottom());
       this.b.setLineSpacing(this.c.getLineSpacingExtra(), this.c.getLineSpacingMultiplier());
       this.addView(this.c, -1, -1);
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public EditText getEditText(){
       return this.c;
    }
    public String getText(){
       return this.c.getText().toString();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       CharSequence uCharSequenc = null;
       String str = (p0 == null)? uCharSequenc: p0.toString();
       StrokeEditLayout ti = this.i;
       if (ti != null) {
          str = ti.a(this.b, str);
       }
       ti = this.b;
       StrokeEditLayout td = (str == null || !str.length())? this.d: str;
       ti.setText(td);
       if (str == null && this.c.getText() != null) {
          this.c.setText(uCharSequenc);
       }else if(str != null && !str.equals(this.c.getText().toString())){
          uCharSequenc = this.c.getSelectionStart();
          this.c.setText(str);
          StrokeEditLayout tc = this.c;
          if (uCharSequenc > tc.length()) {
             uCharSequenc = this.c.length();
          }
          tc.setSelection(uCharSequenc);
       }
       return;
    }
    public void setText(CharSequence p0){
       this.c.setText(p0);
       if (!TextUtils.isEmpty(p0)) {
          this.c.setSelection(p0.length());
       }
       return;
    }
    public void setTextPreHandler(StrokeEditLayout$a p0){
       this.i = p0;
    }
}
