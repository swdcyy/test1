package com.kwai.widget.customer.mediapreview.PreviewMediaActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.graphics.Rect;
import java.util.List;
import ix7.a0;
import lx7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import ix7.n;
import java.util.ArrayList;
import java.util.Collection;
import android.content.Intent;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import moc.b;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.i;
import ekd.j0;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment$b;
import io.reactivex.subjects.PublishSubject;

public class PreviewMediaActivity extends GifshowActivity	// class@00112b
{
    public int y;
    public n z;
    public static final int A;

    public void PreviewMediaActivity(){
       super();
    }
    public static void u3(GifshowActivity p0,Rect p1,List p2,a0 p3,int p4,a p5){
       if (PatchProxy.isSupport2(PreviewMediaActivity.class, "2")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, PreviewMediaActivity.class, "2")) {
             return;
          }
       }
       n on = new n();
       on.b = p1;
       ArrayList uArrayList = (p2 == null)? new ArrayList(): new ArrayList(p2);
       on.c = uArrayList;
       on.d = p3;
       on.e = p4;
       on.f = p5;
       Intent intent = new Intent(p0, PreviewMediaActivity.class);
       intent.putExtra("KEY_EXTRA_BUNDLE_PREVIEW_ID", b.e(on, p0));
       p0.startActivity(intent);
       p0.overridePendingTransition(0, 0);
       PatchProxy.onMethodExit(PreviewMediaActivity.class, "2");
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PreviewMediaActivity.class, "6")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PreviewMediaActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       n b;
       n d;
       PreviewMediaActivity previewMedia = PreviewMediaActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, previewMedia, "3")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       i.h(this, i, i);
       this.setContentView(R.layout.arg_RES_7f0d170c);
       int i1 = j0.b(this.getIntent(), "KEY_EXTRA_BUNDLE_PREVIEW_ID", -1);
       this.y = i1;
       n on = b.c(i1, n.class);
       this.z = on;
       if (on != null) {
          on = on.c;
          if (on != null && !on.isEmpty()) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, previewMedia, "4")) {
                int i2 = 0x7f0a0ee3;
                View view = this.findViewById(i2);
                d = this.z.d;
                if (d != null) {
                   BaseFragment uBaseFragmen = d.a(this);
                   if (uBaseFragmen != null) {
                      e uoe1 = this.getSupportFragmentManager().beginTransaction();
                      uoe1.v(i2, uBaseFragmen);
                      uoe1.m();
                      view.setVisibility(i);
                   }
                }
                view.setVisibility(8);
             }
             if (!PatchProxy.applyVoid(objArray, this, previewMedia, "5")) {
                PreviewMediaFragment previewMedia1 = new PreviewMediaFragment();
                PreviewMediaActivity tz = this.z;
                b = tz.b;
                n c = tz.c;
                d = tz.d;
                n e = tz.e;
                on = tz.f;
                if (PatchProxy.isSupport(PreviewMediaFragment.class)) {
                   Object[] objArray1 = new Object[]{b,c,d,Integer.valueOf(e),on};
                   if (PatchProxy.applyVoid(objArray1, previewMedia1, PreviewMediaFragment.class, "1")) {
                   label_00f6 :
                      e uoe = this.getSupportFragmentManager().beginTransaction();
                      uoe.v(R.id.fragment_container, previewMedia1);
                      uoe.m();
                   }
                }
                PreviewMediaFragment k = previewMedia1.k;
                k.d = b;
                k.c = c;
                k.e = PublishSubject.g();
                k.f = PublishSubject.g();
                k.g = PublishSubject.g();
                k.h = PublishSubject.g();
                k.i = PublishSubject.g();
                k = previewMedia1.k;
                if (d == null) {
                   d = previewMedia1.l;
                }
                k.j = d;
                k.l = PublishSubject.g();
                k = previewMedia1.k;
                k.k = e;
                k.m = on;
                k.n = previewMedia1;
                goto label_00f6 ;
             }
             return;
          }
       }
       this.finish();
       return;
    }
}
