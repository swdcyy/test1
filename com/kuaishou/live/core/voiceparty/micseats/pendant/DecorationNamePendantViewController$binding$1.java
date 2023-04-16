package com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController$binding$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController;
import com.kuaishou.live.core.voiceparty.playway.shared.micseat.viewmodel.Gender;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public final class DecorationNamePendantViewController$binding$1 extends Lambda implements l	// class@0015e8
{
    public final DecorationNamePendantViewController this$0;

    public void DecorationNamePendantViewController$binding$1(DecorationNamePendantViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public final int invoke(boolean p0){
       int i;
       if (p0) {
          i = 0x7f081530;
       }else if(this.this$0.k == Gender.MALE){
          i = 0x7f081510;
       }else {
          i = 0x7f081511;
       }
       return i;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0.booleanValue()));
    }
}
