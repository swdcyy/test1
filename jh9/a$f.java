package jh9.a$f;
import erd.g;
import jh9.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import hb0.a;
import java.lang.StringBuilder;
import q87.c;
import e17.i;
import android.net.Uri;
import xkd.b;
import ekd.x0;
import java.lang.Boolean;
import java.lang.Integer;
import zsd.t;
import w46.b;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import h26.a;

public final class a$f implements g	// class@002ad1
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str1;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          a$f tb = this.b;
          a.o(p0, "scheme");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "18")) {
             Object[] objArray = new Object[0];
             a.D().w("PostToolBox", "navigateToTemplate...scheme:"+p0, objArray);
             String str = 1;
             Uri uri = (!p0.length())? 1: null;
             if (uri) {
                i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
             }else {
                uri = b.g(p0);
                if (uri != null) {
                   if (Boolean.parseBoolean(x0.a(uri, "allowJumpFlashTemplate"))) {
                      str1 = x0.a(uri, "flashTemplateId");
                      str2 = x0.a(uri, "flashGroupId");
                      a.o(str1, "initTemplateId");
                      Integer integer = t.X0(str1);
                      a.o(str2, "groupId");
                      Integer integer1 = t.X0(str2);
                      if (integer != null && (integer.intValue() > 0 && (integer1 == null || integer1.intValue() <= 0))) {
                         i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
                         Object[] objArray1 = new Object[0];
                         a.D().t("PostToolBox", "navigate template error, scheme is "+p0, objArray1);
                      }
                   }else {
                      str2 = null;
                      str1 = str2;
                   }
                   p0 = tb.u;
                   if (p0 == null) {
                      a.S("kuaishanPageParam");
                   }
                   p0.mInitTemplateId = str1;
                   p0 = tb.u;
                   if (p0 == null) {
                      a.S("kuaishanPageParam");
                   }
                   p0.mGroupId = str2;
                }
                p0 = tb.u;
                if (p0 == null) {
                   a.S("kuaishanPageParam");
                }
                p0.mDisallowTemplateLocating = str;
                p0 = tb.u;
                if (p0 == null) {
                   a.S("kuaishanPageParam");
                }
                p0.mTemplateSrc = null;
                p0 = tb.v;
                if (p0 != null) {
                   a u = tb.u;
                   if (u == null) {
                      a.S("kuaishanPageParam");
                   }
                   p0.Zb(u);
                }
                p0 = tb.u;
                if (p0 == null) {
                   a.S("kuaishanPageParam");
                }
                p0.mInitTemplateId = null;
                p0 = tb.u;
                if (p0 == null) {
                   a.S("kuaishanPageParam");
                }
                p0.mGroupId = null;
             }
          }
       }
       return;
    }
}
