package com.kuaishou.live.gameinteractive.web.krn.GameInteractiveKrnFragment;
import v43.b;
import u43.c;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
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
import org.json.JSONObject;
import android.view.View;
import android.os.Bundle;
import java.lang.Long;
import com.kuaishou.live.gameinteractive.web.model.GameWebBalanceData;

public class GameInteractiveKrnFragment extends KwaiRnFragment implements b, c	// class@001c17
{
    public b C;
    public static final int D;

    public void GameInteractiveKrnFragment(){
       super();
    }
    public void A3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractiveKrnFragment.class, "7")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.A3(p0);
       }
       return;
    }
    public void A9(){
       if (PatchProxy.applyVoid(null, this, GameInteractiveKrnFragment.class, "9")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.A9();
       }
       return;
    }
    public t C3(){
       GameInteractiveKrnFragment obj = PatchProxy.apply(null, this, GameInteractiveKrnFragment.class, "17");
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractiveKrnFragment.class, "5")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.F3(p0, p1);
       }
       return;
    }
    public void M5(YodaBaseWebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(GameInteractiveKrnFragment.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, GameInteractiveKrnFragment.class, "19")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.M5(p0, p1, p2);
       }
       return;
    }
    public t Vb(boolean p0,int[] p1){
       GameInteractiveKrnFragment obj;
       if (PatchProxy.isSupport(GameInteractiveKrnFragment.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, GameInteractiveKrnFragment.class, "2");
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractiveKrnFragment.class, "15")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.Yb(p0, p1);
       }
       return;
    }
    public int getHeight(){
       return 100;
    }
    public t getToken(){
       GameInteractiveKrnFragment obj = PatchProxy.apply(null, this, GameInteractiveKrnFragment.class, "16");
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
       return 100;
    }
    public void hf(boolean p0){
       if (PatchProxy.isSupport(GameInteractiveKrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GameInteractiveKrnFragment.class, "3")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.hf(p0);
       }
       return;
    }
    public void l3(){
       if (PatchProxy.applyVoid(null, this, GameInteractiveKrnFragment.class, "11")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.l3();
       }
       return;
    }
    public void o6(JSONObject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractiveKrnFragment.class, "6")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.o6(p0, p1);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractiveKrnFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       return;
    }
    public void u8(boolean p0){
       if (PatchProxy.isSupport(GameInteractiveKrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GameInteractiveKrnFragment.class, "4")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.u8(p0);
       }
       return;
    }
    public String uf(String p0){
       GameInteractiveKrnFragment obj = PatchProxy.applyOneRefs(p0, this, GameInteractiveKrnFragment.class, "12");
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
       if (PatchProxy.isSupport(GameInteractiveKrnFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, GameInteractiveKrnFragment.class, "14")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.vc(p0, p1);
       }
       return;
    }
    public void vd(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractiveKrnFragment.class, "10")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.vd(p0);
       }
       return;
    }
    public void wf(long p0,long p1,c p2){
       if (PatchProxy.isSupport(GameInteractiveKrnFragment.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, GameInteractiveKrnFragment.class, "18")) {
          return;
       }
       GameInteractiveKrnFragment tC = this.C;
       if (tC != null) {
          tC.wf(p0, p1, p2);
       }
       return;
    }
    public t z9(){
       GameInteractiveKrnFragment obj = PatchProxy.apply(null, this, GameInteractiveKrnFragment.class, "13");
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
       GameInteractiveKrnFragment obj = PatchProxy.apply(null, this, GameInteractiveKrnFragment.class, "8");
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
