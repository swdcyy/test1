package gqb.k$a;
import android.view.View$OnClickListener;
import gqb.k;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger$MusicRadioBtnType;
import java.util.Objects;
import wpb.e;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import gqb.l;
import lnc.a1;
import kqb.a0;
import nsd.r0;
import wpb.q;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ba.a;
import ea.e;
import wpb.f;
import ea.a;
import ca.a;
import ga.o;
import android.app.Dialog;
import ga.l;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public final class k$a implements View$OnClickListener	// class@002b7c
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str2;
       q a;
       String str3;
       e a1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, str)) {
          return;
       }
       MusicRadioLogger.f(MusicRadioLogger.a(k.R8(this.b).getCurrentPhoto()), MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_CLOCK.getType(), 0, 4, null);
       k$a tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(null, tb, k.class, "5")) {
          if (tb.t == null) {
             Context context = tb.getContext();
             a.m(context);
             a.o(context, "context!!");
             e uoe1 = new e(context);
             tb.t = uoe1;
             l ol = new l(tb);
             if (!PatchProxy.applyVoidOneRefs(ol, uoe1, uoe, "2")) {
                a.p(ol, "consumer");
                uoe1.e = ol;
             }
          }
          k t = tb.t;
          if (t != null && !PatchProxy.applyVoid(null, t, uoe, "3")) {
             if (t.a == null) {
                String str1 = a0.a(a1.p(R.string.arg_RES_7f103742));
                String[] stringArray = new String[]{str2,str3,str3,str3,str3,str3,str1};
                str2 = a1.p(R.string.arg_RES_7f103743);
                a.o(str2, "CommonUtil.string\(R.stri¡­ic_radio_closure_notopen\)");
                a.o(str1, "str");
                Object[] objArray = new Object[]{String.valueOf(a.a(1))};
                a = q.a;
                str3 = String.format(str1, Arrays.copyOf(objArray, 1));
                a.o(str3, "java.lang.String.format\(format, *args\)");
                objArray = new Object[]{String.valueOf(a.a(2))};
                str3 = String.format(str1, Arrays.copyOf(objArray, 1));
                a.o(str3, "java.lang.String.format\(format, *args\)");
                objArray = new Object[]{String.valueOf(a.a(3))};
                str3 = String.format(str1, Arrays.copyOf(objArray, 1));
                a.o(str3, "java.lang.String.format\(format, *args\)");
                objArray = new Object[]{String.valueOf(a.a(4))};
                str3 = String.format(str1, Arrays.copyOf(objArray, 1));
                a.o(str3, "java.lang.String.format\(format, *args\)");
                objArray = new Object[]{String.valueOf(a.a(5))};
                str3 = String.format(str1, Arrays.copyOf(objArray, 1));
                a.o(str3, "java.lang.String.format\(format, *args\)");
                objArray = new Object[]{String.valueOf(a.a(6))};
                str1 = String.format(str1, Arrays.copyOf(objArray, 1));
                a.o(str1, "java.lang.String.format\(format, *args\)");
                t.c = CollectionsKt__CollectionsKt.L(stringArray);
                if (!PatchProxy.applyVoid(null, t, uoe, str)) {
                   a uoa = new a(t.b, t.f);
                   uoa.h(R.layout.arg_RES_7f0d114b, new f(t));
                   uoa.b(1);
                   uoa.b.c0 = a1.e(17.00f);
                   uoa.g(a1.e(64.00f));
                   uoa.o(a1.a(R.color.arg_RES_7f060c33));
                   uoa.p(a1.a(R.color.arg_RES_7f060c33));
                   uoa.f(a1.a(R.color.arg_RES_7f060c27));
                   uoa.n(a1.e(20.00f));
                   uoa.s(a1.e(16.00f));
                   o oo = uoa.a();
                   t.a = oo;
                   oo.r(t.c);
                   Dialog uDialog = oo.e();
                   if (uDialog != null) {
                      Window window = uDialog.getWindow();
                      if (window != null) {
                         window.getAttributes().width = -1;
                      }
                   }
                }
             }
             uoe = t.a;
             if (uoe != null) {
                uoe.r(t.c);
                uoe = t.a;
                if (uoe != null) {
                   uoe.f.i = t.d;
                   uoe.p();
                }
                a1 = t.a;
                if (a1 != null) {
                   a1.o();
                }
             }
          }
       }
    label_01db :
       return;
    }
}
