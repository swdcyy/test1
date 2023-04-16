package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$mLayoutManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NearbyHeaderFunctionEntranceView$mLayoutManager$2 extends Lambda implements a	// class@001aba
{
    public final Context $context;

    public void NearbyHeaderFunctionEntranceView$mLayoutManager$2(Context p0){
       this.$context = p0;
       super(0);
    }
    public final LinearLayoutManager invoke(){
       Object obj = PatchProxy.apply(null, this, NearbyHeaderFunctionEntranceView$mLayoutManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayoutManager(this.$context, 0, 0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
