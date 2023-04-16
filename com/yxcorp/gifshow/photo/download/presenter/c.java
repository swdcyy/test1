package com.yxcorp.gifshow.photo.download.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import com.yxcorp.gifshow.photo.download.presenter.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CoverMeta;
import lxb.s;
import java.util.Collection;
import java.util.Collections;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import java.lang.Boolean;
import kxb.b;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import kotlin.collections.ArraysKt___ArraysKt;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qrd.l1;
import java.util.Objects;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import ekd.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import lxb.b;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Runnable;
import android.view.ViewGroup;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import gxb.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.widget.CheckBox;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import android.text.TextPaint;
import android.widget.ImageView;
import com.yxcorp.gifshow.photo.download.presenter.c$b;
import android.view.View$OnClickListener;
import gxb.n;
import gxb.m;
import androidx.fragment.app.DialogFragment;

public class c extends PresenterV2	// class@000ee1
{
    public String A;
    public ObservableList B;
    public final List C;
    public int D;
    public int E;
    public final Runnable F;
    public RecyclerView p;
    public TextView q;
    public TextView r;
    public CheckBox s;
    public CheckBox t;
    public TextView u;
    public ImageView v;
    public DialogFragment w;
    public TextView x;
    public QPhoto y;
    public b z;

    public void c(){
       super();
       this.C = new ArrayList();
       this.F = new c$a(this);
    }
    public void E8(){
       b uob;
       s os;
       List list;
       int[] atlasIndices;
       List list1;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          this.C.clear();
          this.B.clear();
          if (this.y.isSinglePhoto()) {
             if (this.y.getCoverMeta() != null) {
                os = new s();
                Collections.addAll(os.b, this.y.getCoverMeta().mCoverUrls);
                ImageMeta$AtlasCoverSize uAtlasCoverS = new ImageMeta$AtlasCoverSize();
                uAtlasCoverS.mWidth = (float)this.y.getCoverMeta().mWidth;
                uAtlasCoverS.mHeight = (float)this.y.getCoverMeta().mHeight;
                os.c = uAtlasCoverS;
                this.C.add(os);
                this.B.addAll(this.C);
                this.S8();
             }
          }else {
             c obj = PatchProxy.apply(objArray, this, uoc, "6");
             int b = (obj != patchProxyRe)? obj.booleanValue(): b.a(this.y);
             int i1 = 1;
             if (b) {
                obj = this.C;
                c ty = this.y;
                list = PatchProxy.applyOneRefs(ty, objArray, b.class, "1");
                if (list != patchProxyRe) {
                }else {
                   a.p(ty, "photo");
                   int[] atlasIndices1 = ty.getAtlasIndices();
                   if (atlasIndices1 == null) {
                      atlasIndices1 = new int[i];
                   }
                   a.o(atlasIndices1, "photo.atlasIndices ?: intArrayOf\(\)");
                   list = b.c(ty);
                   int len = atlasIndices1.length;
                   List atlasList = ty.getAtlasList();
                   if (atlasList != null && len == atlasList.size()) {
                      list1 = b.a.b(ArraysKt___ArraysKt.Qz(atlasIndices1, list));
                   }else {
                      uob = b.a;
                      ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                      Iterator iterator = list.iterator();
                      int i3 = 0;
                      while (iterator.hasNext()) {
                         Object obj1 = iterator.next();
                         int i4 = i3 + 1;
                         if (i3 < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         uArrayList.add(Integer.valueOf(i3));
                         i3 = i4;
                      }
                      list1 = uob.b(CollectionsKt___CollectionsKt.T5(uArrayList, list));
                   }
                   list1 = CollectionsKt___CollectionsKt.J5(list1);
                   if (ty.isLongPhotos()) {
                      s os1 = new s();
                      os1.f = list;
                      os1.d = i1;
                      os1.e = i1;
                      list1.add(i, os1);
                   }
                   list = list1;
                }
                obj.addAll(list);
                if (this.y.isLongPhotos()) {
                   c tD = this.D;
                   if (tD > null) {
                      atlasIndices = this.y.getAtlasIndices();
                      Objects.requireNonNull(atlasIndices);
                      if (tD < atlasIndices.length) {
                         this.D = this.y.getAtlasIndices()[this.D];
                      }
                   }
                }
             }else if(this.y.isLongPhotos()){
                os = new s();
                os.d = i1;
                this.C.add(os);
             }
             ImageMeta$AtlasCoverSize[] uAtlasCoverS1 = r1.n0(this.y.getEntity());
             b = (uAtlasCoverS1 != null)? uAtlasCoverS1.length: 0;
             for (int i5 = 0; i5 < b; i5 = i5 + 1) {
                list = r1.m0(this.y.getEntity(), i5);
                s os2 = new s();
                os2.a = i5;
                if (!q.f(list)) {
                   os2.b.addAll(list);
                }
                os2.c = uAtlasCoverS1[i5];
                this.C.add(os2);
             }
             int i2 = (this.y.isLongPhotos())? this.D + i1: this.D;
             this.E = i2;
             if (this.P8() && this.E < this.C.size()) {
                this.B.add(this.C.get(this.E));
                this.S8();
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "8")) {
          this.p.setLayoutManager(new LinearLayoutManager(this.getContext(), i, i));
          this.p.addItemDecoration(new b(i, a1.e(19.00f), a1.e(19.00f), a1.e(8.00f)));
          this.p.setItemViewCacheSize(this.C.size());
          uob = new b(this.y, this.B, this.A);
          this.z = uob;
          uob.W0(this.C);
          this.p.setAdapter(this.z);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "9") && this.P8()) {
          this.p.post(this.F);
       }
       this.X7(this.B.observable().subscribe(new o(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       this.p.removeCallbacks(this.F);
       return;
    }
    public final boolean P8(){
       boolean b = (this.D >= null)? true: false;
       return b;
    }
    public final boolean R8(){
       Object obj = PatchProxy.apply(null, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.C.size() == this.B.size())? true: false;
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.s.setChecked(this.R8());
       c tx = this.x;
       float f = (!this.B.size())? 0x3f000000: 0x3f800000;
       tx.setAlpha(f);
       if (q.f(this.B)) {
          this.q.setText(R.string.arg_RES_7f100a82);
       }else {
          this.q.setText(a1.q(R.string.arg_RES_7f10462c, this.B.size()));
       }
       if (this.y.isLongPhotos() && this.P8()) {
          this.u.setVisibility(0);
          this.t.setVisibility(0);
          this.t.setChecked(this.B.contains(this.C.get(0)));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.tv_save_download_pic_dialog);
       this.x = textView;
       textView.getPaint().setFakeBoldText(true);
       this.p = m1.f(p0, 0x7f0a36cf);
       textView = m1.f(p0, R.id.tv_title_download_pic_dialog);
       this.q = textView;
       textView.getPaint().setFakeBoldText(true);
       this.r = m1.f(p0, 0x7f0a4268);
       this.u = m1.f(p0, 0x7f0a41cb);
       this.s = m1.f(p0, 0x7f0a06bf);
       this.t = m1.f(p0, 0x7f0a06c4);
       ImageView imageView = m1.f(p0, R.id.iv_close_download_pic_dialog);
       this.v = imageView;
       imageView.setOnClickListener(new c$b(this));
       this.r.setOnClickListener(new n(this));
       this.u.setOnClickListener(new m(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.y = this.r8("DOWNLOAD_PHOTO");
       this.B = this.r8("SELECTED_PIC_TARGETS");
       this.w = this.r8("DOWNLOAD_DIALOG_FRAGMENT");
       this.D = this.r8("DOWNLOAD_PIC_INDEX").intValue();
       this.A = this.r8("DOWNLOAD_SOURCE");
       return;
    }
}
