package d61.h;
import java.util.WeakHashMap;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.view.View;
import android.app.Activity;
import e3a.a;
import java.lang.Number;
import lnc.a1;
import java.lang.Boolean;
import android.view.ViewStub;
import android.content.Context;
import k51.b;
import kotlin.jvm.internal.a;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ProgressBar;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;

public class h	// class@001f1f
{
    public static final WeakHashMap a;

    static {
       h.a = new WeakHashMap();
    }
    public void h(){
       super();
    }
    public static Drawable a(int p0,int p1){
       GradientDrawable obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, oh, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new GradientDrawable();
       obj.setCornerRadius((float)p0);
       obj.setColor(p1);
       return obj;
    }
    public static Drawable b(int p0,GradientDrawable$Orientation p1,int[] p2){
       GradientDrawable obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, h.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new GradientDrawable();
       obj.setCornerRadius((float)p0);
       obj.setOrientation(p1);
       if (p2.length == 1) {
          obj.setColor(p2[0]);
       }else if(p2.length > 1){
          obj.setColors(p2);
       }
       return obj;
    }
    public static Drawable c(GradientDrawable$Orientation p0,int[] p1){
       GradientDrawable obj = PatchProxy.applyTwoRefs(p0, p1, null, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GradientDrawable();
       obj.setShape(1);
       obj.setOrientation(p0);
       if (p1.length == 1) {
          obj.setColor(p1[0]);
       }else if(p1.length > 1){
          obj.setColors(p1);
       }
       return obj;
    }
    public static Activity d(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0);
    }
    public static int e(){
       Object obj = PatchProxy.apply(null, null, h.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f0708fd);
    }
    public static View f(View p0,int p1,int p2){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, h.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.g(p0, p1, p2, 0, 0);
    }
    public static View g(View p0,int p1,int p2,int p3,boolean p4){
       Context obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ViewStub viewStub = p0.findViewById(p1);
       if (viewStub != null) {
          if (p4 && p3 > 0) {
             obj = p0.getContext();
             if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(obj, viewStub, Integer.valueOf(p3), Boolean.valueOf(p4), null, b.class, "7")) {
                a.p(obj, "context");
                a.p(viewStub, "viewStub");
                if (p4) {
                   PreLoader.getInstance().viewStub(obj, viewStub, p3, null);
                }else {
                   viewStub.inflate();
                }
             }
          }else {
             viewStub.inflate().findViewById(p2);
          }
       }
       return p0.findViewById(p2);
    }
    public static void h(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "17")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.getParent() instanceof ViewGroup) {
          p0.getParent().removeView(p0);
       }
       return;
    }
    public static void i(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = layoutParams.topMargin + a1.e(44.00f);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public static void j(ProgressBar p0,int p1,int p2,int p3,int p4){
       float f;
       h oh = h.class;
       int i = 5;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, null, oh, "13")) {
             return;
          }
       }
       float[] uofloatArray = new float[]{f,f,f,f,f,f,f,f};
       f = (float)p4;
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, new RectF(0, 0, 0, 0), uofloatArray));
       shapeDrawabl.getPaint().setColor(p3);
       shapeDrawabl.getPaint().setStyle(Paint$Style.FILL);
       GradientDrawable gradientDraw = new GradientDrawable();
       int[] ointArray = new int[]{p1,p2};
       gradientDraw.setColors(ointArray);
       gradientDraw.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
       gradientDraw.setCornerRadius(f);
       gradientDraw.setShape(0);
       ClipDrawable uClipDrawabl = new ClipDrawable(gradientDraw, 3, 1);
       Drawable[] uDrawableArr = new Drawable[]{shapeDrawabl,uClipDrawabl};
       LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
       layerDrawabl.setId(0, 0x1020000);
       layerDrawabl.setId(1, 0x102000d);
       p0.setProgressDrawable(layerDrawabl);
       return;
    }
    public static void k(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, h.class, "5")) {
          return;
       }
       WeakHashMap a = h.a;
       if (!TextUtils.equals(a.get(p0), p1)) {
          a.put(p0, p1);
          p0.setText(p1);
       }
       return;
    }
    public static void l(View p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oh, "16")) {
          return;
       }
       if (p0 != null && p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          p0.topMargin = p1;
       }
       return;
    }
}
