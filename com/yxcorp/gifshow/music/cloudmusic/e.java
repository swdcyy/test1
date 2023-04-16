package com.yxcorp.gifshow.music.cloudmusic.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class e implements g	// class@002012
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("music_fragment", "", p0);
    }
}
