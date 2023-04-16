package com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView;
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
import com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView$a;
import android.view.ViewGroup;

public final class LiveLiteCommentRecyclerView extends RecyclerView	// class@00081b
{
    public boolean b;
    public LiveLiteCommentRecyclerView$a c;

    public void LiveLiteCommentRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void LiveLiteCommentRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void LiveLiteCommentRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       LiveLiteCommentRecyclerView obj = PatchProxy.applyOneRefs(p0, this, LiveLiteCommentRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       int action = p0.getAction();
       LiveLiteCommentRecyclerView liveLiteComm = 1;
       if (action) {
          if (action == liveLiteComm || action == 3) {
             this.b = false;
          }
       }else {
          this.b = liveLiteComm;
       }
       obj = this.c;
       if (obj != null) {
          obj.a(this.b);
       }
       return super.dispatchTouchEvent(p0);
    }
    public final void setTouchStateListener(LiveLiteCommentRecyclerView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommentRecyclerView.class, "1")) {
          return;
       }
       a.p(p0, "touchStateListener");
       this.c = p0;
       return;
    }
    public final boolean x(){
       return this.b;
    }
}
