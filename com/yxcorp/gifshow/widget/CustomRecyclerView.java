package com.yxcorp.gifshow.widget.CustomRecyclerView;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;

public class CustomRecyclerView extends ViewPagerRecyclerView	// class@001817
{

    public void CustomRecyclerView(Context p0){
       super(p0);
    }
    public void CustomRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void CustomRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       if (PatchProxy.isSupport(CustomRecyclerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, CustomRecyclerView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.drawChild(p0, p1, p2);
    }
    public void invalidate(){
       if (PatchProxy.applyVoid(null, this, CustomRecyclerView.class, "2")) {
          return;
       }
       super.invalidate();
       return;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, CustomRecyclerView.class, "1")) {
          return;
       }
       super.requestLayout();
       return;
    }
}
