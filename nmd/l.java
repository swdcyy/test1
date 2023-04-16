package nmd.l;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.f0;

public final class l implements Callable	// class@001e65
{
    public final StickerDetailInfo b;

    public void l(StickerDetailInfo p0){
       this.b = p0;
    }
    public final Object call(){
       l tb = this.b;
       f0.h(tb);
       return tb;
    }
}
