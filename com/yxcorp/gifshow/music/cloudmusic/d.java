package com.yxcorp.gifshow.music.cloudmusic.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class d implements g	// class@002011
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("music_fragment", "", p0);
    }
}
