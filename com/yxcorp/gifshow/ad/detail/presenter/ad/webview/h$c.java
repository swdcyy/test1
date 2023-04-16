package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h$c;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class h$c implements View$OnTouchListener	// class@00164a
{
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, h$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.u.onNext(new Object());
       return false;
    }
}
