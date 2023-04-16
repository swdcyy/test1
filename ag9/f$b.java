package ag9.f$b;
import com.yxcorp.gifshow.camera.bubble.b$d;
import ag9.f;
import com.kuaishou.android.model.music.Music;
import android.content.Intent;
import java.lang.Object;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import ag9.f$b$a;
import android.view.View$OnClickListener;
import ag9.f$b$b;

public final class f$b implements b$d	// class@0000be
{
    public final f a;
    public final Music b;
    public final Intent c;

    public void f$b(f p0,Music p1,Intent p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(View p0,c p1,ViewGroup p2,Bundle p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f$b.class, "1")) {
          return;
       }
       a.p(p2, "container");
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.cover_image);
       Music mImageUrls = (!j.h(this.b.mImageUrls))? this.b.mImageUrls: e0.h(this.b.mImageUrl);
       kwaiImageVie.U(mImageUrls);
       View view = p0.findViewById(R.id.title);
       a.o(view, "view.findViewById<TextView>\(R.id.title\)");
       view.setText(this.b.mName);
       p0.findViewById(R.id.apply_music).setOnClickListener(new f$b$a(this));
       p0.findViewById(R.id.bubble_container).setOnClickListener(f$b$b.b);
       return;
    }
}
