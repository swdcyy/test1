package com.yxcorp.gifshow.detail.view.InterestSnackBar;
import android.widget.TableLayout;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$touchSlop$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.GestureDetector;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$c;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.MotionEvent;
import java.lang.Boolean;

public final class InterestSnackBar extends TableLayout	// class@001a46
{
    public boolean b;
    public InterestSnackBar$b c;
    public final p d;
    public final GestureDetector e;
    public static final InterestSnackBar$a f;

    static {
       InterestSnackBar.f = new InterestSnackBar$a(null);
    }
    public void InterestSnackBar(Context p0){
       super(p0, null);
    }
    public void InterestSnackBar(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.d = s.c(new InterestSnackBar$touchSlop$2(this));
       this.e = new GestureDetector(p0, new InterestSnackBar$c(this));
    }
    public final int getTouchSlop(){
       Object obj = PatchProxy.apply(null, this, InterestSnackBar.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.d.getValue();
       }
       return obj.intValue();
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InterestSnackBar.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.onTouchEvent(p0);
    }
}
