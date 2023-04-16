package com.frog.engine.internal.FrogEngineInternal$b;
import java.lang.Runnable;
import android.app.Activity;
import com.frog.engine.data.FrogInitParam;
import com.frog.engine.FrogRunGameResultListener;
import com.frog.engine.FrogCommonListener;
import com.frog.engine.FrogCanvasKVStorageProxy;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.internal.FrogEngineInternal;
import android.content.Context;
import com.frog.engine.internal.FrogGameHandlerImpl;
import com.frog.engine.view.FrogGLSurfaceView;
import android.app.Application;
import com.frog.engine.view.FrogRender;
import com.frog.engine.keyboard.FrogKeyBoard;
import com.frog.engine.internal.FrogEngineInternal$b$a;
import com.frog.engine.view.RenderThreadCallBack;
import com.frog.engine.internal.FrogEngineInternal$b$b;
import com.frog.engine.keyboard.FrogKeyBoardListener;

public final class FrogEngineInternal$b implements Runnable	// class@001536
{
    public final Activity a;
    public final FrogInitParam b;
    public final FrogRunGameResultListener c;
    public final FrogCommonListener d;
    public final FrogCanvasKVStorageProxy e;

    public void FrogEngineInternal$b(Activity p0,FrogInitParam p1,FrogRunGameResultListener p2,FrogCommonListener p3,FrogCanvasKVStorageProxy p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FrogEngineInternal$b.class, "1")) {
          return;
       }
       FrogEngineInternal.initActivityWidthAndHeight(this.a);
       if (!this.b.isTrustLoadSoLib() && !FrogEngineInternal.onLoadNativeLibraries(this.a)) {
          FrogEngineInternal.callResult(-3, "game engine so load faild", objArray, this.c);
          return;
       }else {
          FrogGLSurfaceView uFrogGLSurfa = new FrogGLSurfaceView(this.a.getApplication());
          uFrogGLSurfa.createKeyBoradListener(this.a);
          FrogRender uFrogRender = new FrogRender(this.a.getApplication(), this.b, uFrogGLSurfa.getFrogKeyBoard(), this.d, this.e);
          FrogEngineInternal.applicationContext = this.a.getApplicationContext();
          objArray.setUniqueId(uFrogGLSurfa.getUniqueId(), new FrogEngineInternal$b$a(this, uFrogGLSurfa));
          uFrogGLSurfa.setRenderer(objArray);
          FrogGameHandlerImpl uFrogGameHan = new FrogGameHandlerImpl(uFrogGLSurfa);
          if (uFrogGLSurfa.getFrogKeyBoard() != null) {
             uFrogGLSurfa.getFrogKeyBoard().setFrogKeyBoardListener(new FrogEngineInternal$b$b(this, uFrogGameHan));
          }
          FrogEngineInternal.callResult(1, "", uFrogGameHan, this.c);
          return;
       }
    }
}
