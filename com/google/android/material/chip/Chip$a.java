package com.google.android.material.chip.Chip$a;
import o1.f$a;
import com.google.android.material.chip.Chip;
import android.graphics.Typeface;
import java.lang.CharSequence;
import android.widget.CheckBox;

public class Chip$a extends f$a	// class@00166c
{
    public final Chip a;

    public void Chip$a(Chip p0){
       this.a = p0;
       super();
    }
    public void d(int p0){
    }
    public void e(Typeface p0){
       Chip$a ta = this.a;
       ta.setText(ta.getText());
       this.a.requestLayout();
       this.a.invalidate();
    }
}
