package com.kuaishou.tuna.plc.plc2.view.PlcCover2Render;
import com.kuaishou.tuna.plc_base.render.BasePLCRender;
import y06.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import bz4.c;
import com.kuaishou.tuna.plc.plc2.view.PlcCover2Render$mDefaultCategoryMinLen$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dz4.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import android.text.TextPaint;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import java.lang.Boolean;
import android.app.Activity;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import dz4.a;
import java.lang.StringBuilder;
import android.view.View$OnClickListener;
import com.kuaishou.tuna.plc.plc2.view.PlcCover2Render$a;

public final class PlcCover2Render extends BasePLCRender	// class@001064
{
    public View m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public KwaiImageView r;
    public ViewGroup s;
    public final p t;

    public void PlcCover2Render(a p0){
       a.p(p0, "plcContext");
       super(p0.getPageType(), p0);
       this.t = s.c(PlcCover2Render$mDefaultCategoryMinLen$2.INSTANCE);
    }
    public void L(PlcEntryDataAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover2Render.class, "9")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       return;
    }
    public void M(PlcEntryDataAdapter p0){
       PlcCover2Render tn;
       PlcCover2Render tp1;
       PlcCover2Render plcCover2Ren = PlcCover2Render.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, plcCover2Ren, "8")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, plcCover2Ren, "3")) {
          PlcEntryDataAdapter plcEntryData = this.y();
          if (plcEntryData != null) {
             String coverCategor = plcEntryData.getCoverCategoryText();
             a.o(coverCategor, "adapter.coverCategoryText");
             PlcEntryDataAdapter plcEntryData1 = this.y();
             int i = 4;
             int coverCategor1 = (plcEntryData1 != null)? plcEntryData1.getCoverCategoryMaxLen(): 4;
             coverCategor = c.d(coverCategor, coverCategor1, false);
             if (c.b(coverCategor) - (float)2 < 0) {
                plcCover2Ren = this.n;
                ViewGroup$LayoutParams layoutParams = (plcCover2Ren != null)? plcCover2Ren.getLayoutParams(): objArray;
                if (!layoutParams instanceof FlexboxLayout$LayoutParams) {
                   layoutParams = objArray;
                }
                if (layoutParams != null) {
                   tn = this.n;
                   if (tn != null) {
                      TextPaint paint = tn.getPaint();
                      if (paint != null) {
                         coverCategor1 = (int)paint.measureText(coverCategor);
                      label_006b :
                         layoutParams.V1(coverCategor1);
                      }
                   }
                   coverCategor1 = 1;
                   goto label_006b ;
                }
             }else {
                tn = this.n;
                ViewGroup$LayoutParams layoutParams2 = (tn != null)? tn.getLayoutParams(): objArray;
                if (!layoutParams2 instanceof FlexboxLayout$LayoutParams) {
                   layoutParams2 = objArray;
                }
                if (layoutParams2 != null) {
                   Number number = PatchProxy.apply(objArray, this, plcCover2Ren, "1");
                   if (number == PatchProxyResult.class) {
                      number = this.t.getValue();
                   }
                   layoutParams2.V1(number.intValue());
                }
             }
             coverCategor1 = 8;
             c.n(coverCategor, this.n, Integer.valueOf(coverCategor1));
             String title = plcEntryData.getTitle();
             a.o(title, "adapter.title");
             c.o(c.d(title, 15, true), this.p, Integer.valueOf(coverCategor1));
             title = plcEntryData.getActionLabel();
             a.o(title, "adapter.actionLabel");
             c.o(c.d(title, i, false), this.o, Integer.valueOf(coverCategor1));
             c.j(plcEntryData.getActionIconUrl(), this.r, coverCategor1);
             if (!q.f(plcEntryData.getLabels())) {
                List labels = plcEntryData.getLabels();
                if (labels != null) {
                   title = labels.get(false);
                   if (title != null) {
                   label_00f9 :
                      c.o(title, this.q, Integer.valueOf(coverCategor1));
                      int i1 = (TextUtils.x(title))? a1.d(R.dimen.arg_RES_7f070334): a1.d(R.dimen.arg_RES_7f07031b);
                      PlcCover2Render tp = this.p;
                      ViewGroup$LayoutParams layoutParams1 = (tp != null)? tp.getLayoutParams(): objArray;
                      if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                         objArray = layoutParams1;
                      }
                      if (objArray != null) {
                         objArray.topMargin = i1;
                         tp1 = this.p;
                         if (tp1 != null) {
                            tp1.requestLayout();
                         }
                      }
                   }
                }
                title = "";
                goto label_00f9 ;
             }else {
                n.Y(this.q, coverCategor1, false);
             }
             if (plcEntryData.getCoverStyleSubType() == 1) {
                tp1 = this.s;
                if (tp1 != null) {
                   tp1.setAlpha(0.40f);
                }
             }else {
                tp1 = this.s;
                if (tp1 != null) {
                   tp1.setAlpha(0x3f800000);
                }
             }
          }
       }
       return;
    }
    public void N(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover2Render.class, "7")) {
          return;
       }
       a.p(p0, "rootView");
       return;
    }
    public void O(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover2Render.class, "10")) {
          return;
       }
       a.p(p0, "actionText");
       c.o(p0, this.o, Integer.valueOf(8));
       return;
    }
    public int getViewStyle(){
       return 4;
    }
    public int i(){
       return 2;
    }
    public View p(ViewGroup p0,boolean p1){
       PlcCover2Render tm;
       TextPaint paint;
       Object[] objArray1;
       PlcCover2Render plcCover2Ren = PlcCover2Render.class;
       if (PatchProxy.isSupport(plcCover2Ren)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, plcCover2Ren, "6");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, plcCover2Ren, "2")) {
          Activity activity = this.B().getActivity();
          if (activity == null) {
             activity = a.b();
          }
          View view = p1.g(activity, R.layout.arg_RES_7f0d0234);
          this.m = view;
          TextView textView = (view != null)? view.findViewById(R.id.tv_plc_cover_category): objArray;
          this.n = textView;
          PlcCover2Render tm1 = this.m;
          textView = (tm1 != null)? tm1.findViewById(R.id.tv_plc_cover_action_text): objArray;
          this.o = textView;
          tm1 = this.m;
          textView = (tm1 != null)? tm1.findViewById(R.id.tv_plc_cover_title): objArray;
          this.p = textView;
          tm1 = this.m;
          textView = (tm1 != null)? tm1.findViewById(R.id.tv_plc_cover_label): objArray;
          this.q = textView;
          tm1 = this.m;
          KwaiImageView kwaiImageVie = (tm1 != null)? tm1.findViewById(R.id.iv_plc_cover_action_icon): objArray;
          this.r = kwaiImageVie;
          tm1 = this.m;
          if (tm1 != null) {
             objArray = tm1.findViewById(R.id.ll_plc_cover_action_area);
          }
          this.s = objArray;
          tm = this.n;
          if (tm != null) {
             paint = tm.getPaint();
             if (paint != null) {
                paint.setFakeBoldText(true);
             }
          }
          tm = this.o;
          if (tm != null) {
             paint = tm.getPaint();
             if (paint != null) {
                paint.setFakeBoldText(true);
             }
          }
       }
    label_00b9 :
       tm = this.m;
       a.m(tm);
       return tm;
    }
    public String q(){
       Object[] objArray = null;
       PlcEntryDataAdapter obj = PatchProxy.apply(objArray, this, PlcCover2Render.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(this.B().getPhoto(), this.B().e(), 4);
       StringBuilder str = 'C';
       if (obj != null) {
          objArray = Integer.valueOf(obj.getStyleType());
       }
       return str+objArray+'-'+2;
    }
    public int s(){
       return 0x7f0d0234;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover2Render.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       PlcCover2Render tm = this.m;
       if (tm != null) {
          tm.setOnClickListener(new PlcCover2Render$a(this, p0));
       }
       return;
    }
}
