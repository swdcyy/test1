package com.kuaishou.live.gameinteractive.minigame.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment;
import com.yxcorp.retrofit.model.RetrofitException;
import aegon.chrome.net.NetworkException;
import e17.i;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class b implements g	// class@001bdd
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       if (p0 instanceof RetrofitException) {
          if (p0.mCause instanceof NetworkException) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
          }
       }else if(p0 instanceof KwaiException && !TextUtils.x(p0.getMessage())){
          i.d(R.style.arg_RES_7f11066a, p0.getMessage());
       }
       return;
    }
}
