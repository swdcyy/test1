package b4d.a0$e;
import erd.g;
import b4d.a0;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import java.util.Set;
import zu5.c;
import android.widget.EditText;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Boolean;
import kotlin.text.StringsKt__StringsKt;
import mrd.c;
import brd.y;

public final class a0$e implements g	// class@000351
{
    public final a0 b;

    public void a0$e(a0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       a0 uoa0 = a0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$e.class, str)) {
       }else {
          this.b.l9();
          if (a0.R8(this.b).Fi()) {
             RxBus f = RxBus.f;
             Set set = this.b.b9();
             c uoc = PatchProxy.applyOneRefs(set, null, c.class, str);
             if (uoc != patchProxyRe) {
             }else {
                uoc = new c();
                uoc.a = set;
             }
             f.b(uoc);
          }
          a0$e tb = this.b;
          if (tb.B == null && a0.R8(tb).Fi()) {
             tb = this.b;
             a0 w = tb.w;
             if (w != null) {
                if (p0.d >= p0.c || !tb.e9(w.getSelectionStart())) {
                   if (p0.d > p0.c) {
                      p0 = this.b;
                      int selectionSta = w.getSelectionStart();
                      Objects.requireNonNull(p0);
                      boolean b = false;
                      if (PatchProxy.isSupport(uoa0)) {
                         Object obj = PatchProxy.applyOneRefs(Integer.valueOf(selectionSta), p0, uoa0, "37");
                         if (obj != patchProxyRe) {
                            i = obj.intValue();
                         }else if(selectionSta <= 0){
                            p0 = p0.w;
                            if (p0 != null) {
                               p0 = p0.getText();
                               if (p0 != null) {
                                  p0 = p0.subSequence(b, selectionSta);
                                  if (p0 != null) {
                                     p0 = c0.a.matcher(p0);
                                     selectionSta = 0;
                                     while (p0.find()) {
                                        selectionSta = selectionSta + 1;
                                     }
                                     i = selectionSta;
                                  }
                               }
                            }
                         }
                         i = 0;
                      }else {
                         goto label_0092 ;
                      }
                      if (!i) {
                         i = this.b;
                         selectionSta = w.getSelectionStart();
                         Objects.requireNonNull(i);
                         if (PatchProxy.isSupport(uoa0)) {
                            Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(selectionSta), i, uoa0, "38");
                            if (obj1 != patchProxyRe) {
                               b = obj1.booleanValue();
                            }else if(selectionSta <= 0){
                               i = i.w;
                               if (i != null) {
                                  i = i.getText();
                                  if (i != null) {
                                     i = i.subSequence(b, selectionSta);
                                     if (i != null) {
                                        b = StringsKt__StringsKt.O2(i, "@", b, 2, null);
                                     }
                                  }
                               }
                            }
                         }else {
                            goto label_00dc ;
                         }
                         if (b) {
                         label_0106 :
                            return;
                         }
                      }else {
                         goto label_0106 ;
                      }
                   }else {
                      goto label_0106 ;
                   }
                }
                i = this.b;
                i.B = true;
                a0.P8(i).onNext(Boolean.FALSE);
                goto label_0106 ;
             }else {
                goto label_0106 ;
             }
          }else {
             goto label_0106 ;
          }
       }
    }
}
