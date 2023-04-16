package awb.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import awb.c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.follow.model.FilterOption;
import android.widget.Button;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import bwb.d;
import java.lang.CharSequence;
import yvb.f;
import com.yxcorp.gifshow.follow.model.FilterBox;
import zvb.a;
import com.yxcorp.gifshow.follow.model.FilterRemindTag;
import android.text.TextPaint;
import android.content.Context;
import zf6.j;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.follow.model.DarkLightModel;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import awb.b;
import android.view.View$OnClickListener;
import java.lang.Integer;
import java.lang.Number;
import android.graphics.Color;
import ekd.m1;
import com.yxcorp.gifshow.widget.textview.CenterLineTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.util.w0;
import y8c.d;
import yvb.e$b;
import mrd.a;

public class d extends PresenterV2	// class@000343
{
    public FilterOption p;
    public FilterBox q;
    public d r;
    public e$b s;
    public f t;
    public Button u;
    public CenterLineTextView v;
    public KwaiImageView w;
    public a x;

    public void d(){
       super();
    }
    public void E8(){
       View[] viewArray;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "3")) {
          return;
       }
       this.X7(this.x.subscribe(new c(this), Functions.e));
       String showDisplayT = this.p.getShowDisplayText();
       this.u.setTag(showDisplayT);
       float f = 12.00f;
       if (!TextUtils.h(showDisplayT)) {
          TextView[] textViewArra = new TextView[]{this.u};
          d.c(f, textViewArra);
          TextView[] textViewArra1 = new TextView[]{this.u};
          d.b(2, textViewArra1);
       }
       d.a(14.00f, f, this.u, showDisplayT);
       this.u.setText(showDisplayT);
       this.t.a(this.u, this.p.mSelected);
       this.u.setSelected(this.p.mSelected);
       if (a.d(this.p, this.q.mName)) {
          this.v.setVisibility(0);
          this.v.setText(this.p.mRemindTag.getShowText());
          this.v.getPaint().setFakeBoldText(1);
          int i = 0x7f061be0;
          this.v.setTextColor(this.P8(this.p.mRemindTag.getContentColor(), j.b(this.getContext(), i)));
          d tv = this.v;
          FilterOption mRemindTag = this.p.mRemindTag;
          Drawable uDrawable = PatchProxy.applyOneRefs(mRemindTag, this, uod, "4");
          if (uDrawable != PatchProxyResult.class) {
          }else {
             b uob = new b();
             uob.g(KwaiRadiusStyles.FULL);
             uob.w(this.P8(mRemindTag.getBorderColor(), j.b(this.getContext(), i)));
             uob.x(2.00f);
             uob.v(this.P8(mRemindTag.getSolidColor(), j.b(this.getContext(), R.color.arg_RES_7f060751)));
             uDrawable = uob.a();
          }
          tv.setBackground(uDrawable);
       }else {
          this.v.setVisibility(8);
       }
       if (this.p.mBgImgUrl != null) {
          viewArray = new View[]{this.w};
          n.Z(0, viewArray);
          this.w.L(this.p.mBgImgUrl.getMUrl());
       }else {
          viewArray = new View[]{this.w};
          n.Z(8, viewArray);
       }
       this.u.setOnClickListener(new b(this));
       return;
    }
    public final int P8(String p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return Color.parseColor(p0);
       }catch(java.lang.Exception e0){
          return p1;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0522);
       this.v = m1.f(p0, 0x7f0a41f2);
       this.w = m1.f(p0, 0x7f0a14fd);
       w0.a(this.u, 0x3f000000);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("panel_sizer_header_INJECT_KEY_ITEM");
       this.r = this.r8("ADAPTER_POSITION_GETTER");
       this.s = this.t8("panel_sizer_header_INJECT_KEY_ITEM_CLICK");
       this.q = this.r8("panel_sizer_header_SIZER_ADAPTER_BOXES");
       this.t = this.r8("panel_sizer_header_SIZER_THEME_ADAPTER");
       this.x = this.t8("panel_sizer_header_SIZER_SKIN_CHANGE");
       return;
    }
}
