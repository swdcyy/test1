package com.yxcorp.gifshow.album.widget.UserTouchRecyclerView$mHandler$2$a;
import android.os.Handler$Callback;
import com.yxcorp.gifshow.album.widget.UserTouchRecyclerView$mHandler$2;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.widget.UserTouchRecyclerView;
import android.view.ViewGroup;

public final class UserTouchRecyclerView$mHandler$2$a implements Handler$Callback	// class@001b14
{
    public final UserTouchRecyclerView$mHandler$2 b;

    public void UserTouchRecyclerView$mHandler$2$a(UserTouchRecyclerView$mHandler$2 p0){
       this.b = p0;
       super();
    }
    public final boolean handleMessage(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserTouchRecyclerView$mHandler$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "it");
       if (p0.what != 100) {
          return false;
       }
       UserTouchRecyclerView$mHandler$2 this$0 = this.b.this$0;
       if (this$0.d == null && this$0.e == this$0.getScrollX()) {
          this$0 = this.b.this$0;
          if (this$0.f == this$0.getScrollY()) {
             this$0 = this.b.this$0;
             this$0.e = Integer.MIN_VALUE;
             this$0.f = Integer.MIN_VALUE;
             this$0.c = false;
          label_0063 :
             return true;
          }
       }
       this$0 = this.b.this$0;
       this$0.e = this$0.getScrollX();
       this$0 = this.b.this$0;
       this$0.f = this$0.getScrollY();
       this.b.this$0.y();
       goto label_0063 ;
    }
}
