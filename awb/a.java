package awb.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import awb.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import awb.a$b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.model.FilterOption;
import android.widget.Button;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import bwb.d;
import java.lang.CharSequence;
import yvb.f;
import awb.a$c;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.util.w0;
import y8c.d;
import yvb.e$b;
import com.yxcorp.gifshow.follow.model.FilterBox;
import mrd.a;

public final class a extends PresenterV2	// class@000340
{
    public FilterBox p;
    public a q;
    public e$b r;
    public Button s;
    public FilterOption t;
    public d u;
    public f v;
    public static final a$a w;

    static {
       a.w = new a$a(null);
    }
    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          this.X7(tq.subscribe(new a$b(this), Functions.e));
       }
       tq = this.t;
       String str = "mOption";
       if (tq == null) {
          a.S(str);
       }
       String showDisplayT = tq.getShowDisplayText();
       a ts = this.s;
       if (ts == null) {
          a.S("mButton");
       }
       ts.setTag(showDisplayT);
       float f = 12.00f;
       if (!TextUtils.h(showDisplayT)) {
          int i = 1;
          TextView[] textViewArra = new TextView[i];
          a ts1 = this.s;
          if (ts1 == null) {
             a.S("mButton");
          }
          textViewArra[0] = ts1;
          d.c(f, textViewArra);
          int i1 = 2;
          TextView[] textViewArra1 = new TextView[i];
          ts1 = this.s;
          if (ts1 == null) {
             a.S("mButton");
          }
          textViewArra1[0] = ts1;
          d.b(i1, textViewArra1);
       }
       float f1 = 14.00f;
       a ts2 = this.s;
       if (ts2 == null) {
          a.S("mButton");
       }
       a.o(showDisplayT, "displayText");
       d.a(f1, f, ts2, showDisplayT);
       ts = this.s;
       if (ts == null) {
          a.S("mButton");
       }
       ts.setText(showDisplayT);
       tq = this.v;
       if (tq == null) {
          a.S("mSizerThemeAdapter");
       }
       ts = this.s;
       if (ts == null) {
          a.S("mButton");
       }
       a tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       tq.a(ts, tt.mSelected);
       tq = this.s;
       if (tq == null) {
          a.S("mButton");
       }
       ts = this.t;
       if (ts == null) {
          a.S(str);
       }
       tq.setSelected(ts.mSelected);
       tq = this.s;
       if (tq == null) {
          a.S("mButton");
       }
       tq.setOnClickListener(new a$c(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.sizer_item_btn);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.sizer_item_btn\)");
       this.s = p0;
       if (p0 == null) {
          a.S("mButton");
       }
       w0.a(p0, 0x3f000000);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.r8("panel_sizer_header_INJECT_KEY_ITEM");
       a.o(obj, "inject\(SizerAccessIds.SIZER_ADAPTER_KEY_ITEM\)");
       this.t = obj;
       obj = this.r8("ADAPTER_POSITION_GETTER");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION_GETTER\)");
       this.u = obj;
       this.r = this.t8("panel_sizer_header_INJECT_KEY_ITEM_CLICK");
       this.p = this.r8("panel_sizer_header_SIZER_ADAPTER_BOXES");
       obj = this.r8("panel_sizer_header_SIZER_THEME_ADAPTER");
       a.o(obj, "inject\(SizerAccessIds.SIZER_THEME_ADAPTER\)");
       this.v = obj;
       this.q = this.t8("panel_sizer_header_SIZER_SKIN_CHANGE");
       return;
    }
}
