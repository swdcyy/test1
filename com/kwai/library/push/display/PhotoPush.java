package com.kwai.library.push.display.PhotoPush;
import com.kwai.library.push.display.Push;
import com.kwai.library.push.model.InAppNotification;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.push.display.PhotoPush$dataBinder$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import com.kwai.library.push.display.PushDataBinder;
import com.kwai.library.push.widget.InAppImageView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import iy6.j;

public final class PhotoPush extends Push	// class@0008ad
{
    public final p h;

    public void PhotoPush(InAppNotification p0){
       a.p(p0, "data");
       super(p0);
       this.h = s.c(PhotoPush$dataBinder$2.INSTANCE);
    }
    public void a(View p0,InAppNotification p1){
       a.p(p0, "contentView");
       a.p(p1, "data");
       this.n().a(p0, p1);
       InAppImageView inAppImageVi = p0.findViewById(R.id.photo);
       String photo = p1.getPhoto();
       int i = 1;
       int i1 = 0;
       if (photo != null) {
          photo = (photo.length() > 0)? 1: 0;
          if (photo == i) {
          label_002f :
             if (!i) {
                i1 = 8;
             }
             inAppImageVi.setVisibility(i1);
             if (i) {
                inAppImageVi.v(p1.getPhoto());
             }
             return;
          }
       }
       i = 0;
       goto label_002f ;
    }
    public View c(LayoutInflater p0){
       a.p(p0, "layoutInflater");
       View view = p0.inflate(R.layout.arg_RES_7f0d0884, null);
       Context context = view.getContext();
       a.o(context, "context");
       view.setPadding(0, j.b(context), 0, 0);
       return view;
    }
    public void h(){
       this.n().g();
    }
    public final PushDataBinder n(){
       return this.h.getValue();
    }
}
