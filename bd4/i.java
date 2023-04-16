package bd4.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zd4.a;
import q87.c;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a$a;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView;
import lnc.a1;
import java.lang.Number;
import xc4.a;
import java.util.Objects;
import com.kuaishou.merchant.basic.widget.AutoFitIconView;
import java.lang.Integer;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Iterator;
import java.util.List;
import android.widget.TextView;
import android.view.View;
import java.util.ArrayList;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import java.lang.CharSequence;
import android.text.TextUtils;
import brd.t;
import com.kuaishou.merchant.basic.util.d;
import qt3.b;
import erd.g;
import android.content.Context;
import android.text.TextUtils$TruncateAt;
import android.app.Activity;

public class i extends PresenterV2	// class@00038e
{
    public a$a p;
    public Activity q;
    public AutoFitIconView r;

    public void i(){
       super();
    }
    public void E8(){
       int i;
       boolean b;
       DisposableHelper uDisposableH;
       TextView textView;
       b obj2;
       int i5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "4")) {
          return;
       }
       i = 0;
       Object[] objArray1 = new Object[i];
       a.C().w("MerchantGuessLikeTagPresenter", "onBind", objArray1);
       i obj = PatchProxy.apply(objArray, this, oi, "7");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.p;
          b = (obj.a != null)? q.f(obj.c): q.f(obj.b);
       }
       if (b) {
          this.r.setVisibility(8);
          return;
       }else {
          this.r.setVisibility(i);
          this.r.removeAllViews();
          this.r.setHorizontalSpace(i);
          obj = this.r;
          obj.e = i;
          obj.f = a1.d(0x7f07030a);
          obj.g = a1.d(0x7f070334);
          obj.h = a1.d(0x7f07030a);
          if (this.p.a != null) {
             if (!PatchProxy.applyVoid(objArray, this, oi, "9")) {
                obj = this.r;
                a$a c = this.p.c;
                Object obj1 = PatchProxy.apply(objArray, this, oi, "10");
                int i1 = (obj1 != patchProxyRe)? obj1.intValue(): ((a1.h() / 2) - ((a.a * 3) / 2)) - (a1.e(8.00f) * 2);
                Objects.requireNonNull(obj);
                if (PatchProxy.isSupport(AutoFitIconView.class)) {
                   uDisposableH = PatchProxy.applyTwoRefs(c, Integer.valueOf(i1), obj, AutoFitIconView.class, "3");
                   if (uDisposableH != patchProxyRe) {
                   }else if(q.f(c)){
                      uDisposableH = DisposableHelper.DISPOSED;
                   }else {
                      Iterator iterator = obj.o.iterator();
                      while (iterator.hasNext()) {
                         textView = iterator.next();
                         obj.removeView(textView);
                         obj.p.add(textView);
                      }
                      obj.o.clear();
                      TextView textView1 = obj.getTextView();
                      if (PatchProxy.isSupport(AutoFitIconView.class)) {
                         obj2 = PatchProxy.applyThreeRefs(c, textView1, Integer.valueOf(i1), obj, AutoFitIconView.class, "6");
                         if (obj2 != patchProxyRe) {
                            objArray = obj2;
                         }else if(q.f(c)){
                            int i2 = a1.d(R.dimen.arg_RES_7f07031b);
                            if (!i1) {
                               i1 = a1.h();
                            }
                            objArray = new ArrayList();
                            int i3 = c.size();
                            int i4 = 0;
                            for (; i < i3; i = i + 1) {
                               Commodity$IconLabel iconLabel = c.get(i);
                               if (TextUtils.isEmpty(iconLabel.mIconUrl)) {
                                  i4 = i4 + obj.f(textView1, iconLabel.mPrefix);
                                  i4 = i4 + obj.f(textView1, iconLabel.mContent);
                                  i5 = obj.f(textView1, iconLabel.mSuffix);
                               }else {
                                  i5 = iconLabel.getWidth();
                               }
                               i4 = i4 + i5;
                               i5 = i3 - 1;
                               if (i != i5) {
                                  i4 = i4 + i2;
                               }
                               if (i4 <= i1) {
                                  objArray.add(iconLabel);
                               }
                            }
                         }
                      }else {
                         goto label_0116 ;
                      }
                      Objects.requireNonNull(textView1);
                      obj2 = d.e(objArray).subscribe(new b(textView1));
                   }
                }else {
                   goto label_00cb ;
                }
                this.X7(uDisposableH);
             }
          }else if(PatchProxy.applyVoid(objArray, this, oi, "8")){
             Iterator iterator1 = this.p.b.iterator();
             while (iterator1.hasNext()) {
                String str = iterator1.next();
                if (str == null) {
                   continue ;
                }else {
                   i tr = this.r;
                   textView = PatchProxy.applyOneRefs(str, this, oi, "11");
                   if (textView != patchProxyRe) {
                   }else {
                      textView = new TextView(this.getContext());
                      textView.setTextSize(1, 12.00f);
                      textView.setSingleLine(1);
                      textView.setIncludeFontPadding(i);
                      textView.setEllipsize(TextUtils$TruncateAt.END);
                      textView.setGravity(16);
                      textView.setTextColor(a1.a(R.color.arg_RES_7f061a83));
                      textView.setText(str);
                   }
                   tr.addView(textView, -2, -2);
                }
             }
          }
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("MerchantGuessLikeTagPresenter", "onCreate", objArray);
       this.q = this.getActivity();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       if (this.q != null) {
          this.q = null;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("MerchantGuessLikeTagPresenter", "onUnbind", objArray);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a3d38);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("MARKETING_SERVICE_TITLE_LIST");
       return;
    }
}
