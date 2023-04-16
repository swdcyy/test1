package com.yxcorp.gifshow.v3.editor.cover.importcover.album.ImportCoverAlbumActivity;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import com.yxcorp.gifshow.v3.editor.cover.importcover.album.ImportCoverAlbumActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import oa0.a;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import lnc.a1;
import u07.t$a;
import java.lang.CharSequence;
import u07.f;
import spc.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class ImportCoverAlbumActivity extends AlbumGifshowActivity	// class@000e70
{
    public HashMap O;
    public static final ImportCoverAlbumActivity$a P;

    static {
       ImportCoverAlbumActivity.P = new ImportCoverAlbumActivity$a(null);
    }
    public void ImportCoverAlbumActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ImportCoverAlbumActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onResume(){
       ImportCoverAlbumActivity importCoverA = ImportCoverAlbumActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, importCoverA, "1")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, importCoverA, "2") && !a.a.getBoolean("video_import_cover_album_tip_showed", false)) {
          t$a uoa = new t$a(this);
          uoa.W0(R.string.arg_RES_7f101649);
          uoa.z0(a1.p(R.string.arg_RES_7f101646)+"\n"+a1.p(R.string.arg_RES_7f101647));
          uoa.S0(R.string.arg_RES_7f101648);
          t$a uoa1 = f.e(uoa);
          uoa1.Y(new a());
       }
       return;
    }
    public int v3(){
       return 0x7f0d0629;
    }
}
