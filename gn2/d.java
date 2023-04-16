package gn2.d;
import java.lang.Runnable;
import gn2.e;
import java.lang.String;
import com.kuaishou.live.core.basic.model.LiveWishLightGiftGuideConfig;
import java.lang.Object;
import java.util.Objects;
import gn2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import s00.b$a;
import s00.b;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import gn2.i;
import java.lang.Boolean;
import z61.b;
import androidx.lifecycle.MutableLiveData;
import java.lang.StringBuilder;

public final class d implements Runnable	// class@002b50
{
    public final e b;
    public final String c;
    public final LiveWishLightGiftGuideConfig d;

    public void d(e p0,String p1,LiveWishLightGiftGuideConfig p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       d tc = this.c;
       d td = this.d;
       e c = this.b.c;
       Objects.requireNonNull(c);
       if (PatchProxy.applyVoidTwoRefs(tc, td, c, c.class, "9")) {
       }else {
          try{
             List u = c.U;
             b.P(u, "tryShowGiftItem");
             if (TextUtils.isEmpty(tc)) {
                b.P(u, "icon localPath is empty");
             }else {
                td.mIconLocalPath = tc;
                byte[] uobyteArray = b.a().a(td.liveMultiMagicEffectInfoStr);
                try{
                   td.mDefaultLiveMultiMagicEffectInfo = LiveMultiMagicEffectInfo.parseFrom(uobyteArray);
                   c r = c.R;
                   r.b = td;
                   r.mIsVisible = Boolean.TRUE;
                   r.c = c.L;
                   r.d = c.T;
                   c.S.postValue(r);
                }catch(java.lang.Exception e0){
                   b.P(c.U, "liveMultiMagicEffectInfo pb parse fail, liveMultiMagicEffectInfoStr = "+c.T.liveMultiMagicEffectInfoStr);
                }
             }
          }catch(java.lang.Exception e0){
             b.P(c.U, "liveMultiMagicEffectInfoStr decode fail. liveMultiMagicEffectInfoStr = "+td.liveMultiMagicEffectInfoStr);
          }
       }
    }
}
