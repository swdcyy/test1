package com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveBasePreviewBottomCardTemplateView$a extends m	// class@000d9c
{
    public final View$OnClickListener c;
    public final LiveBasePreviewBottomCardTemplateView d;

    public void LiveBasePreviewBottomCardTemplateView$a(LiveBasePreviewBottomCardTemplateView p0,View$OnClickListener p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasePreviewBottomCardTemplateView$a.class, "1")) {
          return;
       }
       LiveBasePreviewBottomCardTemplateView$a tc = this.c;
       if (tc != null) {
          tc.onClick(p0);
       }
       return;
    }
}
