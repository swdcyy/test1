package com.kwai.live.gzone.accompanyplay.anchor.e0$c$a;
import erd.o;
import com.kwai.live.gzone.accompanyplay.anchor.e0$c;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.api.LiveGzoneAccompanyNextRoundResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import e17.i;

public class e0$c$a implements o	// class@000b06
{
    public final e0$c b;

    public void e0$c$a(e0$c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, e0$c$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else if(p0.mResult == 1){
          LiveGzoneAccompanyNextRoundResponse mRoundId = p0.mRoundId;
          if (mRoundId > 0) {
             str = String.valueOf(mRoundId);
          }
       }else {
          i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
       }
       str = "";
       return str;
    }
}
