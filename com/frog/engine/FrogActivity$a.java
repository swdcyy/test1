package com.frog.engine.FrogActivity$a;
import com.frog.engine.FrogRunGameResultListener;
import com.frog.engine.FrogActivity;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.content.res.Resources;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import com.frog.engine.FrogCanvasHandler;
import com.frog.engine.FrogActivity$a$a;
import com.frog.engine.FrogCanvasDelegate;
import com.frog.engine.view.FrogGLSurfaceView;

public class FrogActivity$a implements FrogRunGameResultListener	// class@0014e5
{
    public final FrogActivity a;

    public void FrogActivity$a(FrogActivity p0){
       this.a = p0;
       super();
    }
    public void onFail(int p0,String p1){
       FrogActivity$a uoa = FrogActivity$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       FrogActivity$a ta = this.a;
       Toast.makeText(ta, ta.getResources().getString(R.string.arg_RES_7f1010fc), 0).show();
       return;
    }
    public void onSuccess(FrogCanvasHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogActivity$a.class, "1")) {
          return;
       }
       this.a.mFrogGameHandler = p0;
       p0.setConvertPointAfterSizeChangeSwitch(true);
       p0.registerDelegate(new FrogActivity$a$a(this));
       FrogActivity$a ta = this.a;
       ta.addSurfaceView(ta.mFrogGameHandler.getSurfaceView());
       return;
    }
}
