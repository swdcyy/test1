package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationViewV2$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.BitmapFactory$Options;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class EditDecorationViewV2$b implements Runnable	// class@000f08
{
    public final EditDecorationViewV2 b;

    public void EditDecorationViewV2$b(EditDecorationViewV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EditDecorationViewV2$b.class, "1")) {
          return;
       }
       BitmapFactory$Options options = new BitmapFactory$Options();
       int dECORATION_S = BaseDrawer.DECORATION_SCALE_ROTATE_ICON_WIDTH;
       options.outHeight = dECORATION_S;
       options.outWidth = dECORATION_S;
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       Application uApplication = uoc.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       this.b.r = BitmapFactory.decodeResource(uApplication.getResources(), 0x7f081b4c, options);
       options.outHeight = dECORATION_S;
       options.outWidth = dECORATION_S;
       uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       uApplication = uoc.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       this.b.s = BitmapFactory.decodeResource(uApplication.getResources(), 0x7f081b2d, options);
       options.outHeight = dECORATION_S;
       options.outWidth = dECORATION_S;
       c uoc1 = a.a();
       a.o(uoc1, "AppEnv.get\(\)");
       Application uApplication1 = uoc1.a();
       a.o(uApplication1, "AppEnv.get\(\).appContext");
       this.b.t = BitmapFactory.decodeResource(uApplication1.getResources(), 0x7f081b24, options);
       return;
    }
}
