package cz0.l;
import cz0.b;
import java.lang.Object;
import bz0.e;
import xp5.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ht5.b;
import com.yxcorp.gifshow.models.Gift;
import t02.a0;
import p91.m;
import z12.e;
import fq5.b;
import lp3.e;
import rp5.a;
import lp3.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import ug1.w0;
import java.lang.Integer;
import java.lang.Long;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ik1.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q2b.h$b;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import k2b.e0;
import k2b.u1;
import cz0.a;

public class l implements b	// class@001ece
{

    public void l(){
       super();
    }
    public boolean a(e p0){
       int i;
       ClientContent$ContentPackage uContentPack;
       ClientContent$GiftPackage giftPackage;
       int i7;
       boolean b;
       ClientEvent$ElementPackage uElementPack;
       h$b uob;
       CommonParams uCommonParam;
       ClientEvent$ResultPackage resultPackag;
       e obj = p0;
       i oi = i.class;
       e obj1 = PatchProxy.applyOneRefs(obj, this, l.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       obj1 = obj.b;
       obj = obj.a;
       b a = obj.a;
       i = 2;
       String[] stringArray = new String[i];
       int i1 = 0;
       stringArray[i1] = String.valueOf(a.mId);
       int i2 = 1;
       stringArray[i2] = obj1.Z2.getLiveStreamId();
       e.c("LiveSendGiftHttpUtil", "sendPacketGift", stringArray);
       BaseFragment uBaseFragmen = obj1.b().t5().a(a.class).t();
       ClientContent$LiveStreamPackage liveStreamPa = obj1.b().t5().a(oi).a();
       FeedLogCtx uFeedLogCtx = obj1.b().t5().a(oi).c0();
       b i3 = obj.i;
       String str = obj1.Z2.d();
       b c = obj.c;
       w0 ow0 = w0.class;
       int i4 = 8;
       int i5 = 7;
       int i6 = 10;
       if (PatchProxy.isSupport(ow0)) {
          Object[] objArray = new Object[i6];
          objArray[i1] = uBaseFragmen;
          objArray[i2] = liveStreamPa;
          objArray[i] = uFeedLogCtx;
          objArray[3] = i3;
          objArray[4] = a;
          objArray[5] = Integer.valueOf(i2);
          objArray[6] = Long.valueOf(0);
          objArray[i5] = null;
          objArray[i4] = str;
          objArray[9] = Integer.valueOf(c);
          if (!PatchProxy.applyVoid(objArray, null, ow0, "2")) {
          label_00c9 :
             if (TextUtils.n(i3, "guide_gift")) {
                JsonElement a1 = w0.a;
                if (PatchProxy.isSupport(a0.class)) {
                   Object[] objArray1 = new Object[11];
                   objArray1[i1] = uBaseFragmen;
                   objArray1[i2] = liveStreamPa;
                   objArray1[i] = a;
                   objArray1[3] = Integer.valueOf(6);
                   objArray1[4] = Integer.valueOf(i2);
                   objArray1[5] = Long.valueOf(0);
                   objArray1[6] = null;
                   objArray1[i5] = str;
                   objArray1[i4] = Integer.valueOf(c);
                   objArray1[9] = a1;
                   objArray1[10] = uFeedLogCtx;
                   if (!PatchProxy.applyVoid(objArray1, null, a0.class, "43")) {
                   }
                }else {
                }
             }
          }
       }else {
          goto label_00c9 ;
       }
       return false;
    }
    public b b(int p0){
       return a.b(this, p0);
    }
    public void c(e p0,String p1,String p2,int p3){
       a.a(this, p0, p1, p2, p3);
    }
}
