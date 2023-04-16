package by9.g$a;
import qp7.y0;
import by9.g;
import ar7.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b;
import java.util.Objects;
import uw9.c;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import lnc.a1;
import java.lang.CharSequence;
import by9.f;
import kzc.d;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import u07.t$a;
import u07.f;
import com.kwai.library.widget.popup.common.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import qp7.x0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo;
import pp7.b;
import by9.g$a$a;

public final class g$a extends y0	// class@000517
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void h(){
       SharedPreferences a;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g$a.class, "1")) {
          return;
       }
       if (this.a.o0()) {
          this.a.b0();
       }else {
          g$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, g.class, "3")) {
             a = c.a;
             if (!a.getBoolean("hasShownCoCreateGuidence", false)) {
                SpannableStringBuilder spannableStr = new SpannableStringBuilder(a1.p(0x7f100666));
                String str = a1.p(R.string.arg_RES_7f10066f);
                spannableStr.append(str);
                spannableStr.setSpan(new f(ta), (spannableStr.length() - str.length()), spannableStr.length(), 17);
                ActivityContext uActivityCon = ActivityContext.g();
                a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                d uod = f.e(new d(uActivityCon.e()));
                uod.V0(true);
                uod.x0(17);
                uod.X0(a1.p(R.string.arg_RES_7f100672));
                uod.z0(spannableStr);
                uod.T0(a1.p(R.string.arg_RES_7f10067a));
                uod.X();
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putBoolean("hasShownCoCreateGuidence", true);
                g.a(uEditor);
             }
          }
          l ol1 = this.a.E();
          CoCreateInvitationInfo coCreateInvi = g.n0(this.a).getCoCreateInvitationInfo();
          a.m(coCreateInvi);
          a.o(coCreateInvi, "mPhoto.coCreateInvitationInfo!!");
          Objects.requireNonNull(ol1);
          if (!PatchProxy.applyVoidOneRefs(coCreateInvi, ol1, ol, "3")) {
             a.p(coCreateInvi, "info");
             ol1.e.f(coCreateInvi);
          }
          ol1 = this.a.E();
          g$a$a uoa$a = new g$a$a(this);
          Objects.requireNonNull(ol1);
          if (!PatchProxy.applyVoidOneRefs(uoa$a, ol1, ol, "7")) {
             a.p(uoa$a, "animEndAction");
             ol1.g.f(uoa$a);
          }
          Objects.requireNonNull(this.a);
       }
       return;
    }
}
