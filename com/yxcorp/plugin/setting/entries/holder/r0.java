package com.yxcorp.plugin.setting.entries.holder.r0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.SwitchItem;
import java.lang.Object;
import com.yxcorp.plugin.setting.entries.holder.q0;
import com.yxcorp.gifshow.model.SelectOption;
import java.lang.Boolean;
import xgc.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.b;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import android.view.View;

public class r0 implements c	// class@000887
{
    public GifshowActivity a;
    public b b;
    public SwitchItem c;
    public c d;
    public d e;
    public Boolean f;
    public int g;
    public final SlipSwitchButton$b h;

    public void r0(GifshowActivity p0,SwitchItem p1){
       super();
       int i = 0;
       this.g = i;
       this.h = new q0(this);
       this.a = p0;
       this.c = p1;
       boolean b = (2 == p1.mSelectedOption.mValue)? true: false;
       this.f = Boolean.valueOf(b);
       b uob = new b();
       this.b = uob;
       uob.c = p1.mName;
       if (TextUtils.x(p1.mDescription)) {
          i = 0x7f081084;
       }
       uob.f = i;
       uob.e = p1.mDescription;
       return;
    }
    public void a(){
       b.a(this);
    }
    public b b(){
       return this.b;
    }
    public a getModel(){
       return this.b();
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, r0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.e = new d();
       }
       return this.e;
    }
    public boolean isAvailable(){
       return true;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, r0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          obj = new PresenterV2();
          this.d = obj;
          obj.add(new b(this.h, this.f, null, Boolean.TRUE));
       }
       return this.d;
    }
    public void r(View p0){
       b.b(this, p0);
    }
    public int y0(){
       return 0x7f0d14c9;
    }
}
