package com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$b;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$c;
import android.view.ViewGroup;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;

public class RoundedRecyclerView extends RecyclerView	// class@00217a
{
    public final RoundedRecyclerView$c b;
    public float c;

    public void RoundedRecyclerView(Context p0){
       super(p0, null);
    }
    public void RoundedRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundedRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RoundedRecyclerView$b(this, null);
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d5);
          this.c = (float)(int)typedArray.getDimension(26, 0);
          typedArray.recycle();
       }
       this.setCornerRadius(this.c);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundedRecyclerView.class, "4")) {
          return;
       }
       this.b.c(p0, true);
       super.dispatchDraw(p0);
       this.b.b(p0, true);
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundedRecyclerView.class, "3")) {
          return;
       }
       this.b.c(p0, false);
       super.draw(p0);
       this.b.b(p0, false);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundedRecyclerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundedRecyclerView.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.b.a(p0, p1);
       return;
    }
    public void setCornerRadius(float p0){
       Boolean tRUE;
       if (PatchProxy.isSupport(RoundedRecyclerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundedRecyclerView.class, "2")) {
          return;
       }
       if (PatchProxy.isSupport(RoundedRecyclerView.class)) {
          Object[] objArray = new Object[]{tRUE,tRUE,tRUE,tRUE,Float.valueOf(p0)};
          tRUE = Boolean.TRUE;
          if (PatchProxy.applyVoid(objArray, this, RoundedRecyclerView.class, "1")) {
          label_0049 :
             return;
          }
       }
       this.c = p0;
       this.b.d(1, 1, 1, 1);
       goto label_0049 ;
    }
}
