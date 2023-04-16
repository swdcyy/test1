package com.yxcorp.gifshow.growth.halfscreenfollow.c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.String;
import tna.i;

public final class c implements PopupInterface$d	// class@001387
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(c p0,int p1){
       if (p1 == 1) {
          i.c("BACK");
       }else if(p1 == 2){
          i.c("BLANK_AREA");
       }
       return;
    }
}
