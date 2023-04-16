package com.kuaishou.live.preview.item.presenter.ad.d$a;
import fl3.a;
import com.kuaishou.live.preview.item.presenter.ad.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import sx.d;
import el3.d;
import el3.g;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.Pair;
import erd.g;
import rx.d;

public class d$a implements a	// class@000e0c
{
    public boolean a;
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public void a(boolean p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.a != null) {
          this.a = false;
          return;
       }else {
          uoa = this.b;
          Objects.requireNonNull(uoa);
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoa, uod, "3") && uoa.p.isAd())) {
             d.P8().z0(283, uoa.p.mEntity, "", null, new g(p0));
          }
          return;
       }
    }
    public void b(boolean p0){
       this.a = p0;
    }
}
