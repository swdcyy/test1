package mk0.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.PopupWindow;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import ze.p;
import com.facebook.react.bridge.WritableMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.a;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.Throwable;
import ek0.d;
import android.util.DisplayMetrics;
import ze.c;
import java.lang.StringBuilder;

public class c extends PopupWindow implements ViewTreeObserver$OnGlobalLayoutListener	// class@00318e
{
    public Activity b;
    public Window c;
    public View d;
    public final Rect e;
    public final int f;
    public int g;
    public a h;

    public void c(Activity p0){
       super(p0);
       this.g = 0;
       this.b = p0;
       View view = new View(p0);
       this.d = view;
       this.setContentView(view);
       this.d.getViewTreeObserver().addOnGlobalLayoutListener(this);
       this.setBackgroundDrawable(new ColorDrawable(0));
       this.setWidth(0);
       this.setHeight(-1);
       this.setFocusable(0);
       this.setInputMethodMode(1);
       this.setSoftInputMode(16);
       this.e = new Rect();
       this.f = (int)p.c(60.00f);
    }
    public final WritableMap a(double p0,double p1,double p2,double p3){
       WritableMap obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyFourRefs(Double.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), Double.valueOf(p3), this, c.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Arguments.createMap();
       WritableMap writableMap = Arguments.createMap();
       writableMap.putDouble("height", p3);
       writableMap.putDouble("screenX", p1);
       writableMap.putDouble("width", p2);
       writableMap.putDouble("screenY", p0);
       obj.putMap("endCoordinates", writableMap);
       obj.putString("easing", "keyboard");
       obj.putDouble("duration", 0);
       return obj;
    }
    public void b(String p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       try{
          c th = this.h;
          if (th != null) {
             th.n().getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit(p0, p1);
          }
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[]{p0};
          d.b("KdsKeyboardHelper", String.format("发送%s事件异常", objArray), e4);
       }
       return;
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c td = this.d;
       if (td == null) {
          return;
       }
       td.getWindowVisibleDisplayFrame(this.e);
       int i = c.e().heightPixels - this.e.bottom;
       c tg = this.g;
       double d = Double.MIN_VALUE;
       double d1 = (tg != i && i > this.f)? Double.MIN_VALUE: 0;
       if (d1) {
          this.g = i;
          d.e("键盘弹出-> "+this.e+",键盘高度:"+this.g);
          this.b("keyboardDidShow", this.a((double)p.a((float)this.e.bottom), (double)p.a((float)this.e.left), (double)p.a((float)this.e.width()), (double)p.a((float)this.g)));
          return;
       }else if(tg != null && i <= this.f){
          d = 0;
       }
       if (d) {
          this.g = 0;
          d.e("键盘收起-> "+this.e);
          this.b("keyboardDidHide", this.a((double)p.a((float)this.e.height()), 0, (double)p.a((float)this.e.width()), 0));
       }
       return;
    }
}
