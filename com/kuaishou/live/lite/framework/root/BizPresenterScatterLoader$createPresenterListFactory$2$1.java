package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.util.Map$Entry;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Pair;
import java.util.Objects;

public final class BizPresenterScatterLoader$createPresenterListFactory$2$1 extends Lambda implements a	// class@000952
{
    public final Map$Entry $it;

    public void BizPresenterScatterLoader$createPresenterListFactory$2$1(Map$Entry p0){
       this.$it = p0;
       super(0);
    }
    public final d invoke(){
       Pair obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$it.getValue().second;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.live.lite.basic.LiveLiteBizPresenter");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
