package com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewController$binding$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;

public final class KtvTagPendantViewController$binding$1 extends Lambda implements p	// class@001617
{
    public static final KtvTagPendantViewController$binding$1 INSTANCE;

    static {
       KtvTagPendantViewController$binding$1.INSTANCE = new KtvTagPendantViewController$binding$1();
    }
    public void KtvTagPendantViewController$binding$1(){
       super(2);
    }
    public final int invoke(int p0,boolean p1){
       if (p0 == 2) {
          p0 = 0;
       }else if(!p0){
          p0 = 0x7f08115f;
       }else if(p1){
          p0 = 0x7f081312;
       }else {
          p0 = 0x7f081311;
       }
       return p0;
    }
    public Object invoke(Object p0,Object p1){
       return Integer.valueOf(this.invoke(p0.intValue(), p1.booleanValue()));
    }
}
