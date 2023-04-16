package com.yxcorp.gifshow.prettify.beauty.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.beauty.d;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.View;
import q0c.d;
import android.view.View$OnClickListener;

public final class b implements Runnable	// class@0010fa
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       tb.l.findViewById(R.id.button_prettify_container).setOnClickListener(new d(tb));
    }
}
