package com.kuaishou.live.core.basic.widget.LiveBarrier;
import androidx.constraintlayout.widget.Barrier;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.constraintlayout.widget.ConstraintHelper;

public class LiveBarrier extends Barrier	// class@0008f8
{

    public void LiveBarrier(Context p0){
       super(p0);
    }
    public void LiveBarrier(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveBarrier(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setReferencedIds(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBarrier.class, "1")) {
          return;
       }
       this.setIds(p0);
       return;
    }
}
