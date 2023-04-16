package com.kwai.component.photo.detail.slide.presenter.b$b;
import qw6.b;
import com.kwai.component.photo.detail.slide.presenter.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.util.Map;

public class b$b extends b	// class@000a92
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       this.b.P8("willDisappear currentPosition: "+this.b.u);
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       b.y.put(this.b.v, Boolean.FALSE);
       this.b.P8("willAppear currentPosition: "+this.b.u);
       return;
    }
}
