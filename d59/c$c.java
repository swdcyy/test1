package d59.c$c;
import android.widget.CompoundButton$OnCheckedChangeListener;
import d59.c;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import java.lang.Object;
import android.widget.CompoundButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import tkd.b;
import tkd.d;
import rx4.i;
import org.json.JSONObject;
import android.view.View;
import im8.f;
import c59.l;
import java.lang.Long;
import java.net.URLDecoder;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKDebugToolPresenter$addView$1;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import i2b.a;
import xf6.l;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.library.widget.button.SlipSwitchButton;
import d59.f;
import msd.p;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import d59.d;
import android.view.View$OnClickListener;
import d59.e;

public final class c$c implements CompoundButton$OnCheckedChangeListener	// class@002045
{
    public final c b;
    public final ScrollView c;
    public final LinearLayout d;

    public void c$c(c p0,ScrollView p1,LinearLayout p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       c$c tb;
       String str1;
       c uoc = c.class;
       if (PatchProxy.isSupport(c$c.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, c$c.class, "1")) {
          return;
       }
       if (p1) {
          int i = 0;
          this.c.setVisibility(i);
          tb = this.b;
          c$c td = this.d;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(td, tb, uoc, "4")) {
             uoc = tb.q;
             String str = "mAdMKPageConfig";
             if (uoc == null) {
                a.S(str);
             }
             JSONObject jSONObject = d.a(0x256720e1).cy(uoc.g().getId(), "render");
             c q = tb.q;
             if (q == null) {
                a.S(str);
             }
             td.addView(c.V8(tb, "模板id", q.g().getId(), false, 4, null));
             q = tb.q;
             if (q == null) {
                a.S(str);
             }
             boolean b = true;
             td.addView(tb.S8("pageId", q.e(), b));
             q = tb.r;
             if (q == null) {
                a.S("mMKPageJsonInfo");
             }
             l ol = q.get();
             l ol1 = (ol != null)? ol.b: null;
             td.addView(c.V8(tb, "pageVersion", ol1, false, 4, null));
             q = tb.r;
             if (q == null) {
                a.S("mMKPageJsonInfo");
             }
             ol = q.get();
             ol = (ol != null)? ol.d: null;
             if (ol != b) {
                if (ol != 2) {
                   str1 = (ol != 3)? "未知": "网络";
                }else {
                   str1 = "内存";
                }
             }else {
                str1 = "沙盒";
             }
             td.addView(c.V8(tb, "pageJson获取方式", str1, false, 4, null));
             q = tb.s;
             if (q == null) {
                a.S("mMKPageRenderTime");
             }
             Long longx = q.get();
             long l = (longx != null)? longx.longValue(): 0;
             td.addView(c.V8(tb, "渲染耗时", String.valueOf(l), false, 4, null));
             q = tb.q;
             if (q == null) {
                a.S(str);
             }
             td.addView(tb.S8("scheme", URLDecoder.decode(q.g, "utf-8"), b));
             String str2 = (jSONObject != null)? jSONObject.toString(): null;
             td.addView(c.V8(tb, "引擎信息", str2, false, 4, null));
             String str3 = "关闭MK页面缩放";
             AdMKDebugToolPresenter$addView$1 iNSTANCE = AdMKDebugToolPresenter$addView$1.INSTANCE;
             View view = PatchProxy.applyThreeRefs(str3, "KEY_DISABLE_PAGE_SCALE", iNSTANCE, tb, c.class, "8");
             if (view != PatchProxyResult.class) {
             }else {
                view = tb.m8();
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                view = a.i(view, R.layout.arg_RES_7f0d0061);
                TextView textView = view.findViewById(R.id.ad_mk_tool_item_switch_title);
                a.o(textView, "itemBtnView");
                textView.setText(str3);
                SlipSwitchButton slipSwitchBu = view.findViewById(R.id.ad_mk_tool_item_switch_btn);
                a.o(slipSwitchBu, "itemSwitchBtn");
                slipSwitchBu.setSwitch(l.c("KEY_DISABLE_PAGE_SCALE", i));
                slipSwitchBu.setOnSwitchChangeListener2(new f(iNSTANCE));
                a.o(view, "itemView");
             }
             td.addView(view);
             td.addView(tb.R8("查看PageJson", new d(tb)));
             td.addView(tb.R8("清除缓存", e.b));
          }
       }else {
          this.c.setVisibility(8);
          tb = this.b;
          c$c td1 = this.d;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(td1, tb, uoc, "5")) {
             td1.removeAllViews();
          }
       }
       return;
    }
}
