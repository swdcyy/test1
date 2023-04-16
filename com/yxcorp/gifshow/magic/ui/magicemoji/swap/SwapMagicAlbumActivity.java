package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$b;
import nsd.u;
import java.util.ArrayList;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.util.List;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import lnc.a1;
import androidx.fragment.app.DialogFragment;
import i5b.k;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import i5b.l;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Integer;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Iterable;
import brd.t;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$c;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$d;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$e;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$f;
import erd.g;
import erd.a;
import crd.b;
import j8c.b;
import lnc.b9;
import g26.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$g;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$h;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$i;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$j;
import android.app.Activity;
import ekd.j0;
import android.os.Bundle;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.io.File;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$a;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$k;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$l;
import com.yxcorp.gifshow.album.IAlbumMainFragment$e;
import i5b.j;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Collection;
import com.kwai.gifshow.post.api.feature.magic.SwapMagicEffectDescription;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo$Size;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo$AssetTimeRange;

public abstract class SwapMagicAlbumActivity extends AlbumGifshowActivity	// class@001c25
{
    public b O;
    public int P;
    public String Q;
    public String R;
    public ArrayList S;
    public b T;
    public ProgressFragment U;
    public b V;
    public ArrayList W;
    public ArrayList X;
    public boolean Y;
    public static final SwapMagicAlbumActivity$b Z;

