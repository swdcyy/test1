package com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$a;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH;
import d0c.d;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class MoodRemoteFontVH$a implements View$OnClickListener	// class@000af1
{
    public final MoodRemoteFontVH b;
    public final d c;
    public final FontViewModel d;

    public void MoodRemoteFontVH$a(MoodRemoteFontVH p0,d p1,FontViewModel p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodRemoteFontVH$a.class, "1")) {
          return;
       }
       this.c.n(0);
       this.b.h(this.c);
       this.d.q0(this.b.getAdapterPosition());
       return;
    }
}
