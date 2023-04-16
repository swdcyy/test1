package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$c;

public final class SubtitleTextAdapter$d extends m	// class@000af3
{
    public final SubtitleTextAdapter c;
    public final int d;

    public void SubtitleTextAdapter$d(SubtitleTextAdapter p0,int p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTextAdapter$d.class, "1")) {
          return;
       }
       SubtitleTextAdapter$c uoc = this.c.L0();
       if (uoc != null) {
          uoc.a(this.d);
       }
       return;
    }
}
