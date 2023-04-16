package com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.CharSequence;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.TextView;
import android.view.ViewParent;
import android.widget.EditText;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class TextInputEditText extends AppCompatEditText	// class@0016de
{

    public void TextInputEditText(Context p0){
       super(p0, null);
    }
    public void TextInputEditText(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04031d);
    }
    public void TextInputEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public CharSequence getHint(){
       TextInputLayout textInputLay = this.getTextInputLayout();
       if (textInputLay != null && textInputLay.p()) {
          return textInputLay.getHint();
       }
       return super.getHint();
    }
    public final CharSequence getHintFromLayout(){
       TextInputLayout textInputLay = this.getTextInputLayout();
       CharSequence hint = (textInputLay != null)? textInputLay.getHint(): null;
       return hint;
    }
    public final TextInputLayout getTextInputLayout(){
       ViewParent parent = this.getParent();
       while (true) {
          if (!parent instanceof View) {
             return null;
          }
          if (parent instanceof TextInputLayout) {
             break ;
          }else {
             parent = parent.getParent();
          }
       }
       return parent;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       if (inputConnect != null && p0.hintText == null) {
          p0.hintText = this.getHintFromLayout();
       }
       return inputConnect;
    }
}
