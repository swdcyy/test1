package com.yxcorp.gifshow.v3.EditorActivity$f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.EditorActivity;
import android.widget.RadioButton;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.graphics.Typeface;

public class EditorActivity$f implements ViewTreeObserver$OnGlobalLayoutListener	// class@000d18
{
    public final RadioButton b;
    public final EditorActivity c;

    public void EditorActivity$f(EditorActivity p0,RadioButton p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, EditorActivity$f.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.setSelected(true);
       this.b.setChecked(true);
       this.b.setTypeface(null, true);
       return;
    }
}
