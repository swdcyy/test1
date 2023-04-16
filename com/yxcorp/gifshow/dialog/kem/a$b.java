package com.yxcorp.gifshow.dialog.kem.a$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.model.response.dialog.KemAdvanceCommonDialogResponse;
import android.graphics.Bitmap;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import x9a.c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.dialog.kem.a$b$a;
import o07.n;

public class a$b implements PopupInterface$f	// class@001aac
{
    public KemAdvanceCommonDialogResponse b;
    public Bitmap c;
    public View d;

    public void a$b(KemAdvanceCommonDialogResponse p0,Bitmap p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a$b.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d02df, p2, false);
       view.findViewById(R.id.close_btn).setOnClickListener(new c(p0));
       ImageView imageView = view.findViewById(R.id.image_content_view);
       imageView.setImageBitmap(this.c);
       imageView.setOnClickListener(new a$b$a(this, p0));
       this.d = view.findViewById(0x7f0a2921);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
