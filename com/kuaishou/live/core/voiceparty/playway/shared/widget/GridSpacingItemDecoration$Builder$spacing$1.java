package com.kuaishou.live.core.voiceparty.playway.shared.widget.GridSpacingItemDecoration$Builder$spacing$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class GridSpacingItemDecoration$Builder$spacing$1 extends Lambda implements l	// class@001898
{
    public static final GridSpacingItemDecoration$Builder$spacing$1 INSTANCE;

    static {
       GridSpacingItemDecoration$Builder$spacing$1.INSTANCE = new GridSpacingItemDecoration$Builder$spacing$1();
    }
    public void GridSpacingItemDecoration$Builder$spacing$1(){
       super(1);
    }
    public final int invoke(RecyclerView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GridSpacingItemDecoration$Builder$spacing$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "it");
       return 0;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
