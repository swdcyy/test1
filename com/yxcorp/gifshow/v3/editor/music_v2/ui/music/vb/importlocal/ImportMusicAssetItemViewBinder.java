package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumAssetItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.utility.Log;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import o79.i;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;

public class ImportMusicAssetItemViewBinder extends DefaultAlbumAssetItemViewBinder	// class@0010ea
{

    public void ImportMusicAssetItemViewBinder(Fragment p0,int p1){
       super(p0, p1);
       Log.g("ImportMusicAssetItemVB", "ImportMusicAssetItemViewBinder fragment:"+p0+" viewType:"+p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImportMusicAssetItemViewBinder.class, "1")) {
          return;
       }
       super.e(p0);
       SizeAdjustableTextView sizeAdjustab = this.n();
       if (sizeAdjustab != null) {
          sizeAdjustab.setTextColor(0);
          sizeAdjustab.setBackground(i.e(R.drawable.arg_RES_7f080189));
       }else {
          i1.b("ImportMusicAssetItemVB", new RuntimeException("bindView error: numView null"));
       }
       return;
    }
}
