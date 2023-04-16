package com.kuaishou.live.core.voiceparty.music.l;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartySearchMusicsResponse;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySearchMusicFragment$b;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.voiceparty.music.k;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;

public final class l implements o	// class@0017de
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       ArrayList uArrayList = new ArrayList();
       m.s(p0.musics).p(k.b).n(uArrayList);
       p0.musics = uArrayList;
       return p0;
    }
}
