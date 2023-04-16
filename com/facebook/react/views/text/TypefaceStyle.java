package com.facebook.react.views.text.TypefaceStyle;
import com.facebook.react.views.text.TypefaceStyle$1;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import android.graphics.Typeface;
import android.os.Build$VERSION;

public class TypefaceStyle	// class@00141b
{
    public final boolean a;
    public final int b;
    public static final HashMap c;

    static {
       TypefaceStyle.c = new TypefaceStyle$1();
    }
    public void TypefaceStyle(int p0){
       super();
       boolean b = false;
       if (p0 == -1) {
          p0 = 0;
       }
       if (p0 & 0x02) {
          b = true;
       }
       this.a = b;
       p0 = (p0 & 1)? 700: 400;
       this.b = p0;
       return;
    }
    public void TypefaceStyle(int p0,int p1,String p2){
       super();
       boolean b = false;
       if (p0 == -1) {
          p0 = 0;
       }
       String str = 1;
       if (p0 & 0x02) {
          b = true;
       }
       this.a = b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TypefaceStyle typefaceStyl = TypefaceStyle.class;
       if (PatchProxy.isSupport(typefaceStyl)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p1), p2, null, typefaceStyl, "1");
          if (obj != patchProxyRe) {
             p1 = obj.intValue();
          }else if(p1 <= 0){
             Map$Entry obj1 = PatchProxy.applyOneRefs(p2, null, typefaceStyl, "2");
             if (obj1 != patchProxyRe) {
                patchProxyRe = obj1.intValue();
             }else if(TextUtils.isEmpty(p2)){
                Iterator iterator = TypefaceStyle.c.entrySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      if ((p2.toLowerCase()).endsWith(obj1.getKey())) {
                         iterator = obj1.getValue().intValue();
                      }
                   }
                }
             }
             obj1 = 400;
             obj1 = patchProxyRe;
          }else if(p1 == str || p1 == 3){
             p1 = 700;
          }
       }else {
          goto label_002e ;
       }
       this.b = p1;
       return;
    }
    public Typeface a(Typeface p0){
       TypefaceStyle obj = PatchProxy.applyOneRefs(p0, this, TypefaceStyle.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = Typeface.create(p0, this.b());
       if (Build$VERSION.SDK_INT >= 28) {
          obj = this.b;
          if (obj >= 1 && obj <= 1000) {
             p0 = Typeface.create(p0, obj, this.a);
          }
       }
       return p0;
    }
    public int b(){
       int i;
       if (this.b < 700) {
          i = (this.a != null)? 2: 0;
          return i;
       }else if(this.a != null){
          i = 3;
       }else {
          i = 1;
       }
       return i;
    }
}
