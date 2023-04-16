package ex8.a$c;
import androidx.lifecycle.Observer;
import ex8.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ex8.d;
import com.kwai.robust.PatchProxyResult;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import ex8.b;
import com.yxcorp.gifshow.activity.share.model.PublishPageShareOption;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.RadioButton;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.widget.RadioGroup;

public final class a$c implements Observer	// class@00224c
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str3;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a$c tb = this.b;
          a.o(p0, "it");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          d uod = d.class;
          String str = "5";
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, a.class, str)) {
             Object[] objArray = new Object[0];
             a.b().w("ShareBarPresenter", "onShareOptionChange index: "+i, objArray);
             tb.y = true;
             String str1 = "mTitleView";
             if (-1 != i) {
                a q = tb.q;
                if (q == null) {
                   a.S(str1);
                }
                a x = tb.x;
                String str2 = "mViewModel";
                if (x == null) {
                   a.S(str2);
                }
                Objects.requireNonNull(x);
                if (PatchProxy.isSupport(uod)) {
                   str = PatchProxy.applyOneRefs(Integer.valueOf(i), x, uod, str);
                   if (str != PatchProxyResult.class) {
                   label_009c :
                      q.setText(str);
                      a r = tb.r;
                      if (r == null) {
                         a.S("mDescribeView");
                      }
                      q = tb.x;
                      if (q == null) {
                         a.S(str2);
                      }
                      Objects.requireNonNull(q);
                      if (PatchProxy.isSupport(uod)) {
                         str3 = PatchProxy.applyOneRefs(Integer.valueOf(i), q, uod, "6");
                         if (str3 != PatchProxyResult.class) {
                         label_00de :
                            r.setText(str3);
                            a r1 = tb.r;
                            if (r1 == null) {
                               a.S("mDescribeView");
                            }
                            r1.setVisibility(0);
                            if (PatchProxy.isSupport(a.class)) {
                               r1 = PatchProxy.applyOneRefs(Integer.valueOf(i), tb, a.class, "6");
                               if (r1 != PatchProxyResult.class) {
                               label_0150 :
                                  if (r1 != null) {
                                     r1.setChecked(true);
                                  }
                               }
                            }
                            if (i) {
                               if (i != 1) {
                                  if (i != 2) {
                                     if (i != 3) {
                                        i = "can find index "+i+" button";
                                        PostUtils.D("ShareBarPresenter", i, new IllegalArgumentException(i));
                                        i = 0;
                                     }else {
                                        i = tb.w;
                                        if (i == null) {
                                           a.S("mRadioButtonIndex3");
                                        }
                                     }
                                  }else {
                                     i = tb.v;
                                     if (i == null) {
                                        a.S("mRadioButtonIndex2");
                                     }
                                  }
                               }else {
                                  i = tb.t;
                                  if (i == null) {
                                     a.S("mRadioButtonIndex1");
                                  }
                               }
                            }else {
                               i = tb.u;
                               if (i == null) {
                                  a.S("mRadioButtonIndex0");
                               }
                            }
                            r1 = i;
                            goto label_0150 ;
                         }
                      }
                      str3 = a1.p(q.c.b().get(i).getDescribeResId());
                      a.o(str3, "CommonUtil.string\(mRepo.¡­ons[index].describeResId\)");
                      goto label_00de ;
                   }
                }
                str = a1.p(x.c.b().get(i).getTitleResId());
                a.o(str, "CommonUtil.string\(mRepo.¡­ptions[index].titleResId\)");
                goto label_009c ;
             }else {
                i = tb.s;
                if (i == null) {
                   a.S("mRadioGroup");
                }
                i.clearCheck();
                i = tb.q;
                if (i == null) {
                   a.S(str1);
                }
                i.setText(R.string.arg_RES_7f103ded);
                i = tb.r;
                if (i == null) {
                   a.S("mDescribeView");
                }
                i.setVisibility(8);
             }
          }
       }
       return;
    }
}
