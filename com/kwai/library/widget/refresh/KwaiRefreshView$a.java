package com.kwai.library.widget.refresh.KwaiRefreshView$a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.kwai.library.widget.refresh.KwaiRefreshView;
import android.view.View;
import s17.c;
import android.widget.RelativeLayout;

public class KwaiRefreshView$a extends Handler	// class@0009c1
{

    public void KwaiRefreshView$a(Looper p0){
       super(p0);
    }
    public void handleMessage(Message p0){
       KwaiRefreshView kwaiRefreshV;
       try{
          kwaiRefreshV = p0.obj.get();
       }catch(java.lang.ClassCastException e0){
          kwaiRefreshV = null;
       }
       if (kwaiRefreshV == null) {
          return;
       }
       if (p0.what == (kwaiRefreshV.hashCode() + 1)) {
          kwaiRefreshV.c();
          return;
       }else if(c.d(kwaiRefreshV)){
          return;
       }else {
          kwaiRefreshV.setAlpha(0);
          return;
       }
    }
}
