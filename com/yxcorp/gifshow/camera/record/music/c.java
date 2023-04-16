package com.yxcorp.gifshow.camera.record.music.c;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.response.MusicDetailResponse;
import com.yxcorp.gifshow.camera.record.music.d;
import com.yxcorp.gifshow.model.response.MagicMusicsResponse;
import java.util.ArrayList;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import j8c.a;
import java.lang.String;
import q87.c;

public final class c implements o	// class@000e6f
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       MagicMusicsResponse magicMusicsR = new MagicMusicsResponse();
       magicMusicsR.mMusics = new ArrayList();
       MusicDetailResponse mMusic = p0.mMusic;
       if (mMusic != null && !mMusic.isOffline()) {
          magicMusicsR.mMusics.add(p0.mMusic);
          magicMusicsR.mLlsid = p0.mMusic.mLlsid;
       }else {
          Object[] objArray = new Object[0];
          a.D().A("MagicMusicPpCtrl", "custom music detail is illegal", objArray);
       }
       return magicMusicsR;
    }
}
