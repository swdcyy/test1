package m3a.c;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.ActionType;
import android.app.RemoteAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.content.Intent;
import android.app.PendingIntent;
import java.lang.CharSequence;
import java.util.List;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.Enum;

public final class c	// class@002f0f
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final RemoteAction a(Activity p0,ActionType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "type");
       return new RemoteAction(Icon.createWithResource(p0, p1.getIcon()), "", "", PendingIntent.getBroadcast(p0, p1.getRequestCode(), new Intent(this.c(p0, p1)), 0x8000000));
    }
    public final List b(Activity p0,boolean p1){
       ArrayList obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       obj = new ArrayList();
       obj.add(this.a(p0, ActionType.ACTION_SMALL_WINDOW_LAST));
       if (p1) {
          obj.add(this.a(p0, ActionType.ACTION_SMALL_WINDOW_PAUSE));
       }else {
          obj.add(this.a(p0, ActionType.ACTION_SMALL_WINDOW_PLAY));
       }
       obj.add(this.a(p0, ActionType.ACTION_SMALL_WINDOW_NEXT));
       return obj;
    }
    public final String c(Activity p0,ActionType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getPackageName()+'.'+p1.name();
    }
}
