package com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$c;
import java.lang.Runnable;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH;
import d0c.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import zuc.c;

public final class MoodRemoteFontVH$c implements Runnable	// class@000af3
{
    public final MoodRemoteFontVH b;
    public final d c;

    public void MoodRemoteFontVH$c(MoodRemoteFontVH p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MoodRemoteFontVH$c.class, "1")) {
          return;
       }
       MoodRemoteFontVH$c tb = this.b;
       MoodRemoteFontVH g = tb.g;
       if (g != null) {
          g.D1(true, tb.getAdapterPosition(), this.c);
       }
       return;
    }
}
