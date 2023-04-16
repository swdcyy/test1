package nmd.i0;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import kotlin.jvm.internal.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;

public final class i0 implements Observer	// class@001e5c
{
    public final StickerTimelineFragment b;

    public void i0(StickerTimelineFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w(this.b.w, "mRequestState is "+p0+' ', objArray);
          String str = 2;
          if (p0 != null && p0.intValue() == str) {
             this.b.rh();
             p0 = this.b.qh();
             if (p0 != null) {
                p0.setVisibility(8);
             }
          }else {
             str = "Lists.newArrayList\(\)";
             if (p0 == null || p0.intValue()) {
                objArray = 3;
                if (p0 == null || p0.intValue() != objArray) {
                   if (p0 != null && p0.intValue() == 1) {
                      p0 = this.b.qh();
                      if (p0 != null) {
                         p0.setVisibility(0);
                      }
                   }else {
                      p0 = this.b.fh().N();
                      a.o(p0, "editorDelegate.workspaceDraft");
                      if (h1.k(p0.v())) {
                         p0 = Lists.b();
                         a.o(p0, str);
                         StickerDetailInfo.addLocalStickers(p0);
                         this.b.th(p0);
                         p0 = this.b.qh();
                         if (p0 != null) {
                            p0.setVisibility(8);
                         }
                      }
                   }
                }
             }
             p0 = this.b.fh().N();
             a.o(p0, "editorDelegate.workspaceDraft");
             if (h1.k(p0.v())) {
                p0 = Lists.b();
                a.o(p0, str);
                StickerDetailInfo.addLocalStickers(p0);
                this.b.th(p0);
                p0 = this.b.qh();
                if (p0 != null) {
                   p0.setVisibility(8);
                }
             }
          }
       }
       return;
    }
}
