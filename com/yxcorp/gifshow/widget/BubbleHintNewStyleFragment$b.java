package com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.fragment.PopupWindowFragment;

public class BubbleHintNewStyleFragment$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0017f8
{
    public final View b;
    public final BubbleHintNewStyleFragment c;
    public final c d;
    public final String e;
    public final long f;

    public void BubbleHintNewStyleFragment$b(View p0,BubbleHintNewStyleFragment p1,c p2,String p3,long p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, BubbleHintNewStyleFragment$b.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       this.c.Fh(this.d, this.e, this.b);
       BubbleHintNewStyleFragment.Hh(this.c, this.f, this.b);
       return;
    }
}
