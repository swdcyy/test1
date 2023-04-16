package com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$b;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH;
import d0c.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MoodRemoteFontVH$b implements View$OnClickListener	// class@000af2
{
    public final MoodRemoteFontVH b;
    public final d c;

    public void MoodRemoteFontVH$b(MoodRemoteFontVH p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodRemoteFontVH$b.class, "1")) {
          return;
       }
       this.b.m(this.c, false);
       return;
    }
}
