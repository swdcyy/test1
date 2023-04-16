package com.yxcorp.gifshow.map.search.a$c$b;
import com.yxcorp.map.fragment.LocationSuggestionFragment$e;
import com.yxcorp.gifshow.map.search.a$c;
import java.lang.Object;
import com.kuaishou.android.model.mix.Location;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.map.search.a;
import wkd.b;
import com.kwai.feature.component.searchhistory.b;
import java.util.Objects;
import g06.f;
import java.util.ArrayList;
import java.util.Collection;
import g06.h;
import java.util.List;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import java.util.Set;
import com.yxcorp.map.search.SearchEditorLayout;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import com.yxcorp.gifshow.map.PhotoSource;
import b6b.q;
import g6b.c;

public final class a$c$b implements LocationSuggestionFragment$e	// class@001cd4
{
    public final a$c a;

    public void a$c$b(a$c p0){
       this.a = p0;
       super();
    }
    public final void a(Location p0){
       ArrayList uArrayList;
       a y;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c$b.class, "1")) {
          return;
       }
       if (this.a.b.D != null) {
          b uob = b.a(0x4abd6a99);
          a d = this.a.b.D;
          Objects.requireNonNull(d, "null cannot be cast to non-null type com.kwai.feature.component.searchhistory.SearchHistoryAble");
          String str = d.K();
          uArrayList = new ArrayList(this.a.b.y);
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidThreeRefs(str, p0, uArrayList, uob, b.class, "4")) {
             c.k(new h(uob, str, p0, uArrayList));
          }
          y = this.a.b.y;
          if (y != null) {
             y.clear();
          }
       }
       y = this.a.b.r;
       if (y != null) {
          y.e();
       }
       if (p0 != null) {
          y = this.a.b.p;
          if (y != null) {
             MapCenterInfo mapCenterInf = new MapCenterInfo(p0.latitude, p0.longitude, PhotoSource.FROM_SEARCH, q.d.b());
             y.c(uArrayList, "SEARCH");
          }
       }
       return;
    }
}
