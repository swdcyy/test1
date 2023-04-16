package com.kuaishou.post.story.edit.decoration.text.font.MoodLocalFontVH$a;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.edit.decoration.text.font.MoodLocalFontVH;
import d0c.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import zuc.c;

public final class MoodLocalFontVH$a implements View$OnClickListener	// class@000aed
{
    public final MoodLocalFontVH b;
    public final d c;

    public void MoodLocalFontVH$a(MoodLocalFontVH p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodLocalFontVH$a.class, "1")) {
          return;
       }
       if (!this.c.l()) {
          MoodLocalFontVH$a tb = this.b;
          MoodLocalFontVH d = tb.d;
          if (d != null) {
             d.D1(true, tb.getAdapterPosition(), this.c);
          }
       }
       return;
    }
}
