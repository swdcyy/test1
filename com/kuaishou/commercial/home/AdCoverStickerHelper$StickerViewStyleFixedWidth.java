package com.kuaishou.commercial.home.AdCoverStickerHelper$StickerViewStyleFixedWidth;
import com.kuaishou.commercial.home.DrawTextSelfStickerView;
import com.kuaishou.commercial.home.AdCoverStickerHelper;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.home.StickerView;
import java.lang.StringBuilder;
import android.text.TextPaint;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.util.List;
import java.lang.CharSequence;

public class AdCoverStickerHelper$StickerViewStyleFixedWidth extends DrawTextSelfStickerView	// class@0014c8
{
    public boolean y;
    public final AdCoverStickerHelper z;

    public void AdCoverStickerHelper$StickerViewStyleFixedWidth(AdCoverStickerHelper p0,Context p1,View p2){
       this.z = p0;
       super(p1, p2);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, AdCoverStickerHelper$StickerViewStyleFixedWidth.class, "2")) {
          return;
       }
       if ((this.b).length() > 0) {
          StickerView tb = this.b;
          StickerView tu = this.u;
          if (tb.length() <= tu) {
             tu = (this.b).length();
          }
          int i = 0;
          String str = tb.substring(i, tu);
          while (this.y != null && str.length() < this.u) {
             str = str+"µÄ";
          }
          float f = this.o.measureText(str, i, str.length());
          ViewGroup$LayoutParams layoutParams = this.m.getLayoutParams();
          if ((this.b).length() <= str.length()) {
             this.x.clear();
             this.x.add(this.b);
          }else {
             this.d(f);
          }
          if (layoutParams != null) {
             layoutParams.width = (int)((f + (float)this.m.getPaddingRight()) + (float)this.m.getPaddingLeft());
             layoutParams.height = (this.m.getPaddingTop() + this.m.getPaddingBottom()) + (int)(this.getTextLineHeight() * (float)this.x.size());
             this.m.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void setFixedWidth(boolean p0){
       this.y = p0;
    }
    public void setStickerTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdCoverStickerHelper$StickerViewStyleFixedWidth.class, "1")) {
          return;
       }
       super.setStickerTitle(p0);
       this.m.setText("");
       return;
    }
}
