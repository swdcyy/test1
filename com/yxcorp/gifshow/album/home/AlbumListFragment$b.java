package com.yxcorp.gifshow.album.home.AlbumListFragment$b;
import ia9.d;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumListItemViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ga9.b;
import java.util.List;
import androidx.lifecycle.ViewModel;
import jlb.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;
import android.text.TextUtils;
import java.io.File;
import c79.c$a;
import android.content.res.Resources;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import r79.b;
import r79.b$a;
import c79.c;
import c79.a;
import android.net.Uri;
import ic7.d;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import c79.a$a;

public final class AlbumListFragment$b extends d	// class@001a02
{

    public void AlbumListFragment$b(View p0,AbsAlbumListItemViewBinder p1){
       a.q(p0, "mItemView");
       a.q(p1, "viewBinder");
       super(p0, p1);
    }
    public void a(Object p0,List p1,ViewModel p2){
       AbsAlbumListItemViewBinder a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AlbumListFragment$b.class, "1")) {
       }else {
          a.q(p1, "payloads");
          a = this.b().a;
          String str = null;
          if (a != null) {
             String str1 = (p0 != null)? p0.a(): str;
             a.setText(str1);
          }
          TextView textView = this.b().j();
          if (textView != null) {
             Integer integer = (p0 != null)? Integer.valueOf(p0.b()): str;
             textView.setText(String.valueOf(integer));
          }
          textView = this.b().j();
          if (textView != null) {
             textView.setVisibility(0);
          }
          if (p0 != null) {
             str = p0.d();
          }
          if (!TextUtils.isEmpty(str)) {
             p0 = new File(str);
             if (p0.exists()) {
                a = this.b().c;
                if (a != null) {
                   c$a uoa = new c$a();
                   uoa.g(a.getResources().getDrawable(R.drawable.arg_RES_7f080fce));
                   b$a h = b.h;
                   uoa.j(h.a());
                   uoa.e(h.a());
                   uoa.d(true);
                   p0 = d.a(p0);
                   a.h(p0, "KsAlbumSafetyUriCalls.getUriFromFile\(file\)");
                   a.a.a(a, p0, uoa.a());
                }
             }
          }
       }
    label_00b6 :
       return;
    }
}
