package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$d;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
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

public final class AlbumSelectedContainer$d extends RecyclerView$r	// class@001a9a
{
    public final AlbumSelectedContainer a;

    public void AlbumSelectedContainer$d(AlbumSelectedContainer p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       AlbumSelectedContainer$d uod = AlbumSelectedContainer$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       a.q(p0, "recyclerView");
       Log.b("MediaSelectManager", "onScrollStateChanged\(\) called with: recyclerView = ["+p0+"], newState = ["+p1+']');
       if (!p1) {
          AlbumSelectedContainer$d ta = this.a;
          if (ta.w != null) {
             ta.w = false;
             int i = AlbumSelectedContainer.f(ta).Z0() - 1;
             RecyclerView$ViewHolder viewHolder = this.a.D().findViewHolderForAdapterPosition(i);
             if (viewHolder != null) {
                viewHolder = viewHolder.itemView;
                a.h(viewHolder, "holder.itemView");
                c uoc = AlbumSelectedContainer.f(this.a).L0(i);
                if (viewHolder.getVisibility() && uoc != null) {
                   this.a.C.remove(uoc);
                   c.a(viewHolder);
                }
             }
          }
       }
       return;
    }
}
