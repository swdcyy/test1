package com.kuaishou.tuna_core.widget.dialog.model.TunaWebDialogModel;
import java.io.Serializable;
import java.lang.Object;

public class TunaWebDialogModel implements Serializable	// class@00113a
{
    public int mDialogStyle;
    public int mHeight;
    public JumpUrlModel mJumpUrlModel;
    public int mWidth;
    public static final long serialVersionUID = 0x302bbf25685cf94c;

    public void TunaWebDialogModel(){
       super();
       this.mDialogStyle = 1;
    }
}
