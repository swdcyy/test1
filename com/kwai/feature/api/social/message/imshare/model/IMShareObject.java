package com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import java.io.Serializable;
import java.lang.Object;

public abstract class IMShareObject implements Serializable	// class@001156
{
    public String shareId;
    public static final long serialVersionUID = 0x7fa725ec19987371;

    public void IMShareObject(){
       super();
    }
    public abstract int getKwaiMsgType();
    public abstract int getShareAction();
}
