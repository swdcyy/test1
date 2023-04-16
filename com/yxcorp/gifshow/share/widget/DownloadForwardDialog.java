package com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.share.module.SimilarPhotoResponse;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.android.model.mix.w;
import n80.b;
import java.lang.Throwable;
import q87.c;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import djc.o;
import android.view.View$OnClickListener;
import djc.p;
import djc.q;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.app.Dialog;
import com.yxcorp.gifshow.share.widget.l;
import lnc.c3$a;
import lnc.c3;
import djc.n;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import android.view.ViewStub;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog;
import com.yxcorp.gifshow.activity.GifshowActivity;
import djc.r;
import msd.a;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import djc.e0;

public class DownloadForwardDialog extends BaseDialogFragment implements d	// class@001cb4
{
    public SimilarPhotoResponse A;
    public BaseFeed B;
    public TextView p;
    public View q;
    public TextView r;
    public View s;
    public TextView t;
    public KwaiImageView u;
    public int v;
    public boolean w;
    public User x;
    public e0 y;
    public boolean z;
    public static final int C;

    public void DownloadForwardDialog(){
       super();
       this.z = false;
    }
    public static DownloadForwardDialog uh(User p0,int p1,boolean p2,SimilarPhotoResponse p3,BaseFeed p4){
       DownloadForwardDialog obj;
       if (PatchProxy.isSupport(DownloadForwardDialog.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,p4};
          obj = PatchProxy.apply(objArray, null, DownloadForwardDialog.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new DownloadForwardDialog();
       obj.lh("USER", p0);
       obj.kh("DOWNLOAD_SHARE_TYPE", p1);
       obj.mh("SHOW_PROFILE", p2);
       obj.lh("KEY_SIMILAR_PHOTOS", p3);
       obj.lh("KEY_PHOTO", p4);
       return obj;
    }
    public static boolean wh(boolean p0,User p1){
       p0 = (p0 && p1 != null)? true: false;
       return p0;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, DownloadForwardDialog.class, "9")) {
          return;
       }
       DownloadForwardDialog tB = this.B;
       if (tB != null) {
          w.y1(tB, false);
       }
       super.dismiss();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadForwardDialog.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a4343);
       this.p = m1.f(p0, 0x7f0a3e0b);
       this.u = m1.f(p0, 0x7f0a13ac);
       this.s = m1.f(p0, 0x7f0a1791);
       this.q = m1.f(p0, 0x7f0a433c);
       this.t = m1.f(p0, 0x7f0a3e0d);
       m1.a(p0, new o(this), R.id.close_btn);
       m1.a(p0, new p(this), R.id.lin_download_more);
       m1.a(p0, new q(this), R.id.upload);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadForwardDialog.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(1, R.style.arg_RES_7f110362);
       if (this.getArguments() != null) {
          try{
             this.x = SerializableHook.getSerializable(this.getArguments(), "USER");
          }catch(java.lang.Exception e0){
             this.x = null;
          }
          this.v = this.getArguments().getInt("DOWNLOAD_SHARE_TYPE");
          this.w = DownloadForwardDialog.wh(this.getArguments().getBoolean("SHOW_PROFILE"), this.x);
          this.A = this.Zg("KEY_SIMILAR_PHOTOS");
          this.B = this.Zg("KEY_PHOTO");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DownloadForwardDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0316, p1, false);
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, DownloadForwardDialog.class, "7")) {
          return;
       }
       super.onStart();
       c3.c(this.getDialog(), l.a);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadForwardDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       boolean b = true;
       this.getDialog().setCanceledOnTouchOutside(b);
       this.k0(new n(this));
       this.doBindView(p0);
       DownloadForwardDialog tv = this.v;
       if (!PatchProxy.isSupport(DownloadForwardDialog.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tv), this, DownloadForwardDialog.class, "12")) {
          GuideShareMoreDialog$a uoa = 0x7f0802e2;
          if (tv != -1) {
             int i = 0x7f0801c8;
             DownloadForwardDialog uDownloadFor = 0x7f101292;
             if (tv != 5) {
                if (tv != b) {
                   if (tv != 2) {
                      if (tv == 3) {
                         this.th(R.string.arg_RES_7f100ab8, uDownloadFor, R.drawable.arg_RES_7f0802dc, i);
                      }
                   }
                }else {
                   this.th(R.string.arg_RES_7f100aaf, 0x7f1047be, uoa, R.drawable.arg_RES_7f0802bd);
                }
             }else {
                this.th(R.string.arg_RES_7f100aba, uDownloadFor, 0, i);
             }
          }
          this.th(R.string.arg_RES_7f100ab1, 0x7f100824, uoa, R.drawable.arg_RES_7f0801a7);
       }
       if (this.A != null && this.getActivity() != null) {
          if (!PatchProxy.applyVoidOneRefs("DOWNLOAD_AND_SHARE_POPUP", this, DownloadForwardDialog.class, "6")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
             showEvent.areaPackage = uAreaPackage;
             uAreaPackage.name = "DOWNLOAD_AND_SHARE_POPUP";
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             showEvent.elementPackage = uElementPack;
             uElementPack.action2 = "AREA";
             u1.g0(showEvent);
          }
          this.p.setText(R.string.arg_RES_7f100aaf);
          ViewStub viewStub = p0.findViewById(R.id.guid_share_more_list);
          if (viewStub != null) {
             viewStub.inflate();
          }
          GuideShareMoreDialog.f.b(p0, this.A, this.getActivity(), "DOWNLOAD_AND_SHARE_POPUP", new r(this));
       }
       return;
    }
    public final void th(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DownloadForwardDialog.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DownloadForwardDialog.class, "13")) {
          return;
       }
       this.p.setText(p0);
       this.r.setText(p1);
       p1 = 0;
       this.r.setCompoundDrawablesWithIntrinsicBounds(p2, p1, p1, p1);
       this.q.setBackgroundResource(p3);
       DownloadForwardDialog ts = this.s;
       if (this.w == null) {
          p1 = 8;
       }
       ts.setVisibility(p1);
       if (this.x != null && !this.t.getVisibility()) {
          this.u.U(this.x.mAvatars);
          ts = this.t;
          p1 = (this.x.isFemale())? 0x7f100ab6: 0x7f100ab7;
          ts.setText(p1);
          ts = this.y;
          if (ts != null) {
             ts.d();
          }
       }
    label_0075 :
       return;
    }
    public DownloadForwardDialog vh(e0 p0){
       this.y = p0;
       return this;
    }
}
