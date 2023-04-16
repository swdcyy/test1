package com.kwai.library.groot.slide.demo.DemoActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.View;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import android.widget.TextView;
import com.kwai.library.slide.base.widget.SlidePlayRefreshView;
import zw6.e;
import com.kwai.library.slide.base.pagelist.a;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import ok.o;
import com.kwai.library.groot.slide.filter.a;
import zw6.a;
import android.view.View$OnClickListener;
import zw6.b;
import zw6.c;
import zw6.d;
import ww6.a$a;
import ww6.a;
import xw6.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import zw6.f;
import yw6.g;
import jw6.a;
import com.yxcorp.gifshow.entity.QPhoto;

public class DemoActivity extends RxFragmentActivity	// class@00083b
{
    public KwaiGrootViewPager c;
    public a d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public SlidePlayRefreshView i;

    public void DemoActivity(){
       super();
    }
    public List F2(){
       Object obj = PatchProxy.apply(null, this, DemoActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DemoActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       DemoActivity uDemoActivit = DemoActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDemoActivit, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0255);
       this.c = this.findViewById(0x7f0a111a);
       this.e = this.findViewById(0x7f0a3533);
       this.f = this.findViewById(0x7f0a0a80);
       this.g = this.findViewById(0x7f0a0181);
       this.h = this.findViewById(0x7f0a35ac);
       this.i = this.findViewById(0x7f0a3537);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uDemoActivit, "2")) {
          SlideMediaType aLL = SlideMediaType.ALL;
          e uoe = new e(new a(), a.a(aLL, true), aLL);
          this.e.setOnClickListener(new a(this, uoe));
          this.f.setOnClickListener(new b(this, uoe));
          this.g.setOnClickListener(new c(this, uoe));
          this.h.setOnClickListener(new d(this, uoe));
          a$a uoa = new a$a();
          uoa.i(true);
          a uoa1 = uoa.a();
          a uoa2 = new a(this.getSupportFragmentManager(), uoe, this.c, new f(), uoa1);
          this.d = v7;
          v7.r(objArray);
          uoe.v(false);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DemoActivity.class, "3")) {
          return;
       }
       super.onDestroy();
       this.d.m();
       this.e.setOnClickListener(null);
       return;
    }
}
