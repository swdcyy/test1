package com.yxcorp.gifshow.album.viewbinder.DefaultPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j79.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import ag6.a;

public final class DefaultPreviewFragmentViewBinder extends AbsPreviewFragmentViewBinder	// class@001ae2
{

    public void DefaultPreviewFragmentViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public boolean b(l0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultPreviewFragmentViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.b(p0);
       return false;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPreviewFragmentViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       super.e(p0);
       this.q(p0.findViewById(R.id.choice_circle));
       this.r(p0.findViewById(R.id.choice_circle_layout));
       this.s(p0.findViewById(R.id.choice_text));
       this.t(p0.findViewById(R.id.close_back));
       this.v(p0.findViewById(R.id.view_pager));
       this.u(p0.findViewById(R.id.title_bar));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultPreviewFragmentViewBinder.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d06fa, p1, false);
       a.h(view, "inflater.inflate\(R.layou¡­agment, container, false\)");
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DefaultPreviewFragmentViewBinder.class, "3")) {
          return;
       }
       super.onDestroy();
       return;
    }
}
