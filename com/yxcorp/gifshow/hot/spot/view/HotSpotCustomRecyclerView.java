package com.yxcorp.gifshow.hot.spot.view.HotSpotCustomRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import android.view.ViewParent;
import android.view.ViewGroup;

public class HotSpotCustomRecyclerView extends RecyclerView	// class@001849
{
    public int b;
    public int c;

    public void HotSpotCustomRecyclerView(Context p0){
       super(p0);
    }
    public void HotSpotCustomRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void HotSpotCustomRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean canScrollHorizontally(int p0){
       return true;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotSpotCustomRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action == 0.00f) {
             float x = p0.getX();
             float f = Math.abs((x - (float)this.b));
             boolean b = true;
             ViewParent viewParent = (Math.round((float)((Math.asin(((double)f / Math.sqrt((double)((f * f) + (Math.abs((p0.getY() - (float)this.c)) * Math.abs((p0.getY() - (float)this.c))))))) / 0x400921fb54442d18) * 180.00f)) > 20)? 1: null;
             HotSpotCustomRecyclerView tb = this.b;
             int i = (x - (float)tb < 0 && viewParent)? 1: 0;
             x = (x - (float)tb > 0 && viewParent)? 1: 0;
             viewParent = this.getParent();
             if (!i && !x) {
                b = false;
             }
             viewParent.requestDisallowInterceptTouchEvent(b);
          }
       }else {
          this.b = (int)p0.getX();
          this.c = (int)p0.getY();
       }
       return super.dispatchTouchEvent(p0);
    }
}
