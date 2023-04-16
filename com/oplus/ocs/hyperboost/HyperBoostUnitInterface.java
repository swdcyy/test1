package com.oplus.ocs.hyperboost.HyperBoostUnitInterface;
import java.lang.String;
import android.content.Context;
import com.oplus.ocs.hyperboost.HyperBoostCallback;
import com.oplus.ocs.base.common.AuthResult;

public interface abstract HyperBoostUnitInterface	// class@000b30
{

    boolean appActionBind(int p0,boolean p1);
    boolean appActionBurst(int p0,int p1);
    boolean appActionDdr(int p0,int p1);
    boolean appActionEnd();
    boolean appActionGpu(int p0,int p1);
    boolean appActionLoading(int p0,int p1);
    boolean appActionVibrate(int p0);
    boolean appBootCompleted();
    boolean gameActionBind(int p0,boolean p1);
    boolean gameActionBurst(int p0,int p1);
    boolean gameActionDdr(int p0,int p1);
    boolean gameActionEnd();
    boolean gameActionGpu(int p0,int p1);
    boolean gameActionLoading(int p0,int p1);
    boolean gameActionVibrate(int p0);
    boolean gameBootCompleted();
    boolean gameSceneEnd();
    boolean gameSceneStart();
    String getVersion();
    void initialize(Context p0);
    boolean registerClient();
    boolean registerNotifier(HyperBoostCallback p0);
    void setAuthResult(AuthResult p0);
    boolean updateGameInfo(String p0);
}
