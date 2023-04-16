package com.yxcorp.gifshow.album.widget.UserTouchRecyclerView$mHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.widget.UserTouchRecyclerView;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;
import com.yxcorp.gifshow.album.widget.UserTouchRecyclerView$mHandler$2$a;
import android.os.Handler$Callback;

public final class UserTouchRecyclerView$mHandler$2 extends Lambda implements a	// class@001b15
{
    public final UserTouchRecyclerView this$0;

    public void UserTouchRecyclerView$mHandler$2(UserTouchRecyclerView p0){
       this.this$0 = p0;
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, UserTouchRecyclerView$mHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Handler(Looper.getMainLooper(), new UserTouchRecyclerView$mHandler$2$a(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
