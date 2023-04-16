package kgd.b1;
import erd.o;
import com.yxcorp.plugin.setting.entries.holder.d0$a;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import qk.m;
import com.yxcorp.plugin.setting.entries.holder.a0;
import ok.o;
import com.yxcorp.plugin.setting.entries.holder.z;
import ok.h;
import com.yxcorp.plugin.setting.entries.holder.c0;
import java.util.Comparator;
import com.google.common.collect.ImmutableList;

public final class b1 implements o	// class@001779
{
    public final d0$a b;

    public void b1(d0$a p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b1 tb = this.b;
       Objects.requireNonNull(tb);
       ImmutableList immutableLis = PatchProxy.applyOneRefs(p0, tb, d0$a.class, "9");
       if (immutableLis != PatchProxyResult.class) {
       }else {
          immutableLis = m.s(p0).p(a0.b).F(z.b).E(c0.b);
          if (immutableLis != null && immutableLis.size() > 3) {
             immutableLis = immutableLis.subList(0, 3);
          }
       }
       return immutableLis;
    }
}
