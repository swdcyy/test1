package com.yxcorp.gifshow.camera.record.album.slideup.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.album.slideup.c;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.album.slideup.b;
import android.view.View;

public final class a implements Runnable	// class@001ccd
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       d l = tb.l;
       if (l != null) {
          l.post(new b(tb));
       }
       return;
    }
}
