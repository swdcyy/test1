package com.google.android.material.chip.Chip$b;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import android.view.View;
import android.graphics.Outline;
import com.google.android.material.chip.a;

public class Chip$b extends ViewOutlineProvider	// class@00166d
{
    public final Chip a;

    public void Chip$b(Chip p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       Chip e = this.a.e;
       if (e != null) {
          e.getOutline(p1);
       }else {
          p1.setAlpha(0);
       }
       return;
    }
}
