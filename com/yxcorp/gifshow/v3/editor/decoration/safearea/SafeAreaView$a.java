package com.yxcorp.gifshow.v3.editor.decoration.safearea.SafeAreaView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.decoration.safearea.SafeAreaView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class SafeAreaView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000f15
{
    public final SafeAreaView b;

    public void SafeAreaView$a(SafeAreaView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, SafeAreaView$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.N();
       return;
    }
}
