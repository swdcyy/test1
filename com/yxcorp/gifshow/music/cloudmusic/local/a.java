package com.yxcorp.gifshow.music.cloudmusic.local.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class a implements g	// class@002029
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("LocalMusicFragment", "请求权限异常", p0);
    }
}
