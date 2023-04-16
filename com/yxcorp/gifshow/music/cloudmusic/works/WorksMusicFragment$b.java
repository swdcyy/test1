package com.yxcorp.gifshow.music.cloudmusic.works.WorksMusicFragment$b;
import kob.m;
import com.yxcorp.gifshow.music.cloudmusic.works.WorksMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;
import jqb.j;

public class WorksMusicFragment$b extends m	// class@002050
{
    public final WorksMusicFragment l;

    public void WorksMusicFragment$b(WorksMusicFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public View J0(){
       Object obj = PatchProxy.apply(null, this, WorksMusicFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.b(super.J0());
    }
}
