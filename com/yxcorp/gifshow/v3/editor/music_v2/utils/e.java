package com.yxcorp.gifshow.v3.editor.music_v2.utils.e;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import o79.i;
import androidx.fragment.app.FragmentActivity;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import java.lang.CharSequence;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.b;
import r79.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.google.gson.JsonObject;
import k2b.e0;
import lsc.g0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import om6.j;
import android.content.Intent;
import om6.k;
import e16.a$a;
import w69.i;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption$a;
import w69.b;
import w69.b$a;
import w69.b$b;
import w69.k$a;
import w69.d$a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicAlbumBottomFragment;
import w69.e0;
import w69.d;
import w69.f;
import w69.f$a;
import w69.f$b;
import o79.a;
import ga9.c;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicPreviewViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicPreviewItemViewBinder;
import w69.i$a;
import w69.i$b;
import w69.k;
import e16.a;
import x79.d;

public class e	// class@001129
{

    public void e(){
       super();
    }
    public static int a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)(n.k(p0) - (i.d(16.00f) * 2)) * 0x3f333333);
    }
    public static g b(FragmentActivity p0){
       ProgressFragment obj = PatchProxy.applyOneRefs(p0, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProgressFragment();
       obj.setCancelable(false);
       obj.wh(i.p(R.string.cancel));
       obj.Jh(i.p(R.string.arg_RES_7f101658));
       obj.Eh(false, 100);
       return new b(p0, obj);
    }
    public static boolean c(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.getDuration() - (long)(PostExperimentUtils.l0() * 1000) >= 0) {
          b = true;
       }
       return b;
    }
    public static void d(boolean p0,FragmentActivity p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uoe, "6")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       String str = (p0)? "SUCCESS": "FAIL";
       jsonObject.c0("extract_result", str);
       int i = p1;
       String str1 = "EXTRACT_PHOTO_MUSIC_RESULT";
       if (!PatchProxy.applyVoidThreeRefs(i, str1, jsonObject, null, g0.class, "39")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = str1;
          uElementPack.params = jsonObject.toString();
          u1.D0("", i, 4, uElementPack, null, null);
       }
       return;
    }
    public static void e(GifshowActivity p0){
       e uoe = e.class;
       b$a obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoe, "1")) {
          return;
       }
       Intent intent = d.a(0x2538349d).nt(p0);
       a$a uoa = new a$a();
       i oi = PatchProxy.apply(obj, obj, uoe, "2");
       if (oi != PatchProxyResult.class) {
       }else {
          Log.g("MusicAlbumUtils", "buildOptions");
          obj = b.g.a();
          obj.c(true);
          k$a uoa1 = new k$a();
          uoa1.n = true;
          uoa1.o(false);
          uoa1.E = 1;
          uoa1.g(false);
          uoa1.d(2);
          uoa1 = uoa1.r(false);
          uoa1.m(true);
          uoa1.q(false);
          uoa1.K = false;
          d$a uoa2 = new d$a();
          uoa2.a(new ImportMusicAlbumBottomFragment());
          f$a uoa3 = f.w.a();
          uoa3.g(a.d);
          uoa3.c(false);
          oi = i.h.a().f(AlbumLimitOption.H.a().d()).a(obj.a()).c(uoa2.c()).m(uoa1.b()).n(new c().e(AbsAlbumAssetItemViewBinder.class, ImportMusicAssetItemViewBinder.class).e(AbsPreviewFragmentViewBinder.class, ImportMusicPreviewViewBinder.class).e(AbsPreviewItemViewBinder.class, ImportMusicPreviewItemViewBinder.class)).d(uoa3.a()).b();
       }
       d.a(intent, uoa.g(oi).f());
       intent.putExtra("ALBUM_BIZ_CODE", "post_edit_music_import_voice");
       intent.putExtra("ALBUM_BOTTOM_BAR_SHOW_HIDE_WHEN_ALBUM_LIST_SHOW_HIDE", true);
       p0.startActivityForResult(intent, 1004);
       return;
    }
}
