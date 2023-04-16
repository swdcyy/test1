package com.yxcorp.gifshow.v3.editor.effectv2.view.MultiFingeredRecyclerView;
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
import android.view.ViewGroup;

public final class MultiFingeredRecyclerView extends RecyclerView	// class@000f6d
{
    public HashMap b;

    public void MultiFingeredRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void MultiFingeredRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1);
    }
    public void MultiFingeredRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiFingeredRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       boolean b = true;
       if (p0.getPointerCount() == b && !super.dispatchTouchEvent(p0)) {
          b = false;
       }
       return b;
    }
}
