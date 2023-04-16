package com.kuaishou.merchant.live.marketing.sandeago.e;
import q14.i;
import java.lang.Object;
import com.kuaishou.merchant.api.live.basic.model.SwitchToolParams;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.marketing.sandeago.c;
import android.app.Activity;
import io.reactivex.g;
import java.lang.Boolean;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import m64.a;
import q14.h;
import com.kuaishou.merchant.api.live.sandeabiz.LiveAnchorSandeaBizService;
import java.util.Map;
import e17.i;
import com.kuaishou.merchant.live.marketing.sandeago.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.live.marketing.sandeago.d;
import n64.d;
import lnc.a1;
import brd.v;

public class e implements i	// class@001a3b
{

    public void e(){
       super();
    }
    public t a(SwitchToolParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new c(this, p0.mActivity, p0.mLiveStreamId, p0));
    }
    public boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return o.H().x(p0);
    }
    public t c(t p0){
       return h.f(this, p0);
    }
    public t d(i p0,SwitchToolParams p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SwitchToolParams mLiveStreamI = p1.mLiveStreamId;
       SwitchToolParams mActivity = p1.mActivity;
       o oo = o.H();
       obj = oo.f;
       boolean b = true;
       if (obj != null) {
          if (obj.c()) {
             if (oo.I(mLiveStreamI).size() > b) {
                i.a(R.style.arg_RES_7f110668, 0x7f10434f);
                return this.k(false);
             }else {
                return t.create(new b(this, mActivity, p0, obj));
             }
          }else if(obj.a()){
             return this.c(obj.b());
          }
       }else if(!TextUtils.isEmpty(mLiveStreamI)){
          d uod = new d(this, oo, mActivity, mLiveStreamI, p0, p1);
          return t.create(obj);
       }
       this.h(p1, b);
       return this.k(b);
    }
    public int[] e(){
       int[] ointArray = new int[]{12};
       return ointArray;
    }
    public t f(SwitchToolParams p0){
       SwitchToolParams obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mLiveStreamId;
       if (!TextUtils.isEmpty(obj)) {
          return t.create(new d(this, obj, p0));
       }
       this.j(p0, true);
       return this.k(true);
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f104345);
    }
    public int getBizId(){
       return 8;
    }
    public void h(SwitchToolParams p0,boolean p1){
       h.c(this, p0, p1);
    }
    public t i(t p0){
       return h.b(this, p0);
    }
    public void j(SwitchToolParams p0,boolean p1){
       h.d(this, p0, p1);
    }
    public t k(boolean p0){
       return h.a(this, p0);
    }
    public void l(v p0,boolean p1){
       h.e(this, p0, p1);
    }
}
