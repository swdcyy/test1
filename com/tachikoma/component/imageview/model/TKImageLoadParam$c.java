package com.tachikoma.component.imageview.model.TKImageLoadParam$c;
import com.tachikoma.component.imageview.model.TKImageLoadParam;
import java.lang.Object;
import com.tachikoma.component.imageview.model.TKIcon;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.Integer;

public class TKImageLoadParam$c	// class@000d08
{
    public int a;
    public int b;
    public int c;

    public void TKImageLoadParam$c(int p0,int p1,TKImageLoadParam p2){
       super();
       this.c = -2;
       this.a = p0;
       this.b = p1;
       if (p2 != null) {
          TKImageLoadParam tKIcon = p2.tKIcon;
          if (tKIcon != null) {
             this.c = tKIcon.resultType;
          }
       }
       return;
    }
    public void TKImageLoadParam$c(TKImageLoadParam p0){
       super(0, 0, p0);
    }
    public Map a(){
       HashMap obj = PatchProxy.apply(null, this, TKImageLoadParam$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("width", Integer.valueOf(this.a));
       obj.put("height", Integer.valueOf(this.b));
       TKImageLoadParam$c tc = this.c;
       if (tc != -2) {
          obj.put("type", Integer.valueOf(tc));
       }
       return obj;
    }
}
