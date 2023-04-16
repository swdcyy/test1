package com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.e;
import ok.h;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;

public final class e implements h	// class@001530
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object apply(Object p0){
       if (p0 instanceof KwaiException) {
          i.d(R.style.arg_RES_7f110668, p0.mErrorMessage);
       }
       return null;
    }
}
