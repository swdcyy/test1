package com.kuaishou.live.gameinteractive.web.GameInteractiveWebFragment;
import v43.b;
import u43.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kuaishou.live.gameinteractive.web.GameInteractiveWebFragment$a;
import com.kuaishou.live.gameinteractive.web.GameInteractiveWebFragment$b;
import v43.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v43.a;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Boolean;
import com.kuaishou.live.external.invoke.gzone.model.JsGamePayParams;
import java.lang.Number;
import android.widget.AbsoluteLayout;
import org.json.JSONObject;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import androidx.fragment.app.Fragment;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.kuaishou.live.gameinteractive.web.model.GameWebBalanceData;

public class GameInteractiveWebFragment extends KwaiYodaWebViewFragment implements b, c	// class@001bf9
{
    public b C;
    public final KwaiYodaWebView$b D;
    public final WebViewFragment$b E;
    public static final int F;

    public void GameInteractiveWebFragment(){
       super();
       this.D = new GameInteractiveWebFragment$a(this);
       this.E = new GameInteractiveWebFragment$b(this);
    }
    public void A3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractiveWebFragment.class, "7")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.A3(p0);
       }
       return;
    }
    public void A9(){
       if (PatchProxy.applyVoid(null, this, GameInteractiveWebFragment.class, "9")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.A9();
       }
       return;
    }
    public t C3(){
       GameInteractiveWebFragment obj = PatchProxy.apply(null, this, GameInteractiveWebFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj != null) {
          return obj.C3();
       }
       return null;
    }
    public void Ca(b p0){
       this.C = p0;
    }
    public void F3(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractiveWebFragment.class, "5")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.F3(p0, p1);
       }
       return;
    }
    public void M5(YodaBaseWebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(GameInteractiveWebFragment.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, GameInteractiveWebFragment.class, "19")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.M5(p0, p1, p2);
       }
       return;
    }
    public t Vb(boolean p0,int[] p1){
       GameInteractiveWebFragment obj;
       if (PatchProxy.isSupport(GameInteractiveWebFragment.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, GameInteractiveWebFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.C;
       if (obj != null) {
          return obj.Vb(p0, p1);
       }else {
          return null;
       }
    }
    public void Yb(JsGamePayParams p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractiveWebFragment.class, "15")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.Yb(p0, p1);
       }
       return;
    }
    public int getHeight(){
       Object obj = PatchProxy.apply(null, this, GameInteractiveWebFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.Ch() != null) {
          return this.Ch().getHeight();
       }
       return 0;
    }
    public t getToken(){
       GameInteractiveWebFragment obj = PatchProxy.apply(null, this, GameInteractiveWebFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj != null) {
          return obj.getToken();
       }
       return null;
    }
    public int getWidth(){
       Object obj = PatchProxy.apply(null, this, GameInteractiveWebFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.Ch() != null) {
          return this.Ch().getWidth();
       }
       return 0;
    }
    public void hf(boolean p0){
       if (PatchProxy.isSupport(GameInteractiveWebFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GameInteractiveWebFragment.class, "3")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.hf(p0);
       }
       return;
    }
    public void l3(){
       if (PatchProxy.applyVoid(null, this, GameInteractiveWebFragment.class, "11")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.l3();
       }
       return;
    }
    public void o6(JSONObject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractiveWebFragment.class, "6")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.o6(p0, p1);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractiveWebFragment.class, "1")) {
          return;
       }
       this.lh(this.E);
       super.onViewCreated(p0, p1);
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          String str = "BUNDLE_KEY_TAG";
          if (arguments.containsKey(str)) {
             String str1 = arguments.getString(str, "");
             Object[] objArray = new Object[0];
             a.C().w("GameInteractiveWebFragment", "onViewCreated -- tag:"+str1, objArray);
             if (this.Ch() != null && !TextUtils.x(str1)) {
                this.Ch().setTag(R.id.tag_key_data, str1);
             }
          }
       }
       return;
    }
    public void u8(boolean p0){
       if (PatchProxy.isSupport(GameInteractiveWebFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GameInteractiveWebFragment.class, "4")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.u8(p0);
       }
       return;
    }
    public String uf(String p0){
       GameInteractiveWebFragment obj = PatchProxy.applyOneRefs(p0, this, GameInteractiveWebFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj != null) {
          return obj.uf(p0);
       }
       return null;
    }
    public void vc(boolean p0,c p1){
       if (PatchProxy.isSupport(GameInteractiveWebFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, GameInteractiveWebFragment.class, "14")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.vc(p0, p1);
       }
       return;
    }
    public void vd(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractiveWebFragment.class, "10")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.vd(p0);
       }
       return;
    }
    public void wf(long p0,long p1,c p2){
       if (PatchProxy.isSupport(GameInteractiveWebFragment.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, GameInteractiveWebFragment.class, "18")) {
          return;
       }
       GameInteractiveWebFragment tC = this.C;
       if (tC != null) {
          tC.wf(p0, p1, p2);
       }
       return;
    }
    public t z9(){
       GameInteractiveWebFragment obj = PatchProxy.apply(null, this, GameInteractiveWebFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj != null) {
          return obj.z9();
       }
       return null;
    }
    public GameWebBalanceData zg(){
       GameInteractiveWebFragment obj = PatchProxy.apply(null, this, GameInteractiveWebFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj != null) {
          return obj.zg();
       }
       return null;
    }
}
