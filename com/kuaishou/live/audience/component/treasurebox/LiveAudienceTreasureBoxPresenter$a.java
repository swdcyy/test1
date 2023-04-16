package com.kuaishou.live.audience.component.treasurebox.LiveAudienceTreasureBoxPresenter$a;
import xq5.c;
import com.kuaishou.live.audience.component.treasurebox.LiveAudienceTreasureBoxPresenter;
import java.lang.Object;
import xq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j02.m;
import kotlin.jvm.internal.a;
import java.util.Objects;
import j02.k;
import j02.o;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class LiveAudienceTreasureBoxPresenter$a implements c	// class@000beb
{
    public final LiveAudienceTreasureBoxPresenter b;

    public void LiveAudienceTreasureBoxPresenter$a(LiveAudienceTreasureBoxPresenter p0){
       this.b = p0;
       super();
    }
    public void P(){
       b.a(this);
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceTreasureBoxPresenter$a.class, "1")) {
          return;
       }
       b.b(this);
       LiveAudienceTreasureBoxPresenter d = this.b.D;
       if (d != null && !PatchProxy.applyVoid(objArray, d, m.class, "2")) {
          m k = d.k;
          if (k == null) {
             a.S("treasureBoxDataBinding");
          }
          m j = d.j;
          if (j == null) {
             a.S("treasureBoxViewModel");
          }
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoidOneRefs(j, k, k.class, "6")) {
             a.p(j, "treasureViewModel");
             if (k.a != null && k.b != null) {
                k.c(j);
             }
          }
       }
    label_0051 :
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
