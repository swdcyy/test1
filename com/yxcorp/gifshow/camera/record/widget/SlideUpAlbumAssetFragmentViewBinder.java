package com.yxcorp.gifshow.camera.record.widget.SlideUpAlbumAssetFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.album.widget.LoadingView;
import android.widget.Button;
import com.yxcorp.gifshow.camera.record.widget.SlideUpAlbumAssetFragmentViewBinder$a;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.widget.SlideUpAlbumAssetFragmentViewBinder$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import q79.d;
import j8c.a;
import q87.c;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class SlideUpAlbumAssetFragmentViewBinder extends AbsAlbumAssetFragmentViewBinder	// class@000fe2
{
    public final String j;
    public Button k;

    public void SlideUpAlbumAssetFragmentViewBinder(Fragment p0){
       a.p(p0, "fragment");
       super(p0);
       this.j = "SlideUpAlbumAssetFragmentViewBinder";
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideUpAlbumAssetFragmentViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.x(p0);
       this.w(p0.findViewById(R.id.album_view_list));
       this.v(p0.findViewById(R.id.no_file_tv));
       this.s(p0.findViewById(R.id.no_file_icon));
       this.t(p0.findViewById(R.id.no_file_layout));
       this.r(p0.findViewById(R.id.loading_view));
       Button uButton = p0.findViewById(R.id.open_permission);
       this.k = uButton;
       if (uButton != null) {
          uButton.setOnClickListener(new SlideUpAlbumAssetFragmentViewBinder$a(this));
       }
       this.y();
       SlideUpAlbumAssetFragmentViewBinder tk = this.k;
       if (tk != null) {
          ViewTreeObserver viewTreeObse = tk.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.addOnGlobalLayoutListener(new SlideUpAlbumAssetFragmentViewBinder$b(this));
          }
       }
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SlideUpAlbumAssetFragmentViewBinder.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d153f, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­agment, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SlideUpAlbumAssetFragmentViewBinder.class, "3")) {
          return;
       }
       this.w(null);
       this.v(null);
       this.s(null);
       this.t(null);
       this.r(null);
       return;
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, SlideUpAlbumAssetFragmentViewBinder.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s(this.j, "checkStoragePermission\(\) called", objArray);
       SlideUpAlbumAssetFragmentViewBinder tk = this.k;
       if (tk != null && (!tk.getVisibility() && PermissionUtils.a(tk.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE"))) {
          tk.setVisibility(8);
       }
    label_0035 :
       return;
    }
}
