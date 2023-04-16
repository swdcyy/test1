package oj.d;
import erd.g;
import com.gifshow.tuna.player.poi.f;
import java.lang.Object;
import oj.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class d implements g	// class@0027d4
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "7")) {
       }else if(!TextUtils.n(p0.a, tb.e())){
          tb.f(p0.b);
       }
       return;
    }
}
