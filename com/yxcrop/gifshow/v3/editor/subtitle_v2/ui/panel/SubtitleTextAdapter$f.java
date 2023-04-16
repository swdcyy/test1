package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$f;
import com.yxcorp.gifshow.widget.m;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$c;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;

public final class SubtitleTextAdapter$f extends m	// class@000af5
{
    public final SubtitleTextAdapter c;
    public final int d;

    public void SubtitleTextAdapter$f(SubtitleTextAdapter p0,int p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTextAdapter$f.class, "1")) {
          return;
       }
       SubtitleTextAdapter$c uoc = this.c.L0();
       if (uoc != null) {
          uoc.b(this.d, this.c.J0().get(this.d));
       }
       return;
    }
}
