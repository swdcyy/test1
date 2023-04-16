package com.kuaishou.commercial.home.StickerViewStyle6;
import com.kuaishou.commercial.home.DrawTextSelfStickerView;
import android.content.Context;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.commercial.home.StickerView;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import android.graphics.Typeface;
import java.lang.CharSequence;
import android.view.ViewTreeObserver;
import com.kuaishou.commercial.home.StickerViewStyle6$a;
import android.view.ViewTreeObserver$OnPreDrawListener;

public class StickerViewStyle6 extends DrawTextSelfStickerView	// class@0014d4
{
    public float A;
    public LinkedHashMap y;
    public HashMap z;

    public void StickerViewStyle6(Context p0,View p1){
       super(p0, p1);
       this.A = 0;
       this.y = new LinkedHashMap();
       this.z = new HashMap();
       if (PatchProxy.applyVoid(null, this, StickerViewStyle6.class, "1")) {
       }else {
          this.y.put(Integer.valueOf(1), Integer.valueOf(45));
          this.y.put(Integer.valueOf(2), Integer.valueOf(24));
          this.y.put(Integer.valueOf(4), Integer.valueOf(21));
          this.y.put(Integer.valueOf(6), Integer.valueOf(16));
          this.y.put(Integer.valueOf(9), Integer.valueOf(14));
          this.y.put(Integer.valueOf(12), Integer.valueOf(12));
          this.z.put(Integer.valueOf(1), Integer.valueOf(1));
          this.z.put(Integer.valueOf(2), Integer.valueOf(2));
          this.z.put(Integer.valueOf(4), Integer.valueOf(2));
          this.z.put(Integer.valueOf(6), Integer.valueOf(3));
          this.z.put(Integer.valueOf(9), Integer.valueOf(3));
          this.z.put(Integer.valueOf(12), Integer.valueOf(4));
       }
       this.setPaddings(new int[4]{'#','#','#','#'});
       this.setBackgroundDrawableRes(R.drawable.edit_cover_bubble2_thumb);
       this.setTextSize(45);
       this.m.setMaxLines(4);
       this.m.setGravity(1);
       return;
    }
    public float e(int p0){
       if (PatchProxy.isSupport(StickerViewStyle6.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StickerViewStyle6.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (((super.e(p0) + this.A) - (float)this.m.getTop()) - (float)this.m.getPaddingTop());
    }
    public int getLayoutId(){
       return 0x7f0d0045;
    }
    public void setStickerTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerViewStyle6.class, "2")) {
          return;
       }
       if (p0.length() < 1) {
          return;
       }
       int i = 12;
       if (p0.length() > i) {
          p0 = p0.substring(0, i);
       }
       Iterator iterator = this.y.keySet().iterator();
       while (iterator.hasNext()) {
          i = iterator.next().intValue();
          this.v = this.y.get(Integer.valueOf(i)).intValue();
          this.u = this.z.get(Integer.valueOf(i)).intValue();
          if (i >= p0.length()) {
             break ;
          }
       }
       this.b = p0;
       this.m.setTypeface(Typeface.defaultFromStyle(0));
       this.setTextSize(this.v);
       this.m.setMaxEms(this.u);
       this.m.setText("");
       this.m.getViewTreeObserver().addOnPreDrawListener(new StickerViewStyle6$a(this));
       return;
    }
}
