package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicPreviewViewBinder$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicPreviewViewBinder;
import j79.l0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import androidx.fragment.app.FragmentActivity;
import k2b.e0;
import com.google.gson.JsonObject;
import lsc.g0;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import r79.c;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.e;
import o79.i;
import lsc.m;
import im8.f;
import java.lang.CharSequence;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lsc.u;
import brd.t;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.g;
import erd.g;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.a;
import crd.b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class ImportMusicPreviewViewBinder$a extends m	// class@0010ec
{
    public final l0 c;
    public final ImportMusicPreviewViewBinder d;

    public void ImportMusicPreviewViewBinder$a(ImportMusicPreviewViewBinder p0,l0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       Object[] objArray;
       boolean b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ImportMusicPreviewViewBinder$a.class, str)) {
          return;
       }
       JsonObject jsonObject = null;
       g0.f(this.d.n().getActivity(), "EXTRACT_PHOTO_MUSIC", jsonObject);
       if (this.c != null && this.d.n().getActivity() != null) {
          c media = this.c.t0().getMedia();
          if (e.c(media)) {
             objArray = new Object[]{m.a.get()};
             i.d(R.style.arg_RES_7f11066a, String.format(i.p(R.string.arg_RES_7f10165c), objArray));
          }else {
             Object obj = PatchProxy.applyOneRefs(media, jsonObject, e.class, "4");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(media != null && media.getDuration() - 1000 <= 0){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                objArray = new Object[]{str};
                i.d(R.style.arg_RES_7f11066a, String.format(i.p(R.string.arg_RES_7f10165d), objArray));
             }else {
                g.a(media.getPath(), u.a()).subscribe(e.b(this.d.n().getActivity()), a.b);
             }
          }
       }else {
          PostUtils.D("ImportMusicPreviewVB", "onInterceptUserEventAlbum", new RuntimeException("onInterceptUserEventAlbum error viewModel or activity is null"));
       }
       return;
    }
}
