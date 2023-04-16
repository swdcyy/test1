package com.kwai.feature.api.social.message.imshare.model.IMShareUserObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import com.kwai.framework.model.user.User;
import java.lang.String;

public class IMShareUserObject extends IMShareObject	// class@00115c
{
    public final User user;
    public static final long serialVersionUID = 0x8ef2398e3658ee8d;

    public void IMShareUserObject(User p0,String p1){
       super();
       this.user = p0;
       this.shareId = p1;
    }
    public int getKwaiMsgType(){
       return 1003;
    }
    public int getShareAction(){
       return 1;
    }
}
