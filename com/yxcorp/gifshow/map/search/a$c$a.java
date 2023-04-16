package com.yxcorp.gifshow.map.search.a$c$a;
import com.yxcorp.map.fragment.LocationSuggestionFragment$f;
import com.yxcorp.gifshow.map.search.a$c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.map.search.a;
import wkd.b;
import com.kwai.feature.component.searchhistory.b;
import java.util.Objects;
import g06.f;

public final class a$c$a implements LocationSuggestionFragment$f	// class@001cd3
{
    public final a$c a;

    public void a$c$a(a$c p0){
       this.a = p0;
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c$a.class, "1")) {
          return;
       }
       if (this.a.b.r != null) {
          a d = this.a.b.D;
          Objects.requireNonNull(d, "null cannot be cast to non-null type com.kwai.feature.component.searchhistory.SearchHistoryAble");
          b.a(0x4abd6a99).d(d.K(), p0);
       }
       return;
    }
}
