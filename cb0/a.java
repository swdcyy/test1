package cb0.a;
import ei0.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.gifshow.smartalbum.utils.TextBubbleImageView;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import cb0.a$a;
import android.view.View$OnClickListener;
import cb0.a$b;
import androidx.lifecycle.MutableLiveData;
import cb0.a$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import cb0.a$d;
import cb0.a$e;
import com.kwai.robust.PatchProxy;
import ra0.b;
import java.lang.StringBuilder;
import q87.c;
import android.animation.ValueAnimator;
import fb0.e;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import java.lang.Integer;
import q16.a$a;
import android.app.Activity;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import lnc.r5;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.gifshow.smartalbum.model.SmartAlbumUiItem;
import qr4.i;
import qr4.m$k0;
import qr4.m$r;
import android.util.Pair;
import com.kuaishou.gifshow.smartalbum.logic.network.SALocationCity;
import com.yxcorp.gifshow.model.EditorSplashImageInfo;
import java.io.Serializable;
import lnc.a1;
import com.kuaishou.edit.draft.Workspace$From;
import java.lang.Long;
import tkd.b;
import tkd.d;
import r16.a;
import q16.a;
import android.content.Context;
import android.content.Intent;
import r16.d;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.util.h0;
import com.yxcorp.gifshow.v3.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.SmartAlbum$b;
import com.kuaishou.edit.draft.SmartAlbum;
import com.kuaishou.edit.draft.FeatureId;
import huc.d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$b;
import qaa.a;
import haa.a;
import com.kuaishou.edit.draft.Cover$b;
import uxb.u;
import uxb.l;
import hba.a;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.Cover$Type;

public final class a extends a	// class@0002fd
{
    public final KwaiImageView c;
    public final TextView d;
    public final View e;
    public final View f;
    public final TextBubbleImageView g;
    public final KwaiPlayerFailedStateView h;
    public final SmartAlbumLoadingViewModel i;
    public Bitmap j;
    public boolean k;
    public ValueAnimator l;
    public final GifshowActivity m;

