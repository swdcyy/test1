package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$g$a;
import erd.g;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$g;
import java.lang.Object;
import hn1.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.a0$a;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import hn1.h0;
import hn1.a0$b;

public final class LiveHotSpotDetailCoreMediaAdapter$g$a implements g	// class@00137d
{
    public final LiveHotSpotDetailCoreMediaAdapter$g b;

    public void LiveHotSpotDetailCoreMediaAdapter$g$a(LiveHotSpotDetailCoreMediaAdapter$g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailCoreMediaAdapter$g$a.class, "1")) {
       }else if(p0 instanceof a0$a){
          p0 = this.b;
          LiveHotSpotDetailCoreMediaAdapter$g i = p0.i;
          if (i.l != null) {
             i.k.c((p0.getAbsoluteAdapterPosition() + 1));
          }
       }else if(p0 instanceof a0$b){
          p0 = this.b;
          p0.i.k.c(p0.getAbsoluteAdapterPosition());
       }
       return;
    }
}
