package com.tencent.tauth.IUiListener;
import java.lang.Object;
import com.tencent.tauth.UiError;

public interface abstract IUiListener	// class@000f8f
{

    void onCancel();
    void onComplete(Object p0);
    void onError(UiError p0);
    void onWarning(int p0);
}
