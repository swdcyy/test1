package nmd.k;
import erd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import itc.x2;

public final class k implements g	// class@001e61
{
    public final c b;

    public void k(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       tb.h.onNext(p0);
       h1.l(p0);
       StickerRanker.i.i(p0.mStickerId);
       x2.c(tb.a.Qh(), p0);
    }
}
