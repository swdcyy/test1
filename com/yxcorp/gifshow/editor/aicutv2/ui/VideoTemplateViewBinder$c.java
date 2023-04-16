package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$c;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import jn9.b;
import dca.s;
import java.util.List;
import java.util.Collection;
import eca.g;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.bubble.a;

public final class VideoTemplateViewBinder$c implements RecyclerView$o	// class@001b94
{
    public final VideoTemplateViewBinder b;

    public void VideoTemplateViewBinder$c(VideoTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateViewBinder$c.class, "2")) {
          return;
       }
       a.p(p0, "view");
       return;
    }
    public void w6(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateViewBinder$c.class, "1")) {
          return;
       }
       a.p(p0, "view");
       VideoTemplateViewBinder$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, VideoTemplateViewBinder.class, "10")) {
          List list = tb.l.z0().m();
          int i = 0;
          String str = (list == null || list.isEmpty())? 1: null;
          if (!str) {
             Object obj = list.get(i);
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.ui.item.VideoTemplateUIItem");
             if (obj.g() && tb.e.getChildCount() > 0) {
                b uob = new b(EditBubbleItem.AI_CUT_RECOMMEND);
                uob.b(tb.e.getChildAt(i));
                PostBubbleManager.d(tb.k).n(uob);
             }
          }
       }
    label_006f :
       return;
    }
}
