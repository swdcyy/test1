package com.frog.engine.FrogRunGameResultListener;
import java.lang.String;
import com.frog.engine.FrogCanvasHandler;

public interface abstract FrogRunGameResultListener	// class@0014f4
{

    void onFail(int p0,String p1);
    void onSuccess(FrogCanvasHandler p0);
}
