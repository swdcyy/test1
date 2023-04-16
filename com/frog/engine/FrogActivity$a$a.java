package com.frog.engine.FrogActivity$a$a;
import com.frog.engine.FrogCanvasDelegate;
import com.frog.engine.FrogActivity$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class FrogActivity$a$a implements FrogCanvasDelegate	// class@0014e4
{

    public void FrogActivity$a$a(FrogActivity$a p0){
       super();
    }
    public void onDidError(int p0,String p1){
       if (PatchProxy.isSupport(FrogActivity$a$a.class)) {
          PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, FrogActivity$a$a.class, "3");
       }
       return;
    }
    public void onDidStart(){
       PatchProxy.applyVoid(null, this, FrogActivity$a$a.class, "2");
    }
    public void onDrawFrame(){
    }
    public void onFirstFrameRender(){
       PatchProxy.applyVoid(null, this, FrogActivity$a$a.class, "4");
    }
    public void onWillStart(){
       PatchProxy.applyVoid(null, this, FrogActivity$a$a.class, "1");
    }
    public void onWillStop(){
       PatchProxy.applyVoid(null, this, FrogActivity$a$a.class, "5");
    }
}
