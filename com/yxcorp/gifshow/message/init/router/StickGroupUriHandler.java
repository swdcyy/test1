package com.yxcorp.gifshow.message.init.router.StickGroupUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.yxcorp.gifshow.message.init.router.StickGroupUriHandler$a;
import nsd.u;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.net.Uri;
import xh7.a;
import ekd.x0;
import android.net.Uri$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import qh7.b;
import qh7.a;
import yh7.a;

public final class StickGroupUriHandler extends AnnotationUriHandler	// class@001d68
{
    public static final StickGroupUriHandler$a b;

    static {
       StickGroupUriHandler.b = new StickGroupUriHandler$a(null);
    }
    public void StickGroupUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickGroupUriHandler.class, "1")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "callback");
       String str = "userId";
       String str1 = x0.a(p0.g(), str);
       Uri$Builder uBuilder = new Uri$Builder();
       String str2 = x0.a(p0.g(), "source");
       if (TextUtils.x(str2)) {
          str2 = "unknow";
       }
       Uri$Builder uBuilder1 = uBuilder.scheme("kwai").authority("krn").appendQueryParameter("bundleId", "SocialProfileStickGroup");
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String str3 = (a.g(mE.getId(), str1) ^ 0x01)? "StickGroup": "SelectStickGroup";
       uBuilder1 = uBuilder1.appendQueryParameter("componentName", str3);
       uBuilder1.appendQueryParameter(str, str1);
       uBuilder1.appendQueryParameter("source", str2).appendQueryParameter("minBundleVersion", "23");
       a.b(b.j(p0.b(), uBuilder.toString()), null);
       p1.a(new a(200));
       return;
    }
}
