package com.yxcorp.gifshow.albumwrapper.AlbumPreviewFragment;
import w69.c0;
import dc7.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.albumwrapper.AlbumPreviewFragment$a;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import ag6.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.HashMap;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class AlbumPreviewFragment extends BaseFragment implements c0, c	// class@001b48
{
    public MediaPreviewFragment j;
    public String k;
    public String l;
    public HashMap m;

    public void AlbumPreviewFragment(){
       super(null, null, null, null, 15, null);
       this.j = super();
    }
    public int M(){
       return 4;
    }
    public int getPage(){
       if (this.l != null) {
          return 0;
       }
       return 187;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, AlbumPreviewFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.k;
    }
    public String getUrl(){
       return "ks://camera/normal/album_or_photo_record";
    }
    public MediaPreviewFragment n3(){
       return this.j;
    }
    public String o(){
       AlbumPreviewFragment obj = PatchProxy.apply(null, this, AlbumPreviewFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj == null) {
          String str = super.o();
       }
       return obj;
    }
    public boolean onBackPressed(){
       AlbumPreviewFragment obj = PatchProxy.apply(null, this, AlbumPreviewFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       boolean b = (obj != null)? obj.onBackPressed(): false;
       return b;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumPreviewFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.j == null) {
          this.j = new MediaPreviewFragment();
       }
       p0 = this.getArguments();
       String str = null;
       String str1 = (p0 != null)? p0.getString("album_preview_page2"): str;
       this.l = str1;
       AlbumPreviewFragment tj = this.j;
       if (tj != null) {
          tj.setArguments(this.getArguments());
       }
       tj = this.j;
       if (tj != null) {
          tj.ph(new AlbumPreviewFragment$a(this));
       }
       tj = this.getArguments();
       if (tj != null) {
          str = tj.getString("ALBUM_TASK_ID");
       }
       this.k = str;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AlbumPreviewFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.c(p0, 0x7f0d06e5, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AlbumPreviewFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       this.j = null;
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, AlbumPreviewFragment.class, "9")) {
       }else {
          AlbumPreviewFragment tm = this.m;
          if (tm != null) {
             tm.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumPreviewFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       AlbumPreviewFragment tj = this.j;
       if (tj != null) {
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.f(R.id.preview_container, tj);
          uoe.m();
       }
       return;
    }
}
