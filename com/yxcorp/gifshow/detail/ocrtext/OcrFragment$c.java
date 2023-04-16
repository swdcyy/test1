package com.yxcorp.gifshow.detail.ocrtext.OcrFragment$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment$b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import qrd.l1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class OcrFragment$c implements View$OnClickListener	// class@0015fe
{
    public final OcrFragment b;

    public void OcrFragment$c(OcrFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       ClientContent$PhotoPackage photoPackage;
       if (PatchProxy.applyVoidOneRefs(p0, this, OcrFragment$c.class, "1")) {
          return;
       }
       OcrFragment$c tb = this.b;
       String str = "close";
       Objects.requireNonNull(tb);
       StringBuilder str1 = PatchProxy.apply(null, tb, OcrFragment.class, "2");
       if (str1 != PatchProxyResult.class) {
       }else {
          str1 = "";
          ObservableMap observableMa = tb.H.a();
          if (observableMa != null) {
             Iterator iterator = observableMa.entrySet().iterator();
             while (iterator.hasNext()) {
                Object key = iterator.next().getKey();
                a.o(key, "it.key");
                str1 = str1+key.intValue()+",";
             }
          }
          str1 = str1;
          a.o(str1, "sb.toString\(\)");
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(str, str1, tb, OcrFragment.class, "11")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "EXTRACTION_TEXT_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("type", str);
          oi3.d("content_row", str1);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          OcrFragment i = tb.I;
          if (i != null) {
             a.m(i);
             photoPackage = w1.f(i.mEntity);
          }else {
             photoPackage = null;
          }
          uContentPack.photoPackage = photoPackage;
          u1.M("", tb, 3, uElementPack, uContentPack, null);
       }
       OcrFragment.Ih(this.b, false, 1, null);
       return;
    }
}
