package com.yxcorp.gifshow.v3.previewer.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import lwc.i0;
import java.util.Map;
import com.yxcorp.gifshow.v3.f;

public final class t implements Runnable	// class@00160e
{
    public final PhotosEditPreviewV3Fragment b;

    public void t(PhotosEditPreviewV3Fragment p0){
       this.b = p0;
    }
    public final void run(){
       t tb = this.b;
       i0 oi0 = new i0(tb);
       f.Q(tb.X0, oi0, true);
    }
}
