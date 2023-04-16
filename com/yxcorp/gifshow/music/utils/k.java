package com.yxcorp.gifshow.music.utils.k;
import erd.o;
import java.lang.Object;
import njd.a;
import com.yxcorp.gifshow.music.utils.m;
import java.util.ArrayList;
import com.yxcorp.gifshow.music.network.model.response.HistoryMusicResponse;

public final class k implements o	// class@002098
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0.a() == null)? new ArrayList(): p0.a().mMusicList;
       return p0;
    }
}
