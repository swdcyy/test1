package com.kwai.feature.api.platform.bridge.beans.DialogParams;
import java.io.Serializable;
import java.lang.Object;

public final class DialogParams implements Serializable	// class@001040
{
    public boolean isAddToWindow;
    public String mContent;
    public DialogParams$DialogButton mNegativeButton;
    public DialogParams$DialogButton mNeutralButton;
    public DialogParams$DialogButton mPositiveButton;
    public String mTitle;

    public void DialogParams(){
       super();
    }
}
