package ay9.w;
import erd.g;
import ay9.a0;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import ay9.q;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import tyc.s4;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import java.util.List;
import qp7.x0;
import com.kwai.slide.play.detail.information.caption.l;
import tkd.b;
import tkd.d;
import nl9.u;
import android.text.Spanned;
import java.util.ArrayList;
import koc.c;
import b89.a$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import dkc.b;
import com.kwai.component.photo.detail.core.tag.TagPackageListHelper;
import java.util.Iterator;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import k9a.c;
import e8a.d;

public final class w implements g	// class@00030e
{
    public final a0 b;

    public void w(a0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       SpannableStringBuilder spannableStr;
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a0.class, "9")) {
       }else if(tb.H().i() && (!TextUtils.x(tb.v.getCaptionTitle()) && (!TextUtils.x((tb.v.getCaptionTitle()).trim()) && tb.v.isImageType()))){
          spannableStr = new SpannableStringBuilder();
          if (PatchProxy.applyOneRefs(spannableStr, tb, a0.class, "12") != PatchProxyResult.class) {
          }else {
             spannableStr.replace(0, 0, ((((tb.v.getCaptionTitle()).replace("\n", " ")).replace("\r", " ")).replace("  ", " ")).trim()+" ");
          }
          spannableStr.append(p0);
       }else {
          spannableStr = p0;
       }
       if (tb.L.g() != null) {
          tb.L.g().f();
       }
       tb.w0(tb.L.b());
       tb.E().o(spannableStr, (tb.v.hasCaptionUrls() ^ 0x01), tb.H().e(), d.a(-1694791652).vq(tb.v));
       p0 = c.d(p0);
       tb.y = c.c(p0, tb.v.getTags());
       a$c uoc = tb.L.f();
       tb.C = uoc;
       if (uoc != null) {
          tb.x.a(b.d(uoc.b()));
       }
       p0 = p0.iterator();
       while (p0.hasNext()) {
          String str = p0.next();
          ActivityInfo uActivityInf = PatchProxy.applyOneRefs(str, tb, a0.class, "11");
          if (uActivityInf != PatchProxyResult.class) {
          }else {
             a0 l = tb.L;
             if (l != null) {
                c uoc1 = l.n();
                if (uoc1 != null) {
                   uActivityInf = uoc1.a(str);
                }
             }
             uActivityInf = null;
          }
          q x = tb.x;
          ClientContent$TagPackage tagPackage = (uActivityInf != null)? b.k(uActivityInf, tb.v): b.m(str, tb.v);
          x.a(tagPackage);
       }
       return;
    }
}
