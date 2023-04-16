package com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumEmptyView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;

public final class PotentialAlbumEmptyView extends LinearLayout	// class@001cc5
{
    public ViewGroup b;
    public View c;
    public Boolean d;

    public void PotentialAlbumEmptyView(Context p0){
       super(p0);
    }
    public void PotentialAlbumEmptyView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PotentialAlbumEmptyView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, PotentialAlbumEmptyView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a31a6);
       this.c = this.findViewById(0x7f0a31a7);
       return;
    }
    public final void setNoFileLayout(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PotentialAlbumEmptyView.class, "1")) {
          return;
       }
       a.p(p0, "noFileLayout");
       PotentialAlbumEmptyView tb = this.b;
       if (tb != null) {
          tb.addView(p0);
       }
       return;
    }
}