    public void a(GifshowActivity p0,View p1){
       a.p(p0, "mActivity");
       a.p(p1, "mRootView");
       super(p1);
       this.m = p0;
       View view = p1.findViewById(R.id.album_cover);
       a.o(view, "mRootView.findViewById\(R.id.album_cover\)");
       this.c = view;
       view = p1.findViewById(R.id.loading_progress_tv);
       a.o(view, "mRootView.findViewById\(R.id.loading_progress_tv\)");
       this.d = view;
       view = p1.findViewById(R.id.progress);
       a.o(view, "mRootView.findViewById\(R.id.progress\)");
       this.e = view;
       view = p1.findViewById(R.id.back_btn);
       a.o(view, "mRootView.findViewById\(R.id.back_btn\)");
       this.f = view;
       View view1 = p1.findViewById(R.id.cover_image_with_title_iv);
       a.o(view1, "mRootView.findViewById\(R¡­over_image_with_title_iv\)");
       this.g = view1;
       p1 = p1.findViewById(R.id.empty_view);
       a.o(p1, "mRootView.findViewById\(R.id.empty_view\)");
       this.h = p1;
       ViewModel viewModel = ViewModelProviders.of(p0).get(SmartAlbumLoadingViewModel.class);
       a.o(viewModel, "ViewModelProviders.of\(mA¡­ingViewModel::class.java\)");
       this.i = viewModel;
       view.setOnClickListener(new a$a(this));
       p1.f(new a$b(this));
       viewModel.s0().observe(p0, new a$c(this));
       viewModel.r0().observe(p0, new a$d(this));
       viewModel.q0().observe(p0, new a$e(this));
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.k != null) {
          this.F();
       }
       Object[] objArray = new Object[0];
       b.D().s("SmartAlbumLoadingVB", "onResume: x....mShouldStartEditorActivity:"+this.k, objArray);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       a tl = this.l;
       if (tl != null) {
          a.m(tl);
          if (tl.isRunning()) {
             tl = this.l;
             a.m(tl);
             tl.cancel();
          }
       }
       this.k = false;
       return;
    }
    public final void D(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          return;
       }
       if (this.j == null) {
          View view = this.A();
          float f = 0x3f800000;
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe)) {
             Canvas obj = PatchProxy.applyTwoRefs(view, Float.valueOf(f), objArray, uoe, "12");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else {
             label_0032 :
                int width = view.getWidth();
                int height = view.getHeight();
                if (width && height) {
                   objArray = Bitmap.createBitmap((int)((float)width * f), (int)((float)height * f), Bitmap$Config.ARGB_4444);
                   obj = new Canvas(objArray);
                   obj.scale(f, f);
                   obj.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                   view.draw(obj);
                }
             }
          }else {
             goto label_0032 ;
          }
          this.j = objArray;
       }
       return;
    }
    public final void E(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.e.setVisibility(p0);
       this.d.setVisibility(p0);
       return;
    }
    public final void F(){
       boolean b;
       a uoa4;
       String str4;
       String str5;
       String str6;
       VideoContext videoContext1;
       Object obj = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoa, "7")) {
          return;
       }
       a i = obj.i;
       SmartAlbumLoadingViewModel f = i.f;
       if (f != null) {
          SmartAlbumLoadingViewModel g = i.g;
          SmartAlbumLoadingViewModel smartAlbumLo = SmartAlbumLoadingViewModel.class;
          a$a uoa1 = a$a.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          String str = "8";
          if (!PatchProxy.applyVoidTwoRefs(f, g, obj, uoa, str)) {
             int i1 = 0;
             Object[] objArray1 = new Object[i1];
             String str1 = "SmartAlbumLoadingVB";
             b.D().s(str1, "startEditorActivity: ....", objArray1);
             if (obj.m.isFinishing()) {
                objArray = new Object[i1];
                b.D().s(str1, "isFinishing, startEditorActivity return", objArray);
             }else {
                b = true;
                if (!obj.m.b3()) {
                   obj.k = b;
                }else {
                   this.D();
                   obj.i.o0("success", f);
                   a$a uoa2 = new a$a();
                   String str2 = r5.b().c(f);
                   a$a uoa3 = uoa2.a0("album_movie");
                   a i2 = obj.i;
                   Objects.requireNonNull(i2);
                   String str3 = "9";
                   VideoContext videoContext = PatchProxy.apply(objArray, i2, smartAlbumLo, str3);
                   SmartAlbumLoadingViewModel smartAlbumLo1 = g;
                   if (videoContext != patchProxyRe) {
                      uoa4 = uoa;
                      str4 = str;
                      str5 = str3;
                      str6 = str1;
                   }else {
                      c uoc = i2.p0();
                      if (uoc != null) {
                         videoContext = uoc.d1();
                         if (videoContext != null) {
                         label_00a0 :
                            a.o(videoContext, "getAICutWorkSpaceDraft\(\)\x20\x02Context ?: VideoContext\(\)\x00");
                            SmartAlbumLoadingViewModel f2 = i2.f;
                            SmartAlbumUiItem value1 = i2.b.getValue();
                            if (!PatchProxy.applyVoidFourRefs(i2.p0(), videoContext, f2, value1, null, e.class, "27") && (f2 == null || value1 == null)) {
                               uoa4 = uoa;
                               str4 = str;
                               str5 = str3;
                               videoContext1 = videoContext;
                               str6 = str1;
                            }else {
                               i oi = videoContext.F();
                               str6 = str1;
                               str4 = str;
                               oi.b.K = true;
                               m$r or = new m$r();
                               or.a = value1.getTitle();
                               or.b = value1.getSubTitle();
                               Pair pair = e.k(f2);
                               or.d = pair.first.intValue();
                               or.c = pair.second.intValue();
                               or.h = value1.getClusterMethod();
                               or.e = value1.getBeginDate();
                               or.f = value1.getEndDate();
                               or.j = String.valueOf(value1.getId());
                               SALocationCity city = value1.getCity();
                               str5 = str3;
                               uoa4 = uoa;
                               or.g = city.mNation+"_"+city.mProvince+"_"+city.mCity;
                               oi.b.L = or;
                               videoContext1 = videoContext;
                               videoContext.D0(value1.getTitle()).G0(0).E0(value1.getSubTitle()).F0(value1.getTitle(), value1.getTextId(), true, 50.00f, 50.00f, 0, 0x3f800000, value1.getSubTitle(), "", "", "");
                            }
                            videoContext = videoContext1;
                         }
                      }
                      videoContext = new VideoContext();
                      goto label_00a0 ;
                   }
                   a$a uoa5 = uoa3.h0(videoContext.m()).f0(obj.i.t0()).b0(EditorSplashImageInfo.generateEditorSplashImageInfoWithBitmap(obj.m, obj.j, 1)).R(Integer.valueOf(R.anim.arg_RES_7f010106));
                   String str7 = (smartAlbumLo1 == null)? a1.p(R.string.arg_RES_7f10489a): "";
                   Objects.requireNonNull(uoa5);
                   c obj1 = PatchProxy.applyOneRefs(str7, uoa5, uoa1, "74");
                   uoa5 = (obj1 != patchProxyRe)? obj1: str7;
                   Objects.requireNonNull(uoa5);
                   a obj2 = PatchProxy.applyOneRefs(str2, uoa5, uoa1, "75");
                   uoa5 = (obj2 != patchProxyRe)? obj2: str2;
                   obj2 = obj.i;
                   Objects.requireNonNull(obj2);
                   g = PatchProxy.apply(null, obj2, smartAlbumLo, "3");
                   if (g != patchProxyRe) {
                   }else {
                      g = obj2.e;
                      if (g == null) {
                         a.S("mPageFrom");
                      }
                   }
                   boolean number = g.getNumber();
                   Objects.requireNonNull(uoa5);
                   if (PatchProxy.isSupport(uoa1)) {
                      obj1 = PatchProxy.applyOneRefs(Integer.valueOf(number), uoa5, uoa1, "32");
                      if (obj1 != patchProxyRe) {
                         uoa5 = obj1;
                      label_0223 :
                         SmartAlbumUiItem value = obj.i.s0().getValue();
                         Long longx = (value != null)? Long.valueOf(value.getId()): null;
                         str7 = String.valueOf(longx);
                         Objects.requireNonNull(uoa5);
                         if (PatchProxy.applyOneRefs(str7, uoa5, uoa1, "76") != patchProxyRe) {
                         }else {
                            uoa5.k = str7;
                         }
                         Intent intent = d.a(0x14d6f666).NX(obj.m, uoa2.f());
                         h0.a(intent, f, smartAlbumLo1);
                         a.o(intent, "intent");
                         if (!PatchProxy.applyVoidOneRefs(intent, obj, uoa4, str5)) {
                            value = obj.i.s0().getValue();
                            if (value != null) {
                               a.o(value, "it");
                               intent.putExtra("SMART_ALBUM_COVER_TITLE", value.getTitle());
                               intent.putExtra("SMART_ALBUM_COVER_SUB_TITLE", value.getSubTitle());
                               intent.putExtra("SMART_ALBUM_COVER_TEXT_ID_RES_NAME", value.getTextId());
                               i = obj.i;
                               str1 = value.getTitle();
                               a.o(str1, "it.title");
                               str2 = value.getSubTitle();
                               a.o(str2, "it.subTitle");
                               str7 = value.getTextId();
                               a.o(str7, "it.textId");
                               Objects.requireNonNull(i);
                               if (!PatchProxy.applyVoidThreeRefs(str1, str2, str7, i, SmartAlbumLoadingViewModel.class, "10")) {
                                  a.p(str1, "text");
                                  a.p(str2, "subTitle");
                                  a.p(str7, "textId");
                                  obj1 = i.p0();
                                  if (obj1 != null) {
                                     float f1 = 0x3f800000;
                                     f uof = f.class;
                                     if (PatchProxy.isSupport(uof)) {
                                        Object[] objArray2 = new Object[]{obj1,str1,str2,str7,Float.valueOf(f1)};
                                        if (!PatchProxy.applyVoid(objArray2, null, uof, str4)) {
                                        }
                                     }else if(TextUtils.x(str1) && TextUtils.x(str2)){
                                        SmartAlbum$b uob = SmartAlbum.newBuilder();
                                        uob.a(d.e(str7));
                                        uob.b(str2);
                                        obj1.k().p(uob);
                                        i = a.f(obj1);
                                        i.c0();
                                        GeneratedMessageLite$Builder uBuilder = i.k();
                                        l.n().fF(i.f0(), str1, str2, str7, 0x3f800000);
                                        VideoCoverParam$b uob1 = uBuilder.getVideoCoverParam().toBuilder();
                                        uob1.a(0);
                                        uBuilder.i(uob1);
                                        uBuilder.h(Cover$Type.VIDEO);
                                        number = false;
                                        i.g(number);
                                     label_0376 :
                                        obj.m.startActivityForResult(intent, 101);
                                        obj.m.overridePendingTransition(number, number);
                                        objArray = new Object[number];
                                        b.D().w(str6, "project origin:"+f, objArray);
                                     }
                                  }
                               }
                            }
                         }
                         number = 0;
                         goto label_0376 ;
                      }
                   }
                   uoa5.p = number;
                   goto label_0223 ;
                }
             }
          }
       }
       return;
    }
    public final void G(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       char c = '%';
       if (p0 < 80) {
          this.d.setText(a1.r(R.string.arg_RES_7f101235, p0+c));
       }else {
          this.d.setText(a1.r(R.string.arg_RES_7f104890, p0+c));
       }
       if (p0 == 100) {
          this.D();
       }
       return;
    }
}
