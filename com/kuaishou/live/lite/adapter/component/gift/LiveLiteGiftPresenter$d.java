package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$d;
import ug1.u0;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import java.lang.Object;
import java.lang.String;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;

public final class LiveLiteGiftPresenter$d implements u0	// class@001daf
{
    public final LiveLiteGiftPresenter a;

    public void LiveLiteGiftPresenter$d(LiveLiteGiftPresenter p0){
       this.a = p0;
       super();
    }
    public void E4(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftPresenter$d.class, "2")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "task");
       LiveLiteGiftPresenter$d ta = this.a;
       int i = (ta.V != null)? 1: 0;
       if (!i) {
          return;
       }else {
          LiveLiteGiftPresenter.d9(ta).E4(p0, p1);
          return;
       }
    }
    public void W1(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "task");
       LiveLiteGiftPresenter$d ta = this.a;
       int i = (ta.V != null)? 1: 0;
       if (!i) {
          return;
       }else {
          LiveLiteGiftPresenter.d9(ta).W1(p0, p1);
          return;
       }
    }
}
