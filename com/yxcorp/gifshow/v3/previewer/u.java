package com.yxcorp.gifshow.v3.previewer.u;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import lwc.m0;
import java.util.Map;
import com.yxcorp.gifshow.v3.f;

public final class u implements Runnable	// class@001610
{
    public final PhotosEditPreviewV3Fragment b;
    public final boolean c;

    public void u(PhotosEditPreviewV3Fragment p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       u tb = this.b;
       m0 om0 = new m0(tb, this.c);
       f.Q(tb.X0, om0, true);
    }
}
