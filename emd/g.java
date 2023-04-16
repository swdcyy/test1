package emd.g;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer$b;
import java.lang.CharSequence;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import umd.b;

public final class g implements Runnable	// class@000d97
{
    public final NewVoteStickerDrawer$b b;
    public final CharSequence c;
    public final int d;

    public void g(NewVoteStickerDrawer$b p0,CharSequence p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.c.mOnStickerTextChangeListener.a(this.c.toString(), new ArrayList(), null, this.d);
    }
}
