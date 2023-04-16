package com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import l79.m;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ec7.a;
import r79.c;
import android.view.View;
import java.util.Set;
import p79.c;

public final class MediaPreviewSelectViewStub$b extends RecyclerView$r	// class@001a35
{
    public final MediaPreviewSelectViewStub a;

    public void MediaPreviewSelectViewStub$b(MediaPreviewSelectViewStub p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       MediaPreviewSelectViewStub$b uob = MediaPreviewSelectViewStub$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.q(p0, "recyclerView");
       Log.b("MediaPreviewSelectViewStub", "onScrollStateChanged\(\) called with: recyclerView = ["+p0+"], newState = ["+p1+']');
       if (!p1) {
          MediaPreviewSelectViewStub$b ta = this.a;
          if (ta.l != null) {
             ta.l = false;
             int i = MediaPreviewSelectViewStub.h(ta).Z0() - 1;
             RecyclerView$ViewHolder viewHolder = this.a.m().findViewHolderForAdapterPosition(i);
             if (viewHolder != null) {
                viewHolder = viewHolder.itemView;
                a.h(viewHolder, "holder.itemView");
                c uoc = MediaPreviewSelectViewStub.h(this.a).L0(i);
                if (viewHolder.getVisibility() && uoc != null) {
                   this.a.r.remove(uoc);
                   c.a(viewHolder);
                }
             }
          }
       }
       return;
    }
}
