package com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$a;
import android.view.View$OnLayoutChangeListener;
import crd.b;
import android.view.View;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import db3.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewGroup;
import java.lang.Number;
import eb3.a;
import usd.q;
import android.graphics.Rect;
import com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout$ScaleType;

public final class LiveLiteLayoutManager$a implements View$OnLayoutChangeListener	// class@000911
{
    public final b b;
    public final View c;
    public final LiveLiteLayoutManager d;
    public final i e;
    public final int f;

    public void LiveLiteLayoutManager$a(b p0,View p1,LiveLiteLayoutManager p2,i p3,int p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       Object obj = this;
       object oobject = p0;
       if (PatchProxy.isSupport(LiveLiteLayoutManager$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, obj, LiveLiteLayoutManager$a.class, "1")) {
             return;
          }
       }
       a.p(oobject, "view");
       oobject.removeOnLayoutChangeListener(obj);
       if (!obj.b.isDisposed()) {
          LiveLiteLogTag lAYOUT_MANAG = LiveLiteLogTag.LAYOUT_MANAGER;
          b.Z(lAYOUT_MANAG, "post do adjustCommentList "+obj.e.hashCode());
          int i = obj.d.m.getTop() - obj.d.z.getBottom();
          int i1 = (i - obj.e.d()) - a.b(obj.d.l, Integer.valueOf(10));
          b.e0(lAYOUT_MANAG, "adjustCommentList", "freeHeight", Integer.valueOf(i), "giftSlotHeight", Integer.valueOf(obj.e.d()), "comment list height", Integer.valueOf(i1));
          obj.d.a(i.a(obj.e, q.n(i1, obj.f), 0, 0, 0, 0, 0, 0, 0, null, false, false, false, false, 0, 0, 0, 0, 0, null, 0x7fffa, null));
       }
       return;
    }
}
