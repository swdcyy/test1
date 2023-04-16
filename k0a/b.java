package k0a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import k0a.a;
import k0a.b$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import uh5.e;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uw9.o;
import java.lang.StringBuilder;
import android.os.Build;
import q87.c;
import com.yxcorp.utility.TextUtils;
import androidx.viewpager.widget.ViewPager$i;
import hf5.g;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import sy6.a;
import java.lang.CharSequence;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.ColumnMeta;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import ekd.m1;
import hf5.e;

public class b extends PresenterV2	// class@002b91
{
    public ViewPager$i A;
    public final HotChannelColumn p;
    public final boolean q;
    public ViewStub r;
    public View s;
    public TextView t;
    public TextView u;
    public a v;
    public e0 w;
    public e x;
    public g y;
    public final Runnable z;
    public static final String[][] B;

    static {
       String[] stringArray1;
       String[][] stringArray = new String[][1]{stringArray1};
       stringArray1 = new String[]{"HUAWEI","EML-AL00"};
       b.B = stringArray;
    }
    public void b(HotChannelColumn p0,boolean p1){
       super();
       this.z = new a(this);
       this.A = new b$a(this);
       this.p = p0;
       this.q = p1;
    }
    public void E8(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       u1.a(this);
       b = true;
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          if (this.s == null) {
             this.s = this.r.inflate();
          }
          this.t = this.s.findViewById(0x7f0a06b5);
          this.u = this.s.findViewById(0x7f0a06ba);
          if (e.e()) {
             this.u.setTypeface(Typeface.DEFAULT);
             this.u.getPaint().setFakeBoldText(b);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          String obj = PatchProxy.apply(objArray, this, uob, "6");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             String bRAND = Build.BRAND;
             String mODEL = Build.MODEL;
             Object[] objArray1 = new Object[i];
             o.C().s("DetailChannelInfo", "shouldAdjustTrendingTitleSize phone: "+bRAND+" model: "+mODEL, objArray1);
             obj = TextUtils.M(bRAND);
             String str = TextUtils.M(mODEL);
             String[][] b1 = b.B;
             int len = b1.length;
             int i2 = 0;
             while (true) {
                if (i2 < len) {
                   object oobject = b1[i2];
                   if (!(oobject[i]).equals(obj) || !(oobject[b]).equals(str)) {
                      i2 = i2 + 1;
                   }
                }else {
                   b = false;
                }
             }
          }
          if (b) {
             int i1 = 2;
             this.u.setTextSize(i1, 16.00f);
             this.t.setTextSize(i1, 16.00f);
          }
       }
       this.y.cc(this.A);
       if (this.q == null) {
          k1.o(this.z);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.y.Ud(this.A);
       u1.b(this);
       k1.m(this.z);
       return;
    }
    public void P8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       int i = 8;
       if (p0 >= 0 && p0 < this.v.Q()) {
          b tp = this.p;
          if (tp != null && p0 < tp.mTotalNum) {
             int i1 = 0;
             this.s.setVisibility(i1);
             this.t.setText("");
             this.t.append(String.valueOf((p0 + 1)));
             this.t.append("/");
             SpannableString spannableStr = new SpannableString(String.valueOf(this.p.mTotalNum));
             spannableStr.setSpan(new AbsoluteSizeSpan(12, true), i1, spannableStr.length(), 17);
             this.t.append(spannableStr);
             QPhoto qPhoto = this.v.n(p0);
             if (qPhoto != null && (qPhoto.getEntity() != null && (qPhoto.getColumnMeta() == null || TextUtils.x(qPhoto.getColumnMeta().mDetailTitle)))) {
                this.u.setVisibility(i);
                return;
             }else {
                this.u.setVisibility(i1);
                this.u.setText(qPhoto.getColumnMeta().mDetailTitle);
                String str = TextUtils.k(this.p.mMainTitle);
                String str1 = this.t.getText().toString();
                if (!PatchProxy.applyVoidThreeRefs(qPhoto, str, str1, this, b.class, "8")) {
                   super();
                   this.action2 = "TOP_LIST_TOAST";
                   i3 oi3 = i3.f();
                   oi3.d("toast_name", str);
                   oi3.d("toast_num", str1);
                   this.params = oi3.e();
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.photoPackage = w1.f(qPhoto.mEntity);
                   u1.D0("", this.w, 3, this, uContentPack, null);
                }
                return;
             }
          }
       }
       this.s.setVisibility(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a06b6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.v = this.q8(a.class);
       this.w = this.q8(e0.class);
       this.x = this.q8(e.class);
       this.y = this.q8(g.class);
       return;
    }
    public void onScroll2Position(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       if (p0.intValue() == this.v.a0()) {
          return;
       }
       this.v.k(p0.intValue(), false);
       return;
    }
}
