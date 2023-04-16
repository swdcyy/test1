package com.yxcorp.gifshow.share.platform.QQForward$Companion;
import com.yxcorp.gifshow.share.platform.QQForward$Companion$a;
import com.yxcorp.gifshow.share.platform.QQForward$Companion$b;
import com.yxcorp.gifshow.share.platform.QQForward$Companion$mTencent$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import mhc.x;
import com.tencent.tauth.Tencent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class QQForward$Companion	// class@001c0d
{
    public static final x a;
    public static final x b;
    public static final p c;
    public static final QQForward$Companion d;

    static {
       QQForward$Companion uCompanion = new QQForward$Companion();
       QQForward$Companion.d = uCompanion;
       QQForward$Companion.a = new QQForward$Companion$a(uCompanion);
       QQForward$Companion.b = new QQForward$Companion$b(uCompanion);
       QQForward$Companion.c = s.c(new QQForward$Companion$mTencent$2(uCompanion));
    }
    public void QQForward$Companion(){
       super();
    }
    public final x a(boolean p0){
       x a = (p0)? QQForward$Companion.a: QQForward$Companion.b;
       return a;
    }
    public final Tencent b(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QQForward$Companion.c.getValue();
    }
    public final x c(){
       return QQForward$Companion.a;
    }
    public final x d(){
       return QQForward$Companion.b;
    }
}
