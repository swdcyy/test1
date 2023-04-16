package com.yxcorp.gifshow.camera.record.magic.e$a;
import m4b.c;
import ie9.a;
import com.yxcorp.gifshow.camera.record.magic.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import qxc.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import android.app.Activity;
import pi9.c;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import uyb.m;
import ce9.k;
import androidx.fragment.app.Fragment;
import hf9.b;
import hf9.b$a;
import java.util.Objects;
import e5b.c;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import oc9.w;
import tg9.b;
import crd.b;
import wc9.v;
import j8c.a;
import q87.c;
import ng9.d;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.model.RuntimeData;
import le9.g;
import le9.g$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import we9.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import oe9.a;
import androidx.fragment.app.c;
import erd.g;
import uyb.c$a;
import com.yxcorp.gifshow.camera.record.magic.d;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.camerasdk.q;
import ui9.j;
import boc.b;
import com.yxcorp.gifshow.model.WishMagicInfo;

public class e$a extends a implements c	// class@000e31
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void D(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "3")) {
          return;
       }
       d d = this.b.d;
       if (d != null) {
          d.m(p0);
       }
       return;
    }
    public View F(int p0,View p1){
       e obj;
       View view1;
       View view2;
       KwaiImageView kwaiImageVie;
       TextView textView;
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = null;
       if (p0 == 0x7f0a0622) {
          obj = this.b.p;
          view1 = (obj == null)? view: obj.D();
          view2 = b.a(view1, p1, p0);
       }else if(p0 == 0x7f0a0621){
          obj = this.b.p;
          view1 = (obj == null)? view: obj.B();
          view2 = b.a(view1, p1, p0);
       }else if(p0 == 0x7f0a0623){
          obj = this.b.p;
          view1 = (obj == null)? view: obj.E();
          view2 = b.a(view1, p1, p0);
       }else if(p0 == 0x7f0a0620){
          obj = this.b.p;
          view1 = (obj == null)? view: obj.C();
          view2 = b.a(view1, p1, p0);
       }else {
          view2 = view;
       }
       if (view2 != null) {
          view = view2;
       }
       return view;
    }
    public boolean H(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.d.d(a.d.a()).a();
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "18")) {
          return;
       }
       this.b.o2();
       return;
    }
    public boolean O(){
       d obj = PatchProxy.apply(null, this, e$a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.e;
       if (obj == null) {
          Activity activity = this.getActivity();
       }
       return c.e(obj);
    }
    public void P(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "19")) {
          return;
       }
       if (p0 instanceof PanelShowEvent) {
          this.b.p2(p0);
       }
       return;
    }
    public m R(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(this);
    }
    public boolean S(){
       boolean b;
       d obj = PatchProxy.apply(null, this, e$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.f;
       if (obj != null && (!obj.isDetached() && !this.b.f.isRemoving())) {
          e$a tb = this.b;
          if (tb.l != null) {
             obj = tb.e;
             if (obj != null && !obj.isFinishing()) {
                b = false;
             label_003e :
                return b;
             }
          }
       }
       b = true;
       goto label_003e ;
    }
    public boolean T(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.d.d(b.c.a()).a();
    }
    public boolean V(){
       return false;
    }
    public boolean W(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e$a obj = PatchProxy.apply(objArray, this, e$a.class, "21");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, e.class, "33");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): c.a.b(obj.c);
       return b;
    }
    public String X(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.d.b().getTaskId();
    }
    public void Z(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "5")) {
          return;
       }
       if (p0 != null && this.b.d.j() != null) {
          this.b.d.j().addView(p0);
       }
       return;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "14")) {
          return;
       }
       this.b.Y1(p0);
       return;
    }
    public boolean a0(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, e$a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.d.d(v.e).b != null) {
          objArray = new Object[0];
          a.D().s("MagicControlAdapter", "onMagicEmojiBtnClick mIsCountDowning", objArray);
          return 0;
       }else if(this.b.d.d(d.b).a != null){
          objArray = new Object[0];
          a.D().s("MagicControlAdapter", "onMagicEmojiBtnClick mIsPrettifyPanelShowing", objArray);
          return 0;
       }else if(this.b.d.d(p0.j.a()).c()){
          objArray = new Object[0];
          a.D().w("MagicControlAdapter", "onMagicEmojiBtnClick isAssistantMode", objArray);
          return 0;
       }else if(this.b.d.d(b.c.a()).a()){
          objArray = new Object[0];
          a.D().w("MagicControlAdapter", "onMagicEmojiBtnClick isSlipModeData", objArray);
          return 0;
       }else {
          return true;
       }
    }
    public RuntimeData c0(String p0){
       g obj = PatchProxy.applyOneRefs(p0, this, e$a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.d.d(g.d.a()).b;
       if (!TextUtils.x(p0)) {
          return obj.get(p0);
       }
       return null;
    }
    public boolean d0(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.d.d(a.b).a;
    }
    public MagicEditionHandler f0(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.q;
       if (obj != null) {
          objArray = obj.o;
       }
       return objArray;
    }
    public void g0(boolean p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "15")) {
          return;
       }
       this.b.s2(p0);
       return;
    }
    public Activity getActivity(){
       return this.b.e;
    }
    public c getChildFragmentManager(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, e$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.f;
       if (obj != null) {
          objArray = obj.getChildFragmentManager();
       }
       return objArray;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "17")) {
          return;
       }
       this.b.m2();
       return;
    }
    public b i0(Class p0,g p1){
       d obj = PatchProxy.applyTwoRefs(p0, p1, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.d;
       if (obj != null) {
          return obj.l(p0, p1);
       }
       return null;
    }
    public c$a j0(){
       Object[] objArray = null;
       e$a obj = PatchProxy.apply(objArray, this, e$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       d uod = PatchProxy.apply(objArray, obj, e.class, "30");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(obj);
       }
       return uod;
    }
    public MagicBusinessId k0(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.g2();
    }
    public String o0(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.k2();
    }
    public q p0(){
       return this.b.h;
    }
    public j q0(){
       return this.b.g;
    }
    public void y(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "16")) {
          return;
       }
       Objects.requireNonNull(this.b);
       return;
    }
    public WishMagicInfo z(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.d.c(WishMagicInfo.class);
    }
}
