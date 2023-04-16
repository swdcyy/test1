package com.kuaishou.live.common.core.component.bottombubble.notices.gzone.g$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import bld.b;
import va1.b0;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.widget.RelativeLayout;

public abstract class g$a implements a$a	// class@000fc9
{

    public void g$a(){
       super();
    }
    public void a(LiveGenericCommentNoticeView p0){
       g$a uoa = g$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       Drawable uDrawable = PatchProxy.apply(null, this, uoa, "2");
       if (uDrawable != PatchProxyResult.class) {
       }else {
          b uob = new b();
          int i = (b0.a())? 0x7f06141a: 0x7f06141b;
          uob.v(a1.a(i));
          uob.g(KwaiRadiusStyles.R8);
          uDrawable = uob.a();
       }
       p0.setBackground(uDrawable);
       return;
    }
}
