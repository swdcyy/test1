package com.frog.engine.FrogCanvasDelegate;
import java.lang.String;

public interface abstract FrogCanvasDelegate	// class@0014ed
{

    void onDidError(int p0,String p1);
    void onDidStart();
    void onDrawFrame();
    void onFirstFrameRender();
    void onWillStart();
    void onWillStop();
}
