package com.yxcorp.gifshow.share.widget.ForwardGridFragment$b;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.c;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import java.lang.Integer;

public final class ForwardGridFragment$b extends FragmentPagerAdapter	// class@001cba
{
    public final List h;

    public void ForwardGridFragment$b(c p0,List p1){
       a.p(p0, "fm");
       a.p(p1, "fragments");
       super(p0);
       this.h = p1;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, ForwardGridFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.h.size();
    }
    public Fragment z(int p0){
       ForwardGridFragment$b uob = ForwardGridFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.h.get(p0);
    }
}
