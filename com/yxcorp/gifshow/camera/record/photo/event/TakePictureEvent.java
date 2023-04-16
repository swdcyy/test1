package com.yxcorp.gifshow.camera.record.photo.event.TakePictureEvent;
import com.yxcorp.gifshow.camera.record.photo.event.TakePictureEvent$TakePictureStatus;
import java.lang.Object;
import z1.h;
import java.io.File;

public class TakePictureEvent	// class@000ea9
{
    public final TakePictureEvent$TakePictureStatus a;
    public final File b;
    public final boolean c;
    public final boolean d;

    public void TakePictureEvent(TakePictureEvent$TakePictureStatus p0){
       super();
       boolean b = (p0 != TakePictureEvent$TakePictureStatus.SUCCESS)? true: false;
       h.a(b);
       this.a = p0;
       this.b = null;
       this.d = false;
       this.c = false;
       return;
    }
    public void TakePictureEvent(File p0,boolean p1,boolean p2){
       super();
       this.a = TakePictureEvent$TakePictureStatus.SUCCESS;
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
}
