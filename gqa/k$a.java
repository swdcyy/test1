package gqa.k$a;
import java.lang.Runnable;
import gqa.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jf5.j;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import android.view.View;
import lnc.a1;
import android.text.SpannableString;
import com.yxcorp.gifshow.widget.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.res.Resources;
import android.text.Spannable;

public final class k$a implements Runnable	// class@002b6e
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$a.class, "1")) {
          return;
       }
       j a = j.a;
       k q = this.b.q;
       if (q != null) {
          objArray = q.getEntity();
       }
       GeneralBottomBarInfo generalBotto = a.a(objArray);
       int i = 0;
       k$a uoa = (generalBotto != null && (generalBotto.mBottomBizType == 4 && !TextUtils.x(this.b.r)))? 1: null;
       TextView textView = k.R8(this.b);
       k s = this.b.s;
       if (s == null) {
          a.S("dialogRootView");
       }
       int width = s.getWidth();
       int i1 = (uoa)? 30: 0;
       textView.setMaxWidth((width - a1.e((float)(i1 + 172))));
       if (uoa) {
          k.P8(this.b).setText(this.b.r);
          k.P8(this.b).setVisibility(i);
       }else {
          k.P8(this.b).setVisibility(8);
       }
       k q1 = this.b.q;
       a.m(q1);
       SpannableString spannableStr = new SpannableString(q1.getCaption());
       d uod = new d();
       Activity activity = this.b.getActivity();
       if (activity != null) {
          a.o(activity, "it");
          uod.f(activity.getResources().getColor(R.color.arg_RES_7f0607b1));
          uod.g(activity.getResources().getColor(R.color.arg_RES_7f0607b1));
       }
       uod.a(spannableStr);
       k.R8(this.b).setText(spannableStr);
       return;
    }
}
