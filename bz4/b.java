package bz4.b;
import com.kuaishou.tuna.plc_base.render.BasePLCRender;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import y06.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.helper.ApkStatusHelper;
import android.app.Activity;
import bz4.b$a;
import f4a.i;
import androidx.fragment.app.Fragment;
import o4a.b;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$Event;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.text.TextPaint;
import android.content.Context;
import java.lang.CharSequence;
import java.lang.Integer;
import dz4.c;
import android.view.View$OnClickListener;
import cz4.a;
import cz4.a$a;
import android.view.ViewGroup;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ekd.p1;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import dz4.a;
import java.lang.StringBuilder;
import u06.e;

public abstract class b extends BasePLCRender	// class@0003f4
{
    public View m;
    public View n;
    public ApkStatusHelper o;

    public void b(PlcEntryStyleInfo$PageType p0,a p1){
       a.p(p0, "pageType");
       a.p(p1, "plcContextHolder");
       super(p0, p1);
    }
    public void L(PlcEntryDataAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       if (p0.getActionType() == 2) {
          ApkStatusHelper uApkStatusHe = new ApkStatusHelper(p0, this.w(), this.c, new b$a(this), this.x());
          this.o = v0;
          v0.c();
       }
       return;
    }
    public void M(PlcEntryDataAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       TunaPlcLogger.c(TunaPlcLogger$Event.INIT_STRONG_PLC, p0);
       return;
    }
    public void N(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.m = p0;
       this.n = this.P(p0);
       return;
    }
    public void O(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.p(p0, "actionText");
       return;
    }
    public View P(View p0){
       return null;
    }
    public final View Q(){
       return this.n;
    }
    public final View R(){
       return this.m;
    }
    public final void S(TextView p0,PlcEntryDataAdapter p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "10")) {
          return;
       }
       a.p(p1, "plcEntryDataAdapter");
       String actionLabel = p1.getActionLabel();
       actionLabel = (actionLabel == null || !actionLabel.length())? 1: 0;
       if (!actionLabel) {
          actionLabel = 0;
          ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): actionLabel;
          if (layoutParams instanceof ConstraintLayout$LayoutParams) {
             ViewGroup$LayoutParams layoutParams1 = layoutParams;
          }
          if (actionLabel != null) {
             actionLabel.M = (int)((p0.getPaint().measureText("快手快手") + (float)p0.getPaddingLeft()) + (float)p0.getPaddingRight());
          }
       }
       return;
    }
    public final void T(Activity p0,TextView p1,PlcEntryDataAdapter p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "9")) {
          return;
       }
       a.p(p2, "plcEntryDataAdapter");
       if (p2.getActionType() == 2) {
          i oi = this.x();
          a.m(oi);
          b = oi.f(p0, p2.getPackageName());
          if (b) {
             if (p1 != null) {
                p1.setVisibility(0);
             }
             if (p1 != null) {
                p1.setText(ApkStatusHelper.i);
             }
             return;
          }else {
             i oi1 = this.x();
             a.m(oi1);
             if (oi1.c(p2.getDownloadUrl())) {
                if (p1 != null) {
                   p1.setVisibility(0);
                }
                if (p1 != null) {
                   p1.setText(ApkStatusHelper.h);
                }
                return;
             }
          }
       }
       c.o(p2.getActionLabel(), p1, Integer.valueOf(4));
       return;
    }
    public void d(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       b tn = this.n;
       if (tn != null) {
          tn.setOnClickListener(p0);
       }
       return;
    }
    public int getViewStyle(){
       return 2;
    }
    public void onRelease(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
          return;
       }
       super.onRelease();
       b to = this.o;
       if (to != null) {
          to.a();
       }
       this.o = objArray;
       a uoa = a.c.b(this.m);
       if (uoa != null) {
          uoa.o0(this.A(), this.m);
       }
       return;
    }
    public View p(ViewGroup p0,boolean p1){
       String obj;
       View view;
       View view1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "this";
       if (p0 != null) {
          a$a c = a.c;
          a uoa = c.b(p0);
          view = (uoa != null)? uoa.s0(this.A(), this.b(), 1): null;
          if (view != null) {
             if (p1) {
                p0.addView(view);
             }
          }else {
             view = p1.i(p0, this.b(), p1);
             a.o(view, obj);
             c.c(view, this.b(), 1);
          }
          a.o(view, "if \(cachedView != null\) …M_VIEW\)\n        }\n      }");
       }else if(this.B().getActivity() != null){
          a$a c1 = a.c;
          a uoa1 = c1.a(this.B().getActivity());
          if (uoa1 != null) {
             view1 = uoa1.s0(this.A(), this.b(), 2);
             if (view1 != null) {
             label_0098 :
                view = view1;
             }
          }
          view1 = p1.g(this.B().getActivity(), this.b());
          a.o(view1, obj);
          c1.c(view1, this.b(), 2);
          goto label_0098 ;
       }else {
          view = p1.g(a.b(), this.b());
       }
       a.o(view, "if \(plcContextHolder.get…\), getLayoutId\(\)\)\n      }");
       return view;
    }
    public String q(){
       Object[] objArray = null;
       PlcEntryDataAdapter obj = PatchProxy.apply(objArray, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(this.B().getPhoto(), this.B().e(), 2);
       StringBuilder str = 'S';
       if (obj != null) {
          objArray = Integer.valueOf(obj.getStyleType());
       }
       return str+objArray+'-'+this.i();
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       b tm = this.m;
       if (tm != null) {
          tm.setOnClickListener(p0);
       }
       return;
    }
}
