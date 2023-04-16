package nd9.m0;
import java.lang.Runnable;
import nd9.n0;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.String;
import android.view.View;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import nd9.k0;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.b$c;
import j8c.a;
import q87.c;
import nd9.j0;

public final class m0 implements Runnable	// class@00314e
{
    public final n0 b;

    public void m0(n0 p0){
       this.b = p0;
    }
    public final void run(){
       Object[] objArray;
       m0 tb = this.b;
       Objects.requireNonNull(tb);
       int i = PostExperimentUtils.k0();
       int i1 = 0;
       if (i != 1 && i != 2) {
          if (i == 3 && (!n0.g2("draft_tab_guide_shown") && !tb.l2(tb.p.findViewById(14), 0x7f103d5b, RecordBubbleItem.DRAFT_TAB, k0.a))) {
             objArray = new Object[i1];
             a.D().w("TabGuideController", "needTryShowDraftBubble", objArray);
             tb.r = true;
          }
       }else if(!n0.g2("album_picture_tab_guide_shown") && !tb.l2(tb.p.findViewById(15), 0x7f103dd5, RecordBubbleItem.ALBUM_PICTURE_TAB, j0.a)){
          objArray = new Object[i1];
          a.D().w("TabGuideController", "needTryShowPictureAlbumBubble", objArray);
          tb.q = true;
       }
       return;
    }
}
