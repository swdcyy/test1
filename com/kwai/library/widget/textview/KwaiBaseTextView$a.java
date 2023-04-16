package com.kwai.library.widget.textview.KwaiBaseTextView$a;
import java.lang.Runnable;
import com.kwai.library.widget.textview.KwaiBaseTextView;
import java.lang.Object;
import android.widget.TextView;

public final class KwaiBaseTextView$a implements Runnable	// class@000a44
{
    public final KwaiBaseTextView b;

    public void KwaiBaseTextView$a(KwaiBaseTextView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.r();
       this.b.s(true, true);
       this.b.performLongClick();
    }
}
