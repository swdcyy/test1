package com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment$kwaiTemplate$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment$userId$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import android.os.Bundle;
import dw6.b;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextPaint;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import ow9.a;
import java.util.Objects;
import java.lang.Math;
import iw9.a;
import java.util.List;
import pw9.b;
import java.lang.Runnable;
import android.widget.ImageView;
import hw9.a;
import hw9.a$a;
import q87.c;
import pw9.c;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import lw9.a;

public final class ItemPreviewFragment extends GrootBaseFragment	// class@00130e
{
    public TextView A;
    public TextView B;
    public VideoPlayerView C;
    public View D;
    public View E;
    public final p F;
    public final p G;
    public HashMap H;
    public TextView x;
    public TextView y;
    public TextView z;

    public void ItemPreviewFragment(){
       super();
       this.F = s.c(new ItemPreviewFragment$kwaiTemplate$2(this));
       this.G = s.c(new ItemPreviewFragment$userId$2(this));
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, ItemPreviewFragment.class, "9")) {
          return;
       }
       ItemPreviewFragment tC = this.C;
       if (tC != null) {
          tC.k();
       }
       return;
    }
    public void N2(){
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, ItemPreviewFragment.class, "10")) {
          return;
       }
       ItemPreviewFragment tC = this.C;
       if (tC != null) {
          tC.g();
       }
       return;
    }
    public void Q1(){
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, ItemPreviewFragment.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "show_index="+this.dh()+"&photo_id=";
       KwaiTemplate kwaiTemplate = this.mh();
       String id = (kwaiTemplate != null)? kwaiTemplate.getId(): objArray;
       obj = obj+id+"&author_id=";
       Object obj1 = PatchProxy.apply(objArray, this, ItemPreviewFragment.class, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.G.getValue();
       }
       return obj+obj1;
    }
    public boolean jh(){
       return true;
    }
    public boolean kh(){
       return false;
    }
    public final KwaiTemplate mh(){
       Object obj = PatchProxy.apply(null, this, ItemPreviewFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.F.getValue();
    }
    public final boolean nh(){
       boolean b = (this.m != null || this.l != null)? true: false;
       return b;
    }
    public String o(){
       return "FEATURED_DETAIL";
    }
    public void onActivityCreated(Bundle p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ItemPreviewFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!PatchProxy.applyVoid(null, this, ItemPreviewFragment.class, "7")) {
          b uob = this.ch();
          uob = (uob != null)? uob.c: -1;
          this.t = uob;
          GrootBaseFragment tk = this.k;
          if (tk == null || (uob == tk.getCurrentItem() && !PatchProxy.applyVoid(null, this, ItemPreviewFragment.class, "8"))) {
             this.I();
             this.a0();
          }
       }
    label_0041 :
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ItemPreviewFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (p1 instanceof KwaiGrootViewPager) {
          this.k = p1;
       }
       return a.i(p1, 0x7f0d0516);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ItemPreviewFragment.class, "13")) {
          return;
       }
       super.onDestroy();
       ItemPreviewFragment tC = this.C;
       if (tC != null) {
          tC.g();
       }
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, ItemPreviewFragment.class, "16")) {
       }else {
          ItemPreviewFragment tH = this.H;
          if (tH != null) {
             tH.clear();
          }
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ItemPreviewFragment.class, "12")) {
          return;
       }
       super.onPause();
       if (this.nh()) {
          ItemPreviewFragment tC = this.C;
          if (tC != null) {
             tC.d(false);
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ItemPreviewFragment.class, "11")) {
          return;
       }
       super.onResume();
       if (this.nh()) {
          ItemPreviewFragment tC = this.C;
          if (tC != null) {
             tC.k();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       TextPaint paint;
       a a;
       String str4;
       Object[] objArray1;
       String str = "4";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ItemPreviewFragment.class, str)) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.x = p0.findViewById(0x7f0a3d89);
       this.y = p0.findViewById(0x7f0a3d7b);
       this.z = p0.findViewById(0x7f0a3d9f);
       this.A = p0.findViewById(0x7f0a3d88);
       this.B = p0.findViewById(0x7f0a3d7d);
       this.C = p0.findViewById(0x7f0a31f1);
       this.D = p0.findViewById(0x7f0a3d7c);
       this.E = p0.findViewById(0x7f0a3a63);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ItemPreviewFragment.class, "5")) {
          KwaiTemplate kwaiTemplate = this.mh();
          if (kwaiTemplate != null) {
             a.o(kwaiTemplate, "kwaiTemplate ?: return");
             ItemPreviewFragment tx = this.x;
             if (tx != null) {
                tx.setText(kwaiTemplate.getName());
             }
             tx = this.x;
             boolean b = true;
             if (tx != null) {
                paint = tx.getPaint();
                if (paint != null) {
                   paint.setFakeBoldText(b);
                }
             }
             tx = this.y;
             if (tx != null) {
                tx.setText(kwaiTemplate.getDescription());
             }
             tx = this.z;
             String str1 = null;
             if (tx != null) {
                Long useCount = kwaiTemplate.getUseCount();
                long l = (useCount != null)? useCount.longValue(): str1;
                tx.setText(TextUtils.N(l)+this.getResources().getString(R.string.arg_RES_7f10186d));
             }
             tx = this.z;
             if (tx != null) {
                paint = tx.getPaint();
                if (paint != null) {
                   paint.setFakeBoldText(b);
                }
             }
             tx = this.A;
             if (tx != null) {
                StringBuilder str2 = "";
                Integer groupCount = kwaiTemplate.getGroupCount();
                int i = (groupCount != null)? groupCount.intValue(): 0;
                tx.setText(str2+i+this.getResources().getString(R.string.arg_RES_7f103fd6));
             }
             tx = this.A;
             if (tx != null) {
                paint = tx.getPaint();
                if (paint != null) {
                   paint.setFakeBoldText(b);
                }
             }
             tx = this.B;
             if (tx != null) {
                StringBuilder str3 = this.getResources().getString(0x7f10186a);
                a = a.a;
                Long duration = kwaiTemplate.getDuration();
                long l1 = (duration != null)? duration.longValue(): str1;
                Objects.requireNonNull(a);
                a uoa = a.class;
                if (PatchProxy.isSupport(uoa)) {
                   str4 = PatchProxy.applyOneRefs(Long.valueOf(l1), a, uoa, "2");
                   if (str4 != PatchProxyResult.class) {
                   }else if(l1 - str1 <= 0){
                      str4 = "00:00";
                   }else {
                      int i1 = (int)Math.rint((((double)l1 * 0x3ff0000000000000) / (double)1000));
                      int i2 = i1 % 60;
                      i1 = i1 / 60;
                      int i3 = i1 % 60;
                      i1 = (i1 / 60) % 60;
                      str1 = (i1 > 0)? a.a(i1)+':'+a.a(i3)+':'+a.a(i2): a.a(i3)+':'+a.a(i2);
                      str4 = str1;
                   }
                }else {
                   goto label_015f ;
                }
                tx.setText(str3+str4);
             }
             tx = this.B;
             if (tx != null) {
                paint = tx.getPaint();
                if (paint != null) {
                   paint.setFakeBoldText(b);
                }
             }
             tx = this.C;
             if (tx != null && !PatchProxy.applyVoidOneRefs(kwaiTemplate, tx, VideoPlayerView.class, "2")) {
                a.p(kwaiTemplate, "videoData");
                if ((kwaiTemplate.videoId()).length()) {
                   b = false;
                }
                if (b || (!kwaiTemplate.videoUrls().isEmpty() && !kwaiTemplate.coverUrls().isEmpty())) {
                   if (tx.f != null) {
                      String str5 = kwaiTemplate.videoId();
                      VideoPlayerView m = tx.m;
                      str1 = (m != null)? m.videoId(): objArray;
                      if (!a.g(str5, str1)) {
                      label_0228 :
                         tx.m = kwaiTemplate;
                         tx.g();
                         VideoPlayerView c = tx.c;
                         if (c != null) {
                            c.post(new b(tx, kwaiTemplate));
                         }
                         if (!PatchProxy.applyVoid(objArray, tx, VideoPlayerView.class, str)) {
                            objArray = new Object[0];
                            a.c.a().w("VideoPlayerView", "initSurface: ", objArray);
                            VideoPlayerView b1 = tx.b;
                            if (b1 != null) {
                               b1.setSurfaceTextureListener(new c(tx));
                            }
                         }
                      }
                   }else {
                      goto label_0228 ;
                   }
                }
             }
          label_025d :
             ItemPreviewFragment tD = this.D;
             if (tD != null) {
                tD.post(new a(this));
             }
          }
       }
       return;
    }
}
