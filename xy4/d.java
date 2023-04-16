package xy4.d;
import com.kuaishou.tuna.plc_base.render.BasePLCRender;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import y06.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$Event;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import android.view.View;
import dz4.c;
import dz4.b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.plc.view.PlcImageView;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import cz4.a;
import cz4.a$a;
import android.view.ViewGroup;
import java.lang.Boolean;
import ekd.p1;
import android.app.Activity;
import android.content.Context;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import dz4.a;
import java.lang.StringBuilder;
import java.lang.Integer;
import u06.e;

public abstract class d extends BasePLCRender	// class@00380b
{
    public View m;
    public PlcImageView n;
    public View o;

    public void d(PlcEntryStyleInfo$PageType p0,a p1){
       a.p(p0, "pageType");
       a.p(p1, "plcContextHolder");
       super(p0, p1);
    }
    public boolean I(){
       return true;
    }
    public void L(PlcEntryDataAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       return;
    }
    public void M(PlcEntryDataAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       TunaPlcLogger.c(TunaPlcLogger$Event.INIT_WEAK_PLC, p0);
       return;
    }
    public void N(View p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "5")) {
          return;
       }
       a.p(p0, "rootView");
       if (!PatchProxy.applyVoidOneRefs(p0, null, c.class, "2") && p0 != null) {
          p0.setOnTouchListener(b.b);
       }
       this.m = p0;
       this.n = p0.findViewById(0x7f0a1722);
       this.o = p0.findViewById(0x7f0a4564);
       if (!PatchProxy.applyVoid(null, this, uod, "6")) {
          d to = this.o;
          if (to != null) {
             b uob = new b();
             uob.v(a1.a(R.color.arg_RES_7f061951));
             uob.g(KwaiRadiusStyles.R4);
             to.setBackground(uob.a());
          }
       }
       return;
    }
    public void O(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       a.p(p0, "actionText");
       return;
    }
    public final PlcImageView P(){
       return this.n;
    }
    public final View Q(){
       return this.m;
    }
    public void d(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       a.p(p0, "listener");
       return;
    }
    public void g(int p0){
    }
    public int getViewStyle(){
       Object obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.H())? 5: 1;
       return i;
    }
    public void l(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, d.class, "11");
    }
    public int m(){
       return 8;
    }
    public void onRelease(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.onRelease();
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
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uod, "1");
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
          a.o(view, "if \(cachedView != null\) ¡­M_VIEW\)\n        }\n      }");
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
       a.o(view, "if \(plcContextHolder.get¡­\), getLayoutId\(\)\)\n      }");
       return view;
    }
    public String q(){
       Object[] objArray = null;
       PlcEntryDataAdapter obj = PatchProxy.apply(objArray, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(this.B().getPhoto(), this.B().e(), 1);
       StringBuilder str = 'W';
       if (obj != null) {
          objArray = Integer.valueOf(obj.getStyleType());
       }
       return str+objArray+'-'+this.i();
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       a.p(p0, "listener");
       d tm = this.m;
       if (tm != null) {
          tm.setOnClickListener(p0);
       }
       return;
    }
}
