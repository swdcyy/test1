package com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment$c;
import androidx.recyclerview.widget.GridLayoutManager$b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import j3a.a;

public final class PhotoPlayerPanelFragment$c extends GridLayoutManager$b	// class@00164c
{
    public final List e;

    public void PhotoPlayerPanelFragment$c(List p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       PhotoPlayerPanelFragment$c uoc = PhotoPlayerPanelFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (this.e.get(p0).c())? 5: 1;
       return p0;
    }
}
