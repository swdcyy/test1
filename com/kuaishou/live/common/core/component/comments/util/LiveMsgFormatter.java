package com.kuaishou.live.common.core.component.comments.util.LiveMsgFormatter;
import com.kuaishou.live.common.core.component.comments.util.LiveMsgFormatter$enableLtr$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import y1.e;
import y1.d;
import java.util.Locale;
import y1.a;

public final class LiveMsgFormatter	// class@0010d2
{
    public static final p a;
    public static final LiveMsgFormatter b;

    static {
       LiveMsgFormatter.b = new LiveMsgFormatter();
       LiveMsgFormatter.a = s.c(LiveMsgFormatter$enableLtr$2.INSTANCE);
    }
    public void LiveMsgFormatter(){
       super();
    }
    public static final CharSequence a(CharSequence p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMsgFormatter liveMsgForma = LiveMsgFormatter.class;
       CharSequence uCharSequenc = null;
       LiveMsgFormatter obj = PatchProxy.applyOneRefs(p0, uCharSequenc, liveMsgForma, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null) {
          obj = LiveMsgFormatter.b;
          Objects.requireNonNull(obj);
          Boolean uBoolean = PatchProxy.apply(uCharSequenc, obj, liveMsgForma, "1");
          if (uBoolean == patchProxyRe) {
             uBoolean = LiveMsgFormatter.a.getValue();
          }
          if (uBoolean.booleanValue() && e.e.a(p0, 0, p0.length())) {
             p0 = a.d(Locale.getDefault()).j(p0, e.f);
          }
          uCharSequenc = p0;
       }
       return uCharSequenc;
    }
}
