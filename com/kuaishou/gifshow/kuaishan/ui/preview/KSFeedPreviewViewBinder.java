package com.kuaishou.gifshow.kuaishan.ui.preview.KSFeedPreviewViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import androidx.fragment.app.Fragment;
import j79.l0;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public class KSFeedPreviewViewBinder extends AbsPreviewItemViewBinder	// class@001adb
{

    public void KSFeedPreviewViewBinder(Fragment p0,int p1){
       super(p0, p1);
    }
    public boolean b(l0 p0){
       return false;
    }
    public void e(View p0){
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KSFeedPreviewViewBinder.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d15bf, p1, false);
    }
}
