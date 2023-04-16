package asc.a$c;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import asc.a;
import java.lang.Object;
import java.lang.Long;
import w69.z;
import r79.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.e;
import nsd.r0;
import o79.i;
import kotlin.jvm.internal.a;
import lsc.m;
import im8.f;
import java.util.Arrays;
import java.lang.CharSequence;
import e17.i;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import androidx.lifecycle.ViewModel;
import q79.d;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import android.view.View;

public final class a$c implements IAlbumMainFragment$b	// class@0002c5
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a(Long p0){
       z.b(this, p0);
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       if (p0 != null) {
          String str = "null cannot be cast to non-null type com.yxcorp.gifshow.album.vm.AlbumAssetViewModel";
          int i = 0;
          int i1 = 1;
          if (e.c(p0)) {
             String str1 = i.p(R.string.arg_RES_7f10165c);
             a.o(str1, "CommonUtil.string\(R.stri¡­usic_too_long_notice_new\)");
             Object[] objArray = new Object[i1];
             objArray[i] = m.a.get();
             String str2 = String.format(str1, Arrays.copyOf(objArray, i1));
             a.o(str2, "java.lang.String.format\(format, *args\)");
             i.d(R.style.arg_RES_7f11066a, str2);
             Fragment parentFragme = this.a.g.getParentFragment();
             Objects.requireNonNull(parentFragme, "null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment");
             ViewModel viewModel = parentFragme.Zg();
             Objects.requireNonNull(viewModel, str);
             viewModel.l(p0);
             return;
          }else if(this.a.d.isEmpty() ^ i1){
             Iterator iterator = this.a.d.values().iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                uoc.setSelected(i);
                Fragment parentFragme1 = this.a.g.getParentFragment();
                Objects.requireNonNull(parentFragme1, "null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment");
                ViewModel viewModel1 = parentFragme1.Zg();
                Objects.requireNonNull(viewModel1, str);
                a.o(uoc, "selectedData");
                viewModel1.l(uoc);
             }
             this.a.d.clear();
          }
          this.a.c.setAlpha(0x3f800000);
          this.a.d.put(p0.getPath(), p0);
       }
       return;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "2")) {
          return;
       }
       z.a(this, p0);
       if (p0 == null) {
          return;
       }
       if (this.a.d.containsKey(p0.getPath())) {
          this.a.d.remove(p0.getPath());
       }
       if (this.a.d.isEmpty()) {
          this.a.c.setAlpha(0x3f000000);
       }
       return;
    }
}
