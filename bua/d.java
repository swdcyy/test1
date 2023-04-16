package bua.d;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.i;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import tkd.b;
import tkd.d;
import vw5.a;
import tw5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.LivePlayConfig;
import z99.c;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import u99.d;
import android.view.ViewStub;
import android.view.View;
import com.yxcorp.utility.n;
import x99.s0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lv5.c;
import lv5.b;
import bua.a;
import bua.b;
import ekd.m1;
import com.kwai.library.widget.textview.AdjustSizeTextView;
import bua.g;
import java.util.Map;
import java.util.HashMap;

public class d extends a implements g	// class@000474
{
    public LivePlayConfig r;
    public QPhoto s;
    public PhotoItemViewParam t;
    public Boolean u;
    public View v;
    public AdjustSizeTextView w;

    public void d(boolean p0,CardStyle p1){
       super();
       this.R8(p0, p1);
    }
    public void E8(){
       int b;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       a obj = PatchProxy.apply(objArray, this, uod, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = i.d();
          if (b == 1) {
             b = true;
          }else if(b == 2){
             uod = this.t;
             if (uod != null && (this.s != null && uod.mPage == 9)) {
                obj = d.a(-680793205);
                if (!obj.az().c() && (obj.W40() || !this.s.isCloseLive())) {
                }
             }else {
             }
          }
       label_002a :
          b = false;
       }
       this.u = Boolean.valueOf(b);
       d.g("LiveLazyGroupPresenter", "onBind", r1.V1(this.s.mEntity)+" enableAutoPlay", String.valueOf(this.u));
       if (this.u.booleanValue()) {
          uod = this.v;
          if (uod instanceof ViewStub) {
             uod.setLayoutResource(R.layout.arg_RES_7f0d05de);
             this.v = this.v.inflate();
          }
          this.P8(true);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       View[] viewArray = new View[]{this.w};
       n.Z(8, viewArray);
       return;
    }
    public void R8(boolean p0,CardStyle p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uod, "3")) {
          return;
       }
       this.U7(new s0());
       this.U7(d.a(-242212848).In(p1));
       if (p0) {
          this.U7(new a());
       }else {
          this.U7(new b(p1));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a30e5);
       this.w = m1.f(p0, 0x7f0a3bd9);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new g());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.t8("HOME_LIVE_PLAY_CONFIG");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("FEED_ITEM_VIEW_PARAM");
       return;
    }
}
