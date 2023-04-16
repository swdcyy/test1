package com.kuaishou.tuna.plc.render.poi.PLCWeak5RenderPoi;
import xy4.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import y06.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import yy4.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$Event;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.detail.plc.view.PlcImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import dz4.c;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.tuna.plc.render.poi.PLCWeak5RenderPoi$shouldInitData$1;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import msd.l;
import android.widget.TextView;
import java.lang.Math;
import android.text.TextPaint;

public final class PLCWeak5RenderPoi extends d	// class@00106c
{
    public TextView p;
    public TextView q;
    public View r;
    public View s;
    public TextView t;

    public void PLCWeak5RenderPoi(PlcEntryStyleInfo$PageType p0,a p1){
       a.p(p0, "pageType");
       a.p(p1, "plcContextHolder");
       super(p0, p1);
    }
    public void M(PlcEntryDataAdapter p0){
       String weakTagInfoT;
       int i2;
       Object obj = this;
       String obj1 = p0;
       b uob = b.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, PLCWeak5RenderPoi.class, str)) {
          return;
       }
       String str1 = "plcEntryDataAdapter";
       a.p(obj1, str1);
       TunaPlcLogger.c(TunaPlcLogger$Event.INIT_WEAK_PLC, obj1);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       String str2 = null;
       objectRef.element = str2;
       PlcImageView plcImageView = this.P();
       if (!PatchProxy.applyVoidTwoRefs(obj1, plcImageView, str2, uob, "1")) {
          a.p(obj1, str1);
          c.i(obj1, plcImageView, 0);
       }
       n.Y(this.P(), 0, 0);
       str1 = p0.getWeakCategoryText();
       a.o(str1, "plcEntryDataAdapter.weakCategoryText");
       int weakCategory = p0.getWeakCategoryMaxLen();
       PLCWeak5RenderPoi t = obj.t;
       PLCWeak5RenderPoi r = obj.r;
       PLCWeak5RenderPoi$shouldInitData$1 oshouldInitD = new PLCWeak5RenderPoi$shouldInitData$1(objectRef);
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{str1,Integer.valueOf(weakCategory),t,r,oshouldInitD};
          if (!PatchProxy.applyVoid(objArray, str2, uob, str)) {
          label_0077 :
             a.p(str1, "bizName");
             a.p(oshouldInitD, "onLocationTextProcess");
             weakTagInfoT = (!TextUtils.x(str1) && t != null)? 1: null;
             if (weakTagInfoT) {
                weakTagInfoT = (weakCategory > 0)? c.d(str1, weakCategory, 0): c.d(str1, 4, 0);
                str2 = weakTagInfoT;
                oshouldInitD.invoke(str2);
                i2 = (str2 == null || !str2.length())? 1: 0;
                i2 = i2 ^ i;
             }
             if (i2) {
                if (t != null) {
                   t.setText(str2);
                }
                n.Y(t, 0, 0);
                n.Y(r, 0, 0);
             }else {
                i2 = 8;
                n.Y(t, i2, 0);
                n.Y(r, i2, 0);
             }
          }
       }else {
          goto label_0077 ;
       }
       weakTagInfoT = p0.getWeakTagInfoText();
       PLCWeak5RenderPoi q = obj.q;
       PLCWeak5RenderPoi s = obj.s;
       if (!PatchProxy.applyVoidThreeRefs(weakTagInfoT, q, s, null, b.class, "3")) {
          str2 = (weakTagInfoT == null || !weakTagInfoT.length())? 1: null;
          if (str2) {
             int i1 = 8;
             n.Y(q, i1, 0);
             n.Y(s, i1, 0);
          }else {
             n.Y(q, 0, 0);
             n.Y(s, 0, 0);
             if (q != null) {
                q.setText(c.c(weakTagInfoT, 4.00f, 0));
             }
          }
       }
       weakTagInfoT = p0.getTitle();
       obj1 = p0.getWeakTagInfoText();
       Ref$ObjectRef element = objectRef.element;
       s = obj.p;
       if (!PatchProxy.applyVoidFourRefs(weakTagInfoT, obj1, element, s, null, b.class, "4")) {
          objectRef = (weakTagInfoT == null || !weakTagInfoT.length())? 1: 0;
          str2 = "";
          if (!objectRef) {
             float f = 15.00f;
             if (element == null) {
                element = str2;
             }
             f = f - (float)(int)(float)Math.ceil((double)c.b(element));
             if (obj1 == null) {
                obj1 = str2;
             }
             str2 = c.c(weakTagInfoT, (f - (float)(int)(float)Math.ceil((double)c.b(c.d(obj1, 2, 0)))), i);
          }
          if (str2.length()) {
             i = 0;
          }
          if (i) {
             n.Y(s, 8, 0);
          }else if(s != null){
             s.setText(str2);
          }
          n.Y(s, 0, 0);
       }
       return;
    }
    public void N(View p0){
       TextPaint paint;
       if (PatchProxy.applyVoidOneRefs(p0, this, PLCWeak5RenderPoi.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.N(p0);
       TextView textView = p0.findViewById(R.id.plc_tv_biz_text);
       this.t = textView;
       if (textView != null) {
          paint = textView.getPaint();
          if (paint != null) {
             paint.setFakeBoldText(true);
          }
       }
       this.r = p0.findViewById(0x7f0a3135);
       textView = p0.findViewById(R.id.plc_tv_title);
       this.p = textView;
       if (textView != null) {
          paint = textView.getPaint();
          if (paint != null) {
             paint.setFakeBoldText(true);
          }
       }
       textView = p0.findViewById(R.id.plc_tv_tag_label);
       this.q = textView;
       if (textView != null) {
          paint = textView.getPaint();
          if (paint != null) {
             paint.setFakeBoldText(true);
          }
       }
       this.s = p0.findViewById(0x7f0a3136);
       return;
    }
    public int i(){
       return 5;
    }
    public int r(){
       return 0x7f0d1175;
    }
    public int u(){
       return 0x7f0d1175;
    }
}
