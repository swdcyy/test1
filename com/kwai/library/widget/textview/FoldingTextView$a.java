package com.kwai.library.widget.textview.FoldingTextView$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.library.widget.textview.FoldingTextView;
import java.lang.CharSequence;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class FoldingTextView$a implements ViewTreeObserver$OnPreDrawListener	// class@000a37
{
    public final CharSequence b;
    public final int c;
    public final FoldingTextView d;

    public void FoldingTextView$a(FoldingTextView p0,CharSequence p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean onPreDraw(){
       this.d.getViewTreeObserver().removeOnPreDrawListener(this);
       this.d.u(this.b, this.c);
       return false;
    }
}
