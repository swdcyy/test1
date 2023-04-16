package com.kuaishou.tuna.plc.plc2.view.PlcCover1Render;
import com.kuaishou.tuna.plc_base.render.BasePLCRender;
import y06.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import bz4.c;
import com.kuaishou.tuna.plc.plc2.view.PlcCover1Render$mDefaultCategoryMinLen$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.yxcorp.utility.TextUtils;
import dz4.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import android.text.TextPaint;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Boolean;
import android.app.Activity;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p1;
import com.yxcorp.gifshow.entity.QPhoto;
import dz4.a;
import java.lang.StringBuilder;
import android.view.View$OnClickListener;
import com.kuaishou.tuna.plc.plc2.view.PlcCover1Render$a;

public final class PlcCover1Render extends BasePLCRender	// class@001061
{
    public View m;
    public TextView n;
    public TextView o;
    public TextView p;
    public final p q;

    public void PlcCover1Render(a p0){
       a.p(p0, "plcContext");
       super(p0.getPageType(), p0);
       this.q = s.c(PlcCover1Render$mDefaultCategoryMinLen$2.INSTANCE);
    }
    public void L(PlcEntryDataAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover1Render.class, "8")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       return;
    }
    public void M(PlcEntryDataAdapter p0){
       int i;
       PlcEntryStyleInfo$ActionInfo mActionLabel;
       PlcCover1Render to;
       PlcCover1Render plcCover1Ren = PlcCover1Render.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, plcCover1Ren, "7")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, plcCover1Ren, "3")) {
          PlcEntryStyleInfo plcEntryStyl = this.B().e();
          if (plcEntryStyl != null) {
             plcEntryStyl = plcEntryStyl.mStyleInfo;
             if (plcEntryStyl != null) {
                PlcEntryStyleInfo$StyleInfo mCoverStyleT = plcEntryStyl.mCoverStyleTemplateInfo;
                if (mCoverStyleT != null) {
                   String str = TextUtils.I(mCoverStyleT.mCategory);
                   a.o(str, "TextUtils.sanityCheckNull\(styleInfo.mCategory\)");
                   PlcEntryDataAdapter plcEntryData = this.y();
                   int coverCategor = (plcEntryData != null)? plcEntryData.getCoverCategoryMaxLen(): 4;
                   str = c.d(str, coverCategor, false);
                   if (c.b(str) - (float)2 < 0) {
                      plcCover1Ren = this.n;
                      ViewGroup$LayoutParams layoutParams = (plcCover1Ren != null)? plcCover1Ren.getLayoutParams(): objArray;
                      if (layoutParams instanceof FlexboxLayout$LayoutParams) {
                         objArray = layoutParams;
                      }
                      if (objArray != null) {
                         plcCover1Ren = this.n;
                         if (plcCover1Ren != null) {
                            TextPaint paint = plcCover1Ren.getPaint();
                            if (paint != null) {
                               i = (int)paint.measureText(str);
                            label_007a :
                               objArray.V1(i);
                            }
                         }
                         i = 1;
                         goto label_007a ;
                      }
                   }else {
                      PlcCover1Render tn = this.n;
                      ViewGroup$LayoutParams layoutParams1 = (tn != null)? tn.getLayoutParams(): objArray;
                      if (!layoutParams1 instanceof FlexboxLayout$LayoutParams) {
                         layoutParams1 = objArray;
                      }
                      if (layoutParams1 != null) {
                         Number number = PatchProxy.apply(objArray, this, plcCover1Ren, "1");
                         if (number == PatchProxyResult.class) {
                            number = this.q.getValue();
                         }
                         layoutParams1.V1(number.intValue());
                      }
                   }
                   i = 8;
                   c.n(str, this.n, Integer.valueOf(i));
                   PlcEntryStyleInfo$CoverStyleInfo mTitle = mCoverStyleT.mTitle;
                   a.o(mTitle, "styleInfo.mTitle");
                   c.n(c.d(mTitle, 15, true), this.p, Integer.valueOf(i));
                   mTitle = mCoverStyleT.mActionInfo;
                   if (mTitle != null) {
                      mActionLabel = mTitle.mActionLabel;
                      if (mActionLabel != null) {
                      label_00d7 :
                         c.n(c.d(mActionLabel, 4, false), this.o, Integer.valueOf(i));
                         if (mCoverStyleT.mCoverStyleSubType == true) {
                            to = this.o;
                            if (to != null) {
                               to.setAlpha(0.40f);
                            }
                         }else {
                            to = this.o;
                            if (to != null) {
                               to.setAlpha(0x3f800000);
                            }
                         }
                      }
                   }
                   mActionLabel = "";
                   goto label_00d7 ;
                }
             }
          }
       }
       return;
    }
    public void N(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover1Render.class, "6")) {
          return;
       }
       a.p(p0, "rootView");
       return;
    }
    public void O(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover1Render.class, "9")) {
          return;
       }
       a.p(p0, "actionText");
       c.n(p0, this.o, Integer.valueOf(8));
       return;
    }
    public int getViewStyle(){
       return 4;
    }
    public int i(){
       return 1;
    }
    public View p(ViewGroup p0,boolean p1){
       PlcCover1Render tm;
       TextPaint paint;
       Object[] objArray1;
       PlcCover1Render plcCover1Ren = PlcCover1Render.class;
       if (PatchProxy.isSupport(plcCover1Ren)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, plcCover1Ren, "5");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, plcCover1Ren, "2")) {
          Activity activity = this.B().getActivity();
          if (activity == null) {
             activity = a.b();
          }
          View view = p1.g(activity, R.layout.arg_RES_7f0d0233);
          this.m = view;
          TextView textView = (view != null)? view.findViewById(R.id.tv_plc_cover_category): objArray;
          this.n = textView;
          PlcCover1Render tm1 = this.m;
          textView = (tm1 != null)? tm1.findViewById(R.id.tv_plc_cover_action_text): objArray;
          this.o = textView;
          tm1 = this.m;
          if (tm1 != null) {
             objArray = tm1.findViewById(R.id.tv_plc_cover_title);
          }
          this.p = objArray;
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
    label_0085 :
       tm = this.m;
       a.m(tm);
       return tm;
    }
    public String q(){
       Object[] objArray = null;
       PlcEntryDataAdapter obj = PatchProxy.apply(objArray, this, PlcCover1Render.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(this.B().getPhoto(), this.B().e(), 4);
       StringBuilder str = 'C';
       if (obj != null) {
          objArray = Integer.valueOf(obj.getStyleType());
       }
       return str+objArray+'-'+1;
    }
    public int s(){
       return 0x7f0d0233;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover1Render.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       PlcCover1Render tm = this.m;
       if (tm != null) {
          tm.setOnClickListener(new PlcCover1Render$a(this, p0));
       }
       return;
    }
}
