package com.kuaishou.live.common.core.basic.widget.LiveGridViewPager;
import com.kwai.library.widget.viewpager.GridViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.app.Activity;
import e3a.a;
import android.view.MotionEvent;
import java.lang.IllegalArgumentException;

public class LiveGridViewPager extends GridViewPager	// class@000f18
{

    public void LiveGridViewPager(Context p0){
       super(p0);
    }
    public void LiveGridViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean j(){
       Activity obj = PatchProxy.apply(null, this, LiveGridViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.a(this);
       boolean b = false;
       if (obj == null) {
          return b;
       }
       int requestedOri = obj.getRequestedOrientation();
       if (!requestedOri || requestedOri == 6) {
          b = true;
       }
       return b;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGridViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return super.onInterceptTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e3){
          e3.printStackTrace();
          return false;
       }
    }
}
