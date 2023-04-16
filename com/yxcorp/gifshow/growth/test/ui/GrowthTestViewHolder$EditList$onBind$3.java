package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$3;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList;
import zqa.b;
import android.content.Context;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zqa.b$d;
import msd.a;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$3$2;
import msd.l;
import pna.h;

public final class GrowthTestViewHolder$EditList$onBind$3 implements View$OnClickListener	// class@001564
{
    public final GrowthTestViewHolder$EditList b;
    public final b c;
    public final Context d;

    public void GrowthTestViewHolder$EditList$onBind$3(GrowthTestViewHolder$EditList p0,b p1,Context p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$EditList$onBind$3.class, "1")) {
          return;
       }
       HashMap hashMap = this.c.e().invoke();
       ArrayList uArrayList = new ArrayList(hashMap.keySet());
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          uArrayList1.add(str+" = "+hashMap.get(str));
       }
       h.d(this.d, "Ñ¡ÔñÉ¾³ýÑ¡Ïî", uArrayList1, 1, null, new GrowthTestViewHolder$EditList$onBind$3$2(this, uArrayList), 16, null);
       return;
    }
}
