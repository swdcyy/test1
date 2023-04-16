package gw9.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.a;
import android.content.Context;
import zf6.j;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import gw9.a$a;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;

public final class a extends PresenterV2	// class@0024eb
{
    public KwaiTemplate p;
    public f q;
    public String r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public View v;
    public BaseFragment w;
    public int x;

    public void a(){
       super();
       this.r = "";
       this.x = 2;
    }
    public void E8(){
       a ts;
       long l;
       String str1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a tp = this.p;
       if (tp != null) {
          List coverUrls = tp.getCoverUrls();
          if (coverUrls != null) {
             ts = this.s;
             if (ts != null) {
                ts.P(coverUrls);
             }
          }
       }
       tp = this.t;
       if (tp != null) {
          ts = this.p;
          if (ts != null) {
             objArray = ts.getName();
          }
          tp.setText(objArray);
       }
       tp = this.u;
       if (tp != null) {
          a tp1 = this.p;
          if (tp1 != null) {
             Long useCount = tp1.getUseCount();
             if (useCount != null) {
                l = useCount.longValue();
             label_0041 :
                StringBuilder str = TextUtils.N(l);
                Resources resources = this.l8();
                if (resources != null) {
                   str1 = resources.getString(R.string.arg_RES_7f10186d);
                   if (str1 != null) {
                   label_005f :
                      tp.setText(str+str1);
                   }
                }
                str1 = "";
                goto label_005f ;
             }
          }
          l = 0;
          goto label_0041 ;
       }
       return;
    }
    public void doBindView(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       Context context = this.getContext();
       if (context != null) {
          Resources resources = context.getResources();
          if (resources != null) {
             b = j.o(resources);
          label_0022 :
             this.s = m1.f(p0, 0x7f0a0667);
             this.t = m1.f(p0, 0x7f0a066b);
             this.u = m1.f(p0, 0x7f0a0673);
             p0 = m1.f(p0, R.id.card_container);
             this.v = p0;
             if (p0 != null) {
                p0.setOnClickListener(new a$a(this));
             }
             if (b) {
                Context context1 = this.getContext();
                if (context1 != null) {
                   Resources resources1 = context1.getResources();
                   if (resources1 != null) {
                      a tv = this.v;
                      if (tv != null) {
                         tv.setBackground(resources1.getDrawable(R.drawable.arg_RES_7f0823f1));
                      }
                      tv = this.t;
                      if (tv != null) {
                         tv.setTextColor(resources1.getColor(R.color.arg_RES_7f0601cb));
                      }
                      tv = this.u;
                      if (tv != null) {
                         tv.setTextColor(resources1.getColor(R.color.arg_RES_7f060184));
                      }
                   }
                }
             }
             return;
          }
       }
       b = false;
       goto label_0022 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("CREATION_TEMPLATE");
       this.q = this.x8("ADAPTER_POSITION");
       this.r = this.r8("CREATION_USER_ID");
       this.w = this.r8("FRAGMENT");
       this.x = this.r8("CREATION_TAB_TYPE").intValue();
       return;
    }
}
