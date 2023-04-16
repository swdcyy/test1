package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter$a;
import tw5.f;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import xl8.b;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;

public class HomeLocalSizerViewPresenter$a implements f	// class@001ac5
{
    public final HomeLocalSizerViewPresenter a;

    public void HomeLocalSizerViewPresenter$a(HomeLocalSizerViewPresenter p0){
       this.a = p0;
       super();
    }
    public b a(){
       return this.a.y;
    }
    public View b(int p0){
       HomeLocalSizerViewPresenter obj;
       HomeLocalSizerViewPresenter$a uoa = HomeLocalSizerViewPresenter$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.x;
       if (obj == null) {
          return null;
       }else {
          return obj.findViewById(p0);
       }
    }
}
