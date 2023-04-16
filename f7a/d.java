package f7a.d;
import com.kwai.component.tabs.panel.a$a;
import f7a.c;
import java.lang.Object;
import com.kwai.component.tabs.panel.h;
import yg5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class d implements a$a	// class@0022e1
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0,h p1){
       c.a(this, p0, p1);
    }
    public final void onPanelCloseEvent(int p0){
       String str;
       if (PatchProxy.isSupport2(d.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, d.class, "1")) {
          return;
       }
       if (p0) {
          if (p0 != 1) {
             str = (p0 != 3)? "": "PHOTO_PLAY";
          }else {
             str = "CROSS";
          }
       }else {
          str = "PUSH_BACK";
       }
       this.a.P8(str);
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
