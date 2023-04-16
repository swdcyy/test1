package com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import java.lang.Object;
import java.lang.String;
import bi2.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap;
import nsd.r0;
import java.lang.Integer;
import java.util.Arrays;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.richcard.http.ItemInfo;

public final class LiveRichCardUsedVM$2 implements Model$a	// class@000f61
{
    public final LiveRichCardUsedVM b;
    public final BottomBarInfo c;

    public void LiveRichCardUsedVM$2(LiveRichCardUsedVM p0,BottomBarInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardUsedVM$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       int cardUsedCoun;
       ItemInfo[] this;
       BarTitleTextMap uBarTitleTex;
       String grabNoneUsin;
       c uoc1;
       LiveRichCardUsedVM$2 tb1;
       MutableLiveData mutableLiveD1;
       Object[] objArray;
       RichCardInfo richCardInfo;
       UsingCardInfo usingCardInf;
       Integer integer;
       ItemInfo[] itemInfoArra;
       Integer integer1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardUsedVM$2.class, "1")) {
       }else {
          a.p(p0, "source");
          int i = 0;
          if (p2 != null) {
             p1 = p2.b();
             if (p1 != null) {
                p1 = p1.getUsingCardInfo();
                if (p1 != null) {
                   cardUsedCoun = p1.getCardUsedCount();
                label_002e :
                   this = null;
                   if (cardUsedCoun <= 0) {
                      try{
                         LiveRichCardUsedVM$2 tb = this.b;
                         MutableLiveData mutableLiveD = tb.r0(tb.v0());
                         if (p2 != null) {
                            uBarTitleTex = p2.a();
                            if (uBarTitleTex != null) {
                               grabNoneUsin = uBarTitleTex.getGrabNoneUsingCardText();
                               if (grabNoneUsin != null) {
                                  Object[] objArray1 = new Object[1];
                                  RichCardInfo richCardInfo1 = p2.b();
                                  if (richCardInfo1 != null) {
                                     UsingCardInfo usingCardInf1 = richCardInfo1.getUsingCardInfo();
                                     if (usingCardInf1 != null) {
                                        integer1 = Integer.valueOf(usingCardInf1.getCardCanUseTotalCount());
                                     label_0068 :
                                        objArray1[i] = integer1;
                                        grabNoneUsin = String.format(grabNoneUsin, Arrays.copyOf(objArray1, 1));
                                        a.o(grabNoneUsin, "java.lang.String.format\(format, *args\)");
                                     label_0077 :
                                        mutableLiveD.setValue(grabNoneUsin);
                                     }
                                  }
                                  integer1 = this;
                                  goto label_0068 ;
                               }
                            }
                         }
                      label_0076 :
                         ItemInfo[] itemInfoArra1 = this;
                         goto label_0077 ;
                      }catch(java.lang.Exception e0){
                         c uoc = LiveRichCardStateManager.h.f();
                         if (p2 != null) {
                            uBarTitleTex = p2.a();
                            if (uBarTitleTex != null) {
                               grabNoneUsin = uBarTitleTex.getGrabNoneUsingCardText();
                            label_0090 :
                               b.c0(uoc, "[LiveRichCardUsedVM][ awardTitle.mutate\(\).value ]: 下发数据错误格式错误", "grabNoneUsingCardText", grabNoneUsin);
                            }
                         }
                         grabNoneUsin = this;
                         goto label_0090 ;
                      }
                   }
                }
             }
          }
          cardUsedCoun = 0;
          goto label_002e ;
       }
       return;
    }
}
