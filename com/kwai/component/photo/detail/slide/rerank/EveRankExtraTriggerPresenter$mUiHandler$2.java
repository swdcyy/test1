package com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$mUiHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class EveRankExtraTriggerPresenter$mUiHandler$2 extends Lambda implements a	// class@000a9c
{
    public static final EveRankExtraTriggerPresenter$mUiHandler$2 INSTANCE;

    static {
       EveRankExtraTriggerPresenter$mUiHandler$2.INSTANCE = new EveRankExtraTriggerPresenter$mUiHandler$2();
    }
    public void EveRankExtraTriggerPresenter$mUiHandler$2(){
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, EveRankExtraTriggerPresenter$mUiHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Handler(Looper.getMainLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
