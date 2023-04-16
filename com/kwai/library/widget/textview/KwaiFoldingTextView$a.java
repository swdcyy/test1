package com.kwai.library.widget.textview.KwaiFoldingTextView$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.library.widget.textview.KwaiFoldingTextView;
import java.lang.CharSequence;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class KwaiFoldingTextView$a implements ViewTreeObserver$OnPreDrawListener	// class@000a47
{
    public final CharSequence b;
    public final int c;
    public final KwaiFoldingTextView d;

    public void KwaiFoldingTextView$a(KwaiFoldingTextView p0,CharSequence p1,int p2){
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
