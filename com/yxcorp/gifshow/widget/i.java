package com.yxcorp.gifshow.widget.i;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment;
import androidx.fragment.app.c;
import java.lang.String;
import android.content.DialogInterface$OnShowListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.fragment.PopupWindowFragment;

public class i implements ViewTreeObserver$OnGlobalLayoutListener	// class@00198c
{
    public final View b;
    public final BubbleHintNewStyleFragment c;
    public final int d;
    public final c e;
    public final String f;
    public final DialogInterface$OnShowListener g;
    public final long h;

    public void i(View p0,BubbleHintNewStyleFragment p1,int p2,c p3,String p4,DialogInterface$OnShowListener p5,long p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       this.c.qh(this.d);
       this.c.Eh(this.e, this.f, this.b, this.g);
       BubbleHintNewStyleFragment.Hh(this.c, this.h, this.b);
       return;
    }
}
