package com.kuaishou.live.core.show.luckystar.v2.openresult.a;
import ok.h;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarOpenResultResponse;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2;
import java.lang.String;
import lnc.a1;

public final class a implements h	// class@000d0b
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       if (p0.mWinType != 2) {
          p0 = a1.p(R.string.arg_RES_7f10264f);
       }else if(p0.isNeedFillAddress()){
          p0 = a1.p(R.string.arg_RES_7f102658);
       }else {
          p0 = a1.p(R.string.arg_RES_7f10264e);
       }
       return p0;
    }
}
