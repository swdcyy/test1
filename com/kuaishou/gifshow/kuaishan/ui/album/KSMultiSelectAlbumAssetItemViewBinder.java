package com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectAlbumAssetItemViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import ec7.a;
import java.util.List;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import com.yxcorp.gifshow.models.QMedia;
import q79.d;
import java.util.Iterator;
import java.lang.Iterable;
import r79.c;
import com.yxcorp.gifshow.models.EmptyQMedia;
import p79.c;
import java.lang.Boolean;
import r79.a;
import w69.d;

public final class KSMultiSelectAlbumAssetItemViewBinder extends MultiSelectAlbumAssetItemViewBinder	// class@001aad
{
    public View t;
    public TextView u;
    public static final String v;
    public static final KSMultiSelectAlbumAssetItemViewBinder$a w;

    static {
       KSMultiSelectAlbumAssetItemViewBinder.w = new KSMultiSelectAlbumAssetItemViewBinder$a(null);
       KSMultiSelectAlbumAssetItemViewBinder.v = "ksa_is_spark_template";
    }
    public void KSMultiSelectAlbumAssetItemViewBinder(Fragment p0,int p1){
       a.p(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSMultiSelectAlbumAssetItemViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.e(p0);
       this.t = p0.findViewById(0x7f0a3837);
       TextView textView = p0.findViewById(R.id.selected_hint);
       this.u = textView;
       if (textView != null) {
          TextPaint paint = textView.getPaint();
          if (paint != null) {
             paint.setFakeBoldText(true);
          }
       }
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KSMultiSelectAlbumAssetItemViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0717, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­t_item, container, false\)");
       return view;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(KSMultiSelectAlbumAssetItemViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, KSMultiSelectAlbumAssetItemViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "adapter");
       a.p(p2, "payloads");
       super.i(p0, p1, p2, p3);
       p0 = p0.M0(p1);
       if (p0 instanceof QMedia && p3 instanceof d) {
          List list = p3.m();
          int i = 0;
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                Object obj1 = obj;
                obj1 = (!obj1 instanceof EmptyQMedia && a.g(obj1.getPath(), p0.path))? 1: null;
                if (obj1) {
                   i = obj;
                   break ;
                }
             }
          }
          KSMultiSelectAlbumAssetItemViewBinder kSMultiSelec = (i != null)? 1: null;
          if (kSMultiSelec) {
             kSMultiSelec = this.t;
             if (kSMultiSelec == null || kSMultiSelec.getVisibility()) {
                c.e(this.t, true);
             }
          }else {
             kSMultiSelec = this.t;
             if (kSMultiSelec != null && !kSMultiSelec.getVisibility()) {
                c.e(this.t, false);
             }
          }
       }
    label_0092 :
       return;
    }
    public boolean z(d p0,QMedia p1,int p2){
       Bundle obj;
       if (PatchProxy.isSupport(KSMultiSelectAlbumAssetItemViewBinder.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, KSMultiSelectAlbumAssetItemViewBinder.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "viewModel");
       a.p(p1, "item");
       obj = p0.s0().c().b();
       Boolean uBoolean = (obj != null)? Boolean.valueOf(obj.getBoolean(KSMultiSelectAlbumAssetItemViewBinder.v)): null;
       if (a.g(uBoolean, Boolean.FALSE)) {
          return true;
       }else {
          return super.z(p0, p1, p2);
       }
    }
}
