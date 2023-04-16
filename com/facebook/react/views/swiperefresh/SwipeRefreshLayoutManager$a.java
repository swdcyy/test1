package com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager$a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import ze.n0;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import df.c;
import wf.a;
import android.view.ViewGroup;
import df.b;

public class SwipeRefreshLayoutManager$a implements SwipeRefreshLayout$j	// class@0013fa
{
    public final n0 a;
    public final ReactSwipeRefreshLayout b;
    public final SwipeRefreshLayoutManager c;

    public void SwipeRefreshLayoutManager$a(SwipeRefreshLayoutManager p0,n0 p1,ReactSwipeRefreshLayout p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onRefresh(){
       if (PatchProxy.applyVoid(null, this, SwipeRefreshLayoutManager$a.class, "1")) {
          return;
       }
       this.a.getNativeModule(UIManagerModule.class).getEventDispatcher().c(new a(this.b.getId()));
       return;
    }
}
