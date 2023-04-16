package com.frog.engine.FrogCanvasHandler;
import java.lang.String;
import com.frog.engine.view.FrogGLSurfaceView;
import android.view.KeyEvent;
import com.frog.engine.FrogCanvasDelegate;
import java.util.Map;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCallGameListener;
import org.json.JSONObject;

public interface abstract FrogCanvasHandler	// class@0014ee
{

    String absolutePath(String p0);
    byte[] fileDataWithPath(String p0);
    FrogGLSurfaceView getSurfaceView();
    String getTempAbsPath();
    void handleAudioMute(boolean p0);
    String ksPath(int p0);
    void onActivityFinishCall();
    void onDestroy();
    boolean onKeyDown(int p0,KeyEvent p1);
    void onPause();
    void onRestart();
    void onResume();
    void onStop();
    void registerDelegate(FrogCanvasDelegate p0);
    void registerGameCommand(Map p0);
    void runJavaScriptFile(String p0);
    void sendCommandToGame(String p0,FrogJSObject p1,FrogCallGameListener p2);
    void setConvertPointAfterSizeChangeSwitch(boolean p0);
    void updateLaunchOption(JSONObject p0);
}
