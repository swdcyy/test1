package com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$a;
import java.lang.Runnable;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ContainerBottomSheetBehavior$a implements Runnable	// class@001635
{
    public final View b;
    public final int c;
    public final ContainerBottomSheetBehavior d;

    public void ContainerBottomSheetBehavior$a(ContainerBottomSheetBehavior p0,View p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ContainerBottomSheetBehavior$a.class, "1")) {
          return;
       }
       this.d.startSettlingAnimation(this.b, this.c);
       return;
    }
}
