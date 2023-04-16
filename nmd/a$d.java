package nmd.a$d;
import android.view.View$OnClickListener;
import nmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteStickerFeedUIData;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$d implements View$OnClickListener	// class@001e48
{
    public final a b;
    public final MultiVoteStickerFeedUIData c;
    public final int d;

    public void a$d(a p0,MultiVoteStickerFeedUIData p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       this.b.b(this.c, this.d);
       return;
    }
}
