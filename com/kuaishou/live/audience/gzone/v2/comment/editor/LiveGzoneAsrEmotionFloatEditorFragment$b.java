package com.kuaishou.live.audience.gzone.v2.comment.editor.LiveGzoneAsrEmotionFloatEditorFragment$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.gzone.v2.comment.editor.LiveGzoneAsrEmotionFloatEditorFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.util.Objects;
import y31.e;
import ay0.h;

public class LiveGzoneAsrEmotionFloatEditorFragment$b implements View$OnClickListener	// class@000c2a
{
    public final LiveGzoneAsrEmotionFloatEditorFragment b;

    public void LiveGzoneAsrEmotionFloatEditorFragment$b(LiveGzoneAsrEmotionFloatEditorFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       LiveGzoneAsrEmotionFloatEditorFragment l2;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAsrEmotionFloatEditorFragment$b.class, "1")) {
          return;
       }
       int i = 0;
       boolean b = (this.b.h1.getVisibility())? true: false;
       this.b.Xi(b);
       LiveGzoneAsrEmotionFloatEditorFragment$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LiveGzoneAsrEmotionFloatEditorFragment.class, "7")) {
          l2 = tb.f2;
          if (l2 != null) {
             e g = l2.g;
             if (g != null) {
                g.c();
             }
          }
       }
       l2 = this.b.l2;
       if (b) {
          i = 8;
       }
       l2.setVisibility(i);
       return;
    }
}
