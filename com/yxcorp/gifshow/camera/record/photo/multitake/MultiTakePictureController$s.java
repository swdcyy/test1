package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$s;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import com.yxcorp.gifshow.camera.bubble.b;
import ra9.c;
import android.view.View;
import lnc.a1;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$s$a;
import com.yxcorp.gifshow.camera.bubble.b$c;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class MultiTakePictureController$s implements Runnable	// class@000eec
{
    public final MultiTakePictureController b;
    public final int c;

    public void MultiTakePictureController$s(MultiTakePictureController p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MultiTakePictureController$s.class, "1")) {
          return;
       }
       d d = this.b.d;
       String str = "mCallerContext";
       a.o(d, str);
       BaseFragment uBaseFragmen = d.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       if (uBaseFragmen.isResumed() && this.b.D != null) {
          MultiTakePictureController$s tc = this.c;
          if (tc != null) {
             if (tc == 5) {
                objArray = RecordBubbleItem.MULTI_TAKE_PICTURE_SAVE_BUBBLE;
             }
          }else {
             objArray = RecordBubbleItem.MULTI_TAKE_PICTURE_SAVE_BUBBLE_IN_VIDEO;
          }
          if (objArray != null) {
             b uob = new b(objArray).n(this.b.D).A(R.string.arg_RES_7f100407);
             uob.q((long)5000);
             uob.t((- a1.d(R.dimen.arg_RES_7f070329)));
             uob.v(MultiTakePictureController$s$a.a);
             d d1 = this.b.d;
             a.o(d1, str);
             w ow = d1.b();
             a.o(ow, "mCallerContext.controllerManager");
             ow.V7().n(uob);
          }
       }
    label_007b :
       return;
    }
}
