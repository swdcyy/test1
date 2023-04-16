package com.yxcorp.gifshow.share.widget.GuideShareMoreDialog;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$a;
import nsd.u;
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
import kotlin.jvm.internal.a;
import i2b.a;
import android.widget.TextView;
import android.graphics.Typeface;
import ekd.d0;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$onCreateView$2;
import com.yxcorp.gifshow.share.module.SimilarPhotoResponse;
import com.yxcorp.gifshow.activity.GifshowActivity;
import msd.a;
import o07.n;

public final class GuideShareMoreDialog implements PopupInterface$f	// class@001d05
{
    public BaseFeed b;
    public GifshowActivity c;
    public SimilarPhotoResponse d;
    public c e;
    public static final GuideShareMoreDialog$a f;

    static {
       GuideShareMoreDialog.f = new GuideShareMoreDialog$a(null);
    }
    public void GuideShareMoreDialog(){
       super();
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       GuideShareMoreDialog this;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, GuideShareMoreDialog.class, "9");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       View view = a.g(p1, R.layout.arg_RES_7f0d0594, p2, false);
       View view1 = view.findViewById(R.id.title);
       a.o(view1, "root.findViewById<TextView>\(R.id.title\)");
       view1.setTypeface(d0.c());
       view.findViewById(R.id.iv_close).setOnClickListener(new GuideShareMoreDialog$b(this, p0));
       GuideShareMoreDialog$a f = GuideShareMoreDialog.f;
       a.o(view, "root");
       GuideShareMoreDialog td = this.d;
       if (td == null) {
          a.S("similarPhotos");
       }
       this = this.c;
       if (this == null) {
          a.S("activity");
       }
       f.b(view, td, this, "SHARE_TIP_POPUP", new GuideShareMoreDialog$onCreateView$2(p0));
       this.e = p0;
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
