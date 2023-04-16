package com.yxcorp.gifshow.relation.pymk.page.PymkBottomSheet;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e7c.e;
import y8c.t;
import mbc.b;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import java.lang.System;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import lnc.a1;
import qa9.s;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.widget.TextView;
import mbc.a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$l;
import y8c.g;
import a7c.h$a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ok.x;
import f7c.a;
import a7c.b$a;
import com.yxcorp.gifshow.relation.pymk.page.a;
import com.yxcorp.gifshow.relation.pymk.page.PymkBottomSheet$a;
import f7c.d;
import a7c.h;
import e7c.b;
import e7c.c;
import qvb.i;
import com.yxcorp.gifshow.pymk.f;

public class PymkBottomSheet extends RecyclerFragment	// class@001950
{
    public String F;
    public int G;
    public int H;
    public h I;
    public String J;
    public String K;
    public static final int L;

    public void PymkBottomSheet(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PymkBottomSheet.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new e());
       PatchProxy.onMethodExit(PymkBottomSheet.class, "4");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, PymkBottomSheet.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d096d;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymkBottomSheet.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PymkBottomSheet.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, PymkBottomSheet.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.J)) {
          obj = i3.f();
          obj.c("portal", Integer.valueOf(this.G));
          this.J = obj.e();
       }
       return this.J;
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, PymkBottomSheet.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K == null) {
          this.K = String.valueOf(System.currentTimeMillis());
       }
       return this.K;
    }
    public String o(){
       return "HALF_POSSIBLE_INTERESTED_USER";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkBottomSheet.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.F = p0.getString("title", a1.p(0x7f10013d));
          this.G = p0.getInt("portal");
          this.H = p0.getInt("followrefer");
       }else {
          s.b(this);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PymkBottomSheet.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0.findViewById(R.id.pymk_title).setText(TextUtils.I(this.F));
       p0.findViewById(R.id.pymk_close).setOnClickListener(new a(this));
       return;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PymkBottomSheet.class, "3")) {
          return;
       }
       super.th();
       RecyclerView$s recycledView = this.h0().getRecycledViewPool();
       recycledView.k(14, 15);
       recycledView.k(13, 25);
       this.h0().setItemAnimator(objArray);
       this.h0().setHasFixedSize(true);
       return;
    }
    public g vh(){
       Object[] objArray = null;
       h$a obj = PatchProxy.apply(objArray, this, PymkBottomSheet.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h$a(objArray, this.G, this.m()).q(false).k(false, objArray);
       PymkBottomSheet tH = this.H;
       boolean b = true;
       if (tH <= null) {
          tH = 1;
       }
       obj.i(tH);
       b$a uoa = new b$a();
       uoa.a(a.b);
       uoa.f(b);
       obj.g(uoa);
       obj.m(new PymkBottomSheet$a(this));
       this.I = obj.b();
       return new b(new c(), this.I, this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, PymkBottomSheet.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.s();
    }
}
