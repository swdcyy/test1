package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$b;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;

public final class StickerLongPictureSubViewBinder$b implements Runnable	// class@000ab7
{
    public final StickerLongPictureSubViewBinder b;

    public void StickerLongPictureSubViewBinder$b(StickerLongPictureSubViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StickerLongPictureSubViewBinder$b.class, "1")) {
          return;
       }
       this.b.c.t0(new EditDraftAction(false, 1, objArray));
       StickerLongPictureSubViewBinder$b tb = this.b;
       tb.e.d(tb.i);
       if (this.b.k.getActivity() != null) {
          FragmentActivity activity = this.b.k.getActivity();
          a.m(activity);
          i = n.j(activity);
       }else {
          i = a1.g();
       }
       this.b.h = (float)i / (float)a1.h();
       return;
    }
}
