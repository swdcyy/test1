package b90.c;
import java.lang.Object;
import android.content.Intent;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import nsd.u;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.EditAbilityConfig;
import com.kuaishou.android.post.EditAbilityConfig$a;
import com.kuaishou.android.post.PostPageArg;
import android.app.Activity;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import kotlin.jvm.internal.a;
import z80.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.System;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import z80.s;
import java.util.Objects;
import z80.c;
import k2b.u1;
import crd.b;
import brd.t;
import z80.u;
import erd.o;
import brd.w;
import z80.v;
import erd.a;
import z80.w;
import erd.g;
import z80.x;
import z80.y;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam$a;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import z36.d$a;
import g26.b;
import lnc.x6;
import lnc.y6;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import lnc.r5;
import b90.a;
import mm6.a;
import lq.i;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import b90.c$c;
import b90.c$a;
import android.view.View$OnClickListener;
import b90.c$b;
import android.content.DialogInterface$OnDismissListener;
import lq.l;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingActivity;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class c	// class@000aef
{
    public static long a;
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void a(Intent p0,Map p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "3")) {
          return;
       }
       int i = 1;
       PostArguments postArgument = new PostArguments(false, i, null);
       postArgument.parseFromMap(p1);
       if (p1 != null) {
          String str = p1.get("edit_only_preview");
          if (str != null && Boolean.parseBoolean(str) == i) {
             EditAbilityConfig$a uoa = new EditAbilityConfig$a();
             uoa.g(false);
             uoa.e("NO_EDITOR");
             uoa.d(false);
             uoa.f(false);
             uoa.c(false);
             postArgument.getEditAbilityConfig().set(new EditAbilityConfig(uoa));
          }
       }
       postArgument.write(p0);
       p0.putExtra("returnToOriginalPage", p2);
       return;
    }
    public final void b(Activity p0,MediaSceneConfig p1,MediaSceneLaunchParams p2){
       Object[] objArray1;
       b c;
       boolean requirePrevi;
       Boolean uBoolean;
       boolean requireAlbum;
       Boolean uBoolean1;
       String templateId;
       Intent intent;
       String str3;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "2")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "MediaSceneLoadingHelper";
       a.D().w(str1, "launch with config: "+p1+", launchParams: "+p2, objArray);
       if ((System.currentTimeMillis() - c.a) - (long)2000 < 0) {
          objArray1 = new Object[i];
          a.D().A(str1, "Launch media scene too frequently, 防暴击，不是问题", objArray1);
          return;
       }else {
          c.a = System.currentTimeMillis();
          if (p1 == null && p2 == null) {
             s.b("场景参数缺失！");
             return;
          }else {
             String str2 = "1";
             MediaSceneConfig mediaSceneCo = null;
             if (p2 != null && p2.mDirectPublish == true) {
                objArray1 = new Object[i];
                a.D().w(str1, "directPublish", objArray1);
                s d = s.d;
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoidOneRefs(p2, d, s.class, str2)) {
                   a.p(p2, "launchParams");
                   c.j.x(mediaSceneCo, u1.f(), p2);
                   c = s.c;
                   if (c != null) {
                      a.m(c);
                      if (!c.isDisposed()) {
                         objArray1 = new Object[i];
                         a.D().w("MediaScenePublishUtil", "directLoadAndPublishV2 task processing", objArray1);
                      }
                   }
                   t.concat(d.g().flatMap(u.b), s.c(d, i, true, true, mediaSceneCo)).doOnComplete(v.b).doOnError(w.b).takeLast(true).subscribe(x.b, y.b);
                }
                return;
             }else if(p1 != null){
                requirePrevi = p1.getRequirePreview();
             }else if(p2 != null){
                requirePrevi = p2.mRequirePreview;
             }else {
                uBoolean = mediaSceneCo;
             label_00ea :
                if (uBoolean != null) {
                   requirePrevi = uBoolean.booleanValue();
                   if (p1 != null) {
                      requireAlbum = p1.getRequireAlbum();
                   }else if(p2 != null){
                      requireAlbum = p2.mRequireAlbum;
                   }else {
                      uBoolean1 = mediaSceneCo;
                   label_0101 :
                      if (uBoolean1 != null) {
                         requireAlbum = uBoolean1.booleanValue();
                         if (requirePrevi) {
                            PatchProxyResult patchProxyRe = PatchProxyResult.class;
                            if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "7")) {
                               if (p1 != null) {
                                  templateId = p1.getTemplateId();
                                  if (templateId == null) {
                                  label_0126 :
                                     templateId = (p2 != null)? String.valueOf(p2.mTemplateId): mediaSceneCo;
                                  }
                               }else {
                                  goto label_0126 ;
                               }
                               if (templateId != null) {
                                  if (TextUtils.x(templateId)) {
                                     s.b("模板id缺失！");
                                  }else if(p1 != null){
                                     HashMap argsMap = p1.getArgsMap();
                                     if (argsMap != null) {
                                        mediaSceneCo = argsMap;
                                     }else if(p2 != null){
                                        mediaSceneCo = p2.mArgsMap;
                                     }
                                  }else {
                                     goto label_0149 ;
                                  }
                                  if (p2 != null) {
                                     i = p2.mReturnOriginPage;
                                  }
                                  KuaishanPageParam$a uoa = new KuaishanPageParam$a();
                                  uoa.i(templateId);
                                  if (PatchProxy.applyOneRefs(p2, uoa, KuaishanPageParam$a.class, "2") != patchProxyRe) {
                                  }else {
                                     uoa.i = p2;
                                  }
                                  if (PatchProxy.applyOneRefs(p1, uoa, KuaishanPageParam$a.class, str2) != patchProxyRe) {
                                  }else {
                                     uoa.h = p1;
                                  }
                                  uoa.g((i ^ 0x01));
                                  uoa.d(mediaSceneCo);
                                  c = y6.r(b.class);
                                  if (c != null) {
                                     Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                                     intent = c.v10(p0, uoa.f());
                                     if (intent != null) {
                                        a.o(intent, "get\(KuaiShanPostPlugin::\x20\x02r.build\(\)\n    \) ?: return\x00");
                                        intent.putExtra("discard_current_post_session", true);
                                        p0.startActivity(intent);
                                     }
                                  }
                               }
                            }
                         }else if(requireAlbum){
                            if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "5")) {
                               a.p(p0, str);
                               if (p1 != null) {
                                  str = p1.getTemplateId();
                                  if (str != null) {
                                     mediaSceneCo = str;
                                  }else if(p2 != null){
                                     str3 = String.valueOf(p2.mTemplateId);
                                  }
                               }else {
                                  goto label_01c2 ;
                               }
                               if (mediaSceneCo != null) {
                                  Intent intent1 = Intent.parseUri("kwai://ksalbum?flashTemplateId="+mediaSceneCo, true);
                                  str2 = r5.b().c(new a());
                                  str3 = "intent";
                                  if (p1 != null) {
                                     a.o(intent1, str3);
                                     this.a(intent1, p1.getArgsMap(), p1.getReturnOriginPage());
                                  }else if(p2 != null){
                                     a.o(intent1, str3);
                                     this.a(intent1, p2.mArgsMap, p2.mReturnOriginPage);
                                  }
                                  intent1.putExtra("INTENT_KEY_ALBUM_TASK_IMPL", str2);
                                  c.j.x(p1, u1.f(), p2);
                                  p0.startActivity(intent1);
                               }
                            }
                         }else {
                            this.d(p0, p1, p2);
                         }
                      }
                   }
                   uBoolean1 = Boolean.valueOf(requireAlbum);
                   goto label_0101 ;
                }
             label_0222 :
                return;
             }
             uBoolean = Boolean.valueOf(requirePrevi);
             goto label_00ea ;
          }
       }
    }
    public final void c(Activity p0,MediaSceneConfig p1,MediaSceneLaunchParams p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       ProgressFragment obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          boolean b1 = false;
          if (p0 instanceof a && p0.isFinishing()) {
             b = (!p0.getIntent().getBooleanExtra("backToKuaishan", b1))? true: false;
          }else {
             b = i.h();
          }
       }
       if (b && (p2 != null && p2.mSkipSessionEndWaiting == null)) {
          obj = new ProgressFragment();
          c$c uoc = new c$c(obj, p0, p1, p2);
          obj.vh(R.string.cancel).xh(new c$a(obj)).k0(new c$b(uoc));
          i.m().f(uoc);
          obj.show(p0.getSupportFragmentManager(), "MediaScenePreLoading");
       }else {
          this.b(p0, p1, p2);
       }
       return;
    }
    public final void d(Activity p0,MediaSceneConfig p1,MediaSceneLaunchParams p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       Intent intent = new Intent(p0, MediaSceneLoadingActivity.class);
       SerializableHook.putExtra(intent, "KEY_MEDIA_SCENE_CONFIG", p1);
       SerializableHook.putExtra(intent, "KEY_MEDIA_SCENE_LAUNCH_PARAMS", p2);
       intent.putExtra("photo_task_id", u1.f());
       if (p1 != null) {
          this.a(intent, p1.getArgsMap(), p1.getReturnOriginPage());
       }else if(p2 != null){
          this.a(intent, p2.mArgsMap, p2.mReturnOriginPage);
       }
       p0.startActivity(intent);
       return;
    }
}
