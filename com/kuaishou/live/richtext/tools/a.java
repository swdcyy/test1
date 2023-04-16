package com.kuaishou.live.richtext.tools.a;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.String;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import com.kuaishou.live.richtext.tools.a$a;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.lang.Boolean;

public class a	// class@000f78
{

    public void a(){
       super();
    }
    public static boolean a(int p0){
       int i = 1;
       if (!p0 || (p0 & i)) {
          i = false;
       }
       return i;
    }
    public static Drawable b(Resources p0,String p1){
       NinePatchDrawable obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Bitmap uBitmap = BitmapFactory.decodeFile(p1);
       if (uBitmap == null) {
          return obj;
       }
       byte[] ninePatchChu = uBitmap.getNinePatchChunk();
       if (!NinePatch.isNinePatchChunk(ninePatchChu)) {
          return obj;
       }
       a$a uoa = a.c(ninePatchChu);
       if (uoa == null) {
          return obj;
       }
       obj = new NinePatchDrawable(p0, uBitmap, ninePatchChu, uoa.a, "");
       return obj1;
    }
    public static a$a c(byte[] p0){
       Object obj = null;
       a$a obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       ByteBuffer uByteBuffer = ByteBuffer.wrap(p0).order(ByteOrder.nativeOrder());
       if (!uByteBuffer.get()) {
          return obj;
       }
       obj1 = new a$a();
       int[] ointArray = new int[uByteBuffer.get()];
       obj1.b = ointArray;
       ointArray = new int[uByteBuffer.get()];
       obj1.c = ointArray;
       ointArray = new int[uByteBuffer.get()];
       obj1.d = ointArray;
       int i = (a.a(obj1.b.length) && a.a(obj1.c.length))? 1: 0;
       if (!i) {
          return obj;
       }else {
          uByteBuffer.getInt();
          uByteBuffer.getInt();
          obj1.a.left = uByteBuffer.getInt();
          obj1.a.right = uByteBuffer.getInt();
          obj1.a.top = uByteBuffer.getInt();
          obj1.a.bottom = uByteBuffer.getInt();
          uByteBuffer.getInt();
          a.e(obj1.b, uByteBuffer);
          a.e(obj1.c, uByteBuffer);
          a.e(obj1.d, uByteBuffer);
          return obj1;
       }
    }
    public static boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.endsWith(".9.png"))? true: false;
       return b;
    }
    public static void e(int[] p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "4")) {
          return;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          p0[i] = p1.getInt();
       }
       return;
    }
}
