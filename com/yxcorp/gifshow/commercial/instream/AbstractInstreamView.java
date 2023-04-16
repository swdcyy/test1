package com.yxcorp.gifshow.commercial.instream.AbstractInstreamView;
import android.widget.FrameLayout;
import android.content.Context;

public abstract class AbstractInstreamView extends FrameLayout	// class@00113a
{

    public void AbstractInstreamView(Context p0){
       super(p0);
    }
    public abstract void a();
    public abstract void b();
    public abstract void setVolume(boolean p0);
}
