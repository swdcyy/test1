package com.google.android.material.bottomsheet.a$d;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.google.android.material.bottomsheet.a;
import android.view.View;
import android.app.Dialog;

public class a$d extends BottomSheetBehavior$c	// class@001667
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
    }
    public void b(View p0,int p1){
       if (p1 == 5) {
          this.a.cancel();
       }
       return;
    }
}
