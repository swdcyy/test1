package com.yxcorp.gifshow.b0;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam$Builder;
import o56.a;
import android.content.Context;
import com.kuaishou.ax2c.PreloadParam;
import tkd.b;
import tkd.d;
import ra0.d;

public final class b0 implements Runnable	// class@001c48
{
    public static final b0 b;

    static {
       b0.b = new b0();
    }
    public void b0(){
       super();
    }
    public final void run(){
       PreLoader.getInstance().preload(new PreloadParam$Builder(a.B).addLayoutId(R.layout.record_album_home_fragment).setUseMutableContext(true).build());
       d.a(0x1bf6ff1d).AQ();
       PreLoader.getInstance().preload(new PreloadParam$Builder(a.B).addLayoutId(R.layout.ksa_album_main_fragment_tab).setUseMutableContext(true).build());
       PreLoader.getInstance().preload(new PreloadParam$Builder(a.B).addLayoutId(R.layout.ksa_photo_picker_v4).setUseMutableContext(true).build());
       PreLoader.getInstance().preload(new PreloadParam$Builder(a.B).addLayoutId(R.layout.ksa_album_fragment_select_container_top).setUseMutableContext(true).build());
       PreLoader.getInstance().preload(new PreloadParam$Builder(a.B).addLayoutId(R.layout.ksa_photo_pick_img_fragment).setRepeatCount(3).setUseMutableContext(true).build());
    }
}
