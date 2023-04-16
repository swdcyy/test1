package com.kwai.yoda.view.YodaWebTitleBar$b;
import android.content.Context;
import java.lang.Object;
import android.content.res.Resources;
import cw9.c;
import com.kwai.yoda.model.ButtonParams$Icon;
import android.widget.TextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;

public class YodaWebTitleBar$b	// class@0012fd
{
    public int a;
    public int b;
    public Context c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int h;
    public String i;
    public String j;

    public void YodaWebTitleBar$b(Context p0){
       super();
       this.c = p0;
       this.a = c.b(p0.getResources(), 0x7f070fde);
       this.d = c.a(p0.getResources(), 0x7f070f5a);
       this.b = p0.getResources().getColor(0x7f062009);
       this.e = p0.getResources().getColor(0x7f06200b);
       this.f = c.b(p0.getResources(), 0x7f070104);
       this.h = ButtonParams$Icon.BACK.mIconId;
    }
    public TextView a(){
       TextView obj = PatchProxy.apply(null, this, YodaWebTitleBar$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextView(this.c);
       obj.setTextColor(this.e);
       obj.setGravity(17);
       obj.setSingleLine(true);
       obj.setTextSize(0, (float)this.f);
       obj.setPadding(this.d, 0, this.d, 0);
       obj.setText(this.g);
       return obj;
    }
}
