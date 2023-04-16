package com.yxcorp.gifshow.v3.previewer.u0;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import lwc.t2;

public final class u0 implements Runnable	// class@00160f
{
    public final VideoEditPreviewV3Fragment b;

    public void u0(VideoEditPreviewV3Fragment p0){
       this.b = p0;
    }
    public final void run(){
       u0 tb = this.b;
       tb.ni(new t2(tb));
    }
}
