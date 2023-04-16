package com.yxcorp.gifshow.widget.SafeDrawImageView;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;

public class SafeDrawImageView extends ImageView	// class@0018ba
{

    public void SafeDrawImageView(Context p0){
       super(p0);
    }
    public void SafeDrawImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SafeDrawImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SafeDrawImageView.class, "1")) {
          return;
       }
       try{
          super.onDraw(p0);
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          a.D().w("SafeDrawImageView", "onDraw"+e4.toString(), objArray);
       }
       return;
    }
}
