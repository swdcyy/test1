package com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment$5$1;
import la6.b;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment$5;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;

public class PymkDetailSlidePlayRecyclerFragment$5$1 implements b	// class@0016d2
{
    public final PymkDetailSlidePlayRecyclerFragment$5 this$1;

    public void PymkDetailSlidePlayRecyclerFragment$5$1(PymkDetailSlidePlayRecyclerFragment$5 p0){
       this.this$1 = p0;
       super();
    }
    public List getItems(){
       Object obj = PatchProxy.apply(null, this, PymkDetailSlidePlayRecyclerFragment$5$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.emptyList();
    }
    public boolean hasMore(){
       return false;
    }
}
