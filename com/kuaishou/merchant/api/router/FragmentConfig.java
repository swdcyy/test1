package com.kuaishou.merchant.api.router.FragmentConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import com.kuaishou.merchant.api.router.FragmentConfig$bundle$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.Bundle;
import java.lang.Boolean;
import java.lang.Number;
import androidx.fragment.app.c;
import kotlin.jvm.internal.a;

public final class FragmentConfig	// class@001579
{
    public c a;
    public final p b;

    public void FragmentConfig(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FragmentConfig uFragmentCon = FragmentConfig.class;
       super();
       this.b = s.c(FragmentConfig$bundle$2.INSTANCE);
       int i = 0x7f0100b4;
       this.f(i);
       int i1 = 0x7f0100b5;
       if (PatchProxy.isSupport(uFragmentCon) && PatchProxy.applyOneRefs(Integer.valueOf(i1), this, uFragmentCon, "4") != patchProxyRe) {
       }else {
          this.b().putInt("animExit", i1);
       }
       this.g(i);
       this.h(R.anim.arg_RES_7f0100bb);
       if (PatchProxy.isSupport(uFragmentCon) && PatchProxy.applyOneRefs(Boolean.TRUE, this, uFragmentCon, "14") != patchProxyRe) {
       }else {
          this.b().putBoolean("backStack", true);
       }
       return;
    }
    public final String a(){
       Object obj = PatchProxy.apply(null, this, FragmentConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b().getString("backStackName");
    }
    public final Bundle b(){
       Object obj = PatchProxy.apply(null, this, FragmentConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, FragmentConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b().getInt("containerId");
    }
    public final c d(){
       return this.a;
    }
    public final FragmentConfig e(FragmentConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FragmentConfig.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "config");
       this.b().putAll(p0.b());
       this.a = p0.a;
       return this;
    }
    public final FragmentConfig f(int p0){
       FragmentConfig uFragmentCon = FragmentConfig.class;
       if (PatchProxy.isSupport(uFragmentCon)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFragmentCon, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b().putInt("animEnter", p0);
       return this;
    }
    public final FragmentConfig g(int p0){
       FragmentConfig uFragmentCon = FragmentConfig.class;
       if (PatchProxy.isSupport(uFragmentCon)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFragmentCon, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b().putInt("animPopEnter", p0);
       return this;
    }
    public final FragmentConfig h(int p0){
       FragmentConfig uFragmentCon = FragmentConfig.class;
       if (PatchProxy.isSupport(uFragmentCon)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFragmentCon, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b().putInt("animPopExit", p0);
       return this;
    }
    public final FragmentConfig i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FragmentConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b().putString("backStackName", p0);
       return this;
    }
    public final FragmentConfig j(int p0){
       FragmentConfig uFragmentCon = FragmentConfig.class;
       if (PatchProxy.isSupport(uFragmentCon)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFragmentCon, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b().putInt("containerId", p0);
       return this;
    }
    public final FragmentConfig k(c p0){
       this.a = p0;
       return this;
    }
}
