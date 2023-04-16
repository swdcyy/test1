package com.yxcorp.gifshow.widget.KwaiActionBar$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.Object;
import android.view.View;
import android.app.Activity;

public class KwaiActionBar$a implements View$OnClickListener	// class@001869
{
    public final KwaiActionBar b;

    public void KwaiActionBar$a(KwaiActionBar p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       KwaiActionBar$a tb = this.b;
       if (tb.j != null) {
          tb.getActivity().onBackPressed();
       }else {
          KwaiActionBar g = tb.g;
          if (g != null) {
             g.onClick(p0);
          }
       }
       return;
    }
}
