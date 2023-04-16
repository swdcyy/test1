package com.yxcorp.gifshow.music.cloudmusic.collect.b;
import erd.r;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment;
import com.kuaishou.android.model.music.MusicType;

public final class b implements r	// class@001ffb
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 != null && p0.mType != MusicType.LIP)? true: false;
       return b;
    }
}
