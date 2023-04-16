package com.kuaishou.live.core.show.test.w0;
import lnc.c3$a;
import java.lang.Object;
import il2.k;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.test.LiveResourceFileSearchViewController$onBind$1;
import android.view.View$OnClickListener;
import android.widget.Button;
import il2.l;

public final class w0 implements c3$a	// class@0011c8
{
    public static final w0 a;

    static {
       w0.a = new w0();
    }
    public void w0(){
       super();
    }
    public final void apply(Object p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, k.class, "1")) {
       }else {
          p0.a.setOnClickListener(new LiveResourceFileSearchViewController$onBind$1(p0));
          p0.b.setOnClickListener(new l(p0));
       }
       return;
    }
}
