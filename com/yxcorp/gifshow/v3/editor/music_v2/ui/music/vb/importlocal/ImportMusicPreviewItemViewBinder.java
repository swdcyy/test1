package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicPreviewItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.utility.Log;
import j79.l0;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.ViewGroup;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import lnc.i1;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import o79.i;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;

public class ImportMusicPreviewItemViewBinder extends AbsPreviewItemViewBinder	// class@0010eb
{
    public ViewGroup q;

    public void ImportMusicPreviewItemViewBinder(Fragment p0,int p1){
       super(p0, p1);
       Log.g("ImporMusicPreviewItemVB", "ImportMusicPreviewItemViewBinder fragment:"+p0+" viewType:"+p1);
    }
    public boolean b(l0 p0){
       return false;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImportMusicPreviewItemViewBinder.class, "1")) {
          return;
       }
       if (this.x() == 2) {
          this.C(p0.findViewById(R.id.player_seekbar));
          this.B(p0.findViewById(R.id.ksa_current_time_view));
          this.H(p0.findViewById(R.id.ksa_total_time_view));
          this.q = p0.findViewById(0x7f0a31f2);
       }else {
          i1.b("ImporMusicPreviewItemVB", new IllegalArgumentException("bindView error viewType not TYPE_SDK_VIDEO"));
       }
       FrameLayout$LayoutParams layoutParams = this.q.getLayoutParams();
       layoutParams.bottomMargin = i.c(0x7f07034d);
       this.q.setLayoutParams(layoutParams);
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ImportMusicPreviewItemViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.x() == 2) {
          return a.c(p0, 0x7f0d06fe, p1, false);
       }
       i1.b("ImporMusicPreviewItemVB", new IllegalArgumentException("bindView error viewType not TYPE_SDK_VIDEO"));
       throw new IllegalArgumentException("view type : $viewType is wrong");
    }
}
