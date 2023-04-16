package com.yxcorp.plugin.setting.stencil.item.storage.CleanCacheItem;
import ihc.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ihc.a;
import android.content.Context;
import zgd.a;
import com.yxcorp.gifshow.settings.SettingItem;
import java.lang.Enum;
import k2b.e0;
import msd.a;
import nsd.u;
import com.yxcorp.plugin.setting.stencil.item.storage.CleanCacheItem$action$1;
import ehc.g;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import ayb.i;
import android.app.Activity;
import com.yxcorp.plugin.setting.stencil.item.storage.CleanCacheItem$a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.plugin.setting.cache.activity.ClearCacheActivity;
import android.content.Intent;
import rkd.b;
import com.yxcorp.plugin.setting.cache.activity.ClearCacheActivityTablet;

public class CleanCacheItem extends c	// class@000929
{
    public boolean s;
    public final String t;
    public final g u;
    public final l v;

    public void CleanCacheItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       String str = this.b.getString(R.string.arg_RES_7f1005ac);
       a.o(str, "context.getString\(R.string.cleanup\)");
       this.t = str;
       a uoa = new a(this.d, SettingItem.CLEAR_CACHE.name(), null, 4, null);
       this.u = str;
       this.v = new CleanCacheItem$action$1(this);
    }
    public g f(){
       return this.u;
    }
    public l getAction(){
       return this.v;
    }
    public String getTitle(){
       return this.t;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, CleanCacheItem.class, "1")) {
          return;
       }
       if (this.s == null && d.a(0x4f878389).UV(this.c)) {
          this.s = true;
          k1.r(new CleanCacheItem$a(this), 1000);
       }
       return;
    }
    public void p(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CleanCacheItem.class, "2")) {
          return;
       }
       a tc = this.c;
       ClearCacheActivity uClearCacheA = ClearCacheActivity.class;
       if (!PatchProxy.applyVoidOneRefs(tc, objArray, uClearCacheA, "1")) {
          if (b.g()) {
             uClearCacheA = ClearCacheActivityTablet.class;
          }
          Intent intent = new Intent(tc, uClearCacheA);
          intent.putExtra("KEY_PAGE_TYPE", 0);
          tc.startActivity(intent);
       }
       return;
    }
}
