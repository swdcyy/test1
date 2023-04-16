package com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH;
import d0c.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import zuc.c;

public final class RemoteFontVH$c implements Runnable	// class@001440
{
    public final RemoteFontVH b;
    public final d c;

    public void RemoteFontVH$c(RemoteFontVH p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RemoteFontVH$c.class, "1")) {
          return;
       }
       RemoteFontVH$c tb = this.b;
       RemoteFontVH g = tb.g;
       if (g != null) {
          g.D1(true, tb.getAdapterPosition(), this.c);
       }
       return;
    }
}
