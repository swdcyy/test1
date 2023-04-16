package com.yxcorp.gifshow.v3.EditorActivity$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;

public class EditorActivity$d implements ViewTreeObserver$OnGlobalLayoutListener	// class@000d14
{
    public final EditorActivity b;

    public void EditorActivity$d(EditorActivity p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, EditorActivity$d.class, "1")) {
          return;
       }
       this.b.y3();
       this.b.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
