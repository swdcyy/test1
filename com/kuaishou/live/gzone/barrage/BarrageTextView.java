package com.kuaishou.live.gzone.barrage.BarrageTextView;
import com.lsjwzh.widget.text.StrokableTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.CharSequence;
import android.text.StaticLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.lsjwzh.widget.text.FastTextView;
import android.graphics.Canvas;
import java.lang.StringBuilder;
import java.lang.Exception;
import z12.e;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class BarrageTextView extends StrokableTextView	// class@001c22
{

    public void BarrageTextView(Context p0){
       super(p0);
    }
    public void BarrageTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void BarrageTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public StaticLayout h(CharSequence p0,int p1,boolean p2){
       if (PatchProxy.isSupport(BarrageTextView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, BarrageTextView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p2) {
          p1 = Integer.MAX_VALUE;
       }
       return super.h(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BarrageTextView.class, "2")) {
          return;
       }
       try{
          super.onDraw(p0);
       }catch(java.lang.Exception e3){
          String str = "onDraw crashed: text = "+this.getText()+", reason = "+e3.getMessage();
          String[] stringArray = new String[0];
          e.c("BarrageTextView", str, stringArray);
          ExceptionHandler.handleCaughtException(new IllegalArgumentException(str));
       }
       return;
    }
}
