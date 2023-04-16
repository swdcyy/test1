package com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$c;
import w69.k0;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import w69.i;
import h69.b;
import java.lang.Object;
import w69.j0;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import jlb.b;
import android.app.Activity;
import u07.t$a;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import sb9.r0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import brd.t;
import dc7.e;
import dc7.d;
import com.yxcorp.gifshow.models.QMedia;
import r79.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import w69.b;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.post.api.aicut.AICutProjectOption;
import com.kuaishou.android.model.music.MusicType;
import java.util.Objects;
import android.view.View;
import w46.b;
import android.widget.ImageView;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$c$a;
import com.yxcorp.gifshow.album.selected.interact.a;
import m79.d;
import m79.e;
import lnc.a1;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$c$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.m;
import sb9.b0;
import tkd.b;
import tkd.d;

public class AlbumActivityV2$c implements k0	// class@001ca1
{
    public final i a;
    public final b b;
    public final boolean c;
    public final AlbumActivityV2 d;

    public void AlbumActivityV2$c(AlbumActivityV2 p0,i p1,b p2,boolean p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public boolean a(){
       return j0.c(this);
    }
    public void b(List p0,boolean p1,String p2,String p3,String p4){
       AlbumActivityV2$c uoc = AlbumActivityV2$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             return;
          }
       }
       this.d.M3(p0, p1, p2, p3, p4, false);
       return;
    }
    public void c(){
    }
    public void d(boolean p0){
       AlbumActivityV2$c uoc = AlbumActivityV2$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (PostExperimentUtils.C0()) {
          p0.o1 = (p0)? "true": "false";
       }
    label_002a :
       return;
    }
    public void e(b p0){
       j0.a(this, p0);
    }
    public void f(List p0,Activity p1){
       j0.j(this, p0, p1);
    }
    public void g(boolean p0){
       t$a uoa;
       AlbumActivityV2$c uoc = AlbumActivityV2$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "6")) {
          return;
       }
       int i = 0x7f104050;
       if (!p0) {
          uoa = new t$a(this.d);
          uoa.y0(R.string.arg_RES_7f10404e);
          uoa.S0(i);
          f.e(uoa).Y(PopupInterface.a);
       }else if(this.c != null){
          uoa = new t$a(this.d);
          uoa.y0(R.string.arg_RES_7f10404f);
          uoa.S0(i);
          f.e(uoa).Y(PopupInterface.a);
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("publish_reedit_atlas_tip_shown", true);
          g.a(uEditor);
          if (!PatchProxy.applyVoid(null, null, r0.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHOW_FIRST_MODIFY_WINDOW";
             u1.u0(10, uElementPack, new ClientContent$ContentPackage());
          }
       }
       return;
    }
    public void h(t p0){
       d.a(this, p0);
    }
    public void i(QMedia p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumActivityV2$c.class, "3")) {
          return;
       }
       AlbumActivityV2$c td = this.d;
       if (td.k1 == null) {
          return;
       }
       int i = 1;
       int i1 = 0;
       if (td.n1 != null) {
          c[] uocArray = new c[i];
          uocArray[i1] = p0;
          ArrayList uArrayList = Lists.e(uocArray);
          String str = this.a.a().e();
          String str1 = this.a.a().a();
          if (str1 == null) {
             str1 = "";
          }
          String str2 = str1;
          Object[] objArray = new Object[i1];
          a.D().w("AlbumActivityV2", "only image="+p0.isImage()+", taskId="+p1+", tag="+str+", activityId="+str2, objArray);
          this.d.O.Yc();
          this.b(uArrayList, p0.isImage(), p1, str, str2);
          p1.p1 = p0;
       }else {
          Intent intent = new Intent();
          QMedia[] qMediaArray = new QMedia[i];
          qMediaArray[i1] = p0;
          SerializableHook.putExtra(intent, "album_data_list", Lists.e(qMediaArray));
          this.d.setResult(-1, intent);
          this.d.finish();
       }
       return;
    }
    public void j(){
       j0.e(this);
    }
    public void k(){
       AlbumActivityV2$c td2;
       AlbumActivityV2 uAlbumActivi = AlbumActivityV2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumActivityV2$c.class, "4")) {
          return;
       }
       if (this.d.L3()) {
          AlbumActivityV2$c td = this.d;
          AlbumActivityV2 p = td.P;
          AlbumActivityV2 x = td.X;
          AlbumActivityV2 y = td.Y;
          AlbumActivityV2 z = td.Z;
          int i = 0;
          int i1 = (z == null)? 0: z.getValue();
          AICutProjectOption uAICutProjec = new AICutProjectOption(p, x, y, i1);
          td = this.d;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoid(objArray, td, uAlbumActivi, "5") && td.V0 != null) {
             View view = td.O.B3().findViewById(R.id.next_step);
             String str = "AlbumActivityV2";
             if (view == null) {
                Object[] objArray1 = new Object[i];
                a.D().t(str, "removeNextStepButtonIfNeed: cant find next view", objArray1);
             }else {
                Object[] objArray2 = new Object[i];
                a.D().w(str, "removeNextStepButtonIfNeed: remove next Step view", objArray2);
                view.setVisibility(8);
             }
          }
          td = this.d;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoid(objArray, td, uAlbumActivi, "7") && td.Y0 != null) {
             ImageView imageView = td.findViewById(R.id.left_btn);
             if (imageView != null) {
                imageView.setImageDrawable(td.getResources().getDrawable(td.Y0));
             }
          }
          AlbumActivityV2$c td1 = this.d;
          boolean b = (td1.k1 != null && td1.n1 != null)? true: false;
          this.b.Pu(td1, td1.O, uAICutProjec, false, td1.h1, b, td1.o1, td1.U0);
          this.d.S3();
          td2 = this.d;
          td2.V = new AlbumActivityV2$c$a(this, uAICutProjec);
          if (td2.O.m8() != null) {
             this.d.O.m8().G(this.d.V);
          }
       }
       if ((a1.p(0x7f100b70)).equals(this.d.a1) && this.d.O.m8() != null) {
          this.d.O.m8().G(new AlbumActivityV2$c$b(this));
       }
       td2 = this.d;
       if (td2.j1 != null) {
          m.c(td2, td2.O);
       }
       return;
    }
    public void l(boolean p0,boolean p1){
       AlbumActivityV2$c uoc = AlbumActivityV2$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "7")) {
          return;
       }
       if (b0.f()) {
          uoc = this.d;
          if (uoc.U0 != null) {
             this.b.ki(p0, p1, uoc.O);
          }
       }
       return;
    }
    public void m(boolean p0){
       AlbumActivityV2$c uoc = AlbumActivityV2$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       int i = (p0)? 5: 6;
       a.z1(i);
       AlbumActivityV2$c td = this.d;
       td.k1 = p0;
       td.l1 = true;
       Objects.requireNonNull(td);
       AlbumActivityV2 uAlbumActivi = AlbumActivityV2.class;
       if (!PatchProxy.isSupport(uAlbumActivi) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), td, uAlbumActivi, "8") && td.L3())) {
          uAlbumActivi = td.P;
          AlbumActivityV2 x = td.X;
          AlbumActivityV2 y = td.Y;
          AlbumActivityV2 z = td.Z;
          int i1 = (z == null)? 0: z.getValue();
          d.a(-873393519).Pu(td, td.O, new AICutProjectOption(uAlbumActivi, x, y, i1), false, false, p0, td.o1, td.U0);
       }
       return;
    }
}
