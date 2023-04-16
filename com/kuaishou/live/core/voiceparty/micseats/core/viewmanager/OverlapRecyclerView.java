package com.kuaishou.live.core.voiceparty.micseats.core.viewmanager.OverlapRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
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

public final class OverlapRecyclerView extends RecyclerView	// class@001591
{
    public HashMap b;

    public void OverlapRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void OverlapRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void OverlapRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OverlapRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       return false;
    }
}
