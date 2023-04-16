package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class StickerLibraryFragment$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001296
{
    public final Runnable b;
    public final StickerLibraryFragment c;

    public void StickerLibraryFragment$b(StickerLibraryFragment p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, StickerLibraryFragment$b.class, "1")) {
          return;
       }
       this.c.u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.run();
       return;
    }
}
