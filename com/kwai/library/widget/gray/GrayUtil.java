package com.kwai.library.widget.gray.GrayUtil;
import com.kwai.library.widget.gray.GrayUtil$grayPaint$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.widget.gray.GrayUtil$unGrayPaint$2;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import android.graphics.Paint;
import java.lang.Exception;

public final class GrayUtil	// class@000940
{
    public static final p a;
    public static final p b;
    public static final GrayUtil c;

    static {
       GrayUtil.c = new GrayUtil();
       GrayUtil.a = s.c(GrayUtil$grayPaint$2.INSTANCE);
       GrayUtil.b = s.c(GrayUtil$unGrayPaint$2.INSTANCE);
    }
    public void GrayUtil(){
       super();
    }
    public final void a(View p0){
       if (p0 != null) {
          int i = 2;
          try{
             Objects.requireNonNull(GrayUtil.c);
             p0.setLayerType(i, GrayUtil.a.getValue());
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public final void b(View p0){
       if (p0 != null) {
          int i = 2;
          try{
             Objects.requireNonNull(GrayUtil.c);
             p0.setLayerType(i, GrayUtil.b.getValue());
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
}
