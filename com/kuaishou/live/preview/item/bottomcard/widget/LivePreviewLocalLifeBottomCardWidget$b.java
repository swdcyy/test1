package com.kuaishou.live.preview.item.bottomcard.widget.LivePreviewLocalLifeBottomCardWidget$b;
import erd.g;
import com.kuaishou.live.preview.item.bottomcard.widget.LivePreviewLocalLifeBottomCardWidget;
import java.lang.Object;
import b87.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import java.util.Map;
import nk3.v;
import java.util.Set;
import java.util.Iterator;
import lnc.i3;
import java.util.Map$Entry;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardExtraParam;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class LivePreviewLocalLifeBottomCardWidget$b implements g	// class@000da7
{
    public final LivePreviewLocalLifeBottomCardWidget b;

    public void LivePreviewLocalLifeBottomCardWidget$b(LivePreviewLocalLifeBottomCardWidget p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Map$Entry uEntry;
       String key;
       LivePreviewLocalLifeBottomCardWidget livePreviewL = LivePreviewLocalLifeBottomCardWidget.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewLocalLifeBottomCardWidget$b.class, "1")) {
       }else {
          LivePreviewLocalLifeBottomCardWidget$b tb = this.b;
          a.o(p0, "param");
          Objects.requireNonNull(tb);
          ClientEvent$ElementPackage uElementPack = PatchProxy.applyOneRefs(p0, tb, livePreviewL, "9");
          if (uElementPack != PatchProxyResult.class) {
          }else {
             Map map = v.c(tb.g);
             a.o(map, "LivePreviewBottomCardMod¡­vePreviewBottomCardModel\)");
             a mLogInfo = p0.mLogInfo;
             if (mLogInfo != null) {
                Iterator iterator = mLogInfo.keySet().iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   if (p0.mLogInfo.get(str) != null) {
                      map.put(str, String.valueOf(p0.mLogInfo.get(str)));
                   }
                }
             }
             i3 oi3 = i3.f();
             Iterator iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry = iterator1.next();
                key = uEntry.getKey();
                oi3.d(key, uEntry.getValue());
             }
             i3 oi31 = i3.f();
             LivePreviewBottomCardModel mBottomCardE = tb.g.mBottomCardExtraParam;
             if (mBottomCardE != null) {
                LivePreviewBottomCardExtraParam mEventTrackD = mBottomCardE.mEventTrackData;
                if (mEventTrackD != null) {
                   Iterator iterator2 = mEventTrackD.entrySet().iterator();
                   while (iterator2.hasNext()) {
                      uEntry = iterator2.next();
                      key = uEntry.getKey();
                      oi31.d(key, uEntry.getValue());
                   }
                }
             }
             oi3.d("extra_info", oi31.e());
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = p0.mAction;
             uElementPack.params = oi3.e();
          }
          if (a.g("click", p0.mType)) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(uElementPack, p0, livePreviewL, "8")) {
                p0 = new ClickMetaData();
                p0.setType(1);
                p0.setElementPackage(uElementPack);
                u1.B(p0);
             }
          }else if(a.g("show", p0.mType)){
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(uElementPack, p0, livePreviewL, "7")) {
                p0 = new ShowMetaData();
                p0.setType(5);
                p0.setElementPackage(uElementPack);
                u1.B0(p0);
             }
          }
       }
    label_0122 :
       return;
    }
}
