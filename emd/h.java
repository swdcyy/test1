package emd.h;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer$c;
import java.lang.CharSequence;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.util.List;
import umd.b;

public final class h implements Runnable	// class@000d98
{
    public final NewVoteStickerDrawer$c b;
    public final int c;
    public final CharSequence d;
    public final int e;

    public void h(NewVoteStickerDrawer$c p0,int p1,CharSequence p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       ArrayList uArrayList;
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       Objects.requireNonNull(tb);
       if (tc == null) {
          uArrayList = tb.d.constructOptionList((td.toString()).trim(), null, null);
       }else if(tc == 1){
          uArrayList = tb.d.constructOptionList(null, (td.toString()).trim(), null);
       }else if(tc == 2){
          uArrayList = tb.d.constructOptionList(null, null, (td.toString()).trim());
       }else {
          uArrayList = new ArrayList();
       }
       tb.d.mOnStickerTextChangeListener.a(null, uArrayList, null, te);
       return;
    }
}
