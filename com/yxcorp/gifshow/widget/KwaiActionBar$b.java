package com.yxcorp.gifshow.widget.KwaiActionBar$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.Object;
import android.view.View;

public class KwaiActionBar$b implements View$OnClickListener	// class@00186a
{
    public final KwaiActionBar b;

    public void KwaiActionBar$b(KwaiActionBar p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       KwaiActionBar h = this.b.h;
       if (h != null) {
          h.onClick(p0);
       }
       return;
    }
}
