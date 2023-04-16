package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.NewStickerLibraryFragment;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import lnc.a1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import faa.a;
import q87.c;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment;
import java.util.List;

public class NewStickerLibraryFragment extends StickerLibraryFragment	// class@000a95
{
    public final int N;

    public void NewStickerLibraryFragment(){
       super();
       this.N = a1.d(0x7f07030d);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       ViewGroup$LayoutParams obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, NewStickerLibraryFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       if (view != null && !PatchProxy.applyVoidOneRefs(view, this, NewStickerLibraryFragment.class, "2")) {
          if (this.getActivity() == null) {
             Object[] objArray = new Object[0];
             a.D().w("NewStickerLibraryFragment", "changeLibraryPanelHeight: getActivity is null", objArray);
          }else {
             View view1 = view.findViewById(R.id.root_view);
             obj = view1.getLayoutParams();
             int i = (int)(((float)n.j(this.getActivity()) * 3.00f) / 4.00f);
             obj.height = i;
             view1.setLayoutParams(obj);
             view1.setBackgroundColor(a1.a(R.color.arg_RES_7f061cf2));
             view1 = view.findViewById(R.id.view_pager);
             obj = view1.getLayoutParams();
             obj.height = i - this.N;
             view1.setLayoutParams(obj);
          }
       }
       return view;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(NewStickerLibraryFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NewStickerLibraryFragment.class, "3")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (!p0) {
          if (this.t() instanceof StickerGroupFragment) {
             this.t().eh(this.J);
             this.t().ch();
          }
       }else {
          this.Rh();
       }
       return;
    }
}
