package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List$onBind$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List;
import zqa.b;
import android.content.Context;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import zqa.b$f;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List$onBind$1$1;
import pna.h;
import kotlin.jvm.internal.a;
import android.content.Intent;
import qrd.l1;
import pna.g;
import msd.l;
import n3d.a;

public final class GrowthTestViewHolder$List$onBind$1 implements View$OnClickListener	// class@00156a
{
    public final GrowthTestViewHolder$List b;
    public final b c;
    public final Context d;

    public void GrowthTestViewHolder$List$onBind$1(GrowthTestViewHolder$List p0,b p1,Context p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$List$onBind$1.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(this.c.d().keySet());
       GrowthTestViewHolder$List c = this.b.c;
       ArrayList obj = null;
       CharSequence text = (c != null)? c.getText(): obj;
       GrowthTestViewHolder$List$onBind$1 td = this.d;
       String str = this.c.c();
       Integer integer = Integer.valueOf(uArrayList.indexOf(String.valueOf(text)));
       GrowthTestViewHolder$List$onBind$1$1 list$onBind$ = new GrowthTestViewHolder$List$onBind$1$1(this, uArrayList);
       if (PatchProxy.isSupport2(h.class, "6")) {
          Object[] objArray = new Object[]{td,str,integer,uArrayList,Integer.valueOf(0),list$onBind$};
          if (PatchProxy.applyVoid(objArray, obj, h.class, "6")) {
          label_00b6 :
             return;
          }
       }
       a.p(td, "activity");
       a.p(str, "activityTitle");
       a.p(uArrayList, "listData");
       a.p(list$onBind$, "callback");
       Intent intent = h.b(td, uArrayList, str);
       intent.putExtra("KEY_SELECT_ACTIVITY_TYPE", 0);
       intent.putExtra("KEY_SELECT_VIEW_TYPE", 0);
       obj = new ArrayList();
       int i = (integer != null)? integer.intValue(): -1;
       obj.add(Integer.valueOf(i));
       h.c(intent, obj);
       td.t1(intent, 1024, new g(list$onBind$));
       PatchProxy.onMethodExit(h.class, "6");
       goto label_00b6 ;
    }
}
