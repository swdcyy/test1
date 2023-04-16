package com.yxcorp.gifshow.album.preview.MediaPreviewWrapFragment;
import dc7.c;
import w69.c0;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Bundle;
import com.yxcorp.gifshow.album.preview.MediaPreviewWrapFragment$a;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$e;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import o79.i;
import java.util.HashMap;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public final class MediaPreviewWrapFragment extends RxFragment implements c, c0	// class@001a40
{
    public MediaPreviewFragment c;
    public HashMap d;

    public void MediaPreviewWrapFragment(){
       super();
       this.c = new MediaPreviewFragment();
    }
    public MediaPreviewFragment n3(){
       return this.c;
    }
    public boolean onBackPressed(){
       MediaPreviewWrapFragment obj = PatchProxy.apply(null, this, MediaPreviewWrapFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = (obj != null)? obj.onBackPressed(): false;
       return b;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewWrapFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.c == null) {
          this.c = new MediaPreviewFragment();
       }
       MediaPreviewWrapFragment tc = this.c;
       if (tc != null) {
          tc.ph(new MediaPreviewWrapFragment$a(this));
       }
       tc = this.c;
       if (tc != null) {
          tc.setArguments(this.getArguments());
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MediaPreviewWrapFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       return i.o(p0, 0x7f0d06e5, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewWrapFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       this.c = null;
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, MediaPreviewWrapFragment.class, "7")) {
       }else {
          MediaPreviewWrapFragment td = this.d;
          if (td != null) {
             td.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MediaPreviewWrapFragment.class, "3")) {
          return;
       }
       a.q(p0, "view");
       super.onViewCreated(p0, p1);
       MediaPreviewWrapFragment tc = this.c;
       if (tc != null) {
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.f(R.id.preview_container, tc);
          uoe.m();
       }
       return;
    }
}
