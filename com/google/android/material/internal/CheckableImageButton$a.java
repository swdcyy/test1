package com.google.android.material.internal.CheckableImageButton$a;
import a2.a;
import com.google.android.material.internal.CheckableImageButton;
import android.view.View;
import b2.d;
import android.view.accessibility.AccessibilityEvent;

public class CheckableImageButton$a extends a	// class@001699
{
    public final CheckableImageButton d;

    public void CheckableImageButton$a(CheckableImageButton p0){
       this.d = p0;
       super();
    }
    public void f(View p0,d p1){
       super.f(p0, p1);
       p1.Y(true);
       p1.Z(this.d.isChecked());
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       super.onInitializeAccessibilityEvent(p0, p1);
       p1.setChecked(this.d.isChecked());
    }
}
