package com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction;

public class PresenterV2$c	// class@000c24
{
    public final PresenterV2 a;
    public boolean b;

    public void PresenterV2$c(PresenterV2 p0){
       super();
       this.a = p0;
    }
    public void a(){
       this.a.f8(PresenterV2$PresenterAction.ACTION_BIND);
       this.b = true;
    }
    public void b(){
       if (this.b != null) {
          this.a.f8(PresenterV2$PresenterAction.ACTION_UNBIND);
       }
       return;
    }
}
