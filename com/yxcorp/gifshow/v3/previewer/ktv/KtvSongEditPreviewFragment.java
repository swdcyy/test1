package com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment;
import n3d.a;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.Boolean;
import lq.l$a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.app.Activity;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import voc.v;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment$b;
import maa.a;
import android.view.View;
import mwc.o0;
import android.view.View$OnClickListener;
import ekd.m1;
import mwc.p0;
import mwc.q0;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorManager;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.previewer.ktv.b0;
import com.yxcorp.gifshow.v3.previewer.ktv.z;
import mwc.b1;
import java.util.Map;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.v3.editor.k;
import android.net.Uri;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import crd.b;
import lnc.b9;
import t36.f;
import com.kwai.video.editorsdk2.PreviewTextureView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import qaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import laa.e;
import mba.m0;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.v3.previewer.ktv.d0;
import ok.h;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ooc.j0;
import androidx.lifecycle.ViewModel;
import com.kuaishou.android.model.music.Music;
import ooc.p0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import oa0.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.v3.previewer.ktv.e0;
import com.google.common.collect.Lists;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.previewer.ktv.f0;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import uxb.o;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.k$a;
import w69.k;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.i;
import x79.e;
import n3d.a$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import k2b.b2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Number;
import java.lang.Math;

public class KtvSongEditPreviewFragment extends KtvBaseEditPreviewFragment implements a	// class@0015b1
{
    public PublishSubject h2;
    public PublishSubject i2;
    public PublishSubject j2;
    public PublishSubject k2;
    public PublishSubject l2;
    public EditorDelegate m2;
    public f n2;
    public final r0 o2;
    public PresenterV2 p2;
    public boolean q2;
    public boolean r2;
    public boolean s2;
    public b t2;
    public static final int u2;

