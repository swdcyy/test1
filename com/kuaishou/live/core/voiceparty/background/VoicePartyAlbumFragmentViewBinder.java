package com.kuaishou.live.core.voiceparty.background.VoicePartyAlbumFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import q79.d;

public class VoicePartyAlbumFragmentViewBinder extends AbsAlbumFragmentViewBinder	// class@001347
{

    public void VoicePartyAlbumFragmentViewBinder(Fragment p0){
       super(p0);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAlbumFragmentViewBinder.class, "1")) {
          return;
       }
       super.e(p0);
       this.u(p0.findViewById(R.id.left_btn));
       this.x(p0.findViewById(R.id.view_pager));
       this.t(p0.findViewById(R.id.album_list_container));
       this.v(p0.findViewById(R.id.photo_picker_title_bar));
       this.s(p0.findViewById(R.id.album_list_divider));
       this.r(p0.findViewById(R.id.bottom_container));
       this.z(p0.findViewById(R.id.tabs));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyAlbumFragmentViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d16d4, p1, false);
    }
    public boolean g(d p0){
       return false;
    }
}
