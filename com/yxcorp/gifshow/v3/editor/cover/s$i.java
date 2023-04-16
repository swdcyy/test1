package com.yxcorp.gifshow.v3.editor.cover.s$i;
import androidx.recyclerview.widget.RecyclerView$q;
import com.yxcorp.gifshow.v3.editor.cover.s;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class s$i implements RecyclerView$q	// class@000ed7
{
    public final s b;

    public void s$i(s p0){
       this.b = p0;
       super();
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, s$i.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.R8();
       return false;
    }
    public void onRequestDisallowInterceptTouchEvent(boolean p0){
    }
    public void onTouchEvent(RecyclerView p0,MotionEvent p1){
    }
}
