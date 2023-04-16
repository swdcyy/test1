package gn8.j;
import fn8.o;
import java.lang.Object;
import android.view.ViewGroup;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.String;
import android.view.View;
import com.swmansion.gesturehandler.PointerEventsConfig;
import ze.u;
import com.facebook.react.uimanager.PointerEvents;
import gn8.j$a;
import java.lang.Enum;

public class j implements o	// class@0024a2
{

    public void j(){
       super();
    }
    public boolean a(ViewGroup p0){
       if (p0.getClipChildren()) {
          return true;
       }
       if (p0 instanceof ReactViewGroup) {
          return ("hidden").equals(p0.getOverflow());
       }
       return false;
    }
    public View b(ViewGroup p0,int p1){
       if (p0 instanceof ReactViewGroup) {
          return p0.getChildAt(p0.getZIndexMappedChildIndex(p1));
       }
       return p0.getChildAt(p1);
    }
    public PointerEventsConfig c(View p0){
       PointerEvents pointerEvent = (p0 instanceof u)? p0.getPointerEvents(): PointerEvents.AUTO;
       if (!p0.isEnabled()) {
          if (pointerEvent == PointerEvents.AUTO) {
             return PointerEventsConfig.BOX_NONE;
          }else if(pointerEvent == PointerEvents.BOX_ONLY){
             return PointerEventsConfig.NONE;
          }
       }
       int i = j$a.a[pointerEvent.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                return PointerEventsConfig.AUTO;
             }else {
                return PointerEventsConfig.NONE;
             }
          }else {
             return PointerEventsConfig.BOX_NONE;
          }
       }else {
          return PointerEventsConfig.BOX_ONLY;
       }
    }
}
