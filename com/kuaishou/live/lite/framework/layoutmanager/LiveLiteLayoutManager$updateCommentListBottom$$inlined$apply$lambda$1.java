package com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.util.Map;
import android.view.ViewGroup;

public final class LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1 extends Lambda implements a	// class@000916
{
    public final int $dialogTop$inlined;
    public final LiveLiteLayoutManager this$0;

    public void LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1(LiveLiteLayoutManager p0,int p1){
       this.this$0 = p0;
       this.$dialogTop$inlined = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1 tthis$0;
       ViewGroup viewGroup;
       LiveLiteLayoutManager liveLiteLayo = LiveLiteLayoutManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       if (this.$dialogTop$inlined == -1) {
          tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.applyVoid(objArray, tthis$0, liveLiteLayo, "22")) {
             viewGroup = tthis$0.k.get(LayoutViewType.AnchorInfoBar);
             if (viewGroup != null) {
                viewGroup.setVisibility(0);
             }
             viewGroup = tthis$0.k.get(LayoutViewType.TempPlayArea);
             if (viewGroup != null) {
                viewGroup.setVisibility(0);
             }
             viewGroup = tthis$0.k.get(LayoutViewType.SquareNoticeArea);
             if (viewGroup != null) {
                viewGroup.setVisibility(0);
             }
          }
       }else {
          tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.applyVoid(objArray, tthis$0, liveLiteLayo, "21")) {
             viewGroup = tthis$0.k.get(LayoutViewType.AnchorInfoBar);
             if (viewGroup != null) {
                viewGroup.setVisibility(4);
             }
             viewGroup = tthis$0.k.get(LayoutViewType.TempPlayArea);
             if (viewGroup != null) {
                viewGroup.setVisibility(4);
             }
             viewGroup = tthis$0.k.get(LayoutViewType.SquareNoticeArea);
             if (viewGroup != null) {
                viewGroup.setVisibility(4);
             }
          }
       }
       PatchProxy.onMethodExit(LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