    public void KtvSongEditPreviewFragment(){
       super();
       this.h2 = PublishSubject.g();
       this.i2 = PublishSubject.g();
       this.j2 = PublishSubject.g();
       this.k2 = PublishSubject.g();
       this.l2 = PublishSubject.g();
       this.o2 = new KtvSongEditPreviewFragment$a(this);
       this.r2 = true;
    }
    public final void Ai(){
       if (PatchProxy.applyVoid(null, this, KtvSongEditPreviewFragment.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("ktv_log", "onChooseCover fail.", objArray);
       return;
    }
    public final void Bi(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvSongEditPreviewFragment.class, "17")) {
          return;
       }
       this.q2 = true;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().path);
       }
       if (!uArrayList.equals(this.Q1.mPhotosPath)) {
          this.r2 = false;
          this.h2.onNext(Boolean.TRUE);
          KtvBaseEditPreviewFragment tQ1 = this.Q1;
          tQ1.mPhotosPath = uArrayList;
          tQ1.mCoverCount = uArrayList.size();
          this.i2.onNext(p0);
       }
       return;
    }
    public boolean Mh(int p0,l$a p1){
       if (PatchProxy.isSupport(KtvSongEditPreviewFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KtvSongEditPreviewFragment.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.zi()) {
          p.o(this.M, this.getActivity(), this.Q1, false);
       }
       return super.Mh(p0, p1);
    }
    public v Oh(EditorItemFunc p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvSongEditPreviewFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KtvSongEditPreviewFragment$b(this, p0);
    }
    public boolean Xh(){
       Object obj = PatchProxy.apply(null, this, KtvSongEditPreviewFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p.h(this.M.o0());
    }
    public boolean bi(){
       return this.r2;
    }
    public void ci(){
       if (PatchProxy.applyVoid(null, this, KtvSongEditPreviewFragment.class, "23")) {
          return;
       }
       super.ci();
       this.k2.onNext(Boolean.FALSE);
       return;
    }
    public void di(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvSongEditPreviewFragment.class, "22")) {
          return;
       }
       super.di(p0);
       this.k2.onNext(Boolean.TRUE);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvSongEditPreviewFragment.class, "1")) {
          return;
       }
       super.doBindView(p0);
       m1.a(p0, new o0(this), R.id.ktv_song_set_cover);
       m1.a(p0, new p0(this), R.id.ktv_song_change_cover);
       m1.a(p0, new q0(this), R.id.ktv_song_init_cover);
       return;
    }
    public void fi(){
       if (PatchProxy.applyVoid(null, this, KtvSongEditPreviewFragment.class, "4")) {
          return;
       }
       super.fi();
       this.q2 = this.zi();
       this.m2 = this.B.m();
       PresenterV2 presenterV2 = new PresenterV2();
       this.p2 = presenterV2;
       presenterV2.U7(new b0());
       this.p2.U7(new z());
       this.p2.f(this.getView());
       Object[] objArray = new Object[]{this};
       this.p2.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvSongEditPreviewFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, KtvSongEditPreviewFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(KtvSongEditPreviewFragment.class, new b1());
       }else {
          obj.put(KtvSongEditPreviewFragment.class, null);
       }
       return obj;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KtvSongEditPreviewFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KtvSongEditPreviewFragment.class, "16")) {
          return;
       }
       boolean b = false;
       this.s2 = b;
       if (p0 != 3274 || p1 != -1) {
          this.Ai();
          return;
       }else if(p2 == null){
          this.Ai();
          return;
       }else {
          List list = j0.e(p2, "album_data_list");
          if (!q.f(list)) {
             this.Bi(list);
             k.f().a(b);
             return;
          }else if(p2.getData() == null){
             this.Ai();
             return;
          }else {
             String absolutePath = new File(p2.getData().toString()).getAbsolutePath();
             if (TextUtils.x(absolutePath) || !new File(absolutePath).exists()) {
                this.Ai();
                return;
             }else {
                ArrayList uArrayList = new ArrayList();
                QMedia qMedia = new QMedia(0, absolutePath, 0, 0, 0);
                uArrayList.add(p2.getData().toString());
                this.Bi(uArrayList);
                return;
             }
          }
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvSongEditPreviewFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KtvSongEditPreviewFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       KtvSongEditPreviewFragment tp2 = this.p2;
       if (tp2 != null) {
          tp2.destroy();
       }
       b9.a(this.t2);
       tp2 = this.n2;
       if (tp2 != null) {
          tp2.c(this.o2);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, KtvSongEditPreviewFragment.class, "11")) {
          return;
       }
       super.onPause();
       if (this.s2 == null) {
          VideoEditPreviewV3Fragment tG = this.G;
          if (tG != null && tG.getPreviewView() != null) {
             this.G.getPreviewView().setKeepLastFrame(true);
          }
       }
       return;
    }
    public void onStart(){
       boolean b;
       Boolean uBoolean;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KtvSongEditPreviewFragment.class, "5")) {
          return;
       }
       super.onStart();
       if (this.Q1 != null && this.V == null) {
          m0 obj = PatchProxy.apply(objArray, this, KtvSongEditPreviewFragment.class, "20");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p.h(this.M.o0()) && !this.M.s0().E()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             try{
                obj = this.M.u();
                if (obj != null) {
                   uBoolean = Boolean.valueOf(obj.p());
                   obj.q(true);
                }else {
                   uBoolean = objArray;
                }
                VideoEditPreviewV3Fragment tM = this.M;
                if (!PatchProxy.applyVoidOneRefs(tM, objArray, p.class, "19")) {
                   p.m(tM, BitmapFactory.decodeFile(tM.o0().y(0).getAlbumId()), true);
                }
                if (uBoolean != null) {
                   obj.q(uBoolean.booleanValue());
                }
             }catch(java.lang.Exception e0){
                PostUtils.D("KtvSongEditPreviewFragment", "onStart", e0);
             }
          }
       }
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvSongEditPreviewFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.t2 = b9.c(this.t2, new d0(this));
       b uob = new b();
       uob.p(a1.a(R.color.arg_RES_7f061a0e), a1.a(R.color.arg_RES_7f061f20));
       uob.g(KwaiRadiusStyles.R2);
       p0.findViewById(R.id.ktv_song_change_cover).setBackground(uob.a());
       f uof = ViewModelProviders.of(this.jh()).get(j0.class).o0();
       this.n2 = uof;
       uof.d(this.o2);
       return;
    }
    public final void wi(){
       if (PatchProxy.applyVoid(null, this, KtvSongEditPreviewFragment.class, "8")) {
          return;
       }
       p0.b("picture", this.Q1.getMusicInfo(), this.V0);
       this.xi();
       return;
    }
    public void xi(){
       String str1;
       VideoEditPreviewV3Fragment g;
       boolean b = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, KtvSongEditPreviewFragment.class, "9")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       b.s2 = true;
       int i = b.yi(0, b.Q1.mSingDuration);
       if (this.zi()) {
          SharedPreferences a = a.a;
          String str = "ktv_remove_assets_tips_show";
          if (!a.getBoolean(str, 0)) {
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(str, true);
             g.a(uEditor);
             str1 = a1.p(R.string.arg_RES_7f1017ea);
             str = a1.p(R.string.arg_RES_7f1017e9);
          label_004e :
             ArrayList uArrayList = new ArrayList();
             if (b.V != null && b.M.o0() != null) {
                List list = b.M.o0().z();
                if (!q.f(list)) {
                   uArrayList.addAll(Lists.h(list, e0.b));
                }
             }
             if (uArrayList.size() > 0) {
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   if ((iterator.next()).startsWith(p.d().getAbsolutePath())) {
                      iterator.remove();
                   }
                }
             }
             String str2 = a1.p(R.string.arg_RES_7f1017e7);
             int i1 = 2;
             if (PatchProxy.isSupport(KtvSongEditPreviewFragment.class)) {
                Object[] objArray1 = new Object[]{activity,b,uArrayList,Integer.valueOf(i),str2,str1,str};
                if (PatchProxy.applyVoid(objArray1, b, KtvSongEditPreviewFragment.class, "10")) {
                label_01e5 :
                   KtvInfo mMusic = b.Q1.mMusic;
                   if (!PatchProxy.applyVoidOneRefs(mMusic, null, KtvSongEditPreviewFragment.class, "24")) {
                      ClientContent$MusicDetailPackage musicDetailP = b2.a(mMusic);
                      musicDetailP.index = mMusic.mViewAdapterPosition;
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.name = "set_cover";
                      uElementPack.type = 15;
                      uElementPack.action = 406;
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.musicDetailPackage = musicDetailP;
                      u1.u(true, uElementPack, uContentPack);
                   }
                   g = b.G;
                   if (g != null && g.getPreviewView() != null) {
                      b.G.getPreviewView().setKeepLastFrame(0);
                   }
                   return;
                }
             }
             Object[] objArray2 = new Object[0];
             a.D().s("startPickMedias", "startPickMedias\(\) called selectedPaths = ["+uArrayList+"], maxSelectCount = ["+i+"], tooManyToast = ["+str2+"], dialogTipAtBegin = ["+str1+"]", objArray2);
             ArrayList uArrayList1 = PatchProxy.applyOneRefs(uArrayList, objArray, KtvSongEditPreviewFragment.class, "26");
             if (uArrayList1 != PatchProxyResult.class) {
             }else if(q.f(uArrayList)){
                uArrayList1 = Lists.b();
             }else {
                uArrayList1 = Lists.h(uArrayList, f0.b);
             }
             f$a uoa = new f$a();
             uoa.g(a.c);
             uoa.h(true);
             uoa.i(b.V0);
             uoa.f(new ArrayList(uArrayList1));
             f uof = uoa.a();
             String str3 = "";
             KtvBaseEditPreviewFragment q1 = b.Q1;
             KtvInfo mCropBegin = q1.mCropBegin;
             if (mCropBegin != null || q1.mCropEnd != q1.mSingDuration) {
                i = b.yi(mCropBegin, q1.mCropEnd);
                if (uArrayList.size() >= i) {
                   if (uArrayList.size() > i) {
                      Object[] objArray3 = new Object[i1];
                      objArray3[0] = "%1$s";
                      objArray3[1] = Integer.valueOf(i);
                      str3 = String.format(a1.p(0x7f104614), objArray3);
                   }
                   i = uArrayList.size();
                }
             }
             AlbumLimitOption$Builder uBuilder = o.a().a("post_ktv_add_image");
             uBuilder.g(i);
             uBuilder.h(str2);
             uBuilder.p(0);
             k$a uoa1 = new k$a();
             uoa1.o(true);
             uoa1.a = str1;
             uoa1.b = str;
             uoa1 = uoa1.r(0);
             uoa1.k(str3);
             b$a uoa2 = new b$a();
             uoa2.c(true);
             e.f().i(activity, new i$a().a(uoa2.a()).m(uoa1.b()).d(uof).f(uBuilder.d()).b(), 3274, b);
             goto label_01e5 ;
          }
       }
       str1 = objArray;
       Object[] objArray4 = str1;
       goto label_004e ;
    }
    public final int yi(int p0,int p1){
       if (PatchProxy.isSupport(KtvSongEditPreviewFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KtvSongEditPreviewFragment.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.min((int)Math.floor(((double)((float)(p1 - p0) / 1000.00f) / 2.00f)), 31);
    }
    public boolean zi(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoEditPreviewV3Fragment obj = PatchProxy.apply(null, this, KtvSongEditPreviewFragment.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.M;
       if (obj != null && this.d2 == null) {
          if (obj.o0() != null && !this.M.o0().z().isEmpty()) {
             if (!this.M.s0().E()) {
                Object obj1 = PatchProxy.apply(null, this, KtvSongEditPreviewFragment.class, "19");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else if(p.h(this.M.o0()) && this.M.s0().E()){
                   b = true;
                }else {
                   b = false;
                }
                if (!b) {
                label_0080 :
                   return true;
                }
             }
             if (this.M.o0().z().size() > 1) {
                goto label_0080 ;
             }else if(p.j(this.M.o0())){
                return true;
             }
          }
       label_008e :
          if (this.M.s0() != null && this.M.s0().p() > 0) {
             return true;
          }
       }
    label_00a3 :
       return false;
    }
}
