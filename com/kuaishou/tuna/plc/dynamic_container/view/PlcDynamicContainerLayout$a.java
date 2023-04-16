package com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout$a;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;

public class PlcDynamicContainerLayout$a extends ViewOutlineProvider	// class@001006
{
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void PlcDynamicContainerLayout$a(float p0,int p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcDynamicContainerLayout$a.class, "1")) {
          return;
       }
       p1.setRoundRect(new Rect(this.b, this.c, this.d, this.e), this.a);
       return;
    }
}
