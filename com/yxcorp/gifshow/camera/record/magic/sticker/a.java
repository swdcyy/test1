package com.yxcorp.gifshow.camera.record.magic.sticker.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import mf9.e;
import android.view.View;

public final class a implements Runnable	// class@000e5a
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       d l = tb.l;
       if (l != null) {
          l.post(new e(tb));
       }
       return;
    }
}
