package com.yxcorp.gifshow.activity.share.presenter.c1$c;
import q96.d;
import com.yxcorp.gifshow.activity.share.presenter.c1;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import q96.c;

public class c1$c implements d	// class@0013cb
{
    public final c1 a;

    public void c1$c(c1 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       c1$c uoc = c1$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareLocationPresenter", "requestLocationWhenEnterShareActivity: onLocateSuccess\(\) called with: isCacheLocation = "+p0+" tencentLocation = ["+p1+"]", objArray);
       this.a.S8();
       return;
    }
    public void onError(int p0,String p1){
       c1$c uoc = c1$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareLocationPresenter", "requestLocationWhenEnterShareActivity: onLocateFailed\(\) called with: errorCode = ["+p0+"], reason = ["+p1+"]", objArray);
       this.a.S8();
       return;
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
       c.c(this);
    }
}
