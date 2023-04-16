package com.yxcorp.gifshow.live.widget.a;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import l1b.b;

public final class a implements PixelCopy$OnPixelCopyFinishedListener	// class@001a92
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void onPixelCopyFinished(int p0){
       if (p0) {
          b.a("SurfaceSnapshotController", "PixelCopy failed: "+p0);
       }
       return;
    }
}
