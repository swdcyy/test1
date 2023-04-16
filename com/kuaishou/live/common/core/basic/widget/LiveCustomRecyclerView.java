package com.kuaishou.live.common.core.basic.widget.LiveCustomRecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import d61.m;

public class LiveCustomRecyclerView extends CustomRecyclerView	// class@000f15
{

    public void LiveCustomRecyclerView(Context p0){
       super(p0);
    }
    public void LiveCustomRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveCustomRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCustomRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return super.dispatchTouchEvent(p0);
       }catch(java.lang.Exception e0){
          m.a(new IllegalStateException("CustomRecyclerView#dispatchTouchEvent"));
          return false;
       }
    }
}
