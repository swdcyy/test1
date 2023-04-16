package com.tachikoma.component.canvas.TKCanvas2D$a;
import java.lang.Runnable;
import com.tachikoma.component.canvas.TKCanvas2D;
import java.lang.Object;

public class TKCanvas2D$a implements Runnable	// class@000cd8
{
    public final TKCanvas2D b;

    public void TKCanvas2D$a(TKCanvas2D p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.mCanvas = null;
    }
}
