package e7a.d$c;
import d6a.a;
import e7a.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import crd.a;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.f;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import e7a.e;
import erd.g;
import crd.b;
import e7a.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import im5.f;
import im5.f$a;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import android.text.SpannableString;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import px9.r;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;

public final class d$c extends a	// class@002083
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       d$c tb = this.b;
       tb.x = false;
       d u = tb.u;
       if (u != null) {
          u.setText("");
       }
       u = this.b.u;
       if (u != null) {
          u.setVisibility(8);
       }
       this.b.z.dispose();
       this.b.z = new a();
       return;
    }
    public void i2(){
       Object[] objArray1;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$c.class, "2")) {
          return;
       }
       d$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, uod, "5")) {
          tb.z.c(RxBus.f.f(f.class).observeOn(a.c()).subscribe(new e(tb)));
          tb.z.c(tb.p.subscribe(new f(tb)));
       }
       tb = this.b;
       boolean b = true;
       tb.x = b;
       d u = tb.u;
       if (u != null) {
          int i = 0;
          u.setVisibility(i);
          d$c tb1 = this.b;
          DanmakuInfo uDanmakuInfo = tb1.P8(tb1.s);
          uDanmakuInfo = (uDanmakuInfo != null)? uDanmakuInfo.mDisableReasoneyKey: objArray;
          int i1 = 2;
          if (!TextUtils.isEmpty(uDanmakuInfo)) {
             tb1 = this.b;
             uDanmakuInfo = tb1.P8(tb1.s);
             uDanmakuInfo = (uDanmakuInfo != null)? uDanmakuInfo.mDisableReasoneyKey: objArray;
             u.setText(a.C(uDanmakuInfo, "\n"));
             this.b.y = i1;
          }
          if (!f.a.d()) {
             u.setText("插件没有安装！！\n");
             this.b.y = i1;
          }
          if (!DanmakuSwitchUtils.h.d()) {
             u.setText("弹幕没有开启\n");
             this.b.y = i1;
          }
          d w = this.b.w;
          if (w != null) {
             PhotoDetailParam mDetailDanma = w.mDetailDanmakuParam;
             if (mDetailDanma != null) {
                i = mDetailDanma.switchSupportType;
             }
          }
          if (i <= null) {
             u.setText("该页面不支持弹幕\n");
             this.b.y = b;
          }
          StringBuilder str = u.getText();
          d s = this.b.s;
          String photoId = (s != null)? s.getPhotoId(): objArray;
          str = str+photoId+10;
          d$c tb2 = this.b;
          Objects.requireNonNull(tb2);
          String str1 = PatchProxy.apply(objArray, tb2, uod, "6");
          if (str1 != PatchProxyResult.class) {
          }else {
             DanmakuInfo uDanmakuInfo1 = tb2.P8(tb2.s);
             str1 = (uDanmakuInfo1 == null || uDanmakuInfo1.mPaster != b)? "paster != true:": "";
             if (r.b(tb2.s)) {
                str1 = str1+"is survey:";
             }
             d s1 = tb2.s;
             if (s1 != null) {
                PlcEntryStyleInfo plcEntryStyl = s1.getPlcEntryStyleInfo();
                if (plcEntryStyl != null && plcEntryStyl.isStrongValid() == b) {
                   str1 = str1+"is plc";
                }
             }
             d s2 = tb2.s;
             if (s2 != null) {
                PlcEntryStyleInfo plcEntryStyl1 = s2.getPlcEntryStyleInfo();
                if (plcEntryStyl1 != null) {
                   plcEntryStyl1 = plcEntryStyl1.mStyleInfo;
                   if (plcEntryStyl1 != null) {
                      objArray = plcEntryStyl1.mMerchantCustomerStyle;
                   }
                }
             }
             if (!TextUtils.isEmpty(objArray)) {
                str1 = str1+":is Merchant";
             }
          }
          u.setText(new SpannableString(str+str1));
       }
       return;
    }
}