    static {
       SwapMagicAlbumActivity.Z = new SwapMagicAlbumActivity$b(null);
    }
    public void SwapMagicAlbumActivity(){
       super();
       this.Q = "";
       this.R = "";
       this.W = new ArrayList();
    }
    public static void G3(SwapMagicAlbumActivity p0,QMedia p1,int p2,int p3,boolean p4,boolean p5,int p6,Object p7){
       boolean b = (p6 & 0x08)? false: p4;
       boolean b1 = (p6 & 0x10)? true: p5;
       p0.F3(p1, p2, p3, b, b1);
       return;
    }
    public final void A3(){
       if (PatchProxy.applyVoid(null, this, SwapMagicAlbumActivity.class, "12")) {
          return;
       }
       SwapMagicAlbumActivity tU = this.U;
       if (tU != null) {
          a.m(tU);
          if (tU.isAdded()) {
             tU = this.U;
             if (tU != null) {
                tU.dismiss();
             }
             this.U = null;
          }
       }
       return;
    }
    public final String B3(){
       return this.Q;
    }
    public final boolean C3(){
       return this.Y;
    }
    public abstract void D3(List p0,List p1,Intent p2);
    public final boolean E3(List p0){
       SwapMagicAlbumActivity swapMagicAlb = SwapMagicAlbumActivity.class;
       String obj = PatchProxy.applyOneRefs(p0, this, swapMagicAlb, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "mediaList");
       String str = "SwapMagicAlbumActivity";
       Log.b(str, "handleSelectedResultAndCompress£¬mediaList:"+p0);
       obj = a1.p(R.string.arg_RES_7f101871);
       a.o(obj, "CommonUtil.string\(titleRes\)");
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(obj, this, swapMagicAlb, "10")) {
          ProgressFragment progressFrag = new ProgressFragment();
          this.U = progressFrag;
          progressFrag.Fh(i, 100, true);
          swapMagicAlb = this.U;
          if (swapMagicAlb != null) {
             swapMagicAlb.setCancelable(i);
          }
          swapMagicAlb = this.U;
          if (swapMagicAlb != null) {
             swapMagicAlb.xh(new k(this));
          }
          swapMagicAlb = this.U;
          if (swapMagicAlb != null) {
             swapMagicAlb.zh(i);
          }
          swapMagicAlb = this.U;
          if (swapMagicAlb != null) {
             swapMagicAlb.Jh(obj);
          }
          swapMagicAlb = this.U;
          if (swapMagicAlb != null) {
             swapMagicAlb.vh(R.string.cancel);
          }
          swapMagicAlb = this.U;
          if (swapMagicAlb != null) {
             swapMagicAlb.k0(new l(this));
          }
          swapMagicAlb = this.U;
          if (swapMagicAlb != null) {
             swapMagicAlb.show(this.getSupportFragmentManager(), str);
          }
       }
       int i1 = p0.size();
       Integer[] integerArray = new Integer[i1];
       for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
          integerArray[i2] = Integer.valueOf(i);
       }
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = i;
       this.V = t.fromIterable(p0).flatMap(new SwapMagicAlbumActivity$c(this, intRef)).subscribeOn(d.c).observeOn(d.a).subscribe(new SwapMagicAlbumActivity$d(this, integerArray, p0), new SwapMagicAlbumActivity$e(this), new SwapMagicAlbumActivity$f(this, p0));
       return true;
    }
    public final void F3(QMedia p0,int p1,int p2,boolean p3,boolean p4){
       SwapMagicAlbumActivity swapMagicAlb = SwapMagicAlbumActivity.class;
       if (PatchProxy.isSupport(swapMagicAlb)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, swapMagicAlb, "6")) {
             return;
          }
       }
       String str = "SwapMagicAlbumActivity";
       b.d(str, "handleVideoMedia, indexInAlbum:"+p1+", isFakeClip:"+p3);
       if (p0 == null) {
          b.d(str, "handleVideoMedia, media is null");
          return;
       }else {
          b9.a(this.O);
          SwapMagicAlbumActivity$i oi = new SwapMagicAlbumActivity$i(this, p0, p2, p3, p4, p1);
          this.O = y6.s(b.class, LoadPolicy.DIALOG).u(new SwapMagicAlbumActivity$g(this, p0)).C(new SwapMagicAlbumActivity$h(this)).T(d.c).G(d.a).R(v8, SwapMagicAlbumActivity$j.b);
          return;
       }
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, SwapMagicAlbumActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+j0.f(this.getIntent(), "SWAP_MAGIC_MAGIC_EMOGI_PAGE_TASK_ID");
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapMagicAlbumActivity.class, "1")) {
          return;
       }
       Intent intent = this.getIntent();
       if (intent != null) {
          intent.putExtra("ALBUM_BIZ_CODE", "post_magicface_album");
       }
       super.onCreate(p0);
       b.d("SwapMagicAlbumActivity", "onCreate");
       this.P = j0.b(this.getIntent(), "SWAP_MAGIC_RECORD_DURATION", 0);
       this.Q = j0.f(this.getIntent(), "SWAP_MAGIC_SELECT_MAGIC_ID");
       this.R = j0.f(this.getIntent(), "SWAP_MAGIC_MAGIC_EMOGI_PAGE_TASK_ID");
       this.S = j0.e(this.getIntent(), "SWAP_MAGIC_MAGIC_DESCRIPTION");
       this.Y = j0.a(this.getIntent(), "single_select", 0);
       ArrayList uArrayList = j0.e(this.getIntent(), "album_selected_data");
       this.X = uArrayList;
       if (uArrayList != null) {
          Iterator iterator = uArrayList.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj.isVideo()) {
                QMedia mExportFileP = obj.mExportFilePath;
                File uFile = (mExportFileP == null || !mExportFileP.length())? 1: null;
                if (!uFile && new File(obj.mExportFilePath).exists()) {
                   this.W.add(new SwapMagicAlbumActivity$a(obj, this.z3(obj, i), true, 0));
                }
             }
          label_00bb :
             i = i1;
          }
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SwapMagicAlbumActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       b9.a(this.O);
       b.d("SwapMagicAlbumActivity", "onDestroy");
       return;
    }
    public void x3(AlbumFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapMagicAlbumActivity.class, "3")) {
          return;
       }
       a.p(p0, "albumFragment");
       p0.v5(new SwapMagicAlbumActivity$k(this));
       p0.y5(new SwapMagicAlbumActivity$l(this));
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, SwapMagicAlbumActivity.class, "4")) {
          return;
       }
       SwapMagicAlbumActivity tQ = this.Q;
       if (tQ != null) {
          j a = j.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(this, tQ, a, j.class, "7")) {
             a.p(this, "page");
             a.p(tQ, "magicId");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "USER_DEFINED_MAGIC_FACE_PICK_PICTURE_FINISH";
             i3 oi3 = i3.f();
             oi3.d("magic_face_id", tQ);
             uElementPack.params = oi3.e();
             u1.L("", this, 1, uElementPack, null);
          }
       }
       return;
    }
    public final KSAssetExportInfo z3(QMedia p0,int p1){
       SwapMagicEffectDescription obj;
       SwapMagicEffectDescription mWidth;
       SwapMagicEffectDescription mHeight;
       SwapMagicAlbumActivity swapMagicAlb = SwapMagicAlbumActivity.class;
       if (PatchProxy.isSupport(swapMagicAlb)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, swapMagicAlb, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b.a("SwapMagicAlbumActivity", "buildAssetExportInfo media:"+p0+", index:"+p1);
       swapMagicAlb = this.P;
       SwapMagicAlbumActivity tS = this.S;
       tS = (tS == null || tS.isEmpty())? 1: null;
       if (!tS) {
          tS = this.S;
          a.m(tS);
          if (p1 < tS.size()) {
             tS = this.S;
             a.m(tS);
             mWidth = tS.get(p1).mWidth;
             SwapMagicAlbumActivity tS1 = this.S;
             a.m(tS1);
             mHeight = tS1.get(p1).mHeight;
             SwapMagicAlbumActivity tS2 = this.S;
             a.m(tS2);
             if (tS2.get(p1).mDuration > null) {
                swapMagicAlb = this.S;
                a.m(swapMagicAlb);
                obj = swapMagicAlb.get(p1).mDuration;
             }
          }else {
          label_008b :
             mWidth = p0.mWidth;
             mHeight = p0.mHeight;
          }
       }else {
          goto label_008b ;
       }
       SwapMagicEffectDescription swapMagicEff = mHeight;
       mHeight = mWidth;
       p0.mClipDuration = (long)obj;
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new KSAssetExportInfo$Size(mHeight, swapMagicEff));
       ArrayList uArrayList1 = new ArrayList();
       uArrayList1.add(new KSAssetExportInfo$AssetTimeRange(0, (double)((float)obj / 1000.00f)));
       KSAssetExportInfo kSAssetExpor = new KSAssetExportInfo(mHeight, swapMagicEff, uArrayList1, uArrayList, "", 0x3f800000, "", "");
       return new KSAssetExportInfo$AssetTimeRange(0, (double)((float)obj / 1000.00f));
    }
}
