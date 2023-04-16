package com.kuaishou.live.core.show.subscribe.plc.d;
import erd.o;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import com.kuaishou.live.core.show.subscribe.plc.f;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.plc.LiveHalfSubscribeDialogFragment$b;
import com.kuaishou.live.core.show.subscribe.plc.e;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import com.kuaishou.live.core.show.subscribe.plc.LiveHalfSubscribeDialogFragment;
import zk2.a;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LiveSubscribeStat;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.show.subscribe.helper.LiveSubscribeDialogContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import lnc.a1;
import rk2.b0;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class d implements o	// class@00115d
{
    public final Activity b;
    public final QPhoto c;
    public final String d;
    public final String e;
    public final Map f;

    public void d(Activity p0,QPhoto p1,String p2,String p3,Map p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object apply(Object p0){
       t ot;
       e uoe;
       int i3;
       int i4;
       String obj3;
       d uod = this;
       d b = uod.b;
       d c = uod.c;
       d d = uod.d;
       d e = uod.e;
       d f = uod.f;
       LiveSubscribeStatInfo liveSubscrib = p0;
       if (!liveSubscrib) {
          ot = t.empty();
       }else {
          LiveSubscribeStatInfo mLiveSubscri = liveSubscrib.mLiveSubscribeStat;
          int i = 0;
          Object obj = null;
          int i1 = 5;
          int i2 = 1;
          if (PatchProxy.isSupport(f.class)) {
             Object[] objArray = new Object[i1];
             objArray[i] = b;
             objArray[i2] = c;
             objArray[2] = d;
             objArray[3] = e;
             objArray[4] = liveSubscrib;
             String obj1 = PatchProxy.apply(objArray, obj, f.class, "5");
             if (obj1 != PatchProxyResult.class) {
                uoe = obj1;
                i3 = 0;
                i4 = 5;
             label_005b :
                Object obj2 = uoe;
                LiveSubscribeStatInfo liveSubscrib1 = mLiveSubscri;
                if (!PatchProxy.applyVoidFourRefs(b, c, mLiveSubscri, uoe, null, j.class, "21")) {
                   LiveHalfSubscribeDialogFragment liveHalfSubs = PatchProxy.applyThreeRefs(c, liveSubscrib1, obj2, null, LiveHalfSubscribeDialogFragment.class, "1");
                   if (liveHalfSubs != PatchProxyResult.class) {
                   }else {
                      liveHalfSubs = new LiveHalfSubscribeDialogFragment();
                      liveHalfSubs.N = obj2;
                      LiveSubscribeStatInfo liveSubscrib3 = liveSubscrib1;
                      liveHalfSubs.O = liveSubscrib3;
                      liveHalfSubs.P = c;
                      liveHalfSubs.ph(new a(liveSubscrib3));
                   }
                   LiveSubscribeDialogContainerFragment liveSubscrib2 = new LiveSubscribeDialogContainerFragment();
                   liveSubscrib2.Ah(i3);
                   liveSubscrib2.Bh(-1, a1.e(0x43fa0000));
                   liveSubscrib2.B = true;
                   liveSubscrib2.A = true;
                   liveSubscrib2.Dh(new b0(liveSubscrib2, liveHalfSubs));
                   liveSubscrib2.Cb(b.getSupportFragmentManager(), "LiveHalfSubscribeDialogFragment");
                }
                if (PatchProxy.isSupport(f.class)) {
                   objArray = new Object[]{b,c,d,e,f,liveSubscrib};
                   obj3 = PatchProxy.apply(objArray, null, f.class, "6");
                   if (obj3 != PatchProxyResult.class) {
                      ot = obj3;
                   }
                }
                obj1 = "1";
                if (!f.f(liveSubscrib)) {
                   obj3 = f.get("immediatelyReservation");
                   if (TextUtils.x(obj3) || !obj3.equals(obj1)) {
                      ot = t.empty();
                   }
                }else {
                   obj3 = f.get("immediatelyCancel");
                   if (TextUtils.x(obj3) || !obj3.equals(obj1)) {
                      ot = t.empty();
                   }
                }
                ot = f.a(b, c, d, e, false, false, liveSubscrib);
             }
          }
          i4 = 5;
          i3 = 0;
          e uoe1 = new e(liveSubscrib, b, c, d, e);
          uoe = v19;
          goto label_005b ;
       }
       return ot;
    }
}
