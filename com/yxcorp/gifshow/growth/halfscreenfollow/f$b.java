package com.yxcorp.gifshow.growth.halfscreenfollow.f$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.halfscreenfollow.f$a;
import ag6.a;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.growth.halfscreenfollow.widget.NestedScrollWebView;
import android.content.Context;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import nkc.c;
import nkc.a;
import nkc.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import im8.c;

public class f$b implements PopupInterface$f	// class@00138b
{
    public PresenterV2 b;
    public String c;
    public String d;

    public void f$b(String p0,String p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f$b.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.b = presenterV2;
       presenterV2.U7(new f$a());
       boolean b = false;
       View view = a.c(p1, R.layout.arg_RES_7f0d0559, p2, b);
       FrameLayout uFrameLayout = view.findViewById(R.id.half_screen_follow_web_view_container);
       try{
          NestedScrollWebView nestedScroll = new NestedScrollWebView(p1.getContext());
          nestedScroll.setId(R.id.half_screen_follow_web_view);
          uFrameLayout.addView(nestedScroll, new LinearLayout$LayoutParams(-1, -1));
       }catch(java.lang.Exception e0){
          new c(new a(uFrameLayout)).i();
       }
       this.b.f(view);
       if (TextUtils.x(this.c)) {
          this.c = this.c+"source_page="+this.d;
       }else {
          String str = "source_page";
          if ((this.c).contains(str)) {
             TextUtils.F(this.c, str, this.d);
          }else {
             this.c = this.c+"&source_page="+this.d;
          }
       }
       Object[] objArray = new Object[]{new c("HALF_SCREEN_FOLLOW_DIALOG", p0),new c("PAGE_PARAMS", this.c)};
       this.b.i(objArray);
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "2")) {
          return;
       }
       f$b tb = this.b;
       if (tb != null) {
          tb.destroy();
       }
       return;
    }
}
