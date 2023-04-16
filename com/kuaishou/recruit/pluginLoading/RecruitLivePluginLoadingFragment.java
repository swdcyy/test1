package com.kuaishou.recruit.pluginLoading.RecruitLivePluginLoadingFragment;
import on5.f;
import com.kuaishou.live.fragment.LivePluginLoadingFragment;
import on5.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.refresh.RefreshType;
import fr6.a;
import wq6.k;
import wq6.j;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import android.content.Intent;
import java.lang.Integer;
import android.os.Bundle;
import com.kuaishou.recruit.pluginLoading.RecruitLivePluginLoadingFragment$a;
import com.kuaishou.live.fragment.LivePluginLoadingFragment$a;
import android.view.View;
import wq6.d;

public class RecruitLivePluginLoadingFragment extends LivePluginLoadingFragment implements f	// class@000ee7
{

    public void RecruitLivePluginLoadingFragment(){
       super();
    }
    public boolean B7(){
       return e.f(this);
    }
    public void L8(){
       if (PatchProxy.applyVoid(null, this, RecruitLivePluginLoadingFragment.class, "12")) {
          return;
       }
       BaseFragment uBaseFragmen = this.dh();
       if (uBaseFragmen instanceof f) {
          uBaseFragmen.L8();
       }else {
          e.h(this);
       }
       return;
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, RecruitLivePluginLoadingFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.dh() != null) {
          return this.dh().M();
       }
       return 5;
    }
    public void N1(){
       e.j(this);
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, RecruitLivePluginLoadingFragment.class, "10")) {
          return;
       }
       if (this.dh() != null && this.dh().isVisible()) {
          this.dh().c0();
       }
       return;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, RecruitLivePluginLoadingFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.dh() != null) {
          return this.dh().getPageParams();
       }
       return super.getPageParams();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, RecruitLivePluginLoadingFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.P(LiveLogTag.LIVE_PLUGIN.appendTag("RecruitLivePluginLoadingFragment"), "getUrl");
       if (this.dh() != null) {
          return this.dh().getUrl();
       }
       return "";
    }
    public boolean i8(){
       return e.e(this);
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, RecruitLivePluginLoadingFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.dh() != null) {
          return this.dh().o();
       }
       return "RecruitDoubleListPlugin";
    }
    public boolean o3(){
       BaseFragment obj = PatchProxy.apply(null, this, RecruitLivePluginLoadingFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.dh();
       if (obj instanceof f) {
          return obj.o3();
       }
       return e.d(this);
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(RecruitLivePluginLoadingFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, RecruitLivePluginLoadingFragment.class, "7")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (this.dh() != null) {
          this.dh().onActivityResult(p0, p1, p2);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitLivePluginLoadingFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.fh(new RecruitLivePluginLoadingFragment$a(this));
       return;
    }
    public void onRefresh(){
       e.g(this);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecruitLivePluginLoadingFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.a6();
       return;
    }
    public int r(){
       return e.a(this);
    }
    public d s8(){
       return j.b(this);
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, RecruitLivePluginLoadingFragment.class, "9")) {
          return;
       }
       if (this.dh() != null && this.dh().isVisible()) {
          this.dh().u();
       }
       return;
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitLivePluginLoadingFragment.class, "8")) {
          return;
       }
       super.y2(p0);
       if (this.dh() != null) {
          this.dh().y2(p0);
       }
       return;
    }
    public d z5(){
       return j.c(this);
    }
}
