package com.yxcorp.gifshow.ad.widget.AdRoundCornerWebViewLayout$a;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;

public class AdRoundCornerWebViewLayout$a extends ViewOutlineProvider	// class@001918
{
    public final float a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void AdRoundCornerWebViewLayout$a(float p0,int p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdRoundCornerWebViewLayout$a.class, "1")) {
          return;
       }
       p1.setRoundRect(new Rect(this.b, this.c, this.d, this.e), this.a);
       return;
    }
}
