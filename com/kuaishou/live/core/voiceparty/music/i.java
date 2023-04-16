package com.kuaishou.live.core.voiceparty.music.i;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartySangMusicsResponse;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySangMusicFragment$a;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.voiceparty.music.h;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;

public final class i implements o	// class@0017db
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final Object apply(Object p0){
       ArrayList uArrayList = new ArrayList();
       m.s(p0.mKtvMusics).p(h.b).n(uArrayList);
       p0.mKtvMusics = uArrayList;
       return p0;
    }
}
