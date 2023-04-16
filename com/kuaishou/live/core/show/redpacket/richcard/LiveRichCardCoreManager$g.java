package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$g;
import erd.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import uw1.f;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import p63.a;
import p63.a$a;
import p63.a$b;
import oa1.a;
import nsd.u;
import oa1.b;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import o63.a;
import msd.l;
import o63.d;
import uw1.m;
import ei2.b;

public final class LiveRichCardCoreManager$g implements g	// class@000f47
{
    public final LiveRichCardCoreManager b;
    public final String c;

    public void LiveRichCardCoreManager$g(LiveRichCardCoreManager p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       LiveRichCardCoreManager$g b;
       UsingCardInfo usingCardInf;
       Object obj = this;
       KwaiException obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveRichCardCoreManager$g.class, "1")) {
       }else {
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          b.y(h.f().appendTag(obj.b.m()), "[jumpToRecoRoom] Ìø×ªÊ§°Ü", obj1);
          if (obj1 instanceof KwaiException) {
             LiveRichCardCoreManager obj2 = obj1;
             if (obj2.getErrorCode() == 13) {
                b.y(h.f().appendTag(obj.b.m()), "[jumpToRecoRoom] ½Ó¿Ú´íÎó", obj1);
                obj1 = obj2.mErrorMessage;
                if (obj1 != null) {
                   i.d(R.style.arg_RES_7f11066a, obj1);
                }
             }else {
             label_0056 :
                b.y(h.f().appendTag(obj.b.m()), "[jumpToRecoRoom] ÇÀ¹âÀ²", obj1);
                b = obj.b;
                obj2 = b.q;
                LiveRichCardCoreManager$g c = obj.c;
                f uof = b.h();
                Integer integer = (uof != null)? Integer.valueOf(uof.g()): null;
                Integer integer1 = Integer.valueOf(1);
                Objects.requireNonNull(obj2);
                if (!PatchProxy.applyVoidThreeRefs(c, integer, integer1, obj2, KrnDialogHandler.class, "3")) {
                   b.e0(h.f(), "[openSpecialDialog]", "activityBiz", c, "redPacketType", integer, "status", integer1);
                   g og = obj2.b.a();
                   if (og != null) {
                      RichCardInfo richCardInfo = og.b();
                      if (richCardInfo != null) {
                         usingCardInf = richCardInfo.getUsingCardInfo();
                      label_00bf :
                         a$a uoa = a.b.a().a("activityBiz", c);
                         String str = (integer != null)? String.valueOf(integer.intValue()): null;
                         a$a uoa1 = uoa.a("boxType", str);
                         String str1 = (integer1 != null)? String.valueOf(integer1.intValue()): null;
                         uoa1 = uoa1.a("status", str1);
                         String str2 = (usingCardInf != null)? String.valueOf(usingCardInf.getCardCanUseRemainCount()): null;
                         b.d(b.a, obj2.a, LiveKrnPageKey.LiveRichCardSpecialDialog, uoa1.a("remainCount", str2).b(), new a(0, 0, 0x3f800000, 0x3f800000, 0, 0, null, true, 0, 355, null), null, 16, null);
                      }
                   }
                   usingCardInf = null;
                   goto label_00bf ;
                }
             }
          }else {
             goto label_0056 ;
          }
          b = obj.b;
          b.v = false;
          b.l().D0();
          obj.b.j.a();
          obj.b.w(null);
       }
       return;
    }
}
