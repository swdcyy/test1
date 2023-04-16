package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$NextMusicOrder;
import ut7.e;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class KtvManager$NextMusicOrder implements e	// class@00140d
{
    public final KtvMusicOrderInfo a;
    public final boolean b;

    public void KtvManager$NextMusicOrder(KtvMusicOrderInfo p0,boolean p1){
       a.p(p0, "music");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(){
       return this.b;
    }
    public final KtvMusicOrderInfo b(){
       return this.a;
    }
}
