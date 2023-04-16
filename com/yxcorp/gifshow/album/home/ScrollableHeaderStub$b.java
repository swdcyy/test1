package com.yxcorp.gifshow.album.home.ScrollableHeaderStub$b;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$d;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView;

public final class ScrollableHeaderStub$b implements ScrollableLayout$d	// class@001a17
{
    public final ScrollableHeaderStub a;

    public void ScrollableHeaderStub$b(ScrollableHeaderStub p0){
       this.a = p0;
       super();
    }
    public View a(){
       Object obj = PatchProxy.apply(null, this, ScrollableHeaderStub$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.i();
    }
}
