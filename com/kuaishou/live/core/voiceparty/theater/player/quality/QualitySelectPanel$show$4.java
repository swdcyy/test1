package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$show$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import java.util.Objects;

public final class QualitySelectPanel$show$4 extends Lambda implements a	// class@0019b5
{
    public final QualitySelectPanel this$0;

    public void QualitySelectPanel$show$4(QualitySelectPanel p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewGroup invoke(){
       View obj = PatchProxy.apply(null, this, QualitySelectPanel$show$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.this$0.c.getContext()), R.layout.arg_RES_7f0d0d27, this.this$0.c, false);
       this.this$0.c.addView(obj);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
