package com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class AssistKSViewPager extends ViewPager	// class@001d1c
{

    public void AssistKSViewPager(Context p0){
       super(p0, null);
    }
    public void AssistKSViewPager(Context p0,AttributeSet p1){
       a.m(p0);
       super(p0, p1);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AssistKSViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       return true;
    }
}
