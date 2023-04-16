package com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment$b;
import b9c.v;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class PymkDetailSlidePlayRecyclerFragment$b extends v	// class@0016d5
{
    public final PymkDetailSlidePlayRecyclerFragment e;

    public void PymkDetailSlidePlayRecyclerFragment$b(PymkDetailSlidePlayRecyclerFragment p0,RecyclerFragment p1,i p2){
       this.e = p0;
       super(p1, p2);
    }
    public boolean v(boolean p0){
       PymkDetailSlidePlayRecyclerFragment$b uob = PymkDetailSlidePlayRecyclerFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.e.q().a();
       return true;
    }
}
