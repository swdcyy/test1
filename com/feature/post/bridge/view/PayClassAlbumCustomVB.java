package com.feature.post.bridge.view.PayClassAlbumCustomVB;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModel;
import com.feature.post.bridge.view.PayClassAlbumCustomVB$a;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import com.feature.post.bridge.view.PayClassAlbumCustomVB$b;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.LayoutInflater;
import android.os.Bundle;
import ag6.a;
import q79.d;

public final class PayClassAlbumCustomVB extends AbsAlbumFragmentViewBinder	// class@0014da
{
    public Button l;

    public void PayClassAlbumCustomVB(Fragment p0){
       a.p(p0, "fragment");
       super(p0);
    }
    public boolean a(ViewModel p0){
       PayClassAlbumCustomVB tl = this.l;
       if (tl == null) {
          a.S("mExportButton");
       }
       tl.setOnClickListener(new PayClassAlbumCustomVB$a(this, p0));
       ImageView imageView = this.m();
       if (imageView != null) {
          imageView.setOnClickListener(new PayClassAlbumCustomVB$b(this));
       }
       return true;
    }
    public void e(View p0){
       a.p(p0, "rootView");
       super.e(p0);
       this.u(p0.findViewById(R.id.left_btn));
       this.x(p0.findViewById(R.id.view_pager));
       this.t(p0.findViewById(R.id.album_list_container));
       this.v(p0.findViewById(R.id.photo_picker_title_bar));
       this.s(p0.findViewById(R.id.album_list_divider));
       this.r(p0.findViewById(R.id.bottom_container));
       this.z(p0.findViewById(R.id.tabs));
       this.y(p0.findViewById(R.id.preview_frame_cover));
       p0 = p0.findViewById(R.id.next_step);
       a.o(p0, "rootView.findViewById\(R.id.next_step\)");
       this.l = p0;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CARD_QUES_PHOTO_SEND";
       u1.u0(6, uElementPack, null);
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.ksa_photo_picker_v4, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­ker_v4, container, false\)");
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       super.onDestroy();
       this.u(null);
       this.x(null);
       this.s(null);
       this.v(null);
       this.t(null);
       this.y(null);
    }
}
