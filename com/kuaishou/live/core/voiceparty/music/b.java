package com.kuaishou.live.core.voiceparty.music.b;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicOrderedResponse;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.voiceparty.music.a;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;

public final class b implements o	// class@0017d4
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       ArrayList uArrayList = new ArrayList();
       m.s(p0.orders).p(a.b).n(uArrayList);
       p0.orders = uArrayList;
       return p0;
    }
}
