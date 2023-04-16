package com.tencent.open.TDialog$1;
import java.lang.Runnable;
import com.tencent.open.TDialog;
import java.lang.Object;
import android.view.Window;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;

public class TDialog$1 implements Runnable	// class@000f33
{
    public final TDialog a;

    public void TDialog$1(TDialog p0){
       this.a = p0;
       super();
    }
    public void run(){
       Window window = this.a.getWindow();
       if (window == null) {
          return;
       }
       View decorView = window.getDecorView();
       if (decorView == null) {
          return;
       }
       decorView = decorView.getChildAt(0);
       if (decorView == null) {
          return;
       }
       decorView.setPadding(0, 0, 0, 0);
       return;
    }
}
