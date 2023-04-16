package com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler;
import o63.a;
import bi2.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.ItemInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler$RichCardSumInfo;
import p63.a;
import p63.a$a;
import p63.a$b;
import fg6.a;
import com.google.gson.Gson;
import oa1.a;
import nsd.u;
import oa1.b;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import msd.l;
import o63.d;

public final class KrnDialogHandler	// class@000f7a
{
    public final a a;
    public final e b;

    public void KrnDialogHandler(a p0,e p1){
       a.p(p0, "jsBridgeService");
       a.p(p1, "richCardModel");
       super();
       this.a = p0;
       this.b = p1;
    }
    public static void b(KrnDialogHandler p0,String p1,Integer p2,String p3,boolean p4,int p5,Object p6){
       if (p5 & 0x08) {
          p4 = false;
       }
       p0.a(p1, p2, p3, p4);
       return;
    }
    public final void a(String p0,Integer p1,String p2,boolean p3){
       UsingCardInfo usingCardInf;
       String str;
       int this;
       Object[] objArray;
       int i2;
       KrnDialogHandler krnDialogHan = this;
       if (PatchProxy.isSupport(KrnDialogHandler.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, KrnDialogHandler.class, "2")) {
          return;
       }
       b.e0(LiveRichCardStateManager.h.f(), "[openConfirmDialog]", "activityBiz", p0, "redPacketType", p1, "redPacketId", p2);
       g og = krnDialogHan.b.a();
       int i = 0;
       if (og != null) {
          RichCardInfo richCardInfo = og.b();
          if (richCardInfo != null) {
             usingCardInf = richCardInfo.getUsingCardInfo();
          label_004f :
             if (p3) {
                str = "0";
             }else if(usingCardInf){
                str = String.valueOf(usingCardInf.getCardCanUseRemainCount());
             }else {
                i2 = i;
             }
             if (usingCardInf) {
                ItemInfo[] itemInfoList = usingCardInf.getItemInfoList();
                if (itemInfoList != null) {
                   ArrayList uArrayList = new ArrayList();
                   this = itemInfoList.length;
                   int i1 = 0;
                   while (i1 < this) {
                      object oobject = itemInfoList[i1];
                      long l = (oobject.getItemCount() - null > 0)? 1: 0;
                      if (l) {
                         uArrayList.add(oobject);
                      }
                      i1 = i1 + 1;
                   }
                   itemInfoList = new ItemInfo[0];
                   objArray = uArrayList.toArray(itemInfoList);
                   Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                label_0098 :
                   a$a uoa = a.b.a().a("richCardSumInfo", a.a.q(new KrnDialogHandler$RichCardSumInfo(str, objArray))).a("activityBiz", p0);
                   g og1 = krnDialogHan.b.a();
                   if (og1 != null) {
                      RichCardInfo richCardInfo1 = og1.b();
                      if (richCardInfo1 != null) {
                         UsingCardInfo usingCardInf1 = richCardInfo1.getUsingCardInfo();
                         if (usingCardInf1 != null) {
                            str = String.valueOf(usingCardInf1.getCardId());
                         label_00d7 :
                            uoa = uoa.a("cardId", str);
                            if (p1 != null) {
                               i = String.valueOf(p1.intValue());
                            }
                            b.d(b.a, krnDialogHan.a, LiveKrnPageKey.LiveRichCardConfirmDialog, uoa.a("boxType", i).a("boxId", p2).b(), new a(0, 0, 0x3f800000, 0x3f800000, 0, 0, null, true, 0, 355, null), null, 16, null);
                            return;
                         }
                      }
                   }
                   i2 = i;
                   goto label_00d7 ;
                }
             }
             objArray = i;
             goto label_0098 ;
          }
       }
       usingCardInf = i;
       goto label_004f ;
    }
}
