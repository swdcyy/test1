package j2b.q;
import ml8.d;
import y8c.r;
import com.yxcorp.gifshow.location.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import ekd.m1;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.Location;
import java.lang.Long;
import java.text.NumberFormat;
import java.math.RoundingMode;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.location.LocationFragment;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import gx8.d;
import f66.i;
import jq.a;
import q87.c;
import vw8.a;

public class q extends r implements d	// class@002f64
{
    public final b i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;

    public void q(b p0){
       super();
       this.i = p0;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       this.doBindView(this.y());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.k = m1.f(p0, 0x7f0a0198);
       this.j = m1.f(p0, 0x7f0a2d1e);
       this.l = m1.f(p0, 0x7f0a0bd3);
       this.m = m1.f(p0, 0x7f0a1298);
       this.n = m1.f(p0, 0x7f0a3624);
       return;
    }
    public void z(){
       String str;
       String title;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, oq, "3")) {
          return;
       }
       Location location = this.t();
       q l = obj.l;
       long distance = location.getDistance();
       int i = 1;
       if (PatchProxy.isSupport(oq)) {
          str = PatchProxy.applyOneRefs(Long.valueOf(distance), obj, oq, "6");
          if (str != patchProxyRe) {
          }else if(distance - null <= 0){
             str = "";
          }else {
             NumberFormat numberInstan = NumberFormat.getNumberInstance();
             numberInstan.setMaximumFractionDigits(i);
             numberInstan.setRoundingMode(RoundingMode.HALF_UP);
             if (distance - 1000 >= 0) {
                float f = ((float)distance * 0x3f800000) / 1000.00f;
                str = (f - 0x4479c000 > 0)? "999+km": numberInstan.format((double)f)+"km";
             }else {
                str = distance+"m";
             }
          }
       }else {
          goto label_0034 ;
       }
       l.setText(str);
       int i1 = 8;
       if (TextUtils.isEmpty(location.getTitle())) {
          obj.k.setVisibility(i1);
          if (TextUtils.isEmpty(location.getAddress())) {
             obj.j.setVisibility(i1);
          }else {
             obj.j.setText(location.getAddress());
             obj.j.setVisibility(0);
          }
       }else {
          obj.j.setText(location.getTitle());
          if (this.E() instanceof LocationFragment) {
             LocationFragment j = this.E().J;
             if (!TextUtils.isEmpty(j)) {
                q j1 = obj.j;
                title = location.getTitle();
                SpannableString spannableStr = PatchProxy.applyTwoRefs(j, title, obj, oq, "7");
                if (spannableStr != patchProxyRe) {
                }else {
                   Matcher matcher = Pattern.compile("\(?i\)"+Pattern.quote(j)).matcher(title);
                   spannableStr = new SpannableString(title);
                   ForegroundColorSpan uForegroundC = null;
                   while (matcher.find()) {
                      spannableStr.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f060751)), matcher.start(), matcher.end(), 33);
                      uForegroundC = 1;
                   }
                   if (uForegroundC == null) {
                      matcher = Pattern.compile("\(?i\)["+Pattern.quote(j)+"]").matcher(title);
                      while (matcher.find()) {
                         spannableStr.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f060751)), matcher.start(), matcher.end(), 33);
                      }
                   }
                }
                j1.setText(spannableStr);
             }
          }
          obj.j.setVisibility(0);
          boolean b = TextUtils.equals(location.getTitle(), location.getCity());
          if (TextUtils.isEmpty(location.getAddress())) {
             obj.k.setVisibility(i1);
          }else {
             obj.k.setVisibility(0);
             obj.k.setText(location.getAddress());
          }
          if (b) {
             obj.l.setText("");
             obj.k.setVisibility(i1);
             obj.b.getLayoutParams().height = a1.d(0x7f070327);
          }
       }
       Object[] objArray1 = new Object[0];
       a.b().w("LocationItemViewPresenter", "onBind : Location title is "+location.mTitle+", iconType is "+d.a(obj.m, obj.n, location), objArray1);
       if (!PatchProxy.applyVoid(objArray, obj, oq, "4") && this.t().showed == null) {
          this.t().showed = true;
          if (obj.i.B != null) {
             if (!PatchProxy.applyVoid(objArray, obj, oq, "5")) {
                BaseFragment uBaseFragmen = this.E();
                if (uBaseFragmen instanceof LocationFragment) {
                   objArray = uBaseFragmen.J;
                }
                a.p(this.t(), this.F(), objArray, 0);
             }
          }else {
             a.p(this.t(), this.F(), "", 0);
          }
       }
       return;
    }
}
