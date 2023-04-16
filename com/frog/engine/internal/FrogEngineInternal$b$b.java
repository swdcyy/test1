package com.frog.engine.internal.FrogEngineInternal$b$b;
import com.frog.engine.keyboard.FrogKeyBoardListener;
import com.frog.engine.internal.FrogEngineInternal$b;
import com.frog.engine.internal.FrogGameHandlerImpl;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.internal.FrogLog;
import org.json.JSONObject;
import java.lang.Exception;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.internal.FrogEngineInternal$b$b$c;
import com.frog.engine.FrogCallGameListener;
import com.frog.engine.internal.FrogEngineInternal$b$b$b;
import com.frog.engine.internal.FrogEngineInternal$b$b$a;

public class FrogEngineInternal$b$b implements FrogKeyBoardListener	// class@001535
{
    public final FrogGameHandlerImpl a;

    public void FrogEngineInternal$b$b(FrogEngineInternal$b p0,FrogGameHandlerImpl p1){
       this.a = p1;
       super();
    }
    public void onKeyBoardComplete(String p0){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogEngineInternal$b$b.class, "3")) {
          return;
       }
       FrogLog.d("FrogEngineInternal", "收到键盘complete时间");
       try{
          jSONObject = new JSONObject();
          jSONObject.put("value", p0);
       }catch(java.lang.Exception e4){
          FrogLog.e("FrogEngineInternal", e4.getMessage());
       }
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       FrogJSObject.fromJSObject(jSONObject, uFrogJSObjec);
       this.a.sendCommandToGame("ks.onKeyboardComplete", uFrogJSObjec, new FrogEngineInternal$b$b$c(this));
       return;
    }
    public void onKeyBoardConfirm(String p0){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogEngineInternal$b$b.class, "2")) {
          return;
       }
       try{
          jSONObject = new JSONObject();
          jSONObject.put("value", p0);
       }catch(java.lang.Exception e4){
          FrogLog.e("FrogEngineInternal", e4.getMessage());
       }
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       FrogJSObject.fromJSObject(jSONObject, uFrogJSObjec);
       this.a.sendCommandToGame("ks.onKeyboardConfirm", uFrogJSObjec, new FrogEngineInternal$b$b$b(this));
       return;
    }
    public void onKeyBoardInput(String p0){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogEngineInternal$b$b.class, "1")) {
          return;
       }
       try{
          jSONObject = new JSONObject();
          jSONObject.put("value", p0);
       }catch(java.lang.Exception e4){
          FrogLog.e("FrogEngineInternal", e4.getMessage());
       }
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       FrogJSObject.fromJSObject(jSONObject, uFrogJSObjec);
       this.a.sendCommandToGame("ks.onKeyboardInput", uFrogJSObjec, new FrogEngineInternal$b$b$a(this));
       return;
    }
}
