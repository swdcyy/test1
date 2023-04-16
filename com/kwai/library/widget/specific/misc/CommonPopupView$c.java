package com.kwai.library.widget.specific.misc.CommonPopupView$c;
import android.view.View$OnKeyListener;
import com.kwai.library.widget.specific.misc.CommonPopupView;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;
import java.lang.RuntimeException;

public class CommonPopupView$c implements View$OnKeyListener	// class@000a0a
{
    public final CommonPopupView b;

    public void CommonPopupView$c(CommonPopupView p0){
       this.b = p0;
       super();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (p1 != 4 || p2.getAction()) {
          return false;
       }
       try{
          this.b.h();
       }catch(java.lang.RuntimeException e1){
          e1.printStackTrace();
       }
       return true;
    }
}
