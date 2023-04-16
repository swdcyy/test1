package com.google.android.material.bottomsheet.BottomSheetBehavior$a;
import java.lang.Runnable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import java.lang.Object;

public class BottomSheetBehavior$a implements Runnable	// class@001653
{
    public final View b;
    public final int c;
    public final BottomSheetBehavior d;

    public void BottomSheetBehavior$a(BottomSheetBehavior p0,View p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       this.d.startSettlingAnimation(this.b, this.c);
    }
}
