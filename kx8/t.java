package kx8.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.web.WebFullScreenVideoActivity;
import java.lang.Object;
import android.view.Window;
import android.app.Activity;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import lnc.b5;
import android.content.Context;
import com.yxcorp.utility.n;

public final class t implements Runnable	// class@002c4a
{
    public final WebFullScreenVideoActivity b;

    public void t(WebFullScreenVideoActivity p0){
       this.b = p0;
    }
    public final void run(){
       t tb = this.b;
       View rootView = tb.getWindow().getDecorView().getRootView();
       if (rootView != null) {
          int[] ointArray = new int[2];
          rootView.getLocationOnScreen(ointArray);
          int i = 1;
          if (ointArray[i] > 10 && !PatchProxy.applyVoid(null, tb, WebFullScreenVideoActivity.class, "8")) {
             tb.getWindow().clearFlags(1024);
             i.i(tb, 0xff000000, i, i);
             rootView = tb.findViewById(R.id.fake_status_back);
             rootView.setBackgroundColor(0xff000000);
             ViewGroup$LayoutParams layoutParams = rootView.getLayoutParams();
             int i1 = (b5.a(tb))? 0: n.A(tb);
             layoutParams.height = i1;
             rootView.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
