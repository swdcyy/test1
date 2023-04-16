package com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper$c;
import java.lang.Runnable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import r79.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import m79.g;
import msd.l;
import qrd.l1;

public final class MultiPicturePreviewHelper$c implements Runnable	// class@000ec5
{
    public final LinearLayoutManager b;
    public final MultiPicturePreviewHelper c;
    public final int d;
    public final c e;

    public void MultiPicturePreviewHelper$c(LinearLayoutManager p0,MultiPicturePreviewHelper p1,int p2,c p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, MultiPicturePreviewHelper$c.class, "1")) {
          return;
       }
       MultiPicturePreviewHelper$c tc = this.c;
       MultiPicturePreviewHelper b = tc.b;
       if (b != null) {
          l1 ol1 = b.invoke(tc.d(this.b.findViewByPosition(this.d), this.e));
       }
       PatchProxy.onMethodExit(MultiPicturePreviewHelper$c.class, "1");
       return;
    }
}
