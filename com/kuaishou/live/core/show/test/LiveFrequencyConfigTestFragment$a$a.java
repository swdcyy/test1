package com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$a$a;
import android.widget.Filter;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$a;
import java.lang.CharSequence;
import android.widget.Filter$FilterResults;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import qk.m;
import il2.h;
import ok.o;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Collections;

public final class LiveFrequencyConfigTestFragment$a$a extends Filter	// class@00118a
{
    public final LiveFrequencyConfigTestFragment$a a;

    public void LiveFrequencyConfigTestFragment$a$a(LiveFrequencyConfigTestFragment$a p0){
       this.a = p0;
       super();
    }
    public Filter$FilterResults performFiltering(CharSequence p0){
       Filter$FilterResults obj = PatchProxy.applyOneRefs(p0, this, LiveFrequencyConfigTestFragment$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Filter$FilterResults();
       ImmutableList immutableLis = m.s(this.a.b).p(new h(p0)).B();
       obj.values = immutableLis;
       obj.count = immutableLis.size();
       return obj;
    }
    public void publishResults(CharSequence p0,Filter$FilterResults p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFrequencyConfigTestFragment$a$a.class, "2")) {
          return;
       }
       LiveFrequencyConfigTestFragment$a$a ta = this.a;
       p1 = p1.values;
       if (p1 != null) {
       }else {
          List list = Collections.emptyList();
       }
       ta.a(p1);
       return;
    }
}
