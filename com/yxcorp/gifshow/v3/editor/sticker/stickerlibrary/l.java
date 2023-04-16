package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.l;
import erd.g;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import e17.i;
import rtc.n;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.LibraryLoadingView;
import rtc.o;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class l implements g	// class@0012a6
{
    public final StickerLibraryFragment b;

    public void l(StickerLibraryFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       int i = p0.intValue();
       if (i && i != 1) {
          if (i != 2) {
             if (i == 3) {
                i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
             }
             tb.H.L(new n(tb));
          }else {
             tb.Sh();
             tb.Uh(new o(tb));
          }
       }else {
          tb.H.M();
          tb.H.setVisibility(0);
       }
       return;
    }
}
