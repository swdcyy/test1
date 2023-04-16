package com.kuaishou.live.core.voiceparty.music.f;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicOrderedResponse;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$b;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.voiceparty.music.e;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;

public final class f implements o	// class@0017d8
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       ArrayList uArrayList = new ArrayList();
       m.s(p0.orders).p(e.b).n(uArrayList);
       p0.orders = uArrayList;
       return p0;
    }
}
