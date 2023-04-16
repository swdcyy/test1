package com.yxcorp.gifshow.album.home.ScrollableHeaderStub$c;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$c;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import w69.d0;

public final class ScrollableHeaderStub$c implements ScrollableLayout$c	// class@001a18
{
    public final ScrollableHeaderStub a;

    public void ScrollableHeaderStub$c(ScrollableHeaderStub p0){
       this.a = p0;
       super();
    }
    public void a(float p0,int p1,int p2,float p3){
       if (PatchProxy.isSupport(ScrollableHeaderStub$c.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Float.valueOf(p3), this, ScrollableHeaderStub$c.class, "1")) {
          return;
       }
       if (p0 - (float)0 > 0 && p0 - 0x3f800000 < 0) {
          this.a.l = true;
       }
       ScrollableHeaderStub e = this.a.e;
       if (e != null) {
          e.a(p0, p1, p2, p3);
       }
       return;
    }
}
