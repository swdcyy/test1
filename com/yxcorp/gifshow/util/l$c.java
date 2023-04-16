package com.yxcorp.gifshow.util.l$c;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class l$c implements View$OnAttachStateChangeListener	// class@001f8a
{

    public void l$c(){
       super();
    }
    public void onViewAttachedToWindow(View p0){
       a.p(p0, "v");
       p0.removeOnAttachStateChangeListener(this);
       p0.requestApplyInsets();
    }
    public void onViewDetachedFromWindow(View p0){
       a.p(p0, "v");
    }
}
