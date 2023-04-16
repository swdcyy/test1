package com.yxcorp.gifshow.photo.download.widget.s;
import ub.a;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$e;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class s extends a	// class@000f51
{
    public final DownloadPicDialog$e b;

    public void s(DownloadPicDialog$e p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "1")) {
       }else {
          this.b.g.setVisibility(8);
       }
       return;
    }
}
