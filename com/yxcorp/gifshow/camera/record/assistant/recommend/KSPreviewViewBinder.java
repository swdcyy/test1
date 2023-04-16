package com.yxcorp.gifshow.camera.record.assistant.recommend.KSPreviewViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j79.l0;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public final class KSPreviewViewBinder extends AbsPreviewItemViewBinder	// class@001d1d
{

    public void KSPreviewViewBinder(Fragment p0,int p1){
       a.p(p0, "fragment");
       super(p0, p1);
    }
    public boolean b(l0 p0){
       return false;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPreviewViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "view");
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KSPreviewViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "layoutInflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d0166, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­ resId, viewGroup, false\)");
       return view;
    }
}
