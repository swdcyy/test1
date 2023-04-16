package com.yxcorp.gifshow.album.widget.UntouchableLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class UntouchableLinearLayout extends LinearLayout	// class@001b11
{
    public HashMap b;

    public void UntouchableLinearLayout(Context p0){
       a.q(p0, "context");
       super(p0);
    }
    public void UntouchableLinearLayout(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1);
    }
    public void UntouchableLinearLayout(Context p0,AttributeSet p1,int p2){
       a.q(p0, "context");
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UntouchableLinearLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "ev");
       return false;
    }
}
